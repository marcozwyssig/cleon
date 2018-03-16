package cleon.support.projectmanagement.spec.planning.scope.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Module extends DynamicResource implements IModule {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModule> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModule>() {
    
    @Override
    public IModule create() {
      return new Module();
    }
    
    @Override
    public IModule create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Module(resourceRepository, resource);
    }
  
  };

  public Module() {
    super(IModule.TYPE_ID);
  }
  
  public Module(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModule.TYPE_ID);
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

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
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
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines() {
    return _getList(cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_deadlines);
  }

  public Module setDeadlines(java.util.List<? extends cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline> deadlines) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_deadlines, deadlines);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency> selectDependsOn() {
    return _getList(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_dependsOn);
  }

  public Module setDependsOn(java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency> dependsOn) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Module setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes selectOutcomes() {
    return _getSingle(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_outcomes);
  }

  public Module setOutcomes(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes outcomes) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_outcomes, outcomes);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public Module setOwner(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.support.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleState selectState() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleState.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_state);
  }

  public Module setState(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleState state) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Module setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_deadlines, visitor);
    _acceptList(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_dependsOn, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_outcomes, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleState.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule selectToMeDependsOn(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_dependsOn, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule> selectToMeOutcomes(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_outcomes, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule> selectToMeDeadlines(cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_deadlines, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule> selectToMeState(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModuleState object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Module_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,Ko/Vq7Uf65GXkuofBa5qxzjkBvE=] */
