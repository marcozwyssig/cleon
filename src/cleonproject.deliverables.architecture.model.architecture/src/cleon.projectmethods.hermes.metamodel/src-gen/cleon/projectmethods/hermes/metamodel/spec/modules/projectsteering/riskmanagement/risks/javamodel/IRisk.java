package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRisk extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IOwnerAware, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("70f3fadf-2efd-11e6-8bd9-a77b8d2a3a0e");
  
  // relations
  
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectEntryDate();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType selectImpactType();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState selectRiskState();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskType selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,70f3fadf-2efd-11e6-8bd9-a77b8d2a3a0e,tO8dJ2RsfisA6StoaCldUS3/iLA=] */
