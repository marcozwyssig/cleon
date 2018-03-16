package cleon.conception.eamod.spec.nsov.v1.lifetime.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceLifetime extends DynamicResource implements IServiceLifetime {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceLifetime> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceLifetime>() {
    
    @Override
    public IServiceLifetime create() {
      return new ServiceLifetime();
    }
    
    @Override
    public IServiceLifetime create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceLifetime(resourceRepository, resource);
    }
  
  };

  public ServiceLifetime() {
    super(IServiceLifetime.TYPE_ID);
  }
  
  public ServiceLifetime(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceLifetime.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceLifetime setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isNA__F___S___F_NotAvailable()) return visitor.visitNA__F___S___F_NotAvailable();
    if (isPL__F___S___F_Planned()) return visitor.visitPL__F___S___F_Planned();
    if (isGA__F___S___F_General__F_Availability()) return visitor.visitGA__F___S___F_General__F_Availability();
    if (isEOL__F___S___F_EndOfLife()) return visitor.visitEOL__F___S___F_EndOfLife();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isNA__F___S___F_NotAvailable()) {
      visitor.visitNA__F___S___F_NotAvailable();
      return;
    }
    if (isPL__F___S___F_Planned()) {
      visitor.visitPL__F___S___F_Planned();
      return;
    }
    if (isGA__F___S___F_General__F_Availability()) {
      visitor.visitGA__F___S___F_General__F_Availability();
      return;
    }
    if (isEOL__F___S___F_EndOfLife()) {
      visitor.visitEOL__F___S___F_EndOfLife();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isNA__F___S___F_NotAvailable() {
    return getResource().equals(cleon.conception.eamod.spec.nsov.v1.lifetime.LifetimePackage.ServiceLifetime_NA__F___S___F_NotAvailable);
  }
  
  @Override
  public boolean isPL__F___S___F_Planned() {
    return getResource().equals(cleon.conception.eamod.spec.nsov.v1.lifetime.LifetimePackage.ServiceLifetime_PL__F___S___F_Planned);
  }
  
  @Override
  public boolean isGA__F___S___F_General__F_Availability() {
    return getResource().equals(cleon.conception.eamod.spec.nsov.v1.lifetime.LifetimePackage.ServiceLifetime_GA__F___S___F_General__F_Availability);
  }
  
  @Override
  public boolean isEOL__F___S___F_EndOfLife() {
    return getResource().equals(cleon.conception.eamod.spec.nsov.v1.lifetime.LifetimePackage.ServiceLifetime_EOL__F___S___F_EndOfLife);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8710140c-c149-11e6-8f58-ad3c6ee7602f,5zipqeTHC/bMeBQER9WsGBJb8ic=] */
