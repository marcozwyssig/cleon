package cleon.applications.actifsource.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractOwnImportRelation extends DynamicResource implements IAbstractOwnImportRelation {

  // abstract implementation, only used for static method calls
  private AbstractOwnImportRelation() {
    super(IAbstractOwnImportRelation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractOwnImportRelation> selectToMeRelation(ch.actifsource.core.javamodel.IOwnRelation object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractOwnImportRelation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_relation, object.getResource());
  }
  
  public static java.util.List<cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractOwnImportRelation> selectToMeDiscriminator(ch.actifsource.core.javamodel.IAttribute object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractOwnImportRelation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_discriminator, object.getResource());
  }
  
  public static cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractOwnImportRelation selectToMeMapCls(cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractOwnImportRelation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_mapCls, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a1575b5b-23a6-11e8-9237-83e9a2871328,G4xw9kYmFc7dJZa3kKMR/el0t4k=] */
