package cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RiskState extends DynamicResource implements IRiskState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskState>() {
    
    @Override
    public IRiskState create() {
      return new RiskState();
    }
    
    @Override
    public IRiskState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RiskState(resourceRepository, resource);
    }
  
  };

  public RiskState() {
    super(IRiskState.TYPE_ID);
  }
  
  public RiskState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRiskState.TYPE_ID);
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

  public RiskState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isIn__F_Plan()) return visitor.visitIn__F_Plan();
    if (isIn__F_Watchlist()) return visitor.visitIn__F_Watchlist();
    if (isIn__F_Steering()) return visitor.visitIn__F_Steering();
    if (isMaterialised()) return visitor.visitMaterialised();
    if (isClosed()) return visitor.visitClosed();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isIn__F_Plan()) {
      visitor.visitIn__F_Plan();
      return;
    }
    if (isIn__F_Watchlist()) {
      visitor.visitIn__F_Watchlist();
      return;
    }
    if (isIn__F_Steering()) {
      visitor.visitIn__F_Steering();
      return;
    }
    if (isMaterialised()) {
      visitor.visitMaterialised();
      return;
    }
    if (isClosed()) {
      visitor.visitClosed();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isIn__F_Plan() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.RiskState_In__F_Plan);
  }
  
  @Override
  public boolean isIn__F_Watchlist() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.RiskState_In__F_Watchlist);
  }
  
  @Override
  public boolean isIn__F_Steering() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.RiskState_In__F_Steering);
  }
  
  @Override
  public boolean isMaterialised() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.RiskState_Materialised);
  }
  
  @Override
  public boolean isClosed() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.RiskState_Closed);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f854e5b5-324e-11e6-ab4d-73a9260c8088,gd+vkVORgzY5Fvqe8Vd9JH6n1B0=] */
