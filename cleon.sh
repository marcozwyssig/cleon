#!/usr/bin/env bash
#
# cleon.sh - the cleon entry point.
#
# It declares cleon's four parameters, provisions the host venv, and execs the CLI. The delivery kernel
# arrives as an ordinary dependency (the `simplon` package on PyPI, pinned in the orchestrator's
# requirements.txt), so there is nothing to vendor and no submodule to init: a fresh clone plus this
# script is the whole setup. Every command lives in Python under
# deploy/provision/orchestrator/src/python/orchestrator. Run `./cleon.sh help` for the command list;
# edit cleon.yaml to grow the CLI.
#
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT"

LAUNCH_PRODUCT=cleon
LAUNCH_ROOT="$ROOT"
LAUNCH_ORCH_DIR="$ROOT/deploy/provision/orchestrator"
LAUNCH_MODULE=orchestrator

VENV="$LAUNCH_ORCH_DIR/.venv"
REQ="$LAUNCH_ORCH_DIR/requirements.txt"
STAMP="$VENV/.deps-stamp"
PY="$VENV/bin/python"

[ -x "$PY" ] || python3 -m venv "$VENV"

# Reinstall only when requirements.txt is newer than the last successful install. Without the stamp
# every invocation pays a pip resolve. --upgrade because the kernel is declared as a floor, not a pin:
# pip leaves an already-satisfied requirement alone, so without it this venv would keep the first
# simplon it ever installed while a fresh CI venv resolved the newest - the two drifting apart silently.
if [ ! -f "$STAMP" ] || [ "$REQ" -nt "$STAMP" ]; then
    "$VENV/bin/pip" install -q --upgrade --disable-pip-version-check -r "$REQ"
    touch "$STAMP"
fi

export PYTHONPATH="$LAUNCH_ORCH_DIR/src/python${PYTHONPATH:+:$PYTHONPATH}"
export LAUNCH_PRODUCT LAUNCH_ROOT LAUNCH_ORCH_DIR LAUNCH_MODULE
exec "$PY" -u -m "$LAUNCH_MODULE" "$@"
