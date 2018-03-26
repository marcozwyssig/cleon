package cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_3_aE_02_aE_TechnicalContext extends DynamicResource implements I__V_3_aE_02_aE_TechnicalContext {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_3_aE_02_aE_TechnicalContext> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_3_aE_02_aE_TechnicalContext>() {
    
    @Override
    public I__V_3_aE_02_aE_TechnicalContext create() {
      return new __V_3_aE_02_aE_TechnicalContext();
    }
    
    @Override
    public I__V_3_aE_02_aE_TechnicalContext create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_3_aE_02_aE_TechnicalContext(resourceRepository, resource);
    }
  
  };

  public __V_3_aE_02_aE_TechnicalContext() {
    super(I__V_3_aE_02_aE_TechnicalContext.TYPE_ID);
  }
  
  public __V_3_aE_02_aE_TechnicalContext(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_3_aE_02_aE_TechnicalContext.TYPE_ID);
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

  public __V_3_aE_02_aE_TechnicalContext setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow> selectFlows() {
    return _getList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_flows);
  }

  public __V_3_aE_02_aE_TechnicalContext setFlows(java.util.List<? extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow> flows) {
    _setList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_flows, flows);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.IInterface> selectInterfaces() {
    return _getList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.IInterface.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_interfaces);
  }

  public __V_3_aE_02_aE_TechnicalContext setInterfaces(java.util.List<? extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.IInterface> interfaces) {
    _setList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_interfaces, interfaces);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_3_aE_02_aE_TechnicalContext setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_flows, visitor);
    _acceptList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.IInterface.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_interfaces, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext selectToMeInterfaces(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.IInterface object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_interfaces, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext selectToMeFlows(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.__V_3_aE_02_aE_TechnicalContext_flows, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2420a6f8-27cc-11e6-b263-9db62e053e59,Dh5erPXLU8BeM2WX+NSb+lkYnYs=] */
