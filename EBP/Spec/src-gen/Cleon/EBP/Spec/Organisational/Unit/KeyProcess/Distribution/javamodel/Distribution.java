package Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Distribution extends DynamicResource implements IDistribution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistribution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistribution>() {
    
    @Override
    public IDistribution create() {
      return new Distribution();
    }
    
    @Override
    public IDistribution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Distribution(resourceRepository, resource);
    }
  
  };

  public Distribution() {
    super(IDistribution.TYPE_ID);
  }
  
  public Distribution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDistribution.TYPE_ID);
  }

  // relations
  
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IFulfillment selectFulfillment() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IFulfillment.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_fulfillment);
  }

  public Distribution setFulfillment(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IFulfillment fulfillment) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_fulfillment, fulfillment);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPreSales selectPreSales() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPreSales.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_preSales);
  }

  public Distribution setPreSales(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPreSales preSales) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_preSales, preSales);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IProduction selectProduction() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IProduction.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_production);
  }

  public Distribution setProduction(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IProduction production) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_production, production);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPurchase selectPurchase() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPurchase.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_purchase);
  }

  public Distribution setPurchase(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPurchase purchase) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_purchase, purchase);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader selectResponsible() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Distribution setResponsible(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader responsible) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> selectStaff() {
    return _getList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff);
  }

  public Distribution setStaff(java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> staff) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Distribution setSubOrganisations(java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Distribution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IFulfillment.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_fulfillment, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPreSales.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_preSales, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IProduction.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_production, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPurchase.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_purchase, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution selectToMePreSales(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPreSales object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_preSales, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution selectToMeFulfillment(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IFulfillment object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_fulfillment, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution selectToMePurchase(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPurchase object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_purchase, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution selectToMeProduction(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IProduction object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.DistributionPackage.Distribution_production, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7546c5a9-daa8-11e3-ae07-89aa80d5ec3d,50k3vXwMZIWMMYl1K5a/YVXz2NM=] */
