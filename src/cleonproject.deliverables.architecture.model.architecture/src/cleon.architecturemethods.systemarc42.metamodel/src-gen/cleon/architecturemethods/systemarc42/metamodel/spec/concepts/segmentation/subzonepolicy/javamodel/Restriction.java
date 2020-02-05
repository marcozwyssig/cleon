package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Restriction extends DynamicResource implements IRestriction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRestriction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRestriction>() {
    
    @Override
    public IRestriction create() {
      return new Restriction();
    }
    
    @Override
    public IRestriction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Restriction(resourceRepository, resource);
    }
  
  };

  public Restriction() {
    super(IRestriction.TYPE_ID);
  }
  
  public Restriction(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRestriction.TYPE_ID);
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

  public Restriction setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isRestricted()) return visitor.visitRestricted();
    if (isAllowed()) return visitor.visitAllowed();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isRestricted()) {
      visitor.visitRestricted();
      return;
    }
    if (isAllowed()) {
      visitor.visitAllowed();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isRestricted() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.Restriction_Restricted);
  }
  
  @Override
  public boolean isAllowed() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.Restriction_Allowed);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f310eb7a-b844-11e9-8760-2d4a9d15ec14,QksbU55DLmbBiZJ+Tig7PTNWC24=] */
