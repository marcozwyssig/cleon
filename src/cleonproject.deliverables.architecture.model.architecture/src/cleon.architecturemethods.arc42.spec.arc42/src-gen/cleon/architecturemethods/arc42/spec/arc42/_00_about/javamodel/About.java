package cleon.architecturemethods.arc42.spec.arc42._00_about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class About extends DynamicResource implements IAbout {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbout> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbout>() {
    
    @Override
    public IAbout create() {
      return new About();
    }
    
    @Override
    public IAbout create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new About(resourceRepository, resource);
    }
  
  };

  public About() {
    super(IAbout.TYPE_ID);
  }
  
  public About(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbout.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardDocumentElementComposite_documentElements);
  }

  public About setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.OnlyStandardDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public About setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardDocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d84d5863-e990-11e8-af5c-a5aa9dc47205,CfXFmxJg74ngsN+M77rq6vlMAlI=] */
