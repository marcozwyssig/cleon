"""Naming the bundle cleon pulls, and the one it publishes.

Every test is Arrange / Act / Assert, one action per test.
"""
import pytest

from orchestrator import bundles

LINUX = ("linux", "x86_64")


# --- picking a published bundle ---------------------------------------------------------------------

def test_only_this_hosts_tags_are_considered():
    """Five hosts push to ONE repository and differ by tag, so the filter is the whole selection."""
    tags = ["4.40-25-0-linux-x86_64", "4.40-25-0-windows-amd64", "4.40-25-0-darwin-arm64"]

    selected = bundles.tags_for_host(tags, LINUX)

    assert selected == ["4.40-25-0-linux-x86_64"]


def test_the_newest_version_wins_numerically_not_alphabetically():
    """String ordering puts `4.9` after `4.40`, which would pin the build to an old Eclipse for as long
    as nobody looked. The failure is silent, which is why it is asserted."""
    tags = ["4.9-25-0-linux-x86_64", "4.40-25-0-linux-x86_64", "4.10-25-0-linux-x86_64"]

    selected = bundles.select_tag(tags, LINUX)

    assert selected == "4.40-25-0-linux-x86_64"


def test_the_jdk_version_breaks_a_tie_on_eclipse():
    """Two bundles of the same Eclipse differ by JDK; the newer JDK is the newer bundle."""
    tags = ["4.40-25.0.3-0-linux-x86_64", "4.40-25.0.4-0-linux-x86_64"]

    selected = bundles.select_tag(tags, LINUX)

    assert selected == "4.40-25.0.4-0-linux-x86_64"


def test_no_tag_for_this_host_fails_loudly():
    """An empty selection means either that asbundle has not published for this platform or that the
    repository name is wrong - different fixes, so the message names what it saw."""
    tags = ["4.40-25-0-windows-amd64"]

    with pytest.raises(LookupError, match="linux/x86_64"):
        bundles.select_tag(tags, LINUX)


def test_an_unpublished_host_is_refused_by_name():
    """windows/arm64 is absent because IBM Semeru ships no aarch64 Windows JDK. A build there should
    say so, not fail later on a missing tag."""
    assert ("windows", "arm64") not in bundles.SUPPORTED_HOSTS


# --- references and names ---------------------------------------------------------------------------

def test_a_reference_has_exactly_one_slash_between_its_parts():
    registry, repository, tag = "ghcr.io/marcozwyssig/", "/asbundle-bundle", "4.40-25-0-linux-x86_64"

    result = bundles.reference(registry, repository, tag)

    assert result == "ghcr.io/marcozwyssig/asbundle-bundle:4.40-25-0-linux-x86_64"


def test_a_feature_is_installed_as_a_feature_group():
    """p2 installs `<id>.feature.group`; the bare id names the feature JAR and resolves to nothing.
    Getting this wrong yields "installable unit not found", the least informative message p2 has."""
    feature_ids = ["cleon.common.doc", "cleon.modelinglanguages.uml"]

    units = bundles.feature_group_ids(feature_ids)

    assert units == ["cleon.common.doc.feature.group", "cleon.modelinglanguages.uml.feature.group"]


def test_the_published_name_records_the_bundle_it_was_built_on():
    """This artefact is not reproducible from cleon's version alone - it carries a particular Eclipse,
    JDK and Actifsource. Two of these files must be tellable apart without unzipping either."""
    source_tag = "4.40-25.0.4-0-linux-x86_64"

    name = bundles.combined_bundle_name("0.4.149.qualifier", LINUX, source_tag)

    assert name == "cleon_0.4.149.qualifier_on_4.40-25.0.4-0-linux-x86_64.zip"


def test_the_version_is_read_from_a_jar_this_build_produced():
    """cleon's version is generated into every feature by the model and written nowhere a build can read
    directly, so the artefact is named after what is actually inside it."""
    jar_name = "cleon.applications.actifsource_0.4.149.qualifier.jar"

    version = bundles.version_from_jar(jar_name)

    assert version == "0.4.149.qualifier"


def test_a_jar_name_without_a_version_is_refused():
    with pytest.raises(ValueError, match="cannot read a version"):
        bundles.version_from_jar("nonsense.jar")


# --- permissions the archive records ----------------------------------------------------------------
# Run 33720226519 died one step after a 591 MB download with
#   PermissionError: [Errno 13] Permission denied: .../build/bundle/ant/bin/ant
# `zipfile.extractall` creates every file 0644 and drops the modes the archive stored.

def test_an_executable_mode_is_read_back_from_the_entry():
    external_attr = 0o100755 << 16          # what ZipInfo.from_file writes for `chmod 755`

    mode = bundles.recorded_mode(external_attr)

    assert mode == 0o755


def test_a_plain_file_keeps_its_own_mode():
    external_attr = 0o100644 << 16

    mode = bundles.recorded_mode(external_attr)

    assert mode == 0o644


def test_an_archive_built_on_windows_records_nothing_usable():
    """0 means "this archive has no opinion", and the caller must then leave the file alone rather
    than invent a mode. A Windows bundle is only ever unpacked on Windows anyway."""
    external_attr = 0

    mode = bundles.recorded_mode(external_attr)

    assert mode == 0


# --- project names ----------------------------------------------------------------------------------
# Actifsource addresses a project as `project:<name>` and finds it by DIRECTORY name. That works by
# accident for the 106 generated projects and not at all for the root one, whose directory is `cleon`.

def test_the_project_name_is_read_from_the_project_file():
    dot_project = ("<projectDescription>"
                   "<name>cleonproject.deliverables.architecture.model.architecture</name>"
                   "<comment></comment></projectDescription>")

    name = bundles.project_name(dot_project)

    assert name == "cleonproject.deliverables.architecture.model.architecture"


def test_surrounding_whitespace_is_dropped():
    dot_project = "<projectDescription>\n  <name>  cleon.common.doc  </name>\n</projectDescription>"

    name = bundles.project_name(dot_project)

    assert name == "cleon.common.doc"


def test_a_project_file_without_a_name_is_refused():
    with pytest.raises(ValueError, match="no <name>"):
        bundles.project_name("<projectDescription/>")


# --- the registry tag -------------------------------------------------------------------------------
# The filename always carried both versions; the tag carried only cleon's, so two builds of the same
# cleon on different bases shared one tag and the second silently replaced the first.

def test_the_tag_names_the_base_it_was_built_on():
    source_tag = "4.40-25.0.4-0-linux-x86_64"

    tag = bundles.combined_tag("0.4.149.qualifier", source_tag)

    assert tag == "0.4.149.qualifier-4.40-25.0.4-0-linux-x86_64"


def test_the_architecture_survives_normalisation():
    """A docker reference admits `_`. Replacing it would turn x86_64 into x86-64 - a different
    architecture name, in a tag consumers select by."""
    source_tag = "4.40-25.0.4-0-linux-x86_64"

    tag = bundles.combined_tag("0.4.149.qualifier", source_tag)

    assert tag.endswith("linux-x86_64")


def test_a_plus_is_removed_because_a_reference_cannot_hold_one():
    source_tag = "4.40-25.0.4+0-linux-x86_64"

    tag = bundles.combined_tag("0.4.149.QUALIFIER", source_tag)

    assert "+" not in tag
    assert tag == tag.lower()


# --- the build number -------------------------------------------------------------------------------
# `0.4.149.qualifier` is a PLACEHOLDER that Eclipse's build replaces and ours did not, so every
# artefact carried the word `qualifier` where a build number belongs.

def test_the_qualifier_carries_the_commit_time_and_its_sha():
    commit_timestamp, short_sha = "v20260903-0816", "a1b2c3d"

    qualifier = bundles.build_qualifier(commit_timestamp, short_sha)

    assert qualifier == "v20260903-0816-a1b2c3d"


def test_a_missing_input_is_refused_rather_than_guessed():
    """Deriving from the clock instead would produce versions that are not reproducible, quietly."""
    with pytest.raises(ValueError, match="required"):
        bundles.build_qualifier("", "a1b2c3d")


def test_the_placeholder_is_replaced_in_a_version():
    qualifier = "v20260903-0816-a1b2c3d"

    version = bundles.apply_qualifier("0.4.149.qualifier", qualifier)

    assert version == "0.4.149.v20260903-0816-a1b2c3d"


def test_a_version_that_decided_already_is_left_alone():
    """Substituting into it would silently rewrite someone's deliberate choice."""
    qualifier = "v20260903-0816-a1b2c3d"

    version = bundles.apply_qualifier("1.2.3", qualifier)

    assert version == "1.2.3"
