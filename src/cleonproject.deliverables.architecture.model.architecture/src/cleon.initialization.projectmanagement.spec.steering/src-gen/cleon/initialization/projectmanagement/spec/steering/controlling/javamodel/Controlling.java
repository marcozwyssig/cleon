package cleon.initialization.projectmanagement.spec.steering.controlling.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Controlling extends DynamicResource implements IControlling {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IControlling> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IControlling>() {
    
    @Override
    public IControlling create() {
      return new Controlling();
    }
    
    @Override
    public IControlling create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Controlling(resourceRepository, resource);
    }
  
  };

  public Controlling() {
    super(IControlling.TYPE_ID);
  }
  
  public Controlling(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IControlling.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModulesControlling selectModuleControlling() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModulesControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.ControllingPackage.Controlling_moduleControlling);
  }

  public Controlling setModuleControlling(cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModulesControlling moduleControlling) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.controlling.ControllingPackage.Controlling_moduleControlling, moduleControlling);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Controlling setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModulesControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.ControllingPackage.Controlling_moduleControlling, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling selectToMeModuleControlling(cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModulesControlling object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.ControllingPackage.Controlling_moduleControlling, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d404ffdb-a7d8-11e5-82dd-3b995d9c840c,ozGumgpBSBHSjrP9q8xTE1nbdI4=] */
