package cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Infrastructure extends DynamicResource implements IInfrastructure {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructure> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructure>() {
    
    @Override
    public IInfrastructure create() {
      return new Infrastructure();
    }
    
    @Override
    public IInfrastructure create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Infrastructure(resourceRepository, resource);
    }
  
  };

  public Infrastructure() {
    super(IInfrastructure.TYPE_ID);
  }
  
  public Infrastructure(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastructure.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Infrastructure setResponsible(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Infrastructure setStaff(java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Infrastructure setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,72e3ba98-daa6-11e3-ae07-89aa80d5ec3d,crGs8swZO9iaItvjXt2M1QCz+eA=] */
