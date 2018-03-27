package cleon.initialization.projectmanagement.spec.hermes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Tasks extends DynamicResource implements ITasks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITasks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITasks>() {
    
    @Override
    public ITasks create() {
      return new Tasks();
    }
    
    @Override
    public ITasks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Tasks(resourceRepository, resource);
    }
  
  };

  public Tasks() {
    super(ITasks.TYPE_ID);
  }
  
  public Tasks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITasks.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.hermes.javamodel.ITask> selectTasks() {
    return _getList(cleon.initialization.projectmanagement.spec.hermes.javamodel.ITask.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Tasks_tasks);
  }

  public Tasks setTasks(java.util.List<? extends cleon.initialization.projectmanagement.spec.hermes.javamodel.ITask> tasks) {
    _setList(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Tasks_tasks, tasks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Tasks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.hermes.javamodel.ITask.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Tasks_tasks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks selectToMeTasks(cleon.initialization.projectmanagement.spec.hermes.javamodel.ITask object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Tasks_tasks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d5e86038-31ce-11e8-8a84-6f139e67278b,uj7yfGlaCA35rTpy8xW2OdGyXpM=] */
