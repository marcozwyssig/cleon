package cleon.support.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleControlling extends DynamicResource implements IModuleControlling {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleControlling> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleControlling>() {
    
    @Override
    public IModuleControlling create() {
      return new ModuleControlling();
    }
    
    @Override
    public IModuleControlling create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleControlling(resourceRepository, resource);
    }
  
  };

  public ModuleControlling() {
    super(IModuleControlling.TYPE_ID);
  }
  
  public ModuleControlling(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleControlling.TYPE_ID);
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
  public cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp selectDeadline() {
    return _getSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_deadline);
  }

  public ModuleControlling setDeadline(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp deadline) {
    _setSingle(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_deadline, deadline);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ModuleControlling setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments selectImpediments() {
    return _getSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_impediments);
  }

  public ModuleControlling setImpediments(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments impediments) {
    _setSingle(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_impediments, impediments);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule selectModule() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_module);
  }

  public ModuleControlling setModule(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
    _setSingle(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_module, module);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp selectQuality() {
    return _getSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_quality);
  }

  public ModuleControlling setQuality(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp quality) {
    _setSingle(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_quality, quality);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp selectRisk() {
    return _getSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risk);
  }

  public ModuleControlling setRisk(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp risk) {
    _setSingle(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risk, risk);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleRisks selectRisks() {
    return _getSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleRisks.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risks);
  }

  public ModuleControlling setRisks(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleRisks risks) {
    _setSingle(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risks, risks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ModuleControlling setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModuleControlling setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_deadline, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_impediments, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_module, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_quality, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risk, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleRisks.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling> selectToMeModule(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_module, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling selectToMeRisks(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleRisks object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risks, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling selectToMeImpediments(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_impediments, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling selectToMeQuality(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_quality, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling selectToMeDeadline(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_deadline, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling selectToMeRisk(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleControlling_risk, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f,G3oFEAoIlWK6mmwr4oPNxlY78QM=] */
