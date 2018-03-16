package cleon.conception.bpmn.spec.bpmn.organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisation extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8700f148-daad-11e3-ae07-89aa80d5ec3d");
  
  // relations
  
  public cleon.conception.bpmn.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit selectOrganisationUnit();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.conception.bpmn.spec.bpmn.organigram.javamodel.IOrganisation> selectSubOrganisation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8700f148-daad-11e3-ae07-89aa80d5ec3d,Q5FAieUr99bmG5BB+Hfm4QEY98I=] */
