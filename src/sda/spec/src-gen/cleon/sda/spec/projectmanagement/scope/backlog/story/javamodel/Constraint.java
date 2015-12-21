package cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Constraint extends DynamicResource implements IConstraint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraint>() {
    
    @Override
    public IConstraint create() {
      return new Constraint();
    }
    
    @Override
    public IConstraint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Constraint(resourceRepository, resource);
    }
  
  };

  public Constraint() {
    super(IConstraint.TYPE_ID);
  }
  
  public Constraint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConstraint.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

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

  public Constraint setAnalysis(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText analysis) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectDescription() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_description);
  }

  public Constraint setDescription(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText description) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_description, description);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner);
  }

  public Constraint setOwner(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson owner) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson selectRequestedBy() {
    return _getSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.Story_requestedBy);
  }

  public Constraint setRequestedBy(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson requestedBy) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.Story_requestedBy, requestedBy);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint selectSprint() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_sprint);
  }

  public Constraint setSprint(cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint sprint) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_sprint, sprint);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Constraint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_description, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.Story_requestedBy, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_sprint, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9e271ef-3777-11e5-95d9-2b04d7ab02d9,WfxhMLEdQvFHLfKjIySWRuoFKYU=] */
