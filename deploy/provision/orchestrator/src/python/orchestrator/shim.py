"""Which entry point cleon spawns its own aggregate steps as. PURE - the host is an argument.

`build` is an impl-less AGGREGATE: the kernel turns its dependency plan into steps and runs each as
`<shim> <command>`, live-streamed. So the plan needs a shim to name, and there is no single script that
works on all five build hosts - `cleon.sh` is a shell script Windows cannot execute, `cleon.cmd` is a
batch file the others cannot.

A CONSTANT IS WHAT WENT WRONG. `cleon.sh` was written straight into the step-factory context, which is
correct on four hosts out of five and fails on the fifth with `WinError 193: %1 is not a valid Win32
application` - a message about the file format, naming neither the shim nor the plan. It cost the
Windows cell its first ever run (33917120184), after the bundle had already been downloaded, unpacked
and compiled. asbundle hit exactly this and fixed it the same way; this is the second half of that
lesson, in the product that had not learned it yet.

Separate from paths.py because that module REGISTERS the product context at import: a decision this
small should be checkable without booting the CLI, and here it is.
"""
from __future__ import annotations


def shim_name(os_name: str) -> str:
    """The entry point for a host, given `os.name` ('nt' on Windows, 'posix' elsewhere)."""
    return "cleon.cmd" if os_name == "nt" else "cleon.sh"
