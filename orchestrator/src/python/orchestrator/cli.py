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

import typer

from delivery import cli as delivery_cli
from delivery import log
from delivery.orchestrator.product import StepFactoryContext

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


def build() -> None:
    """Build the product artefacts (placeholder). Replace with your real build pipeline."""
    log.info("cleon: build (placeholder) - wire me up in orchestrator/src/python/orchestrator/cli.py")


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
