"""Where the build tools are, and what argv runs them. PURE - every path is an argument.

cleon does not build Eclipse or Ant; it CONSUMES an asbundle bundle that carries both. What this module
knows is that bundle's shape, and it knows it from how asbundle assembles it: the archive is made from
the Eclipse install directory, and `MoveJdkToEclipseCommand` / `MoveAntToEclipseCommand` place the JDK
and Ant INSIDE it. So `jdk/` and `ant/` are siblings of `plugins/`, always - which turns three searches
into one. Find the Eclipse home, and the rest is arithmetic.

Finding it needs candidates rather than a fixed path, because the archive root differs by host: on Linux
and Windows it IS the Eclipse install, on macOS it is the folder CONTAINING `Eclipse.app`. The candidate
list lives in cleon.yaml, so a sixth layout is a manifest edit rather than a code change.
"""
from __future__ import annotations

from pathlib import Path
from typing import Dict, List, Sequence

# What proves a directory is an Eclipse install and not merely a folder named `plugins`. The launcher is
# also the jar the site step runs, so a bundle without it cannot complete the build anyway.
_LAUNCHER = "org.eclipse.equinox.launcher_*.jar"


def eclipse_home(bundle_root: Path, candidates: Sequence[str]) -> Path:
    """The Eclipse install inside an unpacked bundle, by the first candidate that proves itself.

    Candidates are globs relative to the bundle root and are tried IN ORDER, so the manifest decides
    precedence rather than filesystem iteration order. A candidate matching a directory that has no
    launcher jar is not accepted - `plugins` is a common enough folder name that mere existence proves
    nothing, and accepting the wrong one fails much later, inside Ant, with a far worse message.
    """
    for candidate in candidates:
        for plugins in sorted(bundle_root.glob(candidate)):
            if plugins.is_dir() and any(plugins.glob(_LAUNCHER)):
                return plugins.parent
    raise FileNotFoundError(
        f"no Eclipse install under {bundle_root}: none of {list(candidates)} resolved to a directory "
        f"containing {_LAUNCHER}. Is an asbundle bundle unpacked there?")


def plugins_directory(eclipse: Path) -> Path:
    return eclipse / "plugins"


def ant_executable(eclipse: Path, *, windows: bool) -> Path:
    """`ant/bin/ant`, or `ant.bat` on Windows.

    Ant's launcher is a shell script; Windows gets a .bat and no extensionless twin, so a single name
    works on four of the five build hosts and silently fails on the fifth.
    """
    name = "ant.bat" if windows else "ant"
    executable = eclipse / "ant" / "bin" / name
    if not executable.is_file():
        raise FileNotFoundError(
            f"no Ant at {executable} - the bundle should carry it next to plugins/")
    return executable


def java_home(eclipse: Path) -> Path:
    """The bundled JDK.

    Used rather than whatever `java` is on PATH: the plugins declare JavaSE-21 and a runner's default
    JDK is not a thing this build should depend on. The bundle exists precisely so it does not.
    """
    home = eclipse / "jdk"
    if not home.is_dir():
        raise FileNotFoundError(f"no JDK at {home} - the bundle should carry it next to plugins/")
    return home


def ant_argv(executable: Path, build_file: Path, targets: Sequence[str],
             properties: Dict[str, str]) -> List[str]:
    """The argv for one Ant run.

    A LIST, never a shell string: these properties carry filesystem paths, and on Windows they carry
    backslashes and spaces. Every value is passed as its own `-Dkey=value` argument, so nothing is ever
    re-parsed by a shell.

    Properties are emitted in sorted order so two runs of the same build produce the same command line -
    which is what makes a logged command line comparable between a green run and a red one.
    """
    argv = [str(executable), "-f", str(build_file)]
    argv += [f"-D{key}={value}" for key, value in sorted(properties.items())]
    argv += list(targets)
    return argv


def describe(build_file: Path, targets: Sequence[str], properties: Dict[str, str],
             *, width: int = 60) -> List[str]:
    """The run, as lines a human reads in a log.

    NOT the argv. `cleon.plugin.entries` alone is 30 KB of absolute paths, and a 30 KB log line is not a
    log line - it is the reason nobody finds the two properties that actually differ between a green run
    and a red one. Long values are truncated with their full length shown, so the count is still there
    when the content cannot be.
    """
    lines = [f"{build_file.name} -> {', '.join(targets)}"]
    for key, value in sorted(properties.items()):
        shown = value if len(value) <= width else f"{value[:width]}... ({len(value)} chars)"
        lines.append(f"  -D{key}={shown}")
    return lines


def ant_overrides(java: Path, opts: Sequence[str]) -> Dict[str, str]:
    """The environment variables an Ant run needs, as OVERRIDES rather than a whole environment.

    Overrides, because the kernel's `run()` is the one subprocess seam in this codebase and takes no
    `env`: the caller applies these around the call instead of building a full environment and going
    around the seam. Returning only what changes also keeps this function testable without a copy of
    os.environ in every assertion.

    ANT_OPTS rather than a `-D` on the command line: `-Xmx` is a JVM flag, and Ant would take it as a
    project property and ignore it. Generation over 22,000 files is where the default heap runs out - so
    getting this wrong surfaces as an OutOfMemoryError halfway through a CI run, not as a clear error.
    """
    overrides = {"JAVA_HOME": str(java)}
    if opts:
        overrides["ANT_OPTS"] = " ".join(opts)
    return overrides
