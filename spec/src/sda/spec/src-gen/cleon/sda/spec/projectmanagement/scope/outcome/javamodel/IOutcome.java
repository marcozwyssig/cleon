package cleon.sda.spec.projectmanagement.scope.outcome.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutcome extends cleon.doc.spec.chapter.javamodel.INamedChapter, cleon.sda.spec.javamodel.IBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills> selectRequiredSkills();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,t18ejVC9f9F6QKYczGwgCjUa09g=] */
