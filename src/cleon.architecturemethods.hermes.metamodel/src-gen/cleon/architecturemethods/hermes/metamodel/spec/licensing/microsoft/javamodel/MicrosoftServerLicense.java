package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MicrosoftServerLicense extends DynamicResource implements IMicrosoftServerLicense {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMicrosoftServerLicense> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMicrosoftServerLicense>() {
    
    @Override
    public IMicrosoftServerLicense create() {
      return new MicrosoftServerLicense();
    }
    
    @Override
    public IMicrosoftServerLicense create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MicrosoftServerLicense(resourceRepository, resource);
    }
  
  };

  public MicrosoftServerLicense() {
    super(IMicrosoftServerLicense.TYPE_ID);
  }
  
  public MicrosoftServerLicense(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMicrosoftServerLicense.TYPE_ID);
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

  public MicrosoftServerLicense setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isDatacenter()) return visitor.visitDatacenter();
    if (isStandard()) return visitor.visitStandard();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isDatacenter()) {
      visitor.visitDatacenter();
      return;
    }
    if (isStandard()) {
      visitor.visitStandard();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isDatacenter() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.MicrosoftServerLicense_Datacenter);
  }
  
  @Override
  public boolean isStandard() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.MicrosoftServerLicense_Standard);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bce9f151-dfce-11ef-b0be-9b4cac321140,iapsZO/zYFVNDdP2/7A9pXTPtOI=] */
