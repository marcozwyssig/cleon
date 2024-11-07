package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EclipseDirectory extends DynamicResource implements IEclipseDirectory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEclipseDirectory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEclipseDirectory>() {
    
    @Override
    public IEclipseDirectory create() {
      return new EclipseDirectory();
    }
    
    @Override
    public IEclipseDirectory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EclipseDirectory(resourceRepository, resource);
    }
  
  };

  public EclipseDirectory() {
    super(IEclipseDirectory.TYPE_ID);
  }
  
  public EclipseDirectory(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEclipseDirectory.TYPE_ID);
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
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IEclipseDirectory> selectSubdirectories() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IEclipseDirectory.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.ResourcePackage.EclipseDirectory_subdirectories);
  }

  public EclipseDirectory setSubdirectories(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IEclipseDirectory> subdirectories) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.ResourcePackage.EclipseDirectory_subdirectories, subdirectories);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EclipseDirectory setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IEclipseDirectory.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.ResourcePackage.EclipseDirectory_subdirectories, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IEclipseDirectory selectToMeSubdirectories(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IEclipseDirectory object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IEclipseDirectory.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.ResourcePackage.EclipseDirectory_subdirectories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8b68e26-5201-11e5-89ac-35d4069568da,SwqiV+2E8FKsZiZD8A4PjsN20JI=] */
