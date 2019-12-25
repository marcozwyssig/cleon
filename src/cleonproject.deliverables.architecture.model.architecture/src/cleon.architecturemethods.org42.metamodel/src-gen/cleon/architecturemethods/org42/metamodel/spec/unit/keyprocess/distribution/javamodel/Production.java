package cleon.architecturemethods.org42.metamodel.spec.unit.keyprocess.distribution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Production extends DynamicResource implements IProduction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProduction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProduction>() {
    
    @Override
    public IProduction create() {
      return new Production();
    }
    
    @Override
    public IProduction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Production(resourceRepository, resource);
    }
  
  };

  public Production() {
    super(IProduction.TYPE_ID);
  }
  
  public Production(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProduction.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Production setResponsible(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Production setStaff(java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Production setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4c51e3b5-daa9-11e3-ae07-89aa80d5ec3d,Wb90DwmN8rdedi2wJtqxDeM1Nh8=] */
