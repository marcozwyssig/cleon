package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OutcomeDependency extends DynamicResource implements IOutcomeDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomeDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomeDependency>() {
    
    @Override
    public IOutcomeDependency create() {
      return new OutcomeDependency();
    }
    
    @Override
    public IOutcomeDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OutcomeDependency(resourceRepository, resource);
    }
  
  };

  public OutcomeDependency() {
    super(IOutcomeDependency.TYPE_ID);
  }
  
  public OutcomeDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutcomeDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.OutcomeDependency_reason);
  }
    
  public void setReason(java.lang.String reason) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.OutcomeDependency_reason, reason);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome selectTo() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.OutcomeDependency_to);
  }

  public OutcomeDependency setTo(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome to) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.OutcomeDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OutcomeDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.OutcomeDependency_reason, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.OutcomeDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency> selectToMeTo(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.OutcomeDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,12cf9b7d-07d6-11e6-a579-8304ec3aa032,2BV4BQ+F6o6QIf9TKg2oP4PEmOU=] */
