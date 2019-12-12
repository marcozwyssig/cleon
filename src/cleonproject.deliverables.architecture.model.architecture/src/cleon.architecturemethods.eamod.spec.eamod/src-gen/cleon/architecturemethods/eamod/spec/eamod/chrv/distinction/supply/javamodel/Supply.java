package cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Supply extends DynamicResource implements ISupply {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupply> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupply>() {
    
    @Override
    public ISupply create() {
      return new Supply();
    }
    
    @Override
    public ISupply create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Supply(resourceRepository, resource);
    }
  
  };

  public Supply() {
    super(ISupply.TYPE_ID);
  }
  
  public Supply(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISupply.TYPE_ID);
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
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
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
  public java.lang.String selectRejectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Destinction_rejectReason);
  }
    
  public void setRejectReason(java.lang.String rejectReason) {
     _setSingleAttribute(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Destinction_rejectReason, rejectReason);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public Supply setAuthors(java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue> selectIssues() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.IssueAware_issues);
  }

  public Supply setIssues(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue> issues) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.IssueAware_issues, issues);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource);
  }

  public Supply setOriginatesFromSource(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Supply setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.Notes_notes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Destinction_rejectReason, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.architecturemethods.eamod.spec.eamod.chrv.issues.IssuesPackage.IssueAware_issues, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9d823f2f-0c7e-11e6-86c5-87a8b520dd59,yiEkmPKfq30pjwn5PcQLFma361Q=] */
