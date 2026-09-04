# cleon

A collection of Actifsource metamodels that support automation — architecture methods, modelling
languages, publishing, building — and the build that turns them into a ready-to-use IDE: an Eclipse
carrying a JDK, Ant, Actifsource Enterprise **and cleon already installed**, published as one archive
per platform.

Someone unpacking it starts modelling immediately and picks up later cleon releases through the
ordinary update mechanism, rather than adding an update site by hand.

## Two Actifsource projects, in this order

This repository holds two levels, and the distinction decides the build order:

| | what it is | where |
|---|---|---|
| **cleon** | the metamodels themselves, with their templates | `src/` — 89 projects, 50 of them OSGi bundles |
| **the cleon project** | the model that *uses* cleon | the repository root itself |

The root is the Eclipse project `cleonproject.deliverables.architecture.model.architecture`; its model
lives in `asrc/` and its `.asproject` generates into `src/`.

**cleon has to be compiled before the cleon project can generate.** The templates call selector
functions written in Java, which live in `src-gen` and are checked in — their `.class` files are not.
An IDE compiles them continuously and nobody notices; a clean checkout has none, and generation fails
with `Invalid selector!`.

## What is delivered

`site.xml` names **32 features**, those name **34 plugins**, and nothing else is built. The 21 sample
projects are deliberately absent from the update site — they exist to be read, not shipped.

That set is derived, never globbed: a glob would build all 89 projects, including samples whose nested
projects Eclipse cannot even import.

## Quick start

```bash
git clone https://github.com/marcozwyssig/cleon.git
cd cleon

./cleon.sh build                             # Linux / macOS
cleon.cmd build                              # Windows
```

The first run bootstraps a host virtualenv under `deploy/provision/orchestrator/.venv`. Nothing else
needs initialising: the delivery kernel is the `simplon` package from PyPI, declared in
`deploy/provision/orchestrator/requirements.txt`, and pip installs it into that venv like any other
dependency. It is declared as a FLOOR (`simplon>=0.1.4`), so cleon tracks the newest kernel release
instead of waiting for someone to bump a pin - at the price that a build is not reproducible from that
file alone. Pin an exact version there the day one has to be. It used to be a git submodule at `lib/platform`, which is why a fresh clone needed one
extra command; it no longer does.

The build needs `oras` (it moves the bundle in and out of the registry) and a GitHub token carrying
`read:packages`. `./cleon.sh support install` provisions the first, `./cleon.sh support git
auth-scopes` grants the second - and the build provisions oras itself if it is missing.

### What it needs

| | |
|---|---|
| `GITHUB_TOKEN` | to pull the asbundle bundle, and to publish |
| package access | the `asbundle-bundle` package must grant this repository **read**. GHCR does not do that across repositories automatically. |

No Actifsource credentials are needed here: Actifsource arrives inside the asbundle bundle, already
installed.

## The pipeline

```
fetch-bundle → compile → generate → package → install → bundle
```

| step | what it does |
|---|---|
| `fetch-bundle` | pull the newest asbundle bundle **for this host** from the registry, unpack it |
| `compile` | compile the model plugins, so the generator can load their Java functions |
| `generate-sources` | Actifsource, headless: sources, features, update site, then validate |
| `package` | jar the plugins and features, publish the P2 site into `build-out/site` |
| `install-features` | install those 32 features into the bundle's Eclipse from `file:` |
| `bundle` | zip the result |

`./cleon.sh build` runs all six and stops at the first failure. Each is also a command on its own:

```bash
./cleon.sh build generate          # regenerate without repackaging
./cleon.sh build package           # rebuild the update site
./cleon.sh release publish         # push the combined bundle to the registry
```

## Configuration

Everything is in **`cleon.yaml`** — no paths, versions or flags in Python:

```yaml
build:
  bundle:                 # where the asbundle bundle comes from and lands
    registry / repository / tag / directory / plugin_candidates
  ant:                    # the two build files, their targets, ANT_OPTS, -D properties
  site:                   # the update-site project and the p2 profile
release:                  # where the combined bundle is published
```

Two properties are worth knowing:

| | |
|---|---|
| `cleon.validate.exceptiontype` | `warning` today. `error` makes any model error fail the build. It is `warning` because the model has one known incompleteness — a `Feature` under *Project Methods → hermes* with no `fullName`. Turning the gate on is a decision for the model's owner. |
| `cleon.generate.verbose` | the generator's own chatter. Long, and the only way to find out why something was not found. |

## What is published

Two artefacts, both private OCI packages in the account's registry:

```
ghcr.io/marcozwyssig/asbundle-bundle : <eclipse>-<jdk>-<os>-<arch>       (consumed)
ghcr.io/marcozwyssig/cleon-bundle    : <cleon>-<eclipse>-<jdk>-<os>-<arch> (produced)
```

cleon's version carries a real build number, derived from the git commit:
`0.4.149.v20260903-0816-a1b2c3d`. `qualifier` in the source is a placeholder — Eclipse's own build
replaces it, and so does this one, in the manifests, the feature definitions, `site.xml` and the jar
names at once. All four have to agree or p2 reports `could not be found`.

From the commit rather than the clock, so the same source produces the same version.

The produced tag names the base it was built on, because the artefact is not reproducible from cleon's
version alone — it carries a particular Eclipse, JDK and Actifsource.

Only `release publish` pushes. A CI run builds the same zip and attaches it as a build artefact, so
verifying costs nothing and publishes nothing.

## Layout

```
cleon.yaml                        the one manifest: command tree + build parameters
cleon.sh / cleon.cmd              entry points (POSIX / Windows)
asrc/                             the cleon PROJECT's model
src/                              cleon itself: metamodels, templates, features, site
deploy/provision/
  asbuild.generate.xml            Actifsource, headless
  asbuild.package.xml             compile, jar, publish the P2 site
  orchestrator/src/python/orchestrator/
    bundles.py                    PURE: which bundle to pull, what the result is called
    deliverables.py               PURE: what is built, in which order, under which jar name
    antbuild.py                   PURE: where the tools are, what argv runs them
    cli.py                        composition root
  orchestrator/test/unit/python/  pytest, Arrange / Act / Assert
```

## Tests

```bash
python -m pytest deploy/provision/orchestrator/test/unit/python -v
```

62 unit tests. The pure modules are asserted against **this checkout** rather than against fixtures —
32 features, 34 plugins, zero violations of the compile order across the real 284 dependencies, and
every feature jar name identical to what `site.xml` expects. A fixture would agree with the code that
wrote it; the repository does not.

## CI

One Linux cell by default, because the cells do not cost the same: a macOS minute is roughly eight
Linux minutes.

```bash
gh workflow run ci.yml                          # one Linux cell
gh workflow run ci.yml -f only=all              # every platform
gh workflow run release.yml -f only=ubuntu-24.04
```

macOS bundles are currently a release behind: they were built before the fix that keeps executable
permissions when unpacking a zip, so `ant/bin/ant` in them is not runnable. Rebuild them from asbundle
(`release-macos.yml`) before building cleon on macOS.
