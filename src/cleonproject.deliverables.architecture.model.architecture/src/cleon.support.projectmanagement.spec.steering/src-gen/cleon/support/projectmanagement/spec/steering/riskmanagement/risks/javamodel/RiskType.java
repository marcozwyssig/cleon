package cleon.support.projectmanagement.spec.steering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RiskType extends DynamicResource implements IRiskType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskType>() {
    
    @Override
    public IRiskType create() {
      return new RiskType();
    }
    
    @Override
    public IRiskType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RiskType(resourceRepository, resource);
    }
  
  };

  public RiskType() {
    super(IRiskType.TYPE_ID);
  }
  
  public RiskType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRiskType.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RiskType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isRisk()) return visitor.visitRisk();
    if (isChance()) return visitor.visitChance();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isRisk()) {
      visitor.visitRisk();
      return;
    }
    if (isChance()) {
      visitor.visitChance();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isRisk() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.RiskType_Risk);
  }
  
  @Override
  public boolean isChance() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.RiskType_Chance);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8f9d029-3394-11e6-94cd-fbf6c8ccd08d,QvczUVb5KND58kxCVgnCA8c2JuA=] */
