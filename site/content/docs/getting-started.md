---
title: Getting started
weight: 3
---

## Take the bundle, not the update site

cleon is published as one archive per platform, carrying Eclipse, a JDK, Ant, Actifsource Enterprise
and cleon itself. The archives live in the GitHub Container Registry as OCI artifacts:

```
ghcr.io/marcozwyssig/cleon-bundle:<cleon version>-<eclipse/jdk version>-<os>-<arch>
```

`oras` pulls one:

```bash
oras pull ghcr.io/marcozwyssig/cleon-bundle:0.4.149.v20260904-1717-fc390c8bd-4.40-25.0.4-0-darwin-arm64
```

Unpack it and start Eclipse. There is no update site to add and no Actifsource installation to do
first — that is the point of shipping it this way.

## Building it yourself

A checkout plus one command:

```bash
git clone https://github.com/marcozwyssig/cleon.git
cd cleon
./cleon.sh build          # Linux and macOS
cleon.cmd build           # Windows
```

The build pulls the base bundle, compiles the model plugins, runs Actifsource headless to generate
sources and the update site, installs the features into the bundle's Eclipse and zips the result into
`build-out/`. `./cleon.sh deploy install <directory>` unpacks that archive where you want it.

The first run provisions a Python virtualenv for the orchestrator and downloads a base bundle of about
a gigabyte, so allow it some time. Everything after that is incremental.

## What you need on the machine

Almost nothing: Python 3 for the launcher, `git`, and `oras` to move archives in and out of the
registry — and cleon installs `oras` itself if it is missing. Java, Ant and Eclipse come inside the
bundle rather than from the host, which is why a build behaves the same on a laptop and on a CI runner.
