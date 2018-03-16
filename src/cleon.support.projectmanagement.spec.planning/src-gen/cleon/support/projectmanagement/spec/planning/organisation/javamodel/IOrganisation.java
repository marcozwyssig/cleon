package cleon.support.projectmanagement.spec.planning.organisation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisation extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7d0996e3-210a-11e8-9bf6-d910b575bad9");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRoles selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7d0996e3-210a-11e8-9bf6-d910b575bad9,D7smgpeXEnzQdSTr5dRpl8l1i+4=] */
