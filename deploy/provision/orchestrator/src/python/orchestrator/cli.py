"""The cleon host CLI (Typer), assembled from cleon.yaml by the delivery kernel.

Scaffolded by `python -m delivery.bootstrap` (netctl#651 strand 4). This is the product's composition root:
it creates the root Typer app, ships the command-impl callables the manifest's "module:function" refs
resolve to, and hands the app + product context + environments + aliases to the delivery binding layer
(delivery.cli). The generic assembly (a sub-app per group, hidden flat aliases, the flat-group collapse,
the CI/CD panels) and the env-first dispatch live in the kernel, driven entirely by the manifest - so a
fresh product adds groups/commands in cleon.yaml and impl callables HERE, and nowhere else.

Replace the placeholder commands (build/up/down) with your own; keep them as module-level callables so the
manifest's impl refs resolve (delivery.orchestrator.manifest.resolve_impl imports THIS module and getattrs
the function named after the `:`). The `all` command in cleon.yaml is a WORKING example of an
impl-less AGGREGATE (#895/#896): it carries only `depends_on: [build, up]` and the kernel binds it at
assembly time via the step context below, so a fresh product sees the pattern live instead of a dead
placeholder - grow it by adding dependencies to that command in the manifest.
"""
from __future__ import annotations

import contextlib
import os
import shutil
import zipfile
from pathlib import Path

import typer

from delivery import cli as delivery_cli
from delivery import log
from delivery import run
from delivery.orchestrator.product import StepFactoryContext

from . import antbuild
from . import bundles
from . import deliverables
from . import environments
from . import paths

app = typer.Typer(add_completion=False, no_args_is_help=True,
                  help=("cleon orchestrator (scaffolded on the delivery kernel). AGNOSTIC groups take "
                        "no env (build); ENV-FIRST CD groups run against a target env as the outer prefix "
                        "`cleon <env> <group> <cmd>` (default dev): deploy (up/down/all, where `all` "
                        "runs the build->up dependency plan). Fill in cleon.yaml to grow the CLI."))

# Back-compat command aliases (old token -> canonical), passed IN so the kernel hardcodes none. Empty for a
# fresh product; add entries here as you rename commands and want the old muscle memory to keep working.
_ALIASES: dict[str, str] = {}


def _settings() -> dict:
    """cleon.yaml's `build:` section. Read here and nowhere else, so there is one place to look."""
    return paths.CONTEXT.manifest_data().get("build") or {}


def _resolve(relative: str) -> Path:
    """A manifest path, resolved from the repo ROOT rather than the caller's cwd.

    `cleon.sh` can be invoked from anywhere, and a relative path that quietly means something different
    per working directory works for everyone until it does not for one person.
    """
    return paths.ROOT / relative


def _eclipse_home() -> Path:
    """The Eclipse install inside the unpacked bundle, per cleon.yaml's candidate list."""
    bundle = _settings().get("bundle") or {}
    return antbuild.eclipse_home(_resolve(bundle.get("directory", "build/bundle")),
                                 bundle.get("plugin_candidates") or ["plugins"])


@contextlib.contextmanager
def _environment(overrides: dict):
    """Apply env overrides for the duration of one call, then put the environment back.

    The kernel's `run()` is the single subprocess seam and takes no `env`, and going around it with a
    raw subprocess call to pass one would be trading a documented seam for a convenience. Restoring in a
    `finally` matters because this process goes on to run the next step of an aggregate: a JAVA_HOME
    left behind by `generate` would silently become `package`'s default.
    """
    previous = {key: os.environ.get(key) for key in overrides}
    os.environ.update(overrides)
    try:
        yield
    finally:
        for key, value in previous.items():
            if value is None:
                os.environ.pop(key, None)
            else:
                os.environ[key] = value


def _link(target: Path, link: Path) -> None:
    """Link `link` -> `target`, as a directory link that works without privileges on every host.

    `os.symlink` needs Developer Mode or an elevated shell on Windows, so a directory JUNCTION is used
    there instead - `mklink /J`, which any user may create. Junctions are directory-only, which is all
    this needs.
    """
    if os.name == "nt":
        rc = run.run(["cmd", "/c", "mklink", "/J", str(link), str(target)], capture=True).rc
        if rc != 0:
            raise typer.BadParameter(f"could not create a junction {link} -> {target}")
    else:
        link.symlink_to(target, target_is_directory=True)


def _workspace() -> Path:
    """A directory in which every project sits under its own NAME, and nothing else does.

    Actifsource addresses a project as `project:<name>` and finds it by directory name. That works by
    accident for the 106 generated projects, whose directories are named after themselves, and not at
    all for the root project: its directory is `cleon` and its name is
    `cleonproject.deliverables.architecture.model.architecture`. Runs 33725593633 through 33726956842
    all died on `project:cleonproject... not found`, having tried the root's directory and its
    `.project` file in `projectFiles`; neither is what the platform looks at.

    So this builds what Actifsource expects and Eclipse would have: a workspace of links, one per
    project, each named after the project it is. It is rebuilt every time - a stale entry would point
    at a project that no longer exists, and Actifsource would load it.
    """
    workspace = _resolve("build/workspace")
    shutil.rmtree(workspace, ignore_errors=True)
    workspace.mkdir(parents=True)

    root_name = bundles.project_name((paths.ROOT / ".project").read_text(encoding="utf-8"))
    _link(paths.ROOT, workspace / root_name)

    linked = 1
    for candidate in sorted((paths.ROOT / "src").iterdir()):
        marker = candidate / ".project"
        if marker.is_file():
            name = bundles.project_name(marker.read_text(encoding="utf-8", errors="ignore"))
            destination = workspace / name
            if not destination.exists():
                _link(candidate, destination)
                linked += 1

    log.info(f"cleon: workspace at {workspace} with {linked} project(s), each under its own name")
    return workspace


def _antdetect_properties(eclipse: Path, project_folders: Path) -> dict:
    """The `ch.actifsource.antdetect.*` half of Actifsource's configuration.

    There are TWO namespaces and both are required. `ch.actifsource.platform.*` is passed to each task
    as a sysproperty at run time; `ch.actifsource.antdetect.*` is read by `actifsource.tasks.detect.xml`
    when it builds the CLASSPATH for the tasks themselves, at import time.

    Setting only the second is what run 33722669190 did. The first defaults to `${eclipse.home}/plugins`
    and `eclipse.home` does not exist outside a running Eclipse, so antdetect searched a folder named
    literally `${eclipse.home}/plugins` and reported every Actifsource library as missing.

    Passed as `-D` rather than left to the `<property>` defaults in the build files: a command-line
    property is set before anything else runs and cannot be overridden.

    THAT IS ALSO THE TRAP. Because -D wins, every one of these keys must carry a real value here - a
    key passed as empty SILENTLY DEFEATS the build file's default. Run 33726013045 lost a whole run to
    exactly that: the fix that named the root project in the build file was overridden by
    `-Dch.actifsource.antdetect.projectFiles=` from this function, and the error was identical to the
    one before the fix. Keeping the same value in two places where one quietly wins is worse than
    keeping it in one; this function is the one.

    `projectFiles` is deliberately empty now: every project, the root one included, lives in the
    workspace `project_folders` points at, under its own name. Naming the root separately was tried
    twice - as a directory and as its `.project` file - and neither was found.

    The workspace root contributes no projects -
    Actifsource's example config says so in a comment - so the project `resourcescope` addresses has to
    be named individually, and `project_folders` covers only the generated ones under src/.
    """
    return {
        "ch.actifsource.antdetect.bundleFolders": str(antbuild.plugins_directory(eclipse)),
        "ch.actifsource.antdetect.bundleFiles": "",
        "ch.actifsource.antdetect.projectFolders": str(project_folders),
        "ch.actifsource.antdetect.projectFiles": "",
        "ch.actifsource.antdetect.projectClassesOutput": "bin",
    }


def _ant(eclipse: Path, build_file: str, targets, properties: dict) -> None:
    """One Ant run against the bundled Eclipse, using the bundle's own JDK.

    What the run IS gets logged before it starts. Ant's own failure output is long, and the part that
    identifies which run failed - build file, targets, properties - is at the top and scrolled away by
    the time anyone reads a CI log.
    """
    ant_settings = _settings().get("ant") or {}

    merged = dict(ant_settings.get("properties") or {})
    merged.update(properties)
    resolved_file = _resolve(build_file)
    argv = antbuild.ant_argv(antbuild.ant_executable(eclipse, windows=os.name == "nt"),
                             resolved_file, targets, merged)

    for line in antbuild.describe(resolved_file, targets, merged):
        log.info(f"cleon: {line}")
    overrides = antbuild.ant_overrides(antbuild.java_home(eclipse), ant_settings.get("opts") or [])
    with _environment(overrides):
        rc = run.run(argv, capture=False, cwd=str(paths.ROOT)).rc
    if rc != 0:
        raise typer.Exit(rc)


def _oras_login(registry: str) -> None:
    """Log in to the registry, with the token on STDIN.

    Never as an argv element: argv is world-readable in /proc, which is the same reason the P2
    repository URL no longer carries credentials either.
    """
    token = os.environ.get("GITHUB_TOKEN", "")
    user = os.environ.get("GITHUB_ACTOR") or os.environ.get("GITHUB_USERNAME") or "x"
    if not token:
        raise typer.BadParameter("GITHUB_TOKEN is not set; it is needed to reach the registry")
    host = registry.split("/")[0]
    result = run.run(["oras", "login", host, "-u", user, "--password-stdin"],
                     capture=True, input_text=token)
    if result.rc != 0:
        raise typer.BadParameter(f"oras login to {host} failed: {result.err or result.out}")


def _require_oras() -> None:
    if not shutil.which("oras"):
        raise typer.BadParameter(
            "oras is not on PATH. It is what moves a plain zip in and out of a registry as an OCI "
            "artifact; a container image cannot carry a macOS or Windows bundle.")


def fetch_bundle() -> None:
    """Pull the asbundle bundle for this host from the registry and unpack it.

    The bundle is not built here and not vendored: it is asbundle's published artefact, carrying
    Eclipse, a JDK, Ant and Actifsource Enterprise. cleon installs itself into a copy of it.
    """
    settings = _settings()
    bundle = settings.get("bundle") or {}
    registry, repository = bundle.get("registry", ""), bundle.get("repository", "")
    directory = _resolve(bundle.get("directory", "build/bundle"))

    _require_oras()
    _oras_login(registry)

    key = bundles.host_key()
    tag = bundle.get("tag") or ""
    if not tag:
        listed = run.run(["oras", "repo", "tags", f"{registry.rstrip('/')}/{repository}"],
                         capture=True)
        if listed.rc != 0:
            raise typer.BadParameter(f"could not list tags: {listed.err or listed.out}")
        tag = bundles.select_tag(listed.out.split(), key)
        log.info(f"cleon: newest bundle for {key[0]}/{key[1]} is {tag}")

    reference = bundles.reference(registry, repository, tag)

    # Pulled into a scratch directory and unpacked from there: the artefact is a zip, and unpacking it
    # over a previous run's tree would leave that run's files behind - including plugins cleon
    # installed, which is exactly what must NOT accumulate between builds.
    scratch = _resolve("build/bundle-download")
    for path in (scratch, directory):
        shutil.rmtree(path, ignore_errors=True)
    scratch.mkdir(parents=True)

    log.info(f"cleon: pulling {reference}")
    if run.run(["oras", "pull", reference, "-o", str(scratch)], capture=False).rc != 0:
        raise typer.Exit(1)

    archives = sorted(scratch.glob("*.zip"))
    if len(archives) != 1:
        raise typer.BadParameter(
            f"expected exactly one zip in {scratch}, found {[a.name for a in archives]}")

    directory.mkdir(parents=True)
    _extract_preserving_modes(archives[0], directory)

    # Record which tag this tree came from. `bundle` names the artefact after it, and recomputing
    # "the newest tag" at publish time could name it after a bundle it does not contain.
    _resolve("build/bundle-source-tag").write_text(tag, encoding="utf-8")

    eclipse = antbuild.eclipse_home(directory, bundle.get("plugin_candidates") or ["plugins"])
    log.ok(f"cleon: unpacked {tag} into {eclipse}")


def _extract_preserving_modes(archive_path: Path, destination: Path) -> int:
    """Unpack a zip and restore the Unix modes it recorded. Returns how many were restored.

    `zipfile.extractall` creates every file 0644 and drops what the archive stored, so an unpacked
    bundle contains no executable at all - `ant`, `java`, `javac`, the Eclipse launcher, every shim in
    the JDK. Run 33720226519 failed on exactly that, one step after the download it had waited a day
    for.
    """
    restored = 0
    with zipfile.ZipFile(archive_path) as archive:
        for entry in archive.infolist():
            extracted = Path(archive.extract(entry, destination))
            mode = bundles.recorded_mode(entry.external_attr)
            if mode and not entry.is_dir():
                extracted.chmod(mode)
                restored += 1
    log.info(f"cleon: unpacked {archive_path.name}, restored {restored} file mode(s)")
    return restored


def install() -> None:
    """Install the freshly built cleon features into the bundle's Eclipse.

    This is what makes the published artefact worth publishing: a user starts with cleon already in
    place and picks up later releases through the ordinary update mechanism, rather than having to add
    an update site by hand.

    The features are installed from the LOCAL site this build just produced (`file:`), never from a
    remote one - the point is to ship what was built here.
    """
    settings = _settings()
    site = settings.get("site") or {}
    eclipse = _eclipse_home()
    site_dir = _resolve(f"{settings.get('output', 'build-out')}/site")
    if not (site_dir / "site.xml").is_file():
        raise typer.BadParameter(f"no update site at {site_dir}; run `cleon build package` first")

    resolved = deliverables.resolve(paths.ROOT, site_project=site.get("project", "cleon.site"),
                                    skip_directories=tuple(site.get("skip_directories") or ()))
    units = bundles.feature_group_ids(resolved.feature_ids)
    log.info(f"cleon: installing {len(units)} feature(s) into {eclipse}")

    launcher = sorted(antbuild.plugins_directory(eclipse).glob("org.eclipse.equinox.launcher_*.jar"))
    if not launcher:
        raise typer.BadParameter(f"no equinox launcher under {antbuild.plugins_directory(eclipse)}")

    java = antbuild.java_home(eclipse) / "bin" / ("java.exe" if os.name == "nt" else "java")
    argv = [str(java), "-jar", str(launcher[-1]),
            "-nosplash", "-consoleLog",
            "-application", "org.eclipse.equinox.p2.director",
            "-repository", site_dir.as_uri(),
            "-installIU", ",".join(units),
            "-destination", str(eclipse),
            "-profile", site.get("profile", "SDKProfile")]

    if run.run(argv, capture=False, cwd=str(paths.ROOT)).rc != 0:
        raise typer.Exit(1)
    log.ok(f"cleon: {len(units)} feature(s) installed into the bundle")


def bundle() -> None:
    """Zip the bundle, now carrying cleon, into a publishable archive."""
    settings = _settings()
    directory = _resolve((settings.get("bundle") or {}).get("directory", "build/bundle"))
    output = _resolve(settings.get("output", "build-out"))
    output.mkdir(parents=True, exist_ok=True)

    resolved = deliverables.resolve(paths.ROOT)
    version = bundles.version_from_jar(resolved.feature_jars[0])
    tag = _source_tag()
    archive = output / bundles.combined_bundle_name(version, bundles.host_key(), tag)

    log.info(f"cleon: packing {directory} into {archive.name}")
    shutil.make_archive(str(archive)[: -len(".zip")], "zip", directory)
    log.ok(f"cleon: {archive} ({archive.stat().st_size} bytes)")


def _source_tag() -> str:
    """The asbundle tag this bundle came from, recorded by fetch-bundle.

    Read from a file rather than recomputed, because "the newest tag" changes between the pull and the
    publish, and an artefact named after a bundle it does not contain is worse than no name at all.
    """
    marker = _resolve("build/bundle-source-tag")
    if not marker.is_file():
        raise typer.BadParameter(
            f"{marker} is missing; run `cleon build fetch-bundle` so the source tag is recorded")
    return marker.read_text(encoding="utf-8").strip()


def publish() -> None:
    """Push the combined cleon+Actifsource bundle to the registry."""
    settings = _settings()
    release = paths.CONTEXT.manifest_data().get("release") or {}
    registry, repository = release.get("registry", ""), release.get("repository", "")
    output = _resolve(settings.get("output", "build-out"))

    archives = sorted(output.glob("cleon_*_on_*.zip"))
    if not archives:
        raise typer.BadParameter(f"no combined bundle in {output}; run `cleon build bundle` first")
    archive = archives[-1]

    _require_oras()
    _oras_login(registry)

    version = bundles.version_from_jar(deliverables.resolve(paths.ROOT).feature_jars[0])
    key = bundles.host_key()
    tag = f"{version}-{key[0]}-{key[1]}".replace("+", "-").lower()
    reference = bundles.reference(registry, repository, tag)

    log.info(f"cleon: pushing {archive.name} to {reference}")
    # Pushed from the archive's own directory: oras records the path it is GIVEN as the artifact name,
    # so an absolute path would bake this runner's directory into the manifest.
    rc = run.stream(["oras", "push", reference,
                     f"{archive.name}:application/vnd.actifsource.cleon.bundle.v1+zip"],
                    cwd=str(output))
    if rc != 0:
        raise typer.Exit(rc)
    log.ok(f"cleon: published {reference}")


def compile() -> None:  # noqa: A001 - the CLI command is `compile`; shadowing the builtin is local
    """Compile the model plugins, so the generator can load their Java functions.

    BEFORE generation, and that order is not arbitrary. Cleon's templates call selector functions that
    are implemented in Java - `FunctionSpace_Project.AbstractProject.UseSimpleName` is the one that
    failed - and those live in `src-gen`, checked in, but their `.class` files do not: `bin/` is
    ignored by git. A developer never notices, because their Eclipse compiles continuously; a fresh CI
    checkout has no compiled classes at all, and the generator reports `Invalid selector!`
    (run 33727465458).

    Actifsource's own example has the same order and says so in one line:
    `depends="export-classpath,compile-project,project-validation,code-gen"`. I built it backwards.

    This runs the packaging build file's `compile` target - the same javac over the same projects,
    stopping before the jars.
    """
    settings = _settings()
    ant_settings = settings.get("ant") or {}
    site = settings.get("site") or {}
    eclipse = _eclipse_home()

    resolved = deliverables.resolve(paths.ROOT, site_project=site.get("project", "cleon.site"),
                                    skip_directories=tuple(site.get("skip_directories") or ()))
    log.info(f"cleon: compiling {len(resolved.plugin_ids)} plugin(s) before generation")

    _ant(eclipse,
         ant_settings.get("package_file", "deploy/provision/asbuild.package.xml"),
         ant_settings.get("compile_targets") or ["compile"],
         {"cleon.bundle.folders": str(antbuild.plugins_directory(eclipse)),
          "cleon.plugin.entries": ";".join(resolved.plugin_entries()),
          "cleon.feature.entries": ";".join(resolved.feature_entries()),
          **_antdetect_properties(eclipse, _workspace())})


def generate() -> None:
    """Run Actifsource headless: sources, features, update site, then validate the model."""
    ant_settings = _settings().get("ant") or {}
    eclipse = _eclipse_home()
    workspace = _workspace()
    _ant(eclipse,
         ant_settings.get("generate_file", "deploy/provision/asbuild.generate.xml"),
         ant_settings.get("generate_targets") or ["generate"],
         {"cleon.bundle.folders": str(antbuild.plugins_directory(eclipse)),
          "cleon.project.folders": str(workspace),
          "cleon.workspace.root": str(workspace),
          **_antdetect_properties(eclipse, workspace)})


def package() -> None:
    """Compile, jar the plugins and features, and publish the P2 update site."""
    settings = _settings()
    ant_settings = settings.get("ant") or {}
    site = settings.get("site") or {}
    eclipse = _eclipse_home()

    # WHAT is built, in WHICH order, under WHICH jar name - all three derived here, from site.xml
    # outwards, and handed to Ant as data. Ant gets each of them wrong on its own: a glob builds the
    # samples too, alphabetical order compiles half the plugins against empty bin/ directories, and
    # <basename> names every jar after its folder - wrong for all 34 of them, without an error.
    resolved = deliverables.resolve(paths.ROOT,
                                    site_project=site.get("project", "cleon.site"),
                                    skip_directories=tuple(site.get("skip_directories") or ()))
    log.info(f"cleon: building {len(resolved.feature_ids)} features and {len(resolved.plugin_ids)} plugins")

    _ant(eclipse,
         ant_settings.get("package_file", "deploy/provision/asbuild.package.xml"),
         ant_settings.get("package_targets") or ["package"],
         {"cleon.bundle.folders": str(antbuild.plugins_directory(eclipse)),
          "cleon.plugin.entries": ";".join(resolved.plugin_entries()),
          "cleon.feature.entries": ";".join(resolved.feature_entries()),
          **_antdetect_properties(eclipse, _workspace())})


def up() -> None:
    """Deploy the product to the target environment (placeholder)."""
    log.info("cleon: up (placeholder)")


def down() -> None:
    """Tear the deployment down (placeholder)."""
    log.info("cleon: down (placeholder)")


# The parsed manifest, read ONCE: the CLI is assembled from it below, and the step factory resolves each
# planned command's dotted identity through it.
_MANIFEST = paths.CONTEXT.manifest()

# The step-factory seam (#895/#896): a command NAME becomes a live-streamed `./cleon.sh <cmd>` step,
# so the manifest's impl-less aggregates (`all`: depends_on build->up) run as DATA through the shared
# runner - no product Python per aggregate. Built once; StepFactoryContext is
# delivery.orchestrator.product's step-factory seam (kept distinct from the identity context in
# delivery.context, netctl#737).
#
# `for_shim` is the kernel's own factory for this shape, and using it is not a style choice: it STAMPS
# each step with the planned command's exact-command identity (`build.build`, `deploy.up`), which is what
# lets the kernel verify that step i really is the step for plan leaf i. A factory that does not stamp
# leaves that pairing unverifiable, and the kernel then drops the whole plan tree - taking every subtree's
# `stop_on_failure` with it, so a failing gate no longer stops the chain that declared it (#42).
_STEP_CONTEXT = StepFactoryContext.for_shim("cleon", paths.ROOT / "cleon.sh", _MANIFEST)


# Assemble the CLI from the manifest via the delivery binding layer. Runs at import (like netctl's cli.py):
# resolve_impl imports this module and binds each leaf command's callback, so every command above must
# already be defined; step_context lets the kernel synthesize the callback for each impl-less aggregate
# (`all` runs its build->up dependency plan, reachable as `cleon all` or `cleon <env> deploy
# all`). The product name only shapes the usage hints.
delivery_cli.assemble(app, _MANIFEST, product=paths.CONTEXT.name, step_context=_STEP_CONTEXT)


def main() -> None:
    """Entry point (`python -m orchestrator`): env-first dispatch via the delivery binding layer. The
    product context, the environments module and the alias map are injected, so delivery.cli hardcodes
    nothing product-specific."""
    delivery_cli.main(app=app, context=paths.CONTEXT, environments=environments.PROVIDER,
                      aliases=_ALIASES)
