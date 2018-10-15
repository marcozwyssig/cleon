package cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __W_2_aE_ProductView extends DynamicResource implements I__W_2_aE_ProductView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__W_2_aE_ProductView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__W_2_aE_ProductView>() {
    
    @Override
    public I__W_2_aE_ProductView create() {
      return new __W_2_aE_ProductView();
    }
    
    @Override
    public I__W_2_aE_ProductView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __W_2_aE_ProductView(resourceRepository, resource);
    }
  
  };

  public __W_2_aE_ProductView() {
    super(I__W_2_aE_ProductView.TYPE_ID);
  }
  
  public __W_2_aE_ProductView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__W_2_aE_ProductView.TYPE_ID);
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

  public __W_2_aE_ProductView setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel.IManufactors> selectManufactors() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel.IManufactors.class, cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView._12_ProductViewPackage.__W_2_aE_ProductView_manufactors);
  }

  public __W_2_aE_ProductView setManufactors(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel.IManufactors> manufactors) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView._12_ProductViewPackage.__W_2_aE_ProductView_manufactors, manufactors);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __W_2_aE_ProductView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel.IManufactors.class, cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView._12_ProductViewPackage.__W_2_aE_ProductView_manufactors, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel.I__W_2_aE_ProductView selectToMeManufactors(cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel.IManufactors object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView.javamodel.I__W_2_aE_ProductView.class, cleon.architecturemethods.itarc42.spec.itarc42._12_ProductView._12_ProductViewPackage.__W_2_aE_ProductView_manufactors, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a7023af1-d0b1-11e8-b005-f7630e4c29c0,Xk9y+gfNx8lZ7oJwxt1j0rBmJzw=] */
