package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RootDirectory extends DynamicResource implements IRootDirectory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRootDirectory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRootDirectory>() {
    
    @Override
    public IRootDirectory create() {
      return new RootDirectory();
    }
    
    @Override
    public IRootDirectory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RootDirectory(resourceRepository, resource);
    }
  
  };

  public RootDirectory() {
    super(IRootDirectory.TYPE_ID);
  }
  
  public RootDirectory(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRootDirectory.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RootDirectory setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b012f106-3484-11ea-8a90-f5372e2e0d45,ivqc0xdfzjyUPJEvY9Dj9JAEevM=] */
