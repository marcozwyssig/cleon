package cleon.conception.bpmn.spec.bpmn.organisational.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisationUnit extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("43bbb85b-ba76-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole selectResponsible();
  
  public java.util.List<? extends cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole> selectStaff();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,43bbb85b-ba76-11e3-9206-f19b78f4aff0,rY43Ci942xmclZ4t0p5/1j5esac=] */
