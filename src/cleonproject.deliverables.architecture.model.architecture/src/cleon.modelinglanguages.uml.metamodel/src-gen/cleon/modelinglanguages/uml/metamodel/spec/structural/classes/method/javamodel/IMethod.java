package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMethod extends ch.actifsource.core.javamodel.INamedResource, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IReturnType, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IObsolete, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IVirtual {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("af648f48-e46c-11e2-b1e0-8de0cec58ee7");
  
  // attributes
  
  public java.lang.String selectReturnTypeDescription();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameter> selectParameters();
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.messageExchange.javamodel.IMessageExchange selectMep();
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionType selectReturnTypeAsCollection();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,af648f48-e46c-11e2-b1e0-8de0cec58ee7,47tpImNDcPJaoJAqKNKzBpKRVlk=] */
