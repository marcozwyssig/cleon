package cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UserStory extends DynamicResource implements IUserStory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserStory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserStory>() {
    
    @Override
    public IUserStory create() {
      return new UserStory();
    }
    
    @Override
    public IUserStory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UserStory(resourceRepository, resource);
    }
  
  };

  public UserStory() {
    super(IUserStory.TYPE_ID);
  }
  
  public UserStory(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUserStory.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference, reference);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis);
  }

  public UserStory setAnalysis(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText analysis) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectDescription() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_description);
  }

  public UserStory setDescription(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText description) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_description, description);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner);
  }

  public UserStory setOwner(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson owner) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson selectRequestedBy() {
    return _getSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.Story_requestedBy);
  }

  public UserStory setRequestedBy(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson requestedBy) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.Story_requestedBy, requestedBy);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirement.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement);
  }

  public UserStory setRequirement(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirement requirement) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement, requirement);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint selectSprint() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_sprint);
  }

  public UserStory setSprint(cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint sprint) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_sprint, sprint);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public UserStory setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public UserStory setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_description, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.Story_requestedBy, visitor);
    _acceptSingle(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirement.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_sprint, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory> selectToMeRequirement(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,693cc9f9-ff9c-11e4-ac0a-959b440f987f,sKWpiNSnX6Ax1SqhtDE1pIS5+Ro=] */
