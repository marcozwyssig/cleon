package cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleUtilizationWithService extends DynamicResource implements IModuleUtilizationWithService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleUtilizationWithService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleUtilizationWithService>() {
    
    @Override
    public IModuleUtilizationWithService create() {
      return new ModuleUtilizationWithService();
    }
    
    @Override
    public IModuleUtilizationWithService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleUtilizationWithService(resourceRepository, resource);
    }
  
  };

  public ModuleUtilizationWithService() {
    super(IModuleUtilizationWithService.TYPE_ID);
  }
  
  public ModuleUtilizationWithService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleUtilizationWithService.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> selectAchiviesDeliverable() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_achiviesDeliverable);
  }

  public ModuleUtilizationWithService setAchiviesDeliverable(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> achiviesDeliverable) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_achiviesDeliverable, achiviesDeliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ModuleUtilizationWithService setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome selectModule() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module);
  }

  public ModuleUtilizationWithService setModule(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome module) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, module);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectRequiredDeliverable() {
    return _getMap(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ModuleUtilizationWithService_requiredDeliverable);
  }

  public ModuleUtilizationWithService setRequiredDeliverable(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> requiredDeliverable) {
    _setMap(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ModuleUtilizationWithService_requiredDeliverable, requiredDeliverable);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectRoleUtilizations() {
    return _getMap(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations);
  }

  public ModuleUtilizationWithService setRoleUtilizations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> roleUtilizations) {
    _setMap(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, roleUtilizations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ModuleUtilizationWithService setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModuleUtilizationWithService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_achiviesDeliverable, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, visitor);
    _acceptMap(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ModuleUtilizationWithService_requiredDeliverable, visitor);
    _acceptMap(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IModuleUtilizationWithService selectToMeRequiredDeliverable(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IModuleUtilizationWithService.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ModuleUtilizationWithService_requiredDeliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f11960a-c6c4-11e6-8242-2f0ed6756d77,fxfP22PhKXjfXga04Iy/0Ffg0EU=] */
