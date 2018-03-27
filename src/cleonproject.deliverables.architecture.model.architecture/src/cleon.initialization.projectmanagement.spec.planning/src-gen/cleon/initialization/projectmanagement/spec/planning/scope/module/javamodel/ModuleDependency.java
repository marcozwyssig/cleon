package cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleDependency extends DynamicResource implements IModuleDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleDependency>() {
    
    @Override
    public IModuleDependency create() {
      return new ModuleDependency();
    }
    
    @Override
    public IModuleDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleDependency(resourceRepository, resource);
    }
  
  };

  public ModuleDependency() {
    super(IModuleDependency.TYPE_ID);
  }
  
  public ModuleDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleDependency_reason);
  }
    
  public void setReason(java.lang.String reason) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleDependency_reason, reason);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule selectTo() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleDependency_to);
  }

  public ModuleDependency setTo(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule to) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModuleDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleDependency_reason, visitor);
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency> selectToMeTo(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency.class, cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,12cf9b7d-07d6-11e6-a579-8304ec3aa032,VlQKsYRutHH3EoI3AlGOw4SkaQY=] */
