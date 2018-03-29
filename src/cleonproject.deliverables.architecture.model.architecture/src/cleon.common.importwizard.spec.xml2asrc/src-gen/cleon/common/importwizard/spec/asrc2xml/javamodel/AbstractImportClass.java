package cleon.common.importwizard.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractImportClass extends DynamicResource implements IAbstractImportClass {

  // abstract implementation, only used for static method calls
  private AbstractImportClass() {
    super(IAbstractImportClass.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportClass selectToMeMapAttr(cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute object) {
    return _getToMeSingle(object.getRepository(), cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportClass.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAttr, object.getResource());
  }
  
  public static cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportClass selectToMeMapOwnRel(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation object) {
    return _getToMeSingle(object.getRepository(), cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportClass.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel, object.getResource());
  }
  
  public static cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportClass selectToMeMapAssoc(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation object) {
    return _getToMeSingle(object.getRepository(), cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportClass.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5ba53fa2-327c-11e8-925e-0378e2266aa0,dI649dTOvQf92/08Rr8vvN+RxC0=] */
