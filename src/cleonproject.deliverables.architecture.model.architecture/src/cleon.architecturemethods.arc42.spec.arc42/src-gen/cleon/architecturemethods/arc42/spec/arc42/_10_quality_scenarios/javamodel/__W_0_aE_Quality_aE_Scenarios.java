package cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __W_0_aE_Quality_aE_Scenarios extends DynamicResource implements I__W_0_aE_Quality_aE_Scenarios {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__W_0_aE_Quality_aE_Scenarios> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__W_0_aE_Quality_aE_Scenarios>() {
    
    @Override
    public I__W_0_aE_Quality_aE_Scenarios create() {
      return new __W_0_aE_Quality_aE_Scenarios();
    }
    
    @Override
    public I__W_0_aE_Quality_aE_Scenarios create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __W_0_aE_Quality_aE_Scenarios(resourceRepository, resource);
    }
  
  };

  public __W_0_aE_Quality_aE_Scenarios() {
    super(I__W_0_aE_Quality_aE_Scenarios.TYPE_ID);
  }
  
  public __W_0_aE_Quality_aE_Scenarios(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__W_0_aE_Quality_aE_Scenarios.TYPE_ID);
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

  public __W_0_aE_Quality_aE_Scenarios setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __W_0_aE_Quality_aE_Scenarios setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,000d4eb0-d0b5-11e8-b005-f7630e4c29c0,iL3Vv+XGeC5fz2ZHxzwENQ9vrTw=] */
