package cleon.support.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModulesControlling extends DynamicResource implements IModulesControlling {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModulesControlling> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModulesControlling>() {
    
    @Override
    public IModulesControlling create() {
      return new ModulesControlling();
    }
    
    @Override
    public IModulesControlling create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModulesControlling(resourceRepository, resource);
    }
  
  };

  public ModulesControlling() {
    super(IModulesControlling.TYPE_ID);
  }
  
  public ModulesControlling(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModulesControlling.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling> selectModuleControllings() {
    return _getMap(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModulesControlling_moduleControllings);
  }

  public ModulesControlling setModuleControllings(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling> moduleControllings) {
    _setMap(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModulesControlling_moduleControllings, moduleControllings);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModulesControlling setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModulesControlling_moduleControllings, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModulesControlling selectToMeModuleControllings(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModulesControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModulesControlling_moduleControllings, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,daab8237-bdfc-11e6-a3f0-c7681ee45a3f,zS9xa5GW8WYuY1jhl+oRUA1xEkM=] */
