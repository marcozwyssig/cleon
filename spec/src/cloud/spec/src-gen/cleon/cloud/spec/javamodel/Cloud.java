package cleon.cloud.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Cloud extends DynamicResource implements ICloud {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICloud> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICloud>() {
    
    @Override
    public ICloud create() {
      return new Cloud();
    }
    
    @Override
    public ICloud create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Cloud(resourceRepository, resource);
    }
  
  };

  public Cloud() {
    super(ICloud.TYPE_ID);
  }
  
  public Cloud(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICloud.TYPE_ID);
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

  public Cloud setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,20056d4e-4e68-11e5-b1c6-87a5f4c1016f,HSJAhE85DOpRqIe9FGpgH/3b0pw=] */
