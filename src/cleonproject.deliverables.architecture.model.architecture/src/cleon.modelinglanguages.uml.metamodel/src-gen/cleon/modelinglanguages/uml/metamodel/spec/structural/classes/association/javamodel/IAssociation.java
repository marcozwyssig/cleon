package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAssociation extends ch.actifsource.core.javamodel.IResource, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IVirtual, cleon.common.modularity.metamodel.spec.javamodel.IDependency {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("10b7d991-2783-11e3-a466-eda9d7258bca");
  
  public java.lang.String selectDescription();
  
  public java.lang.String selectSubjectRoleName();
  
  public java.lang.Boolean selectSubjectReadOnly();
  
  public java.lang.String selectObjectRoleName();
  
  public java.lang.Boolean selectObjectReadOnly();
  
  public java.lang.Boolean selectSuppressAutoProperty();
  
  public java.lang.Boolean selectObjectNavigationable();
  
  // relations
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociationType selectAssocationType();
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,10b7d991-2783-11e3-a466-eda9d7258bca,ezEyNinWHhezRGEJGpsrJFRUx4g=] */
