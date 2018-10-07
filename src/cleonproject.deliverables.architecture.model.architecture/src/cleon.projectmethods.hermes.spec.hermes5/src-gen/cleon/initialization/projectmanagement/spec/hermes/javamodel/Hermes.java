package cleon.initialization.projectmanagement.spec.hermes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Hermes extends DynamicResource implements IHermes {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHermes> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHermes>() {
    
    @Override
    public IHermes create() {
      return new Hermes();
    }
    
    @Override
    public IHermes create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Hermes(resourceRepository, resource);
    }
  
  };

  public Hermes() {
    super(IHermes.TYPE_ID);
  }
  
  public Hermes(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHermes.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IModules selectModules() {
    return _getSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IModules.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_modules);
  }

  public Hermes setModules(cleon.initialization.projectmanagement.spec.hermes.javamodel.IModules modules) {
    _setSingle(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_modules, modules);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IPhases selectPhases() {
    return _getSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IPhases.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_phases);
  }

  public Hermes setPhases(cleon.initialization.projectmanagement.spec.hermes.javamodel.IPhases phases) {
    _setSingle(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_phases, phases);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles selectRoles() {
    return _getSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_roles);
  }

  public Hermes setRoles(cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles roles) {
    _setSingle(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_roles, roles);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios selectScenarios() {
    return _getSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_scenarios);
  }

  public Hermes setScenarios(cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios scenarios) {
    _setSingle(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_scenarios, scenarios);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks selectTasks() {
    return _getSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_tasks);
  }

  public Hermes setTasks(cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks tasks) {
    _setSingle(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_tasks, tasks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Hermes setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IModules.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_modules, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IPhases.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_phases, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_roles, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_scenarios, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_tasks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes selectToMePhases(cleon.initialization.projectmanagement.spec.hermes.javamodel.IPhases object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_phases, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes selectToMeRoles(cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_roles, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes selectToMeModules(cleon.initialization.projectmanagement.spec.hermes.javamodel.IModules object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_modules, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes selectToMeScenarios(cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_scenarios, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes selectToMeTasks(cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.IHermes.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Hermes_tasks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fceba8cc-31c9-11e8-8a84-6f139e67278b,52ZcJ8XxkvI75PhHpByPvaoIcPA=] */
