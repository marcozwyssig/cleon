package cleon.architecturemethods.eamod.metamodel.spec.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemPort extends DynamicResource implements ISystemPort {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemPort> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemPort>() {
    
    @Override
    public ISystemPort create() {
      return new SystemPort();
    }
    
    @Override
    public ISystemPort create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemPort(resourceRepository, resource);
    }
  
  };

  public SystemPort() {
    super(ISystemPort.TYPE_ID);
  }
  
  public SystemPort(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemPort.TYPE_ID);
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

  public SystemPort setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ac7bfa82-818c-11e7-9507-01b75489c44b,dxYEm/PegL8fLioTyWHJvPuM8xQ=] */
