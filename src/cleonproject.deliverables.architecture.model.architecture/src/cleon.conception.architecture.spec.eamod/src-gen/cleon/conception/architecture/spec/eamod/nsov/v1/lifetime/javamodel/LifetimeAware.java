package cleon.conception.architecture.spec.eamod.nsov.v1.lifetime.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class LifetimeAware extends DynamicResource implements ILifetimeAware {

  // abstract implementation, only used for static method calls
  private LifetimeAware() {
    super(ILifetimeAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.nsov.v1.lifetime.javamodel.ILifetimeAware> selectToMeLifetime(cleon.conception.architecture.spec.eamod.nsov.v1.lifetime.javamodel.IServiceLifetime object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.nsov.v1.lifetime.javamodel.ILifetimeAware.class, cleon.conception.architecture.spec.eamod.nsov.v1.lifetime.LifetimePackage.LifetimeAware_lifetime, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f6df515c-c6cb-11e6-8242-2f0ed6756d77,UxmboleBIqxs2s+ktylG32D5/qY=] */
