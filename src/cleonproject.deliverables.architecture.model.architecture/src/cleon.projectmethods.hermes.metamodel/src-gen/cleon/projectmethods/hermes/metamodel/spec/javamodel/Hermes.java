package cleon.projectmethods.hermes.metamodel.spec.javamodel;

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
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules selectModules() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_modules);
  }

  public Hermes setModules(cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules modules) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_modules, modules);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IPhases selectPhases() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IPhases.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_phases);
  }

  public Hermes setPhases(cleon.projectmethods.hermes.metamodel.spec.javamodel.IPhases phases) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_phases, phases);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IRoles selectRoles() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRoles.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_roles);
  }

  public Hermes setRoles(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRoles roles) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_roles, roles);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IScenarios selectScenarios() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IScenarios.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_scenarios);
  }

  public Hermes setScenarios(cleon.projectmethods.hermes.metamodel.spec.javamodel.IScenarios scenarios) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_scenarios, scenarios);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.ITasks selectTasks() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.ITasks.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_tasks);
  }

  public Hermes setTasks(cleon.projectmethods.hermes.metamodel.spec.javamodel.ITasks tasks) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_tasks, tasks);
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
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_modules, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IPhases.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_phases, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRoles.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_roles, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IScenarios.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_scenarios, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.ITasks.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_tasks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes selectToMePhases(cleon.projectmethods.hermes.metamodel.spec.javamodel.IPhases object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_phases, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes selectToMeRoles(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRoles object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_roles, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes selectToMeModules(cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_modules, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes selectToMeScenarios(cleon.projectmethods.hermes.metamodel.spec.javamodel.IScenarios object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_scenarios, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes selectToMeTasks(cleon.projectmethods.hermes.metamodel.spec.javamodel.ITasks object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.javamodel.IHermes.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Hermes_tasks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fceba8cc-31c9-11e8-8a84-6f139e67278b,tZhVvUEcv3BHoRaMRCD5S6vnpaA=] */
