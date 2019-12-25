package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.messageExchange.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AsyncRequestResponse extends DynamicResource implements IAsyncRequestResponse {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsyncRequestResponse> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsyncRequestResponse>() {
    
    @Override
    public IAsyncRequestResponse create() {
      return new AsyncRequestResponse();
    }
    
    @Override
    public IAsyncRequestResponse create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AsyncRequestResponse(resourceRepository, resource);
    }
  
  };

  public AsyncRequestResponse() {
    super(IAsyncRequestResponse.TYPE_ID);
  }
  
  public AsyncRequestResponse(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAsyncRequestResponse.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AsyncRequestResponse setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,31b949ea-a437-11e3-a07f-f96d34c3de8f,2b4YKzu+6dXVY00TAkbRhjYy0U8=] */
