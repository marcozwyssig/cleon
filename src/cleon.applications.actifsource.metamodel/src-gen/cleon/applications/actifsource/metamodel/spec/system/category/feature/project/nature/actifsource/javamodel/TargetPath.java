package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TargetPath extends DynamicResource implements ITargetPath {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITargetPath> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITargetPath>() {
    
    @Override
    public ITargetPath create() {
      return new TargetPath();
    }
    
    @Override
    public ITargetPath create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TargetPath(resourceRepository, resource);
    }
  
  };

  public TargetPath() {
    super(ITargetPath.TYPE_ID);
  }
  
  public TargetPath(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITargetPath.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.generator.javamodel.IBuildConfig> selectBuildConfigs() {
    return _getList(ch.actifsource.generator.javamodel.IBuildConfig.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_buildConfigs);
  }

  public TargetPath setBuildConfigs(java.util.List<? extends ch.actifsource.generator.javamodel.IBuildConfig> buildConfigs) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_buildConfigs, buildConfigs);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IResource selectResource() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IResource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_resource);
  }

  public TargetPath setResource(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IResource resource) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_resource, resource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TargetPath setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TargetPath setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(ch.actifsource.generator.javamodel.IBuildConfig.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_buildConfigs, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IResource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_resource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.ITargetPath> selectToMeResource(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IResource object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.ITargetPath.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_resource, object.getResource());
  }
  
  public static java.util.List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.ITargetPath> selectToMeBuildConfigs(ch.actifsource.generator.javamodel.IBuildConfig object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.ITargetPath.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.ActifsourcePackage.TargetPath_buildConfigs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01463ab3-5202-11e5-89ac-35d4069568da,t2qj1am83CFwhCZulahiqo3vyEo=] */
