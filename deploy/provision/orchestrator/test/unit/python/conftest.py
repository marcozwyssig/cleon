"""pytest bootstrap for the orchestrator block's unit suite.

The block's `src/python` goes on sys.path so the suite imports `orchestrator.*` with no install step
and no PYTHONPATH the caller has to remember.

The KERNEL is not put on sys.path any more: it is the installed `simplon` package now, so it resolves
like any other dependency. The module under test here (orchestrator.deliverables) needs it in neither
form - it is pure, and its tests pass with the kernel absent. That is deliberate: what cleon ships is
derived from files in this repository, so it can be checked without a bundle, without Eclipse, and
without Actifsource.
"""
import sys
from pathlib import Path

_BLOCK = Path(__file__).resolve().parents[3]        # the orchestrator block dir

_SRC = _BLOCK / "src" / "python"
if str(_SRC) not in sys.path:
    sys.path.insert(0, str(_SRC))


def pytest_configure(config):
    config.addinivalue_line("markers", "repository: asserts against the real checkout, not a fixture")
