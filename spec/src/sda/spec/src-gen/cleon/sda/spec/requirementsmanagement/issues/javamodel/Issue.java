package cleon.sda.spec.requirementsmanagement.issues.javamodel;

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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
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
    return _getListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, notes);
  }

  @Override
  public java.lang.String selectResolution() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_resolution);
  }
    
  public void setResolution(java.lang.String resolution) {
     _setSingleAttribute(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_resolution, resolution);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors() {
    return _getList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors);
  }

  public Issue setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory> selectCategory() {
    return _getList(cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_category);
  }

  public Issue setCategory(java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory> category) {
    _setList(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_category, category);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConcerns() {
    return _getList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_concerns);
  }

  public Issue setConcerns(java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> concerns) {
    _setList(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_concerns, concerns);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_originatesFromSource);
  }

  public Issue setOriginatesFromSource(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public cleon.sda.spec.javamodel.IWorkState selectState() {
    return _getSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_state);
  }

  public Issue setState(cleon.sda.spec.javamodel.IWorkState state) {
    _setSingle(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_state, state);
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
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_resolution, visitor);
    // relations
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_category, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_concerns, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_originatesFromSource, visitor);
    _acceptSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue> selectToMeConcerns(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_concerns, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue> selectToMeOriginatesFromSource(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_originatesFromSource, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue> selectToMeState(cleon.sda.spec.javamodel.IWorkState object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_state, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue> selectToMeCategory(cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issue_category, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d0da468c-bdee-11e5-965a-07bc81ea9ca9,/GMcLbE8vd2/YLlc3cxN2/errVE=] */
