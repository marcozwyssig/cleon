package cleon.initialization.projectmanagement.spec.steering.impediments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImpediment extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription, cleon.common.resources.spec.resources.workstate.javamodel.IWorkStateAware, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IOwnerAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b33bed18-3383-11e6-b251-57783f5929b3");
  
  public java.util.List<java.lang.String> selectResolutionsDetails();
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEntryDate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b33bed18-3383-11e6-b251-57783f5929b3,rpfTcxEKg30hlRDHvp2ifWi9iKg=] */
