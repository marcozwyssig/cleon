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
