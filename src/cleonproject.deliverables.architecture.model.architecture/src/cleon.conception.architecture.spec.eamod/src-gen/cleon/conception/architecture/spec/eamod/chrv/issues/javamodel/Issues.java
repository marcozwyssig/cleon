package cleon.conception.architecture.spec.eamod.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Issues extends DynamicResource implements IIssues {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssues> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssues>() {
    
    @Override
    public IIssues create() {
      return new Issues();
    }
    
    @Override
    public IIssues create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Issues(resourceRepository, resource);
    }
  
  };

  public Issues() {
    super(IIssues.TYPE_ID);
  }
  
  public Issues(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIssues.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.ICategory> selectCategories() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.ICategory.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_categories);
  }

  public Issues setCategories(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.ICategory> categories) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_categories, categories);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Issues setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueGroup> selectIssueGroups() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueGroup.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_issueGroups);
  }

  public Issues setIssueGroups(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueGroup> issueGroups) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_issueGroups, issueGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Issues setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.ICategory.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_categories, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueGroup.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_issueGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues selectToMeIssueGroups(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_issueGroups, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues selectToMeCategories(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.ICategory object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.Issues_categories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9fb6a044-bdee-11e5-965a-07bc81ea9ca9,9VXRdwNoiEOZC81LcVJUtp1YMO0=] */
