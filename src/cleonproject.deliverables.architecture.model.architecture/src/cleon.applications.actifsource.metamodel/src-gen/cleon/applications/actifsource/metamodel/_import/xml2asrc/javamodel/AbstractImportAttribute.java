package cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractImportAttribute extends DynamicResource implements IAbstractImportAttribute {

  // abstract implementation, only used for static method calls
  private AbstractImportAttribute() {
    super(IAbstractImportAttribute.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportAttribute> selectToMeAttribute(ch.actifsource.core.javamodel.IAttribute object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportAttribute.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.AbstractImportAttribute_attribute, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dbb8e1fa-221e-11e8-8749-cb7f4d6924d3,lWuvOu24/+24MloKubTxhOrDYwI=] */
