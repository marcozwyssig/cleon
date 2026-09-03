"""What cleon actually ships: the features on the update site, and the plugins those features carry.

PURE - it reads text and returns names. Every path arrives as an argument, nothing here touches a
network or a build tool. That is what lets the module list be tested against the real repository
instead of trusted.

WHY THIS IS NOT A GLOB. There are 106 `.project` files under `src/`, and the deliverable is 32 features
and the plugins they name. The difference is not noise:

  - the samples are not shipped, and they are also the only NESTED projects - Eclipse cannot import
    nested projects, so a glob does not merely build too much, it fails;
  - 17 plugins belong to no feature at all;
  - the repository ROOT is itself a plugin project, and is not part of the deliverable either - it
    carries version 0.3.11 while everything shipped is 0.4.149.

So the set is derived the way Eclipse derives it: site.xml names the features, each feature names its
plugins, and nothing else is built.
"""
from __future__ import annotations

import re
from pathlib import Path
from typing import Dict, List, NamedTuple

# `<feature ... id="cleon.common.doc" ...>` on the site, and the same attribute on a feature itself.
_SITE_FEATURE = re.compile(r'<feature\b[^>]*\bid="([^"]+)"')

# A feature's OWN plugins. `<plugin id="..."/>` is what the feature ships; `<import plugin="..."/>` is
# a dependency on something else - Actifsource, Eclipse - and must not be built here. The two are
# easily confused because both carry a plugin name; the element decides.
_FEATURE_PLUGIN = re.compile(r'<plugin\b[^>]*\bid="([^"]+)"')

_BUNDLE_SYMBOLIC_NAME = re.compile(r'^Bundle-SymbolicName:\s*([^;\s]+)', re.MULTILINE)
_BUNDLE_VERSION = re.compile(r'^Bundle-Version:\s*(\S+)', re.MULTILINE)
_REQUIRE_BUNDLE = re.compile(r'^Require-Bundle:\s*(.*)$', re.MULTILINE)

# A manifest header wraps at 72 columns and continues on a line starting with ONE space. Unfolding
# before parsing is not optional: `Require-Bundle: cleon.a,\n cleon.b` otherwise reads as one
# dependency on `cleon.a` and a stray line, so a plugin silently loses its dependencies - and the
# compile order derived from them silently loses its edges.
_CONTINUATION = re.compile(r'\r?\n ')

# The root element's own `version`, which precedes every nested one in the document.
_FEATURE_VERSION = re.compile(r'<feature\b[^>]*\bversion="([^"]+)"')

# `<feature url="features/cleon.x_0.4.149.qualifier.jar" id="cleon.x" .../>` - the site states the exact
# filename it expects, which is what makes the jar names checkable rather than merely plausible.
_SITE_ENTRY = re.compile(r'<feature\b(?=[^>]*\bid="([^"]+)")(?=[^>]*\burl="([^"]+)")')


class Deliverables(NamedTuple):
    """The projects to build, by directory, the ids they produce, and the jars those become.

    The jar NAMES are here, and not left to the Ant build, for one reason: an OSGi jar must be called
    `<symbolic-name>_<version>.jar`, and in this repository the symbolic name is never the directory
    name - all 34 plugins add a `.builtin` suffix. An Ant `<basename>` over the project directory is the
    obvious way to name a jar and it is wrong for every single one of them, silently: the jars build,
    the site publishes, and nothing resolves. Deriving it here means it is derived once and tested.
    """

    feature_dirs: List[Path]
    plugin_dirs: List[Path]
    feature_ids: List[str]
    plugin_ids: List[str]          # in COMPILE order, not alphabetical - see compile_order
    feature_jars: List[str]
    plugin_jars: List[str]

    def feature_entries(self) -> List[str]:
        """`<dir>|<jar>` pairs for the Ant build - see plugin_entries."""
        return [f"{d}|{j}" for d, j in zip(self.feature_dirs, self.feature_jars)]

    def plugin_entries(self) -> List[str]:
        """`<dir>|<jar>` pairs for the Ant build.

        Paired rather than passed as two parallel lists: two lists that must stay in the same order are
        two things to get wrong, and Ant would not notice a misalignment - it would just write each
        project's content under the next project's name.
        """
        return [f"{d}|{j}" for d, j in zip(self.plugin_dirs, self.plugin_jars)]


def _qualified(text: str, qualifier: str) -> str:
    """Replace the placeholder `.qualifier` with the build number, if one was given."""
    return text.replace(".qualifier", f".{qualifier}") if qualifier else text


def site_feature_ids(site_xml: str) -> List[str]:
    """The feature ids an update site aggregates, deduplicated and sorted."""
    return sorted(set(_SITE_FEATURE.findall(site_xml or "")))


def feature_plugin_ids(feature_xml: str) -> List[str]:
    """The plugin ids one feature SHIPS - `<plugin>`, never `<import plugin=...>`."""
    return sorted(set(_FEATURE_PLUGIN.findall(feature_xml or "")))


def site_feature_urls(site_xml: str) -> Dict[str, str]:
    """Feature id -> the jar path the site expects, e.g. `features/cleon.x_0.4.149.qualifier.jar`.

    Attribute ORDER is not fixed in these files (`url` precedes `id` here, the reverse elsewhere), so
    this matches on presence rather than sequence.
    """
    return {feature_id: url for feature_id, url in _SITE_ENTRY.findall(site_xml or "")}


def bundle_version(manifest: str) -> str:
    """A plugin's `Bundle-Version`, literal - `qualifier` is NOT substituted here.

    Nothing in this repository substitutes it: site.xml refers to `..._0.4.149.qualifier.jar`, so a
    build that replaces the qualifier produces jars the site cannot find. Left alone deliberately.
    """
    match = _BUNDLE_VERSION.search(manifest or "")
    return match.group(1).strip() if match else ""


def feature_version(feature_xml: str) -> str:
    """A feature's own `version` attribute."""
    match = _FEATURE_VERSION.search(feature_xml or "")
    return match.group(1).strip() if match else ""


def required_bundles(manifest: str) -> List[str]:
    """The bundles a plugin requires, by symbolic name, attributes stripped."""
    unfolded = _CONTINUATION.sub("", manifest or "")
    match = _REQUIRE_BUNDLE.search(unfolded)
    if not match:
        return []
    return [entry.split(";")[0].strip()
            for entry in match.group(1).split(",") if entry.strip()]


def compile_order(requirements: Dict[str, List[str]]) -> List[str]:
    """Plugin ids ordered so that every plugin follows the ones it requires.

    NOT alphabetical, which is what `sorted()` gives and what a build would otherwise use. These 34
    plugins carry 284 dependencies on each other, and `exportdependency` resolves an inter-project
    dependency to the other project's `bin/` - a directory that is EMPTY until that project has been
    compiled. In alphabetical order roughly half of them compile against nothing.

    Ties break alphabetically, so the order is reproducible rather than dict-order dependent. A cycle
    raises: javac cannot compile a cycle one project at a time, and a build that silently picks an
    arbitrary entry point produces a different failure on every machine.
    """
    pending = {plugin: {d for d in deps if d in requirements}
               for plugin, deps in requirements.items()}
    ordered: List[str] = []
    while pending:
        ready = sorted(p for p, deps in pending.items() if not deps)
        if not ready:
            raise ValueError(
                "dependency cycle among plugins: " + ", ".join(sorted(pending)))
        ordered.extend(ready)
        for plugin in ready:
            del pending[plugin]
        for deps in pending.values():
            deps.difference_update(ready)
    return ordered


def bundle_symbolic_name(manifest: str) -> str:
    """A plugin's symbolic name, without any `;singleton:=true` suffix.

    Needed because a plugin's ID and its DIRECTORY differ: the directory is
    `src/cleon.common.doc.metamodel`, the id `cleon.common.doc.metamodel.builtin`. Matching on the
    directory name would quietly miss every plugin.
    """
    match = _BUNDLE_SYMBOLIC_NAME.search(manifest or "")
    return match.group(1).strip() if match else ""


def _index_plugins(source_root: Path, skip: tuple = ()) -> Dict[str, Path]:
    """Every plugin PROJECT under `source_root`, by symbolic name.

    A project is a directory holding BOTH `.project` and `META-INF/MANIFEST.MF`. The `.project` half is
    not decoration: `javac` writes a full `bin/META-INF/MANIFEST.MF` copy into every project it
    compiles, so a search for manifests alone finds each plugin twice - once as itself, once as its own
    build output - and would map a symbolic name onto `<project>/bin`. That yields a jar of a jar on the
    second run and never on the first, which is the sort of bug that only appears in CI.

    `skip` names directories that are not part of the deliverable, matched against ANY segment of the
    path: `skip=("x",)` drops both `src/x` and `src/x/src/y`. The samples are the reason - they are not
    shipped, and their nested projects are ones Eclipse cannot import at all.
    """
    index: Dict[str, Path] = {}
    for manifest_path in sorted(source_root.rglob("META-INF/MANIFEST.MF")):
        project = manifest_path.parent.parent
        if not (project / ".project").is_file():
            continue
        if any(part in skip for part in project.relative_to(source_root).parts):
            continue
        name = bundle_symbolic_name(manifest_path.read_text(encoding="utf-8", errors="ignore"))
        if name:
            index.setdefault(name, project)
    return index


def resolve(repository_root: Path, site_project: str = "cleon.site",
            skip_directories: tuple = (), qualifier: str = "") -> Deliverables:
    """The features and plugins to build, derived from the update site outwards.

    Fails loudly on a dangling reference. A feature the site names but the repository does not contain,
    or a plugin a feature names and nobody provides, means the generated tree and the site definition
    disagree - and the honest moment to say so is before compiling, not when the site turns out to be
    missing a jar.

    `qualifier`, when given, replaces the literal `.qualifier` in every jar name. The same value has to
    reach the manifests, the feature definitions and site.xml - the Ant build does those - or p2 looks
    for a version nothing carries.
    """
    source_root = repository_root / "src"
    site_xml = (source_root / site_project / "site.xml").read_text(encoding="utf-8", errors="ignore")

    feature_ids = site_feature_ids(site_xml)
    expected_urls = site_feature_urls(site_xml)
    feature_dirs, feature_jars, plugin_ids = [], [], set()
    missing_features = []
    for feature_id in feature_ids:
        directory = source_root / f"{feature_id}.feature"
        if not (directory / "feature.xml").is_file():
            missing_features.append(feature_id)
            continue
        feature_xml = (directory / "feature.xml").read_text(encoding="utf-8", errors="ignore")
        feature_dirs.append(directory)
        version = feature_version(feature_xml)
        feature_jars.append(f"{feature_id}_{_qualified(version, qualifier)}.jar")
        plugin_ids.update(feature_plugin_ids(feature_xml))

    if missing_features:
        raise FileNotFoundError(
            f"{site_project}/site.xml names {len(missing_features)} feature(s) with no project: "
            f"{', '.join(missing_features)}")

    index = _index_plugins(source_root, skip_directories)
    missing_plugins = sorted(p for p in plugin_ids if p not in index)
    if missing_plugins:
        raise FileNotFoundError(
            f"{len(missing_plugins)} plugin(s) are named by a feature but provided by no project: "
            f"{', '.join(missing_plugins)}")

    # The site names the jar it expects. Comparing against it turns "the version we derived" from an
    # assumption into a checked fact - and catches a feature whose own version has drifted from the
    # generated site, which otherwise surfaces as an update site missing exactly one feature.
    #
    # Compared with the qualifier applied to BOTH sides: site.xml still holds the placeholder here, and
    # the Ant build substitutes it there at the same moment it substitutes it in the feature jars.
    mismatched = [f"{jar} (site expects {expected_urls[fid]})"
                  for fid, jar in zip(feature_ids, feature_jars)
                  if fid in expected_urls
                  and _qualified(expected_urls[fid], qualifier) != f"features/{jar}"]
    if mismatched:
        raise ValueError(
            f"{len(mismatched)} feature jar name(s) disagree with {site_project}/site.xml: "
            f"{', '.join(mismatched)}")

    manifests = {p: (index[p] / "META-INF" / "MANIFEST.MF").read_text(encoding="utf-8", errors="ignore")
                 for p in plugin_ids}
    ordered_plugins = compile_order({p: required_bundles(m) for p, m in manifests.items()})
    plugin_dirs = [index[p] for p in ordered_plugins]
    plugin_jars = [f"{p}_{_qualified(bundle_version(manifests[p]), qualifier)}.jar"
                   for p in ordered_plugins]

    return Deliverables(
        feature_dirs=feature_dirs,
        plugin_dirs=plugin_dirs,
        feature_ids=feature_ids,
        plugin_ids=ordered_plugins,
        feature_jars=feature_jars,
        plugin_jars=plugin_jars)
