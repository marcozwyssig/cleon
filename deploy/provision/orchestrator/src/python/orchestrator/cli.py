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
from pathlib import Path

import typer

from delivery import cli as delivery_cli
from delivery import log
from delivery import run
from delivery.orchestrator.product import StepFactoryContext

from . import antbuild
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


def generate() -> None:
    """Run Actifsource headless: sources, features, update site, then validate the model."""
    ant_settings = _settings().get("ant") or {}
    eclipse = _eclipse_home()
    _ant(eclipse,
         ant_settings.get("generate_file", "deploy/provision/asbuild.generate.xml"),
         ant_settings.get("generate_targets") or ["generate"],
         {"cleon.bundle.folders": str(antbuild.plugins_directory(eclipse)),
          "cleon.project.folders": str(paths.ROOT / "src")})


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
          "cleon.feature.entries": ";".join(resolved.feature_entries())})


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
