package Cleon.EBP.Spec.Organisational.Unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OrganisationUnit extends DynamicResource implements IOrganisationUnit {

  // abstract implementation, only used for static method calls
  private OrganisationUnit() {
    super(IOrganisationUnit.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> selectToMeResponsible(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader object) {
    return _getToMeList(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit selectToMeStaff(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,43bbb85b-ba76-11e3-9206-f19b78f4aff0,ipzCOC9bg2sd6ar25RJpKdVRG10=] */
