package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentProcedurePhaseUsageCount extends DynamicResource implements IDeploymentProcedurePhaseUsageCount {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedurePhaseUsageCount> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedurePhaseUsageCount>() {
    
    @Override
    public IDeploymentProcedurePhaseUsageCount create() {
      return new DeploymentProcedurePhaseUsageCount();
    }
    
    @Override
    public IDeploymentProcedurePhaseUsageCount create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentProcedurePhaseUsageCount(resourceRepository, resource);
    }
  
  };

  public DeploymentProcedurePhaseUsageCount() {
    super(IDeploymentProcedurePhaseUsageCount.TYPE_ID);
  }
  
  public DeploymentProcedurePhaseUsageCount(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentProcedurePhaseUsageCount.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectCount() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedurePhaseUsageCount_count);
  }
    
  public void setCount(java.lang.Integer count) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedurePhaseUsageCount_count, count);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentProcedurePhaseUsageCount setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentProcedurePhaseUsageCount setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectUsageCountFor() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedurePhaseUsageCount_usageCountFor);
  }

  public DeploymentProcedurePhaseUsageCount setUsageCountFor(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration usageCountFor) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedurePhaseUsageCount_usageCountFor, usageCountFor);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedurePhaseUsageCount_count, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedurePhaseUsageCount_usageCountFor, visitor);
  }

  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount> selectToMeUsageCountFor(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedurePhaseUsageCount_usageCountFor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b6c9ea70-7ebc-11ec-b55c-f5ca121c82b7,T9vMhpEH9B9kO7KL3IwhKsGEgv4=] */
