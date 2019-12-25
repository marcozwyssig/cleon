package cleon.projectmethods.hermes.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Modules extends DynamicResource implements IModules {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModules> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModules>() {
    
    @Override
    public IModules create() {
      return new Modules();
    }
    
    @Override
    public IModules create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Modules(resourceRepository, resource);
    }
  
  };

  public Modules() {
    super(IModules.TYPE_ID);
  }
  
  public Modules(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModules.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.javamodel.IModule> selectModules() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.javamodel.IModule.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Modules_modules);
  }

  public Modules setModules(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.javamodel.IModule> modules) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Modules_modules, modules);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Modules setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.javamodel.IModule.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Modules_modules, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules selectToMeModules(cleon.projectmethods.hermes.metamodel.spec.javamodel.IModule object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Modules_modules, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bc41be75-31ca-11e8-8a84-6f139e67278b,zVQ9MqAeeb7OdGva4R0WkSskuMM=] */
