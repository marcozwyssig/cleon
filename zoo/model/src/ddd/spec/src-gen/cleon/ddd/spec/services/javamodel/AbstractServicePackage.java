package cleon.ddd.spec.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractServicePackage extends DynamicResource implements IAbstractServicePackage {

  // abstract implementation, only used for static method calls
  private AbstractServicePackage() {
    super(IAbstractServicePackage.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.ddd.spec.services.javamodel.IAbstractServicePackage selectToMeServicePackages(cleon.ddd.spec.services.javamodel.IServicePackage object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.services.javamodel.IAbstractServicePackage.class, cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_servicePackages, object.getResource());
  }
  
  public static cleon.ddd.spec.services.javamodel.IAbstractServicePackage selectToMeServices(cleon.ddd.spec.javamodel.IDomainService object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.services.javamodel.IAbstractServicePackage.class, cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_services, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2850326-01df-11e4-ab1e-81fd30785d6d,fTSJNDz62fc0XEIJgxlrHBXEHVU=] */
