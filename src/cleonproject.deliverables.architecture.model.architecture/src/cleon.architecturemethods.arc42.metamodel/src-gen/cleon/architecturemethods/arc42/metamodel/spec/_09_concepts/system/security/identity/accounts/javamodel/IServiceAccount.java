package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccount extends cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware, ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IActivityAllocationFromSiteAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6f9d993b-a1a0-11ea-886d-354b9ee6fb2d");
  
  public java.lang.Boolean selectExport();
  
  public java.lang.Integer selectOverrideNumber();
  
  public java.lang.Integer selectUniqueId();
  
  public java.util.List<java.lang.String> selectDescription();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountTemplate selectServiceAccountTemplate();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectAllocateActivitiesFromSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6f9d993b-a1a0-11ea-886d-354b9ee6fb2d,OriR0y+I+74fI3vQ1cEyOl+ahnk=] */
