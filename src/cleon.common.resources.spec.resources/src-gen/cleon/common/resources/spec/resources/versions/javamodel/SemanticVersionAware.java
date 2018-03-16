package cleon.common.resources.spec.resources.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SemanticVersionAware extends DynamicResource implements ISemanticVersionAware {

  // abstract implementation, only used for static method calls
  private SemanticVersionAware() {
    super(ISemanticVersionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersionAware selectToMeVersion(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion object) {
    return _getToMeSingle(object.getRepository(), cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersionAware.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0e6fee9d-d410-11e5-8556-8f55ceb91287,PM9G4GsLipKPMr4mm2x9SJJV8RI=] */
