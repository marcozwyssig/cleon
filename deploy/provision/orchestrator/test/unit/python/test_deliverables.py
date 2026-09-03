"""What cleon ships, checked against cleon.

Two kinds of test here, on purpose:

  - PURE unit tests over literal XML, for the parsing rules;
  - `@pytest.mark.repository` tests that run `resolve()` over THIS checkout.

The second kind is the one that matters. The whole point of deriving the module list from site.xml is
that the derivation can be wrong in ways a fixture will never show - a feature the site names but nobody
generated, a plugin id that differs from its directory name, a build output mistaken for a project. A
fixture I wrote would agree with the code I wrote. The repository does not.
"""
import sys
from pathlib import Path

import pytest

from orchestrator import deliverables

# The block is <root>/deploy/provision/orchestrator, this file <block>/test/unit/python/. Found by the
# same marker walk conftest uses rather than counted hops.
_HERE = Path(__file__).resolve()
ROOT = next(d for d in _HERE.parents if (d / "cleon.yaml").is_file())


# --- site.xml -----------------------------------------------------------------------------------

def test_site_feature_ids_are_deduplicated_and_sorted():
    site = """<site>
      <feature id="b.feature" url="features/b.feature_1.0.0.jar" version="1.0.0"/>
      <feature id="a.feature" url="features/a.feature_1.0.0.jar" version="1.0.0"/>
      <feature id="b.feature" url="features/b.feature_1.0.0.jar" version="1.0.0"/>
    </site>"""
    assert deliverables.site_feature_ids(site) == ["a.feature", "b.feature"]


def test_site_without_features_yields_nothing():
    assert deliverables.site_feature_ids("<site><category-def name='x'/></site>") == []
    assert deliverables.site_feature_ids("") == []


# --- feature.xml --------------------------------------------------------------------------------

def test_a_feature_ships_its_plugins_but_not_its_imports():
    """`<plugin id>` is shipped; `<import plugin=>` is a dependency on someone else's bundle.

    Getting this backwards does not fail loudly - it tries to BUILD Actifsource and Eclipse from this
    repository, and reports them as plugins nobody provides.
    """
    feature = """<feature id="x.feature" version="0.4.149.qualifier">
      <requires>
        <import plugin="ch.actifsource.core" version="6.0.0" match="greaterOrEqual"/>
        <import plugin="org.eclipse.ui"/>
      </requires>
      <plugin id="x.metamodel" version="0.4.149.qualifier"/>
      <plugin id="x.diagram" version="0.4.149.qualifier"/>
    </feature>"""
    assert deliverables.feature_plugin_ids(feature) == ["x.diagram", "x.metamodel"]


def test_a_feature_with_only_imports_ships_nothing():
    feature = """<feature id="x.feature">
      <requires><import plugin="ch.actifsource.core"/></requires>
    </feature>"""
    assert deliverables.feature_plugin_ids(feature) == []


# --- MANIFEST.MF --------------------------------------------------------------------------------

def test_symbolic_name_drops_the_singleton_directive():
    manifest = ("Manifest-Version: 1.0\n"
                "Bundle-SymbolicName: cleon.common.doc.metamodel.builtin;singleton:=true\n"
                "Bundle-Version: 0.4.149.qualifier\n")
    assert deliverables.bundle_symbolic_name(manifest) == "cleon.common.doc.metamodel.builtin"


def test_symbolic_name_is_read_from_its_own_line():
    """Anchored per line, so a header that merely CONTAINS the words is not mistaken for it."""
    manifest = ("Manifest-Version: 1.0\n"
                "Require-Bundle: Bundle-SymbolicName: not.this.one\n"
                "Bundle-SymbolicName: the.real.one\n")
    assert deliverables.bundle_symbolic_name(manifest) == "the.real.one"


def test_a_manifest_without_a_symbolic_name_yields_empty():
    assert deliverables.bundle_symbolic_name("Manifest-Version: 1.0\n") == ""
    assert deliverables.bundle_symbolic_name("") == ""


# --- the index ----------------------------------------------------------------------------------

def test_build_output_is_not_mistaken_for_a_project(tmp_path):
    """`javac` writes a full bin/META-INF/MANIFEST.MF into every project it compiles.

    Note what this case does NOT prove. With a directory literally named `bin`, the real manifest wins
    anyway - `sorted()` puts `<project>/META-INF/...` before `<project>/bin/META-INF/...` because "M"
    sorts before "b". The build is therefore correct today by ASCII accident, not by design, which is
    precisely why the `.project` check exists rather than a reliance on ordering. The case below is the
    one that discriminates.
    """
    project = tmp_path / "x.metamodel"
    (project / "META-INF").mkdir(parents=True)
    (project / ".project").write_text("<projectDescription/>")
    (project / "META-INF" / "MANIFEST.MF").write_text("Bundle-SymbolicName: x.metamodel\n")
    (project / "bin" / "META-INF").mkdir(parents=True)
    (project / "bin" / "META-INF" / "MANIFEST.MF").write_text("Bundle-SymbolicName: x.metamodel\n")

    assert deliverables._index_plugins(tmp_path) == {"x.metamodel": project}


def test_a_manifest_that_is_not_a_projects_own_is_ignored(tmp_path):
    """A copied manifest under a directory sorting BEFORE `META-INF` - `Backup`, `Classes`, an export.

    Here the ordering accident runs the other way and the copy would win, mapping the symbolic name
    onto a directory that is not a project at all. Remove the `.project` check and this test goes red;
    that is what makes the check load-bearing rather than decorative.
    """
    project = tmp_path / "x.metamodel"
    (project / "Backup" / "META-INF").mkdir(parents=True)
    (project / ".project").write_text("<projectDescription/>")
    (project / "Backup" / "META-INF" / "MANIFEST.MF").write_text("Bundle-SymbolicName: x.metamodel\n")

    assert deliverables._index_plugins(tmp_path) == {}


def test_skip_matches_a_top_level_directory_and_a_nested_one(tmp_path):
    def project(path: Path, name: str) -> Path:
        (path / "META-INF").mkdir(parents=True)
        (path / ".project").write_text("<projectDescription/>")
        (path / "META-INF" / "MANIFEST.MF").write_text(f"Bundle-SymbolicName: {name}\n")
        return path

    kept = project(tmp_path / "a.metamodel", "a.metamodel")
    project(tmp_path / "a.sample", "a.sample")                       # skipped: it IS the directory
    project(tmp_path / "a.sample" / "src" / "a.sample.inner", "a.sample.inner")   # skipped: below it

    assert deliverables._index_plugins(tmp_path, skip=("a.sample",)) == {"a.metamodel": kept}


# --- against the real checkout ------------------------------------------------------------------

@pytest.mark.repository
def test_resolve_agrees_with_this_repository():
    """The numbers are asserted, not just the absence of an exception.

    32 features and 34 plugins out of 106 projects. If a change to the model makes this 106, the site
    has started shipping the samples; if it makes it 0, site.xml was not generated. Both are worth a red
    test, and neither shows up as an error anywhere else.
    """
    result = deliverables.resolve(ROOT)

    assert len(result.feature_ids) == 32
    assert len(result.plugin_ids) == 34
    assert len(result.feature_dirs) == len(result.feature_ids)
    assert len(result.plugin_dirs) == len(result.plugin_ids)

    # Far fewer than what a glob would build.
    assert len(list((ROOT / "src").rglob(".project"))) > 100


@pytest.mark.repository
def test_every_resolved_directory_exists_and_is_a_project():
    result = deliverables.resolve(ROOT)
    for directory in result.feature_dirs:
        assert (directory / "feature.xml").is_file(), directory
    for directory in result.plugin_dirs:
        assert (directory / "META-INF" / "MANIFEST.MF").is_file(), directory
        assert (directory / ".project").is_file(), directory
        assert "bin" not in directory.parts, f"{directory} is a build output, not a project"


@pytest.mark.repository
def test_no_actifsource_or_eclipse_bundle_is_scheduled_for_building():
    """The `<import plugin>` rule, checked where it actually bites.

    Actifsource Enterprise cannot be redistributed, so a build plan naming `ch.actifsource.*` is not
    merely wrong, it is a plan to ship something this project has no right to ship.
    """
    result = deliverables.resolve(ROOT)
    foreign = [p for p in result.plugin_ids if not p.startswith("cleon.")]
    assert foreign == [], f"not ours to build: {foreign}"


@pytest.mark.repository
def test_plugin_ids_are_not_simply_their_directory_names():
    """Guards the reason bundle_symbolic_name exists at all.

    `src/cleon.common.doc.metamodel` provides `cleon.common.doc.metamodel.builtin`. Resolving by
    directory name would silently drop every plugin whose id differs from its folder - so if this
    assertion ever stops holding, the cheaper approach has become correct and this module can shrink.
    """
    result = deliverables.resolve(ROOT)
    mismatched = [d.name for d, i in zip(result.plugin_dirs, result.plugin_ids) if d.name != i]
    assert mismatched, "no id differs from its directory any more"


@pytest.mark.repository
def test_a_feature_the_repository_lacks_fails_loudly(tmp_path):
    """A dangling reference must fail BEFORE compiling, naming what is missing.

    Discovering it later means an update site that is quietly missing a jar - which installs, and then
    fails on the user's machine.
    """
    site = tmp_path / "src" / "cleon.site"
    site.mkdir(parents=True)
    site.joinpath("site.xml").write_text(
        '<site><feature id="cleon.nonexistent.feature" version="0.4.149.qualifier"/></site>')

    with pytest.raises(FileNotFoundError, match="cleon.nonexistent.feature"):
        deliverables.resolve(tmp_path)


def test_a_plugin_nobody_provides_fails_loudly(tmp_path):
    source = tmp_path / "src"
    site = source / "cleon.site"
    site.mkdir(parents=True)
    # id "x" -> directory "x.feature": the suffix is the CONVENTION, not part of the id.
    site.joinpath("site.xml").write_text('<site><feature id="x"/></site>')
    feature = source / "x.feature"
    feature.mkdir()
    feature.joinpath("feature.xml").write_text(
        '<feature id="x"><plugin id="x.ghost"/></feature>')

    with pytest.raises(FileNotFoundError, match="x.ghost"):
        deliverables.resolve(tmp_path)


# --- versions and jar names ---------------------------------------------------------------------

def test_bundle_version_is_left_literal():
    """`qualifier` is NOT substituted. site.xml refers to `..._0.4.149.qualifier.jar`, so replacing it
    produces jars the generated site cannot find."""
    assert deliverables.bundle_version("Bundle-Version: 0.4.149.qualifier\n") == "0.4.149.qualifier"


def test_feature_version_is_the_root_elements_own():
    feature = ('<feature id="x" version="0.4.149.qualifier">'
               '<includes id="y" version="9.9.9"/></feature>')
    assert deliverables.feature_version(feature) == "0.4.149.qualifier"


def test_site_entries_are_read_regardless_of_attribute_order():
    """cleon's generated site puts `url` before `id`; hand-written sites do the reverse."""
    site = """<site>
      <feature url="features/a_1.0.0.jar" id="a" version="1.0.0"/>
      <feature id="b" version="1.0.0" url="features/b_1.0.0.jar"/>
    </site>"""
    assert deliverables.site_feature_urls(site) == {
        "a": "features/a_1.0.0.jar", "b": "features/b_1.0.0.jar"}


# --- Require-Bundle and compile order ------------------------------------------------------------

def test_require_bundle_survives_manifest_line_folding():
    """A manifest header wraps at 72 columns and continues on a line beginning with one space.

    Parsing without unfolding reads only the first dependency - so a plugin loses its edges, and the
    compile order loses them with it. Silently, and only for the long headers.
    """
    manifest = ("Bundle-SymbolicName: x\n"
                "Require-Bundle: cleon.a;bundle-version=\"0.4.0\",\n"
                " cleon.b;visibility:=reexport,\n"
                " org.eclipse.ui\n"
                "Bundle-Version: 0.4.149.qualifier\n")
    assert deliverables.required_bundles(manifest) == ["cleon.a", "cleon.b", "org.eclipse.ui"]


def test_no_require_bundle_means_no_dependencies():
    assert deliverables.required_bundles("Bundle-SymbolicName: x\n") == []


def test_compile_order_puts_dependencies_first():
    order = deliverables.compile_order({"a": ["b"], "b": ["c"], "c": []})
    assert order == ["c", "b", "a"]


def test_compile_order_ignores_bundles_outside_the_set():
    """`org.eclipse.ui` comes from the bundle, not from this build - it is not a node."""
    assert deliverables.compile_order({"a": ["org.eclipse.ui", "ch.actifsource.core"]}) == ["a"]


def test_compile_order_breaks_ties_alphabetically():
    """Reproducible rather than dict-order dependent, so two machines build in the same order."""
    assert deliverables.compile_order({"b": [], "a": [], "c": ["a"]}) == ["a", "b", "c"]


def test_a_cycle_is_reported_rather_than_ordered_arbitrarily():
    with pytest.raises(ValueError, match="cycle"):
        deliverables.compile_order({"a": ["b"], "b": ["a"]})


# --- the repository, again ------------------------------------------------------------------------

@pytest.mark.repository
def test_feature_jar_names_match_what_the_site_expects():
    """The strongest check available without running a build.

    site.xml states each jar's exact filename. If the derivation and the site disagree, the published
    update site is missing exactly that feature - which installs fine and fails on the user's machine.
    resolve() raises on a mismatch, so this asserts the agreement is real and not vacuous.
    """
    result = deliverables.resolve(ROOT)
    expected = deliverables.site_feature_urls(
        (ROOT / "src" / "cleon.site" / "site.xml").read_text(encoding="utf-8"))

    assert len(expected) == 32
    assert [f"features/{jar}" for jar in result.feature_jars] == \
           [expected[fid] for fid in result.feature_ids]


@pytest.mark.repository
def test_plugin_jars_are_named_after_the_symbolic_name_not_the_directory():
    result = deliverables.resolve(ROOT)
    for directory, plugin_id, jar in zip(result.plugin_dirs, result.plugin_ids, result.plugin_jars):
        assert jar.startswith(f"{plugin_id}_"), jar
        assert not jar.startswith(f"{directory.name}_"), \
            f"{jar} was named after its folder, which is wrong for every plugin here"


@pytest.mark.repository
def test_the_compile_order_satisfies_every_internal_dependency():
    """Checked over the real 284 edges, not a three-node fixture.

    `exportdependency` resolves an inter-project dependency to the other project's `bin/`, so a plugin
    compiled before something it requires compiles against an empty directory.
    """
    result = deliverables.resolve(ROOT)
    position = {plugin: index for index, plugin in enumerate(result.plugin_ids)}

    violations = []
    edges = 0
    for index, (directory, plugin_id) in enumerate(zip(result.plugin_dirs, result.plugin_ids)):
        manifest = (directory / "META-INF" / "MANIFEST.MF").read_text(encoding="utf-8", errors="ignore")
        for dependency in deliverables.required_bundles(manifest):
            if dependency in position:
                edges += 1
                if position[dependency] > index:
                    violations.append(f"{plugin_id} before {dependency}")

    assert edges > 200, "the internal dependencies vanished - is Require-Bundle still being parsed?"
    assert violations == []
    assert result.plugin_ids != sorted(result.plugin_ids), \
        "the order is alphabetical, so it is not the computed one"


@pytest.mark.repository
def test_entries_pair_each_directory_with_its_own_jar():
    result = deliverables.resolve(ROOT)
    entries = result.plugin_entries()

    assert len(entries) == len(result.plugin_dirs)
    assert entries[0] == f"{result.plugin_dirs[0]}|{result.plugin_jars[0]}"
    # The Ant side splits on ";" between entries and "|" within one.
    assert all(entry.count("|") == 1 and ";" not in entry
               for entry in entries + result.feature_entries())


# --- the build number in the derived names -----------------------------------------------------------

@pytest.mark.repository
def test_the_qualifier_reaches_every_jar_name():
    """All four places - manifest, feature definition, site and filename - must agree, or p2 looks for
    a version nothing carries and reports it as "could not be found"."""
    qualifier = "v20260903-0816-a1b2c3d"

    result = deliverables.resolve(ROOT, qualifier=qualifier)

    assert all(qualifier in jar for jar in result.feature_jars)
    assert all(qualifier in jar for jar in result.plugin_jars)
    assert not any("qualifier.jar" in jar for jar in result.feature_jars + result.plugin_jars)


@pytest.mark.repository
def test_without_a_qualifier_the_placeholder_survives():
    """The Ant file defaults to leaving it alone too, so a standalone run still produces what it did."""
    result = deliverables.resolve(ROOT)

    assert all(jar.endswith("_0.4.149.qualifier.jar") for jar in result.feature_jars)


@pytest.mark.repository
def test_the_site_cross_check_still_holds_with_a_qualifier():
    """site.xml holds the placeholder; the Ant build substitutes it there at the same moment. If the
    comparison were made against the raw site, every feature would look mismatched."""
    qualifier = "v20260903-0816-a1b2c3d"

    result = deliverables.resolve(ROOT, qualifier=qualifier)

    assert len(result.feature_jars) == 32          # resolve() raises on a mismatch, so this is the check
