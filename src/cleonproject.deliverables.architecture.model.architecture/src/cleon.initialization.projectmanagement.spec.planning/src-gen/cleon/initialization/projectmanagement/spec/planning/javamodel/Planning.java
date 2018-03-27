package cleon.initialization.projectmanagement.spec.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Planning extends DynamicResource implements IPlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning>() {
    
    @Override
    public IPlanning create() {
      return new Planning();
    }
    
    @Override
    public IPlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Planning(resourceRepository, resource);
    }
  
  };

  public Planning() {
    super(IPlanning.TYPE_ID);
  }
  
  public Planning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlanning.TYPE_ID);
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
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IConstraints selectConstraints() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IConstraints.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_constraints);
  }

  public Planning setConstraints(cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IConstraints constraints) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_constraints, constraints);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public Planning setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals selectGoals() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_goals);
  }

  public Planning setGoals(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals goals) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_goals, goals);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition selectInitialposition() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_initialposition);
  }

  public Planning setInitialposition(cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition initialposition) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_initialposition, initialposition);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.organisation.javamodel.IOrganisation selectOrganisation() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.organisation.javamodel.IOrganisation.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_organisation);
  }

  public Planning setOrganisation(cleon.initialization.projectmanagement.spec.planning.organisation.javamodel.IOrganisation organisation) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_organisation, organisation);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Planning setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.resource.javamodel.IResourceManagement selectResourceManagement() {
    return _getSingle(cleon.support.projectmanagement.spec.resource.javamodel.IResourceManagement.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_resourceManagement);
  }

  public Planning setResourceManagement(cleon.support.projectmanagement.spec.resource.javamodel.IResourceManagement resourceManagement) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_resourceManagement, resourceManagement);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.schedule.javamodel.ISchedule selectSchedule() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.schedule.javamodel.ISchedule.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_schedule);
  }

  public Planning setSchedule(cleon.initialization.projectmanagement.spec.planning.schedule.javamodel.ISchedule schedule) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_schedule, schedule);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope selectScope() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_scope);
  }

  public Planning setScope(cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope scope) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_scope, scope);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Planning setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Planning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IConstraints.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_constraints, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_goals, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_initialposition, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.organisation.javamodel.IOrganisation.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_organisation, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.resource.javamodel.IResourceManagement.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_resourceManagement, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.schedule.javamodel.ISchedule.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_schedule, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_scope, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning selectToMeInitialposition(cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_initialposition, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning selectToMeGoals(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_goals, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning selectToMeConstraints(cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IConstraints object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_constraints, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning selectToMeScope(cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_scope, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning selectToMeSchedule(cleon.initialization.projectmanagement.spec.planning.schedule.javamodel.ISchedule object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_schedule, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning selectToMeOrganisation(cleon.initialization.projectmanagement.spec.planning.organisation.javamodel.IOrganisation object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_organisation, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning> selectToMeResourceManagement(cleon.support.projectmanagement.spec.resource.javamodel.IResourceManagement object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.planning.PlanningPackage.Planning_resourceManagement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17,7WuUw4raHrT6PWj1CaH4x7Z+JcI=] */
