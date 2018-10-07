package cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.messageExchange.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SyncRequestResponse extends DynamicResource implements ISyncRequestResponse {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISyncRequestResponse> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISyncRequestResponse>() {
    
    @Override
    public ISyncRequestResponse create() {
      return new SyncRequestResponse();
    }
    
    @Override
    public ISyncRequestResponse create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SyncRequestResponse(resourceRepository, resource);
    }
  
  };

  public SyncRequestResponse() {
    super(ISyncRequestResponse.TYPE_ID);
  }
  
  public SyncRequestResponse(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISyncRequestResponse.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SyncRequestResponse setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,11fee24e-a437-11e3-a07f-f96d34c3de8f,Mfkjdim2zU2cF+guO8C4zcma7mo=] */
