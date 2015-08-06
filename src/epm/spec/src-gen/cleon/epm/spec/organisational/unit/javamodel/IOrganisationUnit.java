package cleon.epm.spec.organisational.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisationUnit extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("43bbb85b-ba76-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public cleon.epm.spec.organisational.role.javamodel.ILeader selectResponsible();
  
  public java.util.List<? extends cleon.epm.spec.organisational.role.javamodel.IStaff> selectStaff();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,43bbb85b-ba76-11e3-9206-f19b78f4aff0,6DMo/hsul4qflWpQSu1noN1CVEA=] */
