package cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RiskClassification extends DynamicResource implements IRiskClassification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskClassification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskClassification>() {
    
    @Override
    public IRiskClassification create() {
      return new RiskClassification();
    }
    
    @Override
    public IRiskClassification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RiskClassification(resourceRepository, resource);
    }
  
  };

  public RiskClassification() {
    super(IRiskClassification.TYPE_ID);
  }
  
  public RiskClassification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRiskClassification.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectHigh() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_High);
  }
    
  public void setHigh(java.lang.Integer high) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_High, high);
  }

  @Override
  public java.lang.Integer selectMedium() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_Medium);
  }
    
  public void setMedium(java.lang.Integer medium) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_Medium, medium);
  }

  @Override
  public java.lang.Integer selectVeryHigh() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_VeryHigh);
  }
    
  public void setVeryHigh(java.lang.Integer veryHigh) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_VeryHigh, veryHigh);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RiskClassification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_High, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_Medium, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.RiskClassification_VeryHigh, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fe05275e-324d-11e6-ab4d-73a9260c8088,7bnyIDsyldsyescE4Ya5EQ9BdBA=] */
