package cleon.initialization.projectmanagement.spec.hermes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Scenarios extends DynamicResource implements IScenarios {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScenarios> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScenarios>() {
    
    @Override
    public IScenarios create() {
      return new Scenarios();
    }
    
    @Override
    public IScenarios create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Scenarios(resourceRepository, resource);
    }
  
  };

  public Scenarios() {
    super(IScenarios.TYPE_ID);
  }
  
  public Scenarios(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IScenarios.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenario> selectScenarios() {
    return _getList(cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenario.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Scenarios_scenarios);
  }

  public Scenarios setScenarios(java.util.List<? extends cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenario> scenarios) {
    _setList(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Scenarios_scenarios, scenarios);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Scenarios setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenario.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Scenarios_scenarios, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios selectToMeScenarios(cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenario object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Scenarios_scenarios, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c341a2d2-31cf-11e8-8a84-6f139e67278b,G/NEED2HHqmAXxoIO6d8xNwQqnE=] */
