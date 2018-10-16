package cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __W_3_aE_Requirements_aE_Coverage extends DynamicResource implements I__W_3_aE_Requirements_aE_Coverage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__W_3_aE_Requirements_aE_Coverage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__W_3_aE_Requirements_aE_Coverage>() {
    
    @Override
    public I__W_3_aE_Requirements_aE_Coverage create() {
      return new __W_3_aE_Requirements_aE_Coverage();
    }
    
    @Override
    public I__W_3_aE_Requirements_aE_Coverage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __W_3_aE_Requirements_aE_Coverage(resourceRepository, resource);
    }
  
  };

  public __W_3_aE_Requirements_aE_Coverage() {
    super(I__W_3_aE_Requirements_aE_Coverage.TYPE_ID);
  }
  
  public __W_3_aE_Requirements_aE_Coverage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__W_3_aE_Requirements_aE_Coverage.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public __W_3_aE_Requirements_aE_Coverage setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __W_3_aE_Requirements_aE_Coverage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,875d278c-d183-11e8-b18f-df1540bb7a5c,9buso/qcDyhrxQoO3slZhFGZ91Q=] */
