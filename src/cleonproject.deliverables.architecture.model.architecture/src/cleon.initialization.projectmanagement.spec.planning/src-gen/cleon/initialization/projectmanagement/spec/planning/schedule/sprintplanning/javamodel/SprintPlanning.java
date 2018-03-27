package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintPlanning extends DynamicResource implements ISprintPlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlanning>() {
    
    @Override
    public ISprintPlanning create() {
      return new SprintPlanning();
    }
    
    @Override
    public ISprintPlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintPlanning(resourceRepository, resource);
    }
  
  };

  public SprintPlanning() {
    super(ISprintPlanning.TYPE_ID);
  }
  
  public SprintPlanning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintPlanning.TYPE_ID);
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
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public SprintPlanning setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public SprintPlanning setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint selectSprint() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprint);
  }

  public SprintPlanning setSprint(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint sprint) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprint, sprint);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog selectSprintBacklog() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog);
  }

  public SprintPlanning setSprintBacklog(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog, sprintBacklog);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity selectSprintCapacity() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity);
  }

  public SprintPlanning setSprintCapacity(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity, sprintCapacity);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintGoals selectSprintGoals() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintGoals.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals);
  }

  public SprintPlanning setSprintGoals(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintGoals sprintGoals) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals, sprintGoals);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public SprintPlanning setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SprintPlanning setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam selectTeam() {
    return _getSingle(cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_team);
  }

  public SprintPlanning setTeam(cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam team) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_team, team);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintPlanning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprint, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintGoals.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_team, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning> selectToMeSprint(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprint, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning selectToMeSprintGoals(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning selectToMeSprintCapacity(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning selectToMeSprintBacklog(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning> selectToMeTeam(cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlanning_team, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db3c786a-c009-11e5-a165-d34765931e10,m2RpmpICDOGSOUSRyDF/4NoHKnk=] */
