package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentProcedureStage extends DynamicResource implements IDeploymentProcedureStage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureStage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureStage>() {
    
    @Override
    public IDeploymentProcedureStage create() {
      return new DeploymentProcedureStage();
    }
    
    @Override
    public IDeploymentProcedureStage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentProcedureStage(resourceRepository, resource);
    }
  
  };

  public DeploymentProcedureStage() {
    super(IDeploymentProcedureStage.TYPE_ID);
  }
  
  public DeploymentProcedureStage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentProcedureStage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount> selectPhaseUsageCountExceptions() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureStage_phaseUsageCountExceptions);
  }

  public DeploymentProcedureStage setPhaseUsageCountExceptions(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount> phaseUsageCountExceptions) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureStage_phaseUsageCountExceptions, phaseUsageCountExceptions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentProcedureStage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureStage_phaseUsageCountExceptions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureStage selectToMePhaseUsageCountExceptions(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureStage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureStage_phaseUsageCountExceptions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5886b9d2-7e84-11ec-b55c-f5ca121c82b7,fc09IOQFxcF4X7N61O1gU0uXmpw=] */
