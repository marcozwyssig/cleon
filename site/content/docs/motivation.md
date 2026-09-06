---
title: Why cleon exists
weight: 1
---

## A diagram is a picture of a decision. A model is the decision.

Architecture work produces documents: a component view, a deployment view, a list of quality
requirements, an interface catalogue. Drawn by hand, each of those is a separate picture of the same
system — and the day the system changes, they start disagreeing with it and with each other. Nothing
in a drawing knows that a component was renamed, that an interface lost its consumer, or that a
building block is deployed nowhere.

cleon takes the other route. Every method it supports is a **metamodel**: the rules of that method,
written down so a tool can check them. A building block that must be deployed somewhere is not a
convention in a review checklist — it is a relation the editor refuses to leave empty. The
consequence is dull and valuable: the errors that reviews normally find are the errors that never get
written.

## What generation is for

Once the decision lives in a model, the documents become derivations of it. cleon carries the
templates that produce them: AsciiDoc chapters, static websites, collaboration pages, Gradle builds,
deployment scripts. Regenerating is cheap, so the documents can be *always* current rather than
current at the moment someone last had time.

This is also where the second kind of drift disappears. A generated deployment description and a
generated architecture chapter come from the same model, so they cannot contradict each other. Two
documents built by hand always can, and usually do.

## Why the models ship inside an IDE

An Actifsource metamodel needs Actifsource, which needs a matching Eclipse, which needs a JDK and Ant
to build anything. Distributed as an update site, that is four installations with four ways to be
subtly wrong — and a first day spent on versions rather than on architecture.

So cleon is built together with what it is used with: **one archive per platform**, carrying Eclipse, a
JDK, Ant, Actifsource Enterprise and cleon already installed. Unpack it and model. Later cleon releases
arrive through the ordinary update mechanism, so the archive is a starting point rather than a fork of
the tooling.

That archive is not distributed here. It contains Actifsource Enterprise, and that licence is
Actifsource's to grant — so the bundle is handed over in person, to people whose licence covers it,
while everything cleon itself produces stays public: the source, and the update site.

## Where the boundary is

cleon is a set of metamodels and templates, not a methodology and not a consultancy. It does not
decide whether arc42 or TOGAF is the right frame for a system — it makes the one you chose
enforceable, and turns what you modelled into the documents that had to be written anyway.
