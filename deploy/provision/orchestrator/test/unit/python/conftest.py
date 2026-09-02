"""pytest bootstrap for the orchestrator block's unit suite.

Mirrors the kernel's block layout (lib/platform/src/delivery/test/unit/python/conftest.py): the block's
`src/python` goes on sys.path so the suite imports `orchestrator.*` with no install step and no
PYTHONPATH the caller has to remember.

The kernel source is added too, because orchestrator.paths imports delivery.context. The module under
test here (orchestrator.deliverables) needs NEITHER - it is pure, and its tests pass with the kernel
absent. That is deliberate: what cleon ships is derived from files in this repository, so it can be
checked without a bundle, without Eclipse, and without Actifsource.
"""
import sys
from pathlib import Path

_BLOCK = Path(__file__).resolve().parents[3]        # the orchestrator block dir
# ROOT by marker walk, not by a fixed number of hops: the block already moved once (to deploy/provision/),
# and a counted `.parent` chain is what breaks silently when it moves again.
_ROOT = next(d for d in (_BLOCK, *_BLOCK.parents) if (d / "cleon.yaml").is_file())

for path in (_BLOCK / "src" / "python",
             _ROOT / "lib" / "platform" / "src" / "delivery" / "src" / "python"):
    if str(path) not in sys.path:
        sys.path.insert(0, str(path))


def pytest_configure(config):
    config.addinivalue_line("markers", "repository: asserts against the real checkout, not a fixture")
