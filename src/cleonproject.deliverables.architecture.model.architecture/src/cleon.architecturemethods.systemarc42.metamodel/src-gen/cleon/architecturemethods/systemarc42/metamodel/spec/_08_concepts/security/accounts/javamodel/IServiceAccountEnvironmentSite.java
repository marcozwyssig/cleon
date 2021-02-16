package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccountEnvironmentSite extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IActivityAllocationFromSiteAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bde1151a-394a-11eb-93f1-c3f5ad8bb73f");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite selectSite();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSystem> selectServiceAccountSystem();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> selectAllocateActivitiesFromSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bde1151a-394a-11eb-93f1-c3f5ad8bb73f,O5vGZ8mQF3tPU5x7e/8ql1q/dQ0=] */
