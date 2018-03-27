package cleon.support.projectmanagement.spec.steering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRisk extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId, cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IOwnerAware, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("70f3fadf-2efd-11e6-8bd9-a77b8d2a3a0e");
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEntryDate();
  
  public cleon.support.projectmanagement.spec.steering.riskmanagement.risks.impactarea.javamodel.IImpactType selectImpactType();
  
  public cleon.support.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskState selectRiskState();
  
  public cleon.support.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskType selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,70f3fadf-2efd-11e6-8bd9-a77b8d2a3a0e,A3iwpFMubRM3C1iEoQ+HiaRFR4E=] */
