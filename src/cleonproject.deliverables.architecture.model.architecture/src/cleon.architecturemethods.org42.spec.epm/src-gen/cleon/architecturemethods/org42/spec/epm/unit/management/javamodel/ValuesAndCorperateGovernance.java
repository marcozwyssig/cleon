package cleon.architecturemethods.org42.spec.epm.unit.management.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ValuesAndCorperateGovernance extends DynamicResource implements IValuesAndCorperateGovernance {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValuesAndCorperateGovernance> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValuesAndCorperateGovernance>() {
    
    @Override
    public IValuesAndCorperateGovernance create() {
      return new ValuesAndCorperateGovernance();
    }
    
    @Override
    public IValuesAndCorperateGovernance create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ValuesAndCorperateGovernance(resourceRepository, resource);
    }
  
  };

  public ValuesAndCorperateGovernance() {
    super(IValuesAndCorperateGovernance.TYPE_ID);
  }
  
  public ValuesAndCorperateGovernance(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IValuesAndCorperateGovernance.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public ValuesAndCorperateGovernance setResponsible(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public ValuesAndCorperateGovernance setStaff(java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ValuesAndCorperateGovernance setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1201a988-daa3-11e3-ae07-89aa80d5ec3d,IsyYkCIb+VTn96NLbc+RLAcx+Yw=] */
