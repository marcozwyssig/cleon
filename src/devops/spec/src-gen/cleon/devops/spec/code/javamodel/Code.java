package cleon.devops.spec.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Code extends DynamicResource implements ICode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICode>() {
    
    @Override
    public ICode create() {
      return new Code();
    }
    
    @Override
    public ICode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Code(resourceRepository, resource);
    }
  
  };

  public Code() {
    super(ICode.TYPE_ID);
  }
  
  public Code(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICode.TYPE_ID);
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

  public Code setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c9bd141d-406e-11e5-b5f0-5b1ce9c3de3e,JLwZxl3Zen1X/XwIqe56aiwNfzk=] */
