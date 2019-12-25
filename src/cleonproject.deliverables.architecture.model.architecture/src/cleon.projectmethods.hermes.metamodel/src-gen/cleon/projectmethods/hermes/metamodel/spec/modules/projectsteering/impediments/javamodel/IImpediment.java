package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.impediments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImpediment extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription, cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IOwnerAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b33bed18-3383-11e6-b251-57783f5929b3");
  
  public java.util.List<java.lang.String> selectResolutionsDetails();
  
  // relations
  
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectEntryDate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b33bed18-3383-11e6-b251-57783f5929b3,vHCIKl/m4snvqquYCkyaA5u2oqs=] */
