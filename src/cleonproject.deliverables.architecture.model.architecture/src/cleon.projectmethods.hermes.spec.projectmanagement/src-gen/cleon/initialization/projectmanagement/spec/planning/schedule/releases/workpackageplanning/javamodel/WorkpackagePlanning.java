package cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WorkpackagePlanning extends DynamicResource implements IWorkpackagePlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkpackagePlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkpackagePlanning>() {
    
    @Override
    public IWorkpackagePlanning create() {
      return new WorkpackagePlanning();
    }
    
    @Override
    public IWorkpackagePlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WorkpackagePlanning(resourceRepository, resource);
    }
  
  };

  public WorkpackagePlanning() {
    super(IWorkpackagePlanning.TYPE_ID);
  }
  
  public WorkpackagePlanning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkpackagePlanning.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WorkpackagePlanning setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WorkpackagePlanning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage selectWorkpackage() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.WorkpackageplanningPackage.WorkpackagePlanning_workpackage);
  }

  public WorkpackagePlanning setWorkpackage(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.WorkpackageplanningPackage.WorkpackagePlanning_workpackage, workpackage);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.WorkpackageplanningPackage.WorkpackagePlanning_workpackage, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning> selectToMeWorkpackage(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning.class, cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.WorkpackageplanningPackage.WorkpackagePlanning_workpackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2ca893b3-b487-11e8-8f7e-e5c7a2aaa874,q+NaGSyINhA4G2+FZLlgJHMj74g=] */
