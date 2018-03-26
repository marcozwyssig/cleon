package cleon.conception.architecture.spec.eamod.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IssueGroup extends DynamicResource implements IIssueGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssueGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssueGroup>() {
    
    @Override
    public IIssueGroup create() {
      return new IssueGroup();
    }
    
    @Override
    public IIssueGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IssueGroup(resourceRepository, resource);
    }
  
  };

  public IssueGroup() {
    super(IIssueGroup.TYPE_ID);
  }
  
  public IssueGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIssueGroup.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public IssueGroup setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue> selectIssues() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.IssueGroup_issues);
  }

  public IssueGroup setIssues(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue> issues) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.IssueGroup_issues, issues);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IssueGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.IssueGroup_issues, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueGroup selectToMeIssues(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueGroup.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.IssueGroup_issues, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e33649ff-ce66-11e5-8041-092cb74c72f2,S1F7C7Jnc/6iQd4CghytRMxuR1k=] */
