---
title: Getting started
weight: 3
---

## What is public and what is not

| | where | who |
|---|---|---|
| Source | [github.com/marcozwyssig/cleon](https://github.com/marcozwyssig/cleon) | everyone |
| Update site | `https://marcozwyssig.github.io/cleon/p2/` | everyone |
| Bundle (Eclipse + Actifsource + cleon) | not distributed | handed over in person |

Everything cleon itself produces is public. The **bundle** is not, and it is not a matter of a
credential: it carries **Actifsource Enterprise**, whose licence belongs to Actifsource and is not ours
to pass on. So there is no registry to log into and no access to request — it is handed over
personally, to people whose Actifsource licence covers it.

If that is not you, nothing below is closed off: the source is public and builds a bundle of its own,
and the update site is a URL anyone can paste.

## The bundle: an Eclipse with cleon already in it

One archive per platform, carrying Eclipse, a JDK, Ant, Actifsource Enterprise and cleon. Unpack it and
start Eclipse: there is no update site to add and no Actifsource installation to do first, which is the
point of shipping it this way.

Ask for it directly — a licence question is a conversation, not a download button.

## Updating an installed cleon

The update site is public. In Eclipse, *Help → Install New Software → Add*, and paste:

```
https://marcozwyssig.github.io/cleon/p2/
```

No token, no download, no archive to keep track of — the same URL always carries the newest published
cleon.

The site is also published as a package (`ghcr.io/marcozwyssig/cleon-updatesite:<version>`), which is
what the URL above is served from and what to pull if you need a *specific* version rather than the
current one:

```bash
oras pull ghcr.io/marcozwyssig/cleon-updatesite:<cleon version>
# then: Help -> Install New Software -> Add -> Archive
```

**The update site is public, the bundle is not**, and the line between them is a licence rather than a
policy: the update site carries cleon's own features and plugins, while the bundle carries Actifsource
Enterprise, which is not ours to hand out. That is why one is a URL anyone can paste and the other is
handed over in person, rather than by granting access to somewhere.

## Building it yourself

A checkout plus one command — no credentials needed for the parts that are public:

```bash
git clone https://github.com/marcozwyssig/cleon.git
cd cleon
./cleon.sh build          # Linux and macOS
cleon.cmd build           # Windows
```

The build pulls a base bundle, compiles the model plugins, runs Actifsource headless to generate
sources and the update site, installs the features into the bundle's Eclipse and zips the result into
`build-out/`.

The first run provisions a Python virtualenv and downloads about a gigabyte, so allow it some time.
Everything after that is incremental.

## What you need on the machine

Almost nothing: Python 3 for the launcher, `git`, and `oras` to move archives in and out of the
registry — and cleon installs `oras` itself if it is missing (`./cleon.sh support install`). Java, Ant
and Eclipse come inside the bundle rather than from the host, which is why a build behaves the same on
a laptop and on a CI runner.
