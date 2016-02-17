package cleon.resources.spec.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WithVersion extends DynamicResource implements IWithVersion {

  // abstract implementation, only used for static method calls
  private WithVersion() {
    super(IWithVersion.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.resources.spec.versions.javamodel.IWithVersion selectToMeVersion(cleon.resources.spec.versions.javamodel.ISemanticVersion object) {
    return _getToMeSingle(object.getRepository(), cleon.resources.spec.versions.javamodel.IWithVersion.class, cleon.resources.spec.versions.VersionsPackage.WithVersion_version, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0e6fee9d-d410-11e5-8556-8f55ceb91287,MGc5oE+6TRfMsbNn164UpZYJ89o=] */
