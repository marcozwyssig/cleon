"""GENERATED from cleon.yaml. Do not edit.

Regenerate with the product's `support tasks generate`; the drift gate fails when this file and the manifest
disagree. Each function below is a real Typer command whose SIGNATURE was introspected from the body it
delegates to - the manifest supplies only the name, the help, the presentation and any `with:` overrides.

`register` adds to a root app the PRODUCT owns, so the root's help blurb and any product-only internal
commands stay outside this file.
"""
import typer


def _rc(value: int | None) -> int:
    """A body's return value as a process exit code.

    A framework-free body returns an int. A body that has not been migrated yet raises `typer.Exit`
    itself, so its `raise` wins and this never sees its value; when one returns None anyway that is a
    clean run. Anything else raises here rather than being coerced into a plausible-looking 0 - a body
    returning something that is not an exit code is a defect, and the generated wrapper is the wrong
    place to paper over it.
    """
    return 0 if value is None else int(value)


# An impl-less aggregate has no body: it expands through its dependency plan, which only the PRODUCT can
# dispatch (a plan step runs as its own subprocess). `register` binds the dispatcher here rather than
# closing over it, so every command below stays a module-level def a reader can find.
#
# The price of module state is that it is MODULE state: a second `register()` would rebind it under the
# commands the first one already registered, so those would start dispatching through the new one. This
# module belongs to one manifest and one dispatcher, and `register` says so rather than letting the
# second call quietly win.
_aggregate = None


def _plan(name: str, group: str) -> int:
    """Run an aggregate's dependency plan through the dispatcher `register` bound."""
    if _aggregate is None:
        raise RuntimeError(f"`{group} {name}` is an aggregate and no dispatcher is bound - "
                           f"call register(app, aggregate=...) before invoking it")
    return _aggregate(name, group=group)


def fetch_bundle() -> None:
    'Pull the asbundle bundle for this host from the registry and unpack it.'
    raise typer.Exit(_rc(orchestrator.cli.fetch_bundle()))


def compile() -> None:
    'Compile the model plugins, so the generator can load their Java functions.'
    raise typer.Exit(_rc(orchestrator.cli.compile()))


def generate_sources() -> None:
    'Run Actifsource headless: generate the plugin sources, features and update site, then validate.'
    raise typer.Exit(_rc(orchestrator.cli.generate()))


def package() -> None:
    'Compile, jar the plugins and features, and publish the P2 update site.'
    raise typer.Exit(_rc(orchestrator.cli.package()))


def install_features() -> None:
    "Install the freshly built cleon features into the bundle's Eclipse."
    raise typer.Exit(_rc(orchestrator.cli.install()))


def bundle() -> None:
    'Zip the bundle, now carrying cleon, into a publishable archive.'
    raise typer.Exit(_rc(orchestrator.cli.bundle()))


def build() -> None:
    'The whole build: fetch, compile, generate, package, install, zip.'
    raise typer.Exit(_plan('build', 'build'))


def tag(tag: str = typer.Argument(..., metavar='TAG', help='the tag to cut, exactly as it will exist (e.g. v1.4.0)')) -> None:
    'Cut the release tag at HEAD and push it (`git push origin <tag>`, never `--tags`).'
    raise typer.Exit(_rc(simplon.tasks.release.tag(tag=tag)))


def publish() -> None:
    'Push the combined cleon+Actifsource bundle to the registry.'
    raise typer.Exit(_rc(orchestrator.cli.publish()))


def publish_updatesite() -> None:
    "Push the P2 update site to the registry (mechanics: the kernel's release:artifact)."
    raise typer.Exit(_rc(orchestrator.cli.publish_updatesite()))


def up() -> None:
    'Deploy the product to the target environment (placeholder).'
    raise typer.Exit(_rc(orchestrator.cli.up()))


def deploy_install(directory: str = typer.Argument(..., help='directory to extract the bundle into')) -> None:
    'Extract the packaged cleon bundle into a directory on this machine.'
    raise typer.Exit(_rc(orchestrator.cli.install_bundle(directory=directory)))


def down() -> None:
    'Tear the deployment down (placeholder).'
    raise typer.Exit(_rc(orchestrator.cli.down()))


def all() -> None:
    'Run build then deploy up end to end (the build->up dependency plan).'
    raise typer.Exit(_plan('all', 'deploy'))


def support_install() -> None:
    'Provision the host tooling the kernel needs - today oras; idempotent.'
    raise typer.Exit(_rc(simplon.tasks.hosttools.install()))


def site() -> None:
    "Build the product's documentation website with Hugo, in Docker (HTML only)."
    raise typer.Exit(_rc(simplon.tasks.site.build()))


def reference() -> None:
    "Write the product's command reference as Markdown, read off its BUILT command line."
    raise typer.Exit(_rc(simplon.tasks.cliref.reference(output='site/content/docs/reference.md', title='cleon command reference')))


def commit(message: list[str] | None = typer.Argument(None, help='commit message')) -> None:
    'git add -A + git commit -m.'
    raise typer.Exit(_rc(simplon.tasks.vcs.commit(message=message)))


def push() -> None:
    'git pull --rebase then push (current branch).'
    raise typer.Exit(_rc(simplon.tasks.vcs.push()))


def prune_branches(dry_run: bool = typer.Option(False, "--dry-run", "-n", help='preview only'), remote: bool = typer.Option(False, "--remote", help='also delete merged branches on origin'), unmerged: bool = typer.Option(False, "--unmerged", help='ALSO delete branches that cannot be proven merged (destructive)')) -> None:
    'Delete local branches already merged into main (squash-aware via gh).'
    raise typer.Exit(_rc(simplon.tasks.vcs.prune_branches(dry_run=dry_run, remote=remote, unmerged=unmerged)))


def submodules() -> None:
    'git submodule update --init lib/platform (init the submodule a fresh worktree needs).'
    raise typer.Exit(_rc(simplon.tasks.vcs.submodules()))


def auth_scopes() -> None:
    'Grant the stored gh token the package scopes GHCR needs (interactive, idempotent).'
    raise typer.Exit(_rc(simplon.tasks.vcs.auth_scopes()))


def catalogue() -> None:
    "List the task coordinates the delivery kernel offers, marking the namespaces this product's commands reach."
    raise typer.Exit(_rc(simplon.tasks.tasks.catalogue()))


def generate(check: bool = typer.Option(False, "--check", help='report drift and write nothing')) -> None:
    "Regenerate the product's CLI module from its manifest (--check reports drift and writes nothing)."
    raise typer.Exit(_rc(simplon.tasks.tasks.generate(target='deploy/provision/orchestrator/src/python/orchestrator/generated_cli.py', check=check)))


# The (group, command) pairs this module registers. A product hands it to the reflective assembly so the
# two never both register one group - see `simplon.cli.assemble(skip=...)`.
COVERED = frozenset({
    ("build", "build"),
    ("build", "bundle"),
    ("build", "compile"),
    ("build", "fetch-bundle"),
    ("build", "generate-sources"),
    ("build", "install-features"),
    ("build", "package"),
    ("deploy", "all"),
    ("deploy", "down"),
    ("deploy", "install"),
    ("deploy", "up"),
    ("release", "publish"),
    ("release", "publish-updatesite"),
    ("release", "tag"),
    ("support", "install"),
    ("support", "reference"),
    ("support", "site"),
    ("support.git", "auth-scopes"),
    ("support.git", "commit"),
    ("support.git", "prune-branches"),
    ("support.git", "push"),
    ("support.git", "submodules"),
    ("support.tasks", "catalogue"),
    ("support.tasks", "generate"),
})


def register(app: typer.Typer, *, aggregate: object = None) -> None:
    """Register this manifest's commands onto a root app the product owns.

    `aggregate` dispatches an impl-less command's dependency plan; it takes `(name, group)` and returns
    an exit code. A manifest declaring one and given none fails HERE rather than at first invocation,
    which is where the reflective assembly failed too.
    """
    if aggregate is None:
        raise ValueError("this manifest declares impl-less aggregates; register(aggregate=...) is required to bind them")
    global _aggregate
    if _aggregate is not None and _aggregate is not aggregate:
        raise ValueError("this module is already registered with a different aggregate dispatcher; it belongs to one manifest and one product")
    _aggregate = aggregate
    _g_build = typer.Typer(add_completion=False, invoke_without_command=True, no_args_is_help=False, help='The whole build: fetch, compile, generate, package, install, zip.')
    @_g_build.callback(invoke_without_command=True)
    def _g_build_default(ctx: typer.Context) -> None:
        if ctx.invoked_subcommand is None:
            build()
    _g_release = typer.Typer(add_completion=False, no_args_is_help=True, help='release commands. Environment-agnostic (no env).')
    _g_deploy = typer.Typer(add_completion=False, no_args_is_help=True, help='deploy commands. Env-first: `cleon <env> deploy <cmd>` (default dev).')
    _g_support = typer.Typer(add_completion=False, no_args_is_help=True, help='support commands. Environment-agnostic (no env).')
    _g_support_git = typer.Typer(add_completion=False, no_args_is_help=True, help='git commands. Environment-agnostic (no env).')
    _g_support_tasks = typer.Typer(add_completion=False, no_args_is_help=True, help='tasks commands. Environment-agnostic (no env).')
    app.add_typer(_g_build, name='build', rich_help_panel='CI / agnostic (no env)')
    app.add_typer(_g_release, name='release', rich_help_panel='CI / agnostic (no env)')
    app.add_typer(_g_deploy, name='deploy', rich_help_panel='CD / env-first (cleon <env> <group> <cmd>, default dev)')
    app.add_typer(_g_support, name='support', rich_help_panel='CI / agnostic (no env)')
    _g_support.add_typer(_g_support_git, name='git', rich_help_panel='CI / agnostic (no env)')
    _g_support.add_typer(_g_support_tasks, name='tasks', rich_help_panel='CI / agnostic (no env)')
    _g_build.command(name='fetch-bundle', hidden=False)(fetch_bundle)
    app.command(name='fetch-bundle', hidden=True)(fetch_bundle)
    _g_build.command(name='compile', hidden=False)(compile)
    app.command(name='compile', hidden=True)(compile)
    _g_build.command(name='generate-sources', hidden=False)(generate_sources)
    app.command(name='generate-sources', hidden=True)(generate_sources)
    _g_build.command(name='package', hidden=False)(package)
    app.command(name='package', hidden=True)(package)
    _g_build.command(name='install-features', hidden=False)(install_features)
    app.command(name='install-features', hidden=True)(install_features)
    _g_build.command(name='bundle', hidden=False)(bundle)
    app.command(name='bundle', hidden=True)(bundle)
    _g_release.command(name='tag', hidden=False)(tag)
    app.command(name='tag', hidden=True)(tag)
    _g_release.command(name='publish', hidden=False)(publish)
    app.command(name='publish', hidden=True)(publish)
    _g_release.command(name='publish-updatesite', hidden=False)(publish_updatesite)
    app.command(name='publish-updatesite', hidden=True)(publish_updatesite)
    _g_deploy.command(name='up', hidden=False)(up)
    app.command(name='up', hidden=True)(up)
    _g_deploy.command(name='install', hidden=False)(deploy_install)
    _g_deploy.command(name='down', hidden=False)(down)
    app.command(name='down', hidden=True)(down)
    _g_deploy.command(name='all', hidden=False)(all)
    app.command(name='all', hidden=True)(all)
    _g_support.command(name='install', hidden=False)(support_install)
    _g_support.command(name='site', hidden=False)(site)
    app.command(name='site', hidden=True)(site)
    _g_support.command(name='reference', hidden=False)(reference)
    app.command(name='reference', hidden=True)(reference)
    _g_support_git.command(name='commit', hidden=False)(commit)
    app.command(name='commit', hidden=True)(commit)
    _g_support_git.command(name='push', hidden=False)(push)
    app.command(name='push', hidden=True)(push)
    _g_support_git.command(name='prune-branches', hidden=False)(prune_branches)
    app.command(name='prune-branches', hidden=True)(prune_branches)
    _g_support_git.command(name='submodules', hidden=False)(submodules)
    app.command(name='submodules', hidden=True)(submodules)
    _g_support_git.command(name='auth-scopes', hidden=False)(auth_scopes)
    app.command(name='auth-scopes', hidden=True)(auth_scopes)
    _g_support_tasks.command(name='catalogue', hidden=False)(catalogue)
    app.command(name='catalogue', hidden=True)(catalogue)
    _g_support_tasks.command(name='generate', hidden=False)(generate)
    app.command(name='generate', hidden=True)(generate)


# The impl imports sit at the BOTTOM, and that position is load-bearing rather than a style choice
# (netctl#1446). A product's CLI module imports THIS one and calls `register()` from its own module body,
# while this one imports the product's CLI module back for its impls. Whichever of the two is imported
# first, the other's body runs to completion inside it - so `register` has to be DEFINED before that
# happens, or importing this module first raises `AttributeError: partially initialized module ... has no
# attribute 'register'`. The wrappers above dereference their impls at CALL time, so nothing above needs
# these names at import time.
import orchestrator.cli  # noqa: E402
import simplon.tasks.cliref  # noqa: E402
import simplon.tasks.hosttools  # noqa: E402
import simplon.tasks.release  # noqa: E402
import simplon.tasks.site  # noqa: E402
import simplon.tasks.tasks  # noqa: E402
import simplon.tasks.vcs  # noqa: E402
