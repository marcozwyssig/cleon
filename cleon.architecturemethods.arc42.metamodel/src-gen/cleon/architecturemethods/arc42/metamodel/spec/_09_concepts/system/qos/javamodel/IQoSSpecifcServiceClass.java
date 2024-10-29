package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQoSSpecifcServiceClass extends cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IServiceClassAware, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3ac9c52b-02e6-11ef-90b2-b7186629189e");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService selectService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3ac9c52b-02e6-11ef-90b2-b7186629189e,tFCBALAxyYS52ocQsQk/VBoDM6c=] */
