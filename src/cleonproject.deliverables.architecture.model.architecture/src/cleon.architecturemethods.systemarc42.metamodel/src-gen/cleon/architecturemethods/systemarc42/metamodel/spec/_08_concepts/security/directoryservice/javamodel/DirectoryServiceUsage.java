package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DirectoryServiceUsage extends DynamicResource implements IDirectoryServiceUsage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryServiceUsage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryServiceUsage>() {
    
    @Override
    public IDirectoryServiceUsage create() {
      return new DirectoryServiceUsage();
    }
    
    @Override
    public IDirectoryServiceUsage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DirectoryServiceUsage(resourceRepository, resource);
    }
  
  };

  public DirectoryServiceUsage() {
    super(IDirectoryServiceUsage.TYPE_ID);
  }
  
  public DirectoryServiceUsage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDirectoryServiceUsage.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService selectDirectoryService() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceUsage_directoryService);
  }

  public DirectoryServiceUsage setDirectoryService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService directoryService) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceUsage_directoryService, directoryService);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DirectoryServiceUsage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DirectoryServiceUsage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceUsage_directoryService, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceUsage> selectToMeDirectoryService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceUsage_directoryService, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,67bf2569-e6c4-11ea-92fa-2db17cc89b0c,1ORYSUPxWQCbLBvWg8OGegKe3d4=] */
