package cleon.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PackageRepository extends DynamicResource implements IPackageRepository {

  // abstract implementation, only used for static method calls
  private PackageRepository() {
    super(IPackageRepository.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3877e991-4072-11e5-b5f0-5b1ce9c3de3e,NlE6upf8T0tlAhj2WxEiw48Ze8Y=] */
