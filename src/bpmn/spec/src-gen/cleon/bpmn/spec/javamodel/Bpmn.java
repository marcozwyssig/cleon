package cleon.bpmn.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Bpmn extends DynamicResource implements IBpmn {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBpmn> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBpmn>() {
    
    @Override
    public IBpmn create() {
      return new Bpmn();
    }
    
    @Override
    public IBpmn create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Bpmn(resourceRepository, resource);
    }
  
  };

  public Bpmn() {
    super(IBpmn.TYPE_ID);
  }
  
  public Bpmn(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBpmn.TYPE_ID);
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

  public Bpmn setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b0d96e05-7e49-11e5-85ce-e7c8e0b30f03,/VUFWJVa/VGzaVI40WcoQFSX8Ek=] */
