package cleon.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Monitor extends DynamicResource implements IMonitor {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitor> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitor>() {
    
    @Override
    public IMonitor create() {
      return new Monitor();
    }
    
    @Override
    public IMonitor create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Monitor(resourceRepository, resource);
    }
  
  };

  public Monitor() {
    super(IMonitor.TYPE_ID);
  }
  
  public Monitor(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMonitor.TYPE_ID);
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

  public Monitor setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,749fb884-406f-11e5-b5f0-5b1ce9c3de3e,ULlORi+XrxC9VVtnxq55vFzk6RI=] */
