package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ActivityAllocationFromSiteAware extends DynamicResource implements IActivityAllocationFromSiteAware {

  // abstract implementation, only used for static method calls
  private ActivityAllocationFromSiteAware() {
    super(IActivityAllocationFromSiteAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IActivityAllocationFromSiteAware> selectToMeAllocateActivitiesFromSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IActivityAllocationFromSiteAware.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ActivityAllocationFromSiteAware_allocateActivitiesFromSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ce986cf3-7081-11eb-b91b-ab805dd3de7b,e6RLMeXONsbVOJIANicEfKOuluo=] */
