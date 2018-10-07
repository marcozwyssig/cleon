package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EffortAware extends DynamicResource implements IEffortAware {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEffortAware> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEffortAware>() {
    
    @Override
    public IEffortAware create() {
      return new EffortAware();
    }
    
    @Override
    public IEffortAware create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EffortAware(resourceRepository, resource);
    }
  
  };

  public EffortAware() {
    super(IEffortAware.TYPE_ID);
  }
  
  public EffortAware(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEffortAware.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate);
  }

  public EffortAware setEstimate(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EffortAware setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffortAware> selectToMeEstimate(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffortAware.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a2ffdac0-e6d4-11e5-a502-93f18d5742dc,zei2Hlm5lXk6+lWttcw2IDDDg20=] */
