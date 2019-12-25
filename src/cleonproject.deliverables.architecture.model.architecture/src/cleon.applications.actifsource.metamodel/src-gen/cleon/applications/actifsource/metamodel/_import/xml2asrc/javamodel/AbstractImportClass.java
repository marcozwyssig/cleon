package cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractImportClass extends DynamicResource implements IAbstractImportClass {

  // abstract implementation, only used for static method calls
  private AbstractImportClass() {
    super(IAbstractImportClass.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportClass selectToMeMapAttr(cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportAttribute object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportClass.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.AbstractImportClass_mapAttr, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportClass selectToMeMapOwnRel(cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportOwnRelation object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportClass.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.AbstractImportClass_mapOwnRel, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportClass selectToMeMapAssoc(cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportClass.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.AbstractImportClass_mapAssoc, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5ba53fa2-327c-11e8-925e-0378e2266aa0,zlnpSavKtUerfOLvmNZZkIgiMjE=] */
