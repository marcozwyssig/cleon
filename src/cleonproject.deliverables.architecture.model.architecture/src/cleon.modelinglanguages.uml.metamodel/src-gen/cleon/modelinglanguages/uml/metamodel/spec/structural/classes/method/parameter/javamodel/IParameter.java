package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IParameter extends ch.actifsource.core.javamodel.INamedResource, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a3776ddf-e3f2-11e2-845f-2b181f80a373");
  
  // relations
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier selectType();
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.constraint.javamodel.IConstraint selectConstraint();
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionType selectParameterAsCollection();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a3776ddf-e3f2-11e2-845f-2b181f80a373,ecWDuEbIHmmtedFU/TOVmlo7lQI=] */
