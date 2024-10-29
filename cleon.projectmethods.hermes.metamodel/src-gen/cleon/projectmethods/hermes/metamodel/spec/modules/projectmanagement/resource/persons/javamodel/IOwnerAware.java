package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOwnerAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dd829c7f-3385-11e6-b251-57783f5929b3");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectOwner();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dd829c7f-3385-11e6-b251-57783f5929b3,0u+RODbdPlQtTN62r/6XMzQTWHY=] */
