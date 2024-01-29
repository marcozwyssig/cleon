package cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmiAssociation extends DynamicResource implements IXmiAssociation {

  // abstract implementation, only used for static method calls
  private XmiAssociation() {
    super(IXmiAssociation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel.IXmiAssociation> selectToMeAssociations(cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel.IXmiClass object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel.IXmiAssociation.class, cleon.modelinglanguages.uml.metamodel.template.xmi.XmiPackage.XmiAssociation_associations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f868af21-6c90-11e7-8bc1-2fb13127901b,lXduwCbP19g5mqWV60AwHTtJD0c=] */
