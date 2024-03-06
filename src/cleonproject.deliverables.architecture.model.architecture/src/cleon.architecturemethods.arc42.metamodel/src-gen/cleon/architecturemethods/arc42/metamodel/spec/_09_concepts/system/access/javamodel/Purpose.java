package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Purpose extends DynamicResource implements IPurpose {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPurpose> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPurpose>() {
    
    @Override
    public IPurpose create() {
      return new Purpose();
    }
    
    @Override
    public IPurpose create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Purpose(resourceRepository, resource);
    }
  
  };

  public Purpose() {
    super(IPurpose.TYPE_ID);
  }
  
  public Purpose(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPurpose.TYPE_ID);
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

  public Purpose setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isManagement()) return visitor.visitManagement();
    if (isManagement__F___N_Fallback__O_()) return visitor.visitManagement__F___N_Fallback__O_();
    if (isUser()) return visitor.visitUser();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isManagement()) {
      visitor.visitManagement();
      return;
    }
    if (isManagement__F___N_Fallback__O_()) {
      visitor.visitManagement__F___N_Fallback__O_();
      return;
    }
    if (isUser()) {
      visitor.visitUser();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isManagement() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.Purpose_Management);
  }
  
  @Override
  public boolean isManagement__F___N_Fallback__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.Purpose_Management__F___N_Fallback__O_);
  }
  
  @Override
  public boolean isUser() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.Purpose_User);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b7bb9567-84df-11ec-8ce3-4fc564ebb802,+1DWExZxxXvTxNsG0DQR7+VWKLM=] */
