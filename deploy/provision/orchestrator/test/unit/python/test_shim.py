"""Which entry point an aggregate's steps are spawned as. PURE - the host is an argument.

`build` is an aggregate: the kernel turns its dependency plan into live-streamed `<shim> <command>`
steps. Which shim that is cannot be a constant, because there is no single script that works on all
five build hosts - and getting it wrong fails ONLY on the host that was not thought of.
"""
from orchestrator import shim


def test_posix_hosts_run_the_shell_shim():
    assert shim.shim_name("posix") == "cleon.sh"


def test_windows_runs_the_batch_shim():
    """`WinError 193: %1 is not a valid Win32 application` - what Windows says when it is handed a
    shell script to execute. It killed the Windows matrix cell on its first ever run (33917120184),
    after the bundle had already been downloaded and unpacked."""
    assert shim.shim_name("nt") == "cleon.cmd"
