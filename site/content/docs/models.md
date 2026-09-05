---
title: What is in it
weight: 2
---

cleon ships **32 model packages** in ten domains. Each is an Eclipse feature you can install or leave
out; the common packages below are what the others build on.

## Architecture methods

The frames an architecture is written in. Each is the method's own structure as a metamodel, so the
chapters, views and relations it prescribes are the ones the editor offers — and the ones it insists on.

| Package | What it models |
|---|---|
| `architecturemethods.arc42` | arc42: the twelve chapters, from context and constraints through building blocks, runtime and deployment views to concepts, decisions and risks |
| `architecturemethods.orgarc42` | arc42 applied to an organisation rather than a system |
| `architecturemethods.togaf` | TOGAF: the architecture development phases and their artefacts |
| `architecturemethods.eamod` | EAMOD, enterprise architecture modelling |
| `architecturemethods.hermes` | HERMES from the architecture side: the Swiss federal project method's architecture deliverables |

## Architecture styles and patterns

The shapes a system is built in, modelled so that a style's obligations are visible in the model
rather than remembered.

| Package | What it models |
|---|---|
| `architecturestylesandpatterns.soa` | Service-oriented architecture, with a gRPC template |
| `architecturestylesandpatterns.eda` | Event-driven architecture |
| `architecturestylesandpatterns.eai` | Enterprise application integration |

## Modelling languages

The notations, as metamodels rather than drawing surfaces. What is modelled here can be validated and
generated from; what is drawn cannot.

| Package | What it models |
|---|---|
| `modelinglanguages.uml` | UML: structural and behavioural views |
| `modelinglanguages.bpmn` | BPMN: business processes |
| `modelinglanguages.graph` | Generic graphs, the base other notations reuse |
| `modelinglanguages.network` | Network topologies |
| `modelinglanguages.segmentation` | Network segmentation and zones |
| `modelinglanguages.rack` | Racks and physical placement |

## Project, operational and testing methods

| Package | What it models |
|---|---|
| `projectmethods.hermes` | HERMES 5: phases, modules, roles and the deliverables a project owes |
| `operationalmethods.hermes` | HERMES from the operations side |
| `testingmethods.hermes` | HERMES test artefacts |
| `operationalmethods.chocolatey` | Chocolatey packages, for Windows deployment |

## Publishing

What leaves the model and reaches a reader.

| Package | What it models |
|---|---|
| `publishing.staticwebsite` | A static website generated from the model |
| `publishing.collaboration` | Collaboration platform pages (Confluence and the like) |

## Building

| Package | What it models |
|---|---|
| `building.gradle` | Gradle builds, generated from what was modelled |

## Applications

| Package | What it models |
|---|---|
| `applications.actifsource` | Actifsource itself: projects, plugins and the model behind cleon's own build |

## Common

The vocabulary the domain packages share. Nothing here is a method — these are the pieces every method
needs and should not each invent.

| Package | What it models |
|---|---|
| `common.actifsource` | Actifsource primitives the other packages build on |
| `common.building` | Build concepts shared by the building packages |
| `common.modularity` | Modules, components and their boundaries |
| `common.resources` | Resources and their allocation |
| `common.knowledge` | Knowledge structures |
| `common.glossary` | Terms, with their definitions in one place |
| `common.language` | Natural-language handling, for multilingual documents |
| `common.doc` | Document structure, shared by every generator that writes one |
| `common.calendar` | Dates, periods and schedules |
| `common.xml` | XML import and export |

## How they fit together

The common packages sit at the bottom; a method package (arc42, HERMES) builds on them; a publishing or
building package turns what was modelled into a document, a website or a build file. That layering is
why a package can be left out: leaving out `publishing.staticwebsite` costs you a generator, not a model.
