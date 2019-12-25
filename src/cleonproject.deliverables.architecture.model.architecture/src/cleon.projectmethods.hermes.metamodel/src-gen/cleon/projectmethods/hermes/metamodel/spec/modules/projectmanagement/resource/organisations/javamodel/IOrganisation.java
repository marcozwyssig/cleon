package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.organisations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisation extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cbb98f3c-c768-11e5-b3f9-43c5a0896ea1");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.organisations.javamodel.IOrganisation> selectSubOrganisation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cbb98f3c-c768-11e5-b3f9-43c5a0896ea1,zdAdN82fUAgXxDe6d+AZT+wZH/s=] */
