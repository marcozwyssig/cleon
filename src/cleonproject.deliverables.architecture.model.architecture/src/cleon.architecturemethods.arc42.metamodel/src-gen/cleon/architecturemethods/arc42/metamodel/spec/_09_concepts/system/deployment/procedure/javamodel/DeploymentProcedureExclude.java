package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentProcedureExclude extends DynamicResource implements IDeploymentProcedureExclude {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureExclude> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureExclude>() {
    
    @Override
    public IDeploymentProcedureExclude create() {
      return new DeploymentProcedureExclude();
    }
    
    @Override
    public IDeploymentProcedureExclude create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentProcedureExclude(resourceRepository, resource);
    }
  
  };

  public DeploymentProcedureExclude() {
    super(IDeploymentProcedureExclude.TYPE_ID);
  }
  
  public DeploymentProcedureExclude(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentProcedureExclude.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectExcludeCmpInInstallationOrder() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureExclude_excludeCmpInInstallationOrder);
  }

  public DeploymentProcedureExclude setExcludeCmpInInstallationOrder(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration excludeCmpInInstallationOrder) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureExclude_excludeCmpInInstallationOrder, excludeCmpInInstallationOrder);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentProcedureExclude setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureExclude_excludeCmpInInstallationOrder, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureExclude> selectToMeExcludeCmpInInstallationOrder(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureExclude.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureExclude_excludeCmpInInstallationOrder, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f828df38-8036-11ec-a0b4-330278d4f5d1,+pM0zpA7kKJK9Grtg5TPGSvry2w=] */
