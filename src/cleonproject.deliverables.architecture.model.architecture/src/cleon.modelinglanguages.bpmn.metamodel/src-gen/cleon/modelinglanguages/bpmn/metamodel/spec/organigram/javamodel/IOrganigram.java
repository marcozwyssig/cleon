package cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganigram extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("45b76892-daaa-11e3-ae07-89aa80d5ec3d");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IPerson> selectPeoples();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,45b76892-daaa-11e3-ae07-89aa80d5ec3d,IyJCC19MbS+fPsBTiuuSZp1G0CA=] */
