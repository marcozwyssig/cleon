package cleon.epm.spec.organisational.unit.keyprocess.distribution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Fulfillment extends DynamicResource implements IFulfillment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFulfillment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFulfillment>() {
    
    @Override
    public IFulfillment create() {
      return new Fulfillment();
    }
    
    @Override
    public IFulfillment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Fulfillment(resourceRepository, resource);
    }
  
  };

  public Fulfillment() {
    super(IFulfillment.TYPE_ID);
  }
  
  public Fulfillment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFulfillment.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.epm.spec.organisational.role.javamodel.ILeader selectResponsible() {
    return _getSingle(cleon.epm.spec.organisational.role.javamodel.ILeader.class, cleon.epm.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Fulfillment setResponsible(cleon.epm.spec.organisational.role.javamodel.ILeader responsible) {
    _setSingle(cleon.epm.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.epm.spec.organisational.role.javamodel.IStaff> selectStaff() {
    return _getList(cleon.epm.spec.organisational.role.javamodel.IStaff.class, cleon.epm.spec.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Fulfillment setStaff(java.util.List<? extends cleon.epm.spec.organisational.role.javamodel.IStaff> staff) {
    _setList(cleon.epm.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Fulfillment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.epm.spec.organisational.role.javamodel.ILeader.class, cleon.epm.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.epm.spec.organisational.role.javamodel.IStaff.class, cleon.epm.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,34c39d4e-daa9-11e3-ae07-89aa80d5ec3d,41dAO9Gng+4TI6edr1q8LSRt1ac=] */
