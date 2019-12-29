package cleon.architecturemethods.orgarc42.metamodel.spec.unit.keyprocess.distribution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PreSales extends DynamicResource implements IPreSales {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPreSales> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPreSales>() {
    
    @Override
    public IPreSales create() {
      return new PreSales();
    }
    
    @Override
    public IPreSales create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PreSales(resourceRepository, resource);
    }
  
  };

  public PreSales() {
    super(IPreSales.TYPE_ID);
  }
  
  public PreSales(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPreSales.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public PreSales setResponsible(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public PreSales setStaff(java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PreSales setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,12e989e8-daa9-11e3-ae07-89aa80d5ec3d,FRr6RvSnsqPxirujPkFzPmIPUqk=] */
