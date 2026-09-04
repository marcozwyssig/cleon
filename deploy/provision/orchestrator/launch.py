"""The Windows host-venv bootstrap: what cleon.sh does, in stdlib Python.

WHY THIS EXISTS (#3). cleon.sh is POSIX-only - it needs `python3` on PATH and hardcodes `$VENV/bin/pip`
and `$VENV/bin/python`, while a Windows venv puts them in `Scripts\\`. Without this the Windows half of
the six-cell matrix (#12) has no way in.

WHY PYTHON AND NOT A SHELL SCRIPT. Batch cannot compare two file timestamps without contortions, and
PowerShell is ruled out. But every one of these steps - create a venv, compare two mtimes, run pip,
exec a module - is something the standard library does directly and identically on every platform. The
batch file that calls this is five lines and makes no decisions.

STDLIB ONLY, deliberately: this runs on the SYSTEM interpreter, before any venv exists and therefore
before any dependency has been installed. Importing anything third-party here would be a bootstrap
that requires its own bootstrap.

It mirrors launch.sh's semantics on purpose - same venv location, same `.deps-stamp` file, same
newer-than reinstall rule, same `python -u -m orchestrator`. A divergence between the two entry points
surfaces only as a platform-specific CI failure, which is the most expensive kind to debug.
"""
from __future__ import annotations

import os
import shutil
import subprocess
import sys
import venv
from pathlib import Path

PRODUCT = "cleon"
MODULE = "orchestrator"

ORCH_DIR = Path(__file__).resolve().parent


def _repo_root(start: Path) -> Path:
    """The repo root, found by walking up to the `cleon.yaml` marker.

    A MARKER WALK, not a fixed number of `.parent` hops. This file used to take the block dir's parent,
    which was the root only while the block sat at the top level; moving it to `src/orchestrator/`
    silently made ROOT point at `src/`. The marker is the same one simplon.context.bootstrap walks to,
    so both halves of the product agree on where the root is and relocating the block again needs no
    edit here.
    """
    for candidate in (start, *start.parents):
        if (candidate / f"{PRODUCT}.yaml").is_file():
            return candidate
    raise SystemExit(
        f"{PRODUCT}: no {PRODUCT}.yaml found in {start} or any parent - this is not a checkout of the "
        f"{PRODUCT} repository, or it is incomplete")


ROOT = _repo_root(ORCH_DIR)
VENV_DIR = ORCH_DIR / ".venv"
REQUIREMENTS = ORCH_DIR / "requirements.txt"
STAMP = VENV_DIR / ".deps-stamp"


def die(message: str) -> "NoReturn":  # noqa: F821 - quoted, stdlib-only module
    print(f"{PRODUCT}: {message}", file=sys.stderr)
    raise SystemExit(1)


def venv_bin(name: str) -> Path:
    """A venv executable's path, on either layout.

    Windows puts them in `Scripts\\` with an `.exe`; POSIX in `bin/`. This is precisely the assumption
    launch.sh hardcodes, and the reason it cannot serve Windows.
    """
    if os.name == "nt":
        return VENV_DIR / "Scripts" / f"{name}.exe"
    return VENV_DIR / "bin" / name


def ensure_venv() -> None:
    """Create the venv on first use, and REBUILD it when it is broken.

    An interrupted first run can leave the directory present but without pip, so a directory-only check
    would never self-heal - the same reasoning as launch.sh's `[ ! -x "$VENV/bin/pip" ]`.
    """
    if venv_bin("pip").exists():
        return
    if VENV_DIR.exists():
        shutil.rmtree(VENV_DIR)
    print(f"{PRODUCT}: creating the host venv at {VENV_DIR}", file=sys.stderr)
    try:
        venv.EnvBuilder(with_pip=True, clear=True).create(VENV_DIR)
    except Exception as exc:                                   # noqa: BLE001 - report, do not trace
        die(f"could not create the virtual environment: {exc}")
    if not venv_bin("pip").exists():
        die("the virtual environment was created without pip; install your platform's venv package")


def ensure_dependencies() -> None:
    """Install requirements when they are newer than the stamp; a venv rebuild drops the stamp with it."""
    if STAMP.exists() and STAMP.stat().st_mtime >= REQUIREMENTS.stat().st_mtime:
        return
    print(f"{PRODUCT}: installing dependencies from {REQUIREMENTS.name}", file=sys.stderr)
    result = subprocess.run(
        [str(venv_bin("pip")), "install", "-q", "--disable-pip-version-check", "-r", str(REQUIREMENTS)])
    if result.returncode != 0:
        die(f"dependency installation failed (rc={result.returncode})")
    STAMP.touch()


def main(argv: list[str]) -> int:
    ensure_venv()
    ensure_dependencies()

    env = dict(os.environ)

    # Force UTF-8 for the child's stdout/stderr. A Windows console defaults to the locale code page
    # (cp1252 on the GitHub runners), and the kernel's step runner prints U+2717 to mark a failed
    # aggregate step - so the FIRST failure on Windows died with a UnicodeEncodeError traceback that
    # buried the actual error message underneath it.
    #
    # Set only when unset, so an operator can still override. Not needed in cleon.sh: it inherits a
    # POSIX locale that is already UTF-8, and both Linux cells and both macOS cells
    # print the same character without complaint.
    env.setdefault("PYTHONIOENCODING", "utf-8")
    env.setdefault("PYTHONUTF8", "1")

    # Only the product's own package: the kernel is the installed `simplon` distribution in the venv,
    # not a source tree this has to point at.
    parts = [str(ORCH_DIR / "src" / "python")]
    if env.get("PYTHONPATH"):
        parts.append(env["PYTHONPATH"])
    env["PYTHONPATH"] = os.pathsep.join(parts)

    # No os.exec* here. On Windows it does not replace the process the way POSIX does - the parent
    # returns immediately and the console sees the WRONG exit code, which in CI reads as success.
    # -u keeps the output unbuffered so streamed lines stay live and correctly ordered when piped.
    # launch.sh does `cd "$ROOT"` before exec'ing; this did not, so a relative path given to a command
    # resolved against the repo root on POSIX and against the caller's cwd on Windows - the same command
    # putting files in two different places depending on the platform (#31).
    os.chdir(ROOT)
    return subprocess.run([str(venv_bin("python")), "-u", "-m", MODULE, *argv], env=env).returncode


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
