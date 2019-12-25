package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivityPermission extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IGroup, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b898fc57-7f22-11e9-9a52-07d4b074defc");
  
  // relations
  
  public cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IPermission selectPermission();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b898fc57-7f22-11e9-9a52-07d4b074defc,C+nWBj9YyMpvjkpaZFLVuOimUUY=] */
