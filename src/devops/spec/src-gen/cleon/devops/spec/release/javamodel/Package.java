package cleon.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Package extends DynamicResource implements IPackage {

  // abstract implementation, only used for static method calls
  private Package() {
    super(IPackage.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.devops.spec.release.javamodel.IPackage> selectToMeIncludes(cleon.devops.spec.release.javamodel.IPackage object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.release.javamodel.IPackage.class, cleon.devops.spec.release.ReleasePackage.Package_includes, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.release.javamodel.IPackage> selectToMeReferences(cleon.devops.spec.release.javamodel.IPackage object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.release.javamodel.IPackage.class, cleon.devops.spec.release.ReleasePackage.Package_references, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.release.javamodel.IPackage> selectToMeStores(cleon.devops.spec.release.javamodel.IPackageRepository object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.release.javamodel.IPackage.class, cleon.devops.spec.release.ReleasePackage.Package_stores, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,15cb1207-4071-11e5-b5f0-5b1ce9c3de3e,RSSi26wugZkEK09Y6dnqSjc8/YE=] */
