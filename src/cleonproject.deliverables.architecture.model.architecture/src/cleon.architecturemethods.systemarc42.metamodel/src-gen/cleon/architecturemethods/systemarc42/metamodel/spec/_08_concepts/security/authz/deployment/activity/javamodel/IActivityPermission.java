package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivityPermission extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IGroup, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph, cleon.common.resources.metamodel.spec.descriptions.javamodel.INoDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b898fc57-7f22-11e9-9a52-07d4b074defc");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission selectPermissionTemplate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b898fc57-7f22-11e9-9a52-07d4b074defc,qUUF0bnwRcNiFpVWAKvfAMA/id4=] */
