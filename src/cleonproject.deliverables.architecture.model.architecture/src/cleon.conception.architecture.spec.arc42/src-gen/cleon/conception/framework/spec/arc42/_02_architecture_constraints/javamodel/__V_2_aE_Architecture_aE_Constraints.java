package cleon.conception.framework.spec.arc42._02_architecture_constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_2_aE_Architecture_aE_Constraints extends DynamicResource implements I__V_2_aE_Architecture_aE_Constraints {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_2_aE_Architecture_aE_Constraints> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_2_aE_Architecture_aE_Constraints>() {
    
    @Override
    public I__V_2_aE_Architecture_aE_Constraints create() {
      return new __V_2_aE_Architecture_aE_Constraints();
    }
    
    @Override
    public I__V_2_aE_Architecture_aE_Constraints create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_2_aE_Architecture_aE_Constraints(resourceRepository, resource);
    }
  
  };

  public __V_2_aE_Architecture_aE_Constraints() {
    super(I__V_2_aE_Architecture_aE_Constraints.TYPE_ID);
  }
  
  public __V_2_aE_Architecture_aE_Constraints(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_2_aE_Architecture_aE_Constraints.TYPE_ID);
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

  public __V_2_aE_Architecture_aE_Constraints setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_2_aE_Architecture_aE_Constraints setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b06163b8-ffc9-11e5-bd7b-8b0acf27d441,rUcxH7J+5T79vKpJR0F6R3SluCE=] */
