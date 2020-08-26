package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DirectoryService extends DynamicResource implements IDirectoryService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryService>() {
    
    @Override
    public IDirectoryService create() {
      return new DirectoryService();
    }
    
    @Override
    public IDirectoryService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DirectoryService(resourceRepository, resource);
    }
  
  };

  public DirectoryService() {
    super(IDirectoryService.TYPE_ID);
  }
  
  public DirectoryService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDirectoryService.TYPE_ID);
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

  public DirectoryService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d0f6ae54-e6c3-11ea-92fa-2db17cc89b0c,cQ/fhf0d+lFoqMoLmJH+WdffbXI=] */
