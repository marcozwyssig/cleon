---
title: Getting started
weight: 3
---

## The artefacts are not public

cleon's source is; its builds are not. The bundle and the update site live in the GitHub Container
Registry as OCI artifacts, and every read is authenticated — an anonymous pull gets `403`. If you are
entitled to them, you need a GitHub token carrying `read:packages`:

```bash
gh auth refresh -h github.com -s read:packages     # once
oras login ghcr.io -u <your-user> --password-stdin <<< "$(gh auth token)"
```

If you are not, everything below the fold still works: the repository is public and builds a bundle of
its own.

## The bundle: an Eclipse with cleon already in it

One archive per platform, carrying Eclipse, a JDK, Ant, Actifsource Enterprise and cleon:

```bash
oras pull ghcr.io/marcozwyssig/cleon-bundle:<cleon version>-<eclipse/jdk version>-<os>-<arch>
```

Unpack it and start Eclipse. There is no update site to add and no Actifsource installation to do
first — that is the point of shipping it this way. `./cleon.sh deploy install <directory>` unpacks a
built archive for you, preserving the executable bits a plain `unzip` drops.

## Updating an installed cleon

The update site is published as its own package:

```bash
oras pull ghcr.io/marcozwyssig/cleon-updatesite:<cleon version>
```

Then add the pulled archive in Eclipse under *Help → Install New Software → Add → Archive*, or by URL:

```
jar:file:/path/to/cleon-updatesite_<version>.zip!/
```

**Why a download and not a URL to paste.** p2 speaks HTTP and file, not OCI, so Eclipse cannot read
ghcr.io directly. Serving the site over GitHub Pages would give you that URL — and would make these
artefacts readable by everyone, because Pages on a public repository is public. The manual step is what
keeps the access rule; it is a deliberate trade, not an oversight.

## Building it yourself

A checkout plus one command — no credentials needed for the parts that are public:

```bash
git clone https://github.com/marcozwyssig/cleon.git
cd cleon
./cleon.sh build          # Linux and macOS
cleon.cmd build           # Windows
```

The build pulls a base bundle, compiles the model plugins, runs Actifsource headless to generate
sources and the update site, installs the features into the bundle's Eclipse and zips the result into
`build-out/`.

The first run provisions a Python virtualenv and downloads about a gigabyte, so allow it some time.
Everything after that is incremental.

## What you need on the machine

Almost nothing: Python 3 for the launcher, `git`, and `oras` to move archives in and out of the
registry — and cleon installs `oras` itself if it is missing (`./cleon.sh support install`). Java, Ant
and Eclipse come inside the bundle rather than from the host, which is why a build behaves the same on
a laptop and on a CI runner.
