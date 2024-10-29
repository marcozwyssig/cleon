package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Association extends DynamicResource implements IAssociation {

  // abstract implementation, only used for static method calls
  private Association() {
    super(IAssociation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation> selectToMeAssocationType(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociationType object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_assocationType, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation selectToMeTo(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,10b7d991-2783-11e3-a466-eda9d7258bca,QnOEtxwRgt8J8mRNpvsgpBLOTJk=] */
