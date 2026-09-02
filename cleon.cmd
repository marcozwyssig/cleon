@echo off
:: cleon.cmd - the Windows entry point (#3).
::
:: The counterpart of cleon.sh. It makes no decisions: it locates a Python 3 and hands over to
:: deploy\provision\orchestrator\launch.py, which owns the whole host-venv bootstrap (create, repair, and
:: install when requirements.txt is newer than the stamp), then runs `python -u -m orchestrator`.
::
:: The logic lives in Python rather than here because batch cannot compare two file timestamps without
:: contortions, and because the same file then behaves identically on every platform. No PowerShell is
:: involved anywhere in this path.
::
:: Written with `&&` and gotos rather than if/else blocks on purpose: %ERRORLEVEL% inside a
:: parenthesised block is expanded when the block is PARSED, not when it runs, so a nested check would
:: read the errorlevel from before the block and pick the wrong interpreter.
setlocal

:: `python` first: on GitHub's Windows runners setup-python puts it on PATH. `py -3` is the launcher
:: shipped by the python.org installer, the usual fallback on a developer machine. `python3` is NOT
:: probed: on Windows it is often an App Execution Alias that opens the Microsoft Store instead of
:: running anything, which would hang a CI job rather than fail it.
where python >nul 2>nul && set "CLEON_PY=python" && goto :run
where py >nul 2>nul && set "CLEON_PY=py -3" && goto :run

echo cleon: python 3 is required on PATH ^(the orchestrator is host-Python^) 1>&2
exit /b 1

:run
%CLEON_PY% "%~dp0deploy\provision\orchestrator\launch.py" %*
exit /b %ERRORLEVEL%
