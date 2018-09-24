package cleon.common.resources.spec.resources.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class VersionAware extends DynamicResource implements IVersionAware {

  // abstract implementation, only used for static method calls
  private VersionAware() {
    super(IVersionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.resources.spec.resources.versions.javamodel.IVersionAware> selectToMeVersion(cleon.common.resources.spec.resources.versions.javamodel.IVersion object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.spec.resources.versions.javamodel.IVersionAware.class, cleon.common.resources.spec.resources.versions.VersionsPackage.VersionAware_version, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0aa97623-bff9-11e8-a3d0-5394fd9291a1,UZXONjkMRYk2wg1xiD/OLJUnmQg=] */
