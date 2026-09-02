"""Finding the build tools in a bundle, and the argv that runs them.

Every case here builds a bundle SHAPE on disk rather than mocking the filesystem. The thing under test
is a set of assumptions about how asbundle lays a bundle out, and a mock would only ever confirm the
assumption back to me.
"""
from pathlib import Path

import pytest

from orchestrator import antbuild

CANDIDATES = ["plugins", "Eclipse.app/Contents/Eclipse/plugins",
              "*/plugins", "*/Eclipse.app/Contents/Eclipse/plugins"]


def _eclipse(root: Path, *, launcher: bool = True, ant: bool = True, jdk: bool = True) -> Path:
    """A bundle's Eclipse install, as asbundle leaves it: jdk/ and ant/ NEXT TO plugins/."""
    (root / "plugins").mkdir(parents=True)
    if launcher:
        (root / "plugins" / "org.eclipse.equinox.launcher_1.6.900.v20240613.jar").touch()
    if ant:
        (root / "ant" / "bin").mkdir(parents=True)
        (root / "ant" / "bin" / "ant").touch()
        (root / "ant" / "bin" / "ant.bat").touch()
    if jdk:
        (root / "jdk" / "bin").mkdir(parents=True)
    return root


# --- finding the Eclipse install ------------------------------------------------------------------

def test_the_linux_and_windows_layout_is_the_archive_root(tmp_path):
    """asbundle zips the Eclipse install itself on those hosts, so `plugins` is at the top."""
    eclipse = _eclipse(tmp_path)
    assert antbuild.eclipse_home(tmp_path, CANDIDATES) == eclipse


def test_the_macos_layout_is_inside_the_app_bundle(tmp_path):
    """There the archive root is the folder CONTAINING Eclipse.app, so the same fixed path fails.

    This is the whole reason the candidates are a list in cleon.yaml rather than one path in code.
    """
    eclipse = _eclipse(tmp_path / "Eclipse.app" / "Contents" / "Eclipse")
    assert antbuild.eclipse_home(tmp_path, CANDIDATES) == eclipse


def test_a_plugins_directory_without_a_launcher_does_not_count(tmp_path):
    """`plugins` is a common folder name; existence proves nothing.

    Accepting the wrong one does not fail here - it fails much later, inside Ant, with a far worse
    message than the one this raises.
    """
    (tmp_path / "plugins").mkdir()
    with pytest.raises(FileNotFoundError, match="launcher"):
        antbuild.eclipse_home(tmp_path, CANDIDATES)


def test_candidates_are_tried_in_the_order_the_manifest_gives_them(tmp_path):
    """Order is the manifest's decision, not the filesystem's iteration order."""
    preferred = _eclipse(tmp_path)
    _eclipse(tmp_path / "nested")
    assert antbuild.eclipse_home(tmp_path, ["plugins", "*/plugins"]) == preferred
    assert antbuild.eclipse_home(tmp_path, ["*/plugins", "plugins"]) == tmp_path / "nested"


def test_the_failure_names_the_bundle_and_every_candidate_tried(tmp_path):
    """The message is the whole diagnosis for the most likely first-run failure: no bundle unpacked."""
    with pytest.raises(FileNotFoundError) as caught:
        antbuild.eclipse_home(tmp_path, CANDIDATES)
    message = str(caught.value)
    assert str(tmp_path) in message
    assert all(candidate in message for candidate in CANDIDATES)


# --- the tools next to it -------------------------------------------------------------------------

def test_ant_is_a_bat_file_on_windows_and_not_elsewhere(tmp_path):
    """Ant's launcher is a shell script with a .bat twin. One name works on four hosts of five."""
    eclipse = _eclipse(tmp_path)
    assert antbuild.ant_executable(eclipse, windows=False).name == "ant"
    assert antbuild.ant_executable(eclipse, windows=True).name == "ant.bat"


def test_a_bundle_without_ant_says_so(tmp_path):
    eclipse = _eclipse(tmp_path, ant=False)
    with pytest.raises(FileNotFoundError, match="no Ant"):
        antbuild.ant_executable(eclipse, windows=False)


def test_the_bundled_jdk_is_used_rather_than_whatever_is_on_path(tmp_path):
    """The plugins declare JavaSE-21; a runner's default JDK is not something to depend on."""
    eclipse = _eclipse(tmp_path)
    assert antbuild.java_home(eclipse) == eclipse / "jdk"

    with pytest.raises(FileNotFoundError, match="no JDK"):
        antbuild.java_home(_eclipse(tmp_path / "other", jdk=False))


# --- the command line -----------------------------------------------------------------------------

def test_argv_is_a_list_so_no_shell_ever_reparses_a_path(tmp_path):
    """These properties carry absolute paths - on Windows, with backslashes and spaces in them.

    Each becomes ONE argv element. A shell string would split `C:\\Program Files\\...` in half.
    """
    argv = antbuild.ant_argv(Path("/b/ant"), Path("/b/build.xml"), ["package"],
                             {"a.path": "/some/dir with spaces/x"})
    assert argv == ["/b/ant", "-f", "/b/build.xml", "-Da.path=/some/dir with spaces/x", "package"]


def test_properties_are_ordered_so_two_runs_produce_the_same_command_line():
    """Which is what makes a green run's command line comparable to a red one's."""
    argv = antbuild.ant_argv(Path("ant"), Path("b.xml"), ["t"], {"z": "1", "a": "2", "m": "3"})
    assert argv[3:-1] == ["-Da=2", "-Dm=3", "-Dz=1"]


def test_targets_come_last():
    argv = antbuild.ant_argv(Path("ant"), Path("b.xml"), ["compile", "jar"], {"k": "v"})
    assert argv[-2:] == ["compile", "jar"]


# --- the environment ------------------------------------------------------------------------------

def test_heap_goes_to_ant_opts_not_to_a_property():
    """`-Xmx` is a JVM flag. As `-D` Ant takes it for a project property and ignores it - and the build
    dies of OutOfMemory halfway through generating 22,000 files."""
    overrides = antbuild.ant_overrides(Path("/b/jdk"), ["-Xmx4g"])
    assert overrides == {"JAVA_HOME": "/b/jdk", "ANT_OPTS": "-Xmx4g"}


def test_no_opts_means_no_ant_opts_variable():
    """Set to empty rather than unset would OVERRIDE an ANT_OPTS the caller deliberately exported."""
    assert antbuild.ant_overrides(Path("/b/jdk"), []) == {"JAVA_HOME": "/b/jdk"}


# --- the log --------------------------------------------------------------------------------------

def test_a_long_property_is_truncated_but_keeps_its_length():
    """cleon.plugin.entries is 5 KB of absolute paths. Logged whole it is not a log line, it is the
    reason nobody spots the one property that differs between a green run and a red one."""
    lines = antbuild.describe(Path("/x/asbuild.package.xml"), ["package"],
                              {"short": "21", "long": "p" * 400})

    assert lines[0] == "asbuild.package.xml -> package"
    assert "  -Dshort=21" in lines
    long_line = next(line for line in lines if line.startswith("  -Dlong="))
    assert "(400 chars)" in long_line
    assert len(long_line) < 120
