package cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleUtilization extends DynamicResource implements IModuleUtilization {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleUtilization> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleUtilization>() {
    
    @Override
    public IModuleUtilization create() {
      return new ModuleUtilization();
    }
    
    @Override
    public IModuleUtilization create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleUtilization(resourceRepository, resource);
    }
  
  };

  public ModuleUtilization() {
    super(IModuleUtilization.TYPE_ID);
  }
  
  public ModuleUtilization(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleUtilization.TYPE_ID);
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
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> selectAchiviesDeliverable() {
    return _getList(cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_achiviesDeliverable);
  }

  public ModuleUtilization setAchiviesDeliverable(java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> achiviesDeliverable) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_achiviesDeliverable, achiviesDeliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ModuleUtilization setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule selectModule() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module);
  }

  public ModuleUtilization setModule(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, module);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectRoleUtilizations() {
    return _getMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations);
  }

  public ModuleUtilization setRoleUtilizations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> roleUtilizations) {
    _setMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, roleUtilizations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ModuleUtilization setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModuleUtilization setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_achiviesDeliverable, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, visitor);
    _acceptMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization> selectToMeModule(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization selectToMeRoleUtilizations(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization selectToMeAchiviesDeliverable(cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_achiviesDeliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27e45355-c291-11e6-ba8e-05f5391bcda8,d5BZ7mdJlAHICIGpaP1u0k1NPio=] */
