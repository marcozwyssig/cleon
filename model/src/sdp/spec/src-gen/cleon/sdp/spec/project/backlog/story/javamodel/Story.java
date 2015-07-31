package cleon.sdp.spec.project.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Story extends DynamicResource implements IStory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStory>() {
    
    @Override
    public IStory create() {
      return new Story();
    }
    
    @Override
    public IStory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Story(resourceRepository, resource);
    }
  
  };

  public Story() {
    super(IStory.TYPE_ID);
  }
  
  public Story(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStory.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_reference, reference);
  }

  // relations
  
  @Override
  public cleon.sdp.spec.project.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_analysis);
  }

  public Story setAnalysis(cleon.sdp.spec.project.backlog.javamodel.IText analysis) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.backlog.javamodel.IText selectDescription() {
    return _getSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_description);
  }

  public Story setDescription(cleon.sdp.spec.project.backlog.javamodel.IText description) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_description, description);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_owner);
  }

  public Story setOwner(cleon.sdp.spec.project.javamodel.IPerson owner) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.javamodel.IPerson selectRequestedBy() {
    return _getSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.story.StoryPackage.Story_requestedBy);
  }

  public Story setRequestedBy(cleon.sdp.spec.project.javamodel.IPerson requestedBy) {
    _setSingle(cleon.sdp.spec.project.backlog.story.StoryPackage.Story_requestedBy, requestedBy);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.release.javamodel.ISprint selectSprint() {
    return _getSingle(cleon.sdp.spec.project.release.javamodel.ISprint.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_sprint);
  }

  public Story setSprint(cleon.sdp.spec.project.release.javamodel.ISprint sprint) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_sprint, sprint);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Story setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_reference, visitor);
    // relations
    _acceptSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_analysis, visitor);
    _acceptSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_description, visitor);
    _acceptSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_owner, visitor);
    _acceptSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.story.StoryPackage.Story_requestedBy, visitor);
    _acceptSingle(cleon.sdp.spec.project.release.javamodel.ISprint.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_sprint, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sdp.spec.project.backlog.story.javamodel.IStory> selectToMeRequestedBy(cleon.sdp.spec.project.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.project.backlog.story.javamodel.IStory.class, cleon.sdp.spec.project.backlog.story.StoryPackage.Story_requestedBy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,461882c1-ff9c-11e4-ac0a-959b440f987f,qPi6K8QAkk81iSsJP77nQWgxdng=] */
