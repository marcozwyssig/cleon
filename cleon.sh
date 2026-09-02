#!/usr/bin/env bash
#
# cleon.sh - thin shim onto the shared delivery launcher (scaffolded, netctl#651 strand 4).
#
# Its ONLY job is to declare cleon's product parameters (ROOT, the orchestrator dir, the module, the
# name), export the PYTHONPATH it wants, and delegate the whole host-venv bootstrap + exec to lib/platform's
# launch.sh. Every command lives in Python under deploy/provision/orchestrator/src/python/orchestrator. Run
# `./cleon.sh help` for the command list; edit cleon.yaml to grow the CLI.
#
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT"

# The delivery kernel, vendored as a git submodule at lib/platform. The launcher lives INSIDE it, so its
# absence means the submodule was never populated. Add it once with:
#   git submodule add https://github.com/marcozwyssig/platform.git lib/platform
# and re-init a fresh checkout with `git submodule update --init lib/platform`.
PLATFORM_SRC="$ROOT/lib/platform/src/delivery/src/python"
LAUNCH="$ROOT/lib/platform/src/delivery/src/sh/launch.sh"
if [ ! -f "$LAUNCH" ]; then
    printf 'cleon: delivery launcher not found at %s\n' "$LAUNCH" >&2
    printf 'cleon: run: git submodule update --init lib/platform\n' >&2
    exit 1
fi

# The kernel source + this product's orchestrator package, prepended to PYTHONPATH; the launcher execs the
# venv python with it inherited.
export PYTHONPATH="$PLATFORM_SRC:$ROOT/deploy/provision/orchestrator/src/python${PYTHONPATH:+:$PYTHONPATH}"

LAUNCH_PRODUCT=cleon \
LAUNCH_ROOT="$ROOT" \
LAUNCH_ORCH_DIR="$ROOT/deploy/provision/orchestrator" \
LAUNCH_MODULE=orchestrator \
    exec "$LAUNCH" "$@"
