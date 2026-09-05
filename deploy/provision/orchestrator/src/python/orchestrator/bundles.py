"""Which asbundle bundle this host needs, and what the combined artefact is called. PURE.

cleon does not build Eclipse. It consumes an asbundle bundle - Eclipse, a JDK, Ant and Actifsource
Enterprise, already assembled - installs itself into it, and republishes the result. So it has to name
two things it does not own: the bundle to pull, and the bundle to push.

Both namings are asbundle's, mirrored here rather than shared, because the two products are separate
repositories with separate release cadences. That is a real duplication and it is deliberate: the
alternative is a build-time dependency on asbundle's Python, which would tie cleon's build to
asbundle's internals rather than to its published artefacts. What IS shared is the artefact contract -
the tag shape - and `select_tag` fails loudly when a tag it cannot parse turns up, which is what makes
the duplication detectable instead of silent.
"""
from __future__ import annotations

import platform
import re
from typing import Dict, List, Sequence, Tuple

HostKey = Tuple[str, str]

# asbundle publishes for these; windows/arm64 is absent because IBM Semeru ships no aarch64 Windows JDK.
SUPPORTED_HOSTS: Tuple[HostKey, ...] = (
    ("linux", "x86_64"), ("linux", "aarch64"),
    ("darwin", "x86_64"), ("darwin", "arm64"),
    ("windows", "amd64"),
)

# `4.40-25.0.4-0-linux-x86_64`: an asbundle version segment, then the host. The version's own separator
# is `-` too, so the host is matched from the END and everything before it is the version.
_NUMBERS = re.compile(r"\d+")


def host_key() -> HostKey:
    """This machine, as asbundle names it in a tag.

    `platform.machine()` differs per platform for the same silicon - `AMD64` on Windows, `x86_64` on
    Linux - and asbundle's tags use the raw lowercased value, so this must not normalise beyond case.
    """
    key = (platform.system().lower(), platform.machine().lower())
    if key not in SUPPORTED_HOSTS:
        raise ValueError(
            f"no asbundle bundle is published for {key[0]}/{key[1]}. Published hosts: "
            + ", ".join(f"{s}/{m}" for s, m in SUPPORTED_HOSTS))
    return key


def tags_for_host(tags: Sequence[str], key: HostKey) -> List[str]:
    """The tags that belong to one host, in the order given."""
    suffix = f"-{key[0]}-{key[1]}"
    return [tag for tag in tags if tag.endswith(suffix)]


def _version_sort_key(tag: str, key: HostKey) -> tuple:
    """The numbers in a tag's version segment, as integers.

    String ordering is wrong here and quietly so: `4.9` sorts after `4.40`, which would pin a build to
    an old Eclipse for as long as nobody looked.
    """
    version = tag[: -len(f"-{key[0]}-{key[1]}")]
    return tuple(int(number) for number in _NUMBERS.findall(version))


def select_tag(tags: Sequence[str], key: HostKey) -> str:
    """The newest published tag for this host.

    Fails loudly and names what it saw. An empty selection means either that asbundle has not published
    for this platform yet or that the repository name is wrong, and those need different fixes.
    """
    candidates = tags_for_host(tags, key)
    if not candidates:
        raise LookupError(
            f"no bundle tag for {key[0]}/{key[1]} among {len(tags)} tag(s). "
            f"Has asbundle published for this host, and is the repository name right?")
    return max(candidates, key=lambda tag: _version_sort_key(tag, key))


def reference(registry: str, repository: str, tag: str) -> str:
    """A registry reference: `ghcr.io/owner/repo:tag`, with no doubled or missing slash."""
    return f"{registry.rstrip('/')}/{repository.strip('/')}:{tag}"


def feature_group_ids(feature_ids: Sequence[str]) -> List[str]:
    """The installable-unit ids for a set of features.

    p2 installs a feature as `<id>.feature.group`, never as the bare id - the bare id names the feature
    JAR, which resolves to nothing. Getting this wrong produces "installable unit not found", which is
    the least informative message p2 has.
    """
    return [f"{feature_id}.feature.group" for feature_id in feature_ids]


def project_name(dot_project: str) -> str:
    """The Eclipse project name from a `.project` file.

    Needed because Actifsource addresses a project by NAME and finds it by DIRECTORY, and for this
    repository the two differ: the directory is `cleon`, the project is
    `cleonproject.deliverables.architecture.model.architecture`. Every GENERATED project has a
    directory named exactly like itself, and so does the vendor's example - the root project is the one
    place they part company, which is why nothing found it.
    """
    match = re.search(r"<name>([^<]+)</name>", dot_project or "")
    if not match:
        raise ValueError("no <name> in the .project file")
    return match.group(1).strip()


def recorded_mode(external_attr: int) -> int:
    """The Unix mode a zip entry recorded, or 0 if it recorded none.

    `zipfile.extractall` DROPS these. The bits are there - `shutil.make_archive` writes them through
    `ZipInfo.from_file` - but extraction creates every file 0644, so an unpacked bundle has no
    executable in it. That is not a theory: run 33720226519 died on
    `PermissionError: [Errno 13] Permission denied: .../build/bundle/ant/bin/ant`.

    The first attempt at this chmod'd files NAMED `java` and `eclipse`, which is guessing. The archive
    already knows; the fix is to ask it.

    An archive built on Windows records no useful mode, and 0 says so - the caller then leaves the file
    alone, which is right, because a Windows bundle is only ever unpacked on Windows.
    """
    return (external_attr >> 16) & 0o7777


def newest_archive(entries: Sequence[Tuple[str, float]]) -> str:
    """The archive to install, out of (filename, modification time) pairs. Pure.

    `deploy install` unpacks what the build produced, and what it produced cannot be named in advance:
    cleon's version is generated INTO the filename by the model (see combined_bundle_name), so a caller
    would have to read the directory to write the argument it was being asked for. It picks instead.

    A tie goes to the greater NAME rather than to whichever entry came first. Two archives written in
    the same clock tick is ordinary on a fast disk, and an arbitrary winner would let the same command
    install different bundles on two runs - the kind of difference nobody looks for.
    """
    if not entries:
        raise ValueError("no bundle archive to install; run `cleon build bundle` to produce one")
    return max(entries, key=lambda entry: (entry[1], entry[0]))[0]


# What an unpacked bundle looks like from outside: the macOS app wrapper, or the three siblings the
# Linux and Windows layouts put at the top. Any ONE of them is enough - a half-deleted install still has
# to be replaceable, or the command that failed halfway can never be re-run.
_BUNDLE_MARKERS = frozenset({"Eclipse.app", "plugins", "eclipse", "eclipse.exe", "eclipse.ini",
                             "jdk", "ant"})


def replaceable(entries: Sequence[str]) -> bool:
    """Whether a destination directory holding `entries` may be deleted and rewritten. Pure.

    `deploy install <dir>` takes a path from the command line and then REMOVES it, so the cost of the
    caller being wrong is somebody's files - a typo, a shell completion that landed one directory too
    high, `~` where `~/eclipse` was meant. Empty is fine, an unpacked bundle is fine, and anything else
    is refused rather than replaced: this command has no business deciding that a directory it does not
    recognise is disposable.
    """
    return not entries or bool(_BUNDLE_MARKERS.intersection(entries))


def updatesite_name(cleon_version: str) -> str:
    """The filename of the published P2 update site. Pure.

    The version is IN the name for the reason combined_bundle_name states: someone holding two of these
    has to tell them apart without unzipping either.
    """
    return f"cleon-updatesite_{cleon_version}.zip"


def updatesite_tag(cleon_version: str) -> str:
    """The registry tag for an update site: the version, and nothing else. Pure.

    Unlike the bundle, an update site carries no Eclipse and no JDK - it is platform-independent p2
    metadata plus jars. A host segment in the tag would promise a difference that is not there, and
    would make consumers choose between four identical artefacts.
    """
    return cleon_version


def version_from_jar(jar_name: str) -> str:
    """`cleon.x_0.4.149.qualifier.jar` -> `0.4.149.qualifier`.

    cleon's version is not written anywhere a build can read directly: it is generated into every
    feature and plugin by the model. Taking it from a produced jar means the published artefact is named
    after what is actually inside it, rather than after a number someone remembered to update.
    """
    stem = jar_name[:-4] if jar_name.endswith(".jar") else jar_name
    _, separator, version = stem.rpartition("_")
    if not separator:
        raise ValueError(f"cannot read a version from {jar_name!r}: expected <id>_<version>.jar")
    return version


def build_qualifier(commit_timestamp: str, short_sha: str) -> str:
    """The build number that replaces the literal `qualifier` in every version.

    `0.4.149.qualifier` is not a version, it is a PLACEHOLDER that Eclipse's own build replaces. Ours
    did not, so every artefact this project published carried the word `qualifier` where a build number
    belongs - in the jar names, the manifests, the update site and the registry tag.

    Derived from the COMMIT rather than the clock: the same commit produces the same version, so a
    rebuild is comparable and a version identifies a source state rather than the moment someone
    happened to run a build. The timestamp keeps versions ordered - `v20260903-0816` sorts after
    `v20260902-2312` - and the short sha separates two commits made in the same minute.

    `v<yyyyMMdd>-<HHmm>` is Eclipse's own shape, so the result still reads as an OSGi qualifier.
    """
    if not commit_timestamp or not short_sha:
        raise ValueError("both the commit timestamp and the short sha are required")
    return f"{commit_timestamp}-{short_sha}"


def apply_qualifier(version: str, qualifier: str) -> str:
    """`0.4.149.qualifier` -> `0.4.149.v20260903-0816-a1b2c3d`. Any other version is left alone.

    Left alone rather than forced: a version that does not end in `.qualifier` has already been decided,
    and substituting into it would silently rewrite someone's choice.
    """
    suffix = ".qualifier"
    return version[: -len(suffix)] + "." + qualifier if version.endswith(suffix) else version


def combined_tag(cleon_version: str, source_tag: str) -> str:
    """The registry tag for the combined bundle: cleon's version AND the base it was built on.

    The base belongs in the tag for the same reason it belongs in the filename: this artefact is not
    reproducible from cleon's version alone - it carries a particular Eclipse, JDK and Actifsource.

    Without it, two builds of the same cleon on different bases share one tag and the second silently
    replaces the first, while the file INSIDE still claims to be the other one. The filename got this
    right and the tag did not; they now say the same thing.

    A docker reference admits no uppercase and no `+`. It DOES admit `_`, and that matters here: the
    source tag ends in a host like `linux-x86_64`, and replacing the underscore would rename the
    architecture. asbundle keeps it for the same reason.
    """
    return f"{cleon_version}-{source_tag}".replace("+", "-").lower()


def combined_bundle_name(cleon_version: str, key: HostKey, source_tag: str) -> str:
    """The filename of what cleon publishes: the asbundle bundle with cleon already installed.

    The SOURCE tag is in the name because this artefact is not reproducible from cleon's version alone -
    it carries a particular Eclipse, JDK and Actifsource. Someone holding two of these files needs to be
    able to tell which is which without unzipping either.
    """
    return f"cleon_{cleon_version}_on_{source_tag}.zip"
