package cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Issue extends DynamicResource implements IIssue {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssue> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssue>() {
    
    @Override
    public IIssue create() {
      return new Issue();
    }
    
    @Override
    public IIssue create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Issue(resourceRepository, resource);
    }
  
  };

  public Issue() {
    super(IIssue.TYPE_ID);
  }
  
  public Issue(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIssue.TYPE_ID);
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
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.Notes_notes, notes);
  }

  @Override
  public java.lang.String selectResolution() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_resolution);
  }
    
  public void setResolution(java.lang.String resolution) {
     _setSingleAttribute(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_resolution, resolution);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public Issue setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.ICategory> selectCategory() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.ICategory.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_category);
  }

  public Issue setCategory(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.ICategory> category) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_category, category);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcerns() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_concerns);
  }

  public Issue setConcerns(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> concerns) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_concerns, concerns);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource);
  }

  public Issue setOriginatesFromSource(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Issue setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Issue setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.Notes_notes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_resolution, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.ICategory.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_category, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_concerns, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue> selectToMeConcerns(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_concerns, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue> selectToMeCategory(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.ICategory object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.Issue_category, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d0da468c-bdee-11e5-965a-07bc81ea9ca9,+Ke0+uJ67At1rOz9TR9pGmBgTCA=] */
