package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CollectionAssociation extends DynamicResource implements ICollectionAssociation {

  // abstract implementation, only used for static method calls
  private CollectionAssociation() {
    super(ICollectionAssociation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionAssociation> selectToMeCollectionType(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionType object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionAssociation.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionAssociation_collectionType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,35d66a15-2783-11e3-a466-eda9d7258bca,dZKfuCbLpNc6WU6PdNGt4we0w+E=] */
