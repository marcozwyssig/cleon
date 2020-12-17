package cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ChangeRequest extends DynamicResource implements IChangeRequest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChangeRequest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChangeRequest>() {
    
    @Override
    public IChangeRequest create() {
      return new ChangeRequest();
    }
    
    @Override
    public IChangeRequest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ChangeRequest(resourceRepository, resource);
    }
  
  };

  public ChangeRequest() {
    super(IChangeRequest.TYPE_ID);
  }
  
  public ChangeRequest(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChangeRequest.TYPE_ID);
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

  public ChangeRequest setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,80ae052c-4058-11eb-aaa9-61838d129c8c,dSKaqURUqTxNhyAHdgVx6D6Z73s=] */
