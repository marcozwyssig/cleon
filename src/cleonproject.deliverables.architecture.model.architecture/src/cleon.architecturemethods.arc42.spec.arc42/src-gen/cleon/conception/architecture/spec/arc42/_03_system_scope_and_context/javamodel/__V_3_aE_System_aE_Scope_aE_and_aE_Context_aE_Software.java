package cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software extends DynamicResource implements I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software>() {
    
    @Override
    public I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software create() {
      return new __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software();
    }
    
    @Override
    public I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software(resourceRepository, resource);
    }
  
  };

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software() {
    super(I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software.TYPE_ID);
  }
  
  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software.TYPE_ID);
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

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.domain.javamodel.I__V_3_aE_01_aE_DomainContext selectDomainContext() {
    return _getSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.domain.javamodel.I__V_3_aE_01_aE_DomainContext.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_domainContext);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software setDomainContext(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.domain.javamodel.I__V_3_aE_01_aE_DomainContext domainContext) {
    _setSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_domainContext, domainContext);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem> selectNeighboringSystems() {
    return _getList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_neighboringSystems);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software setNeighboringSystems(java.util.List<? extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem> neighboringSystems) {
    _setList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_neighboringSystems, neighboringSystems);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42.javamodel.ISoftwareSystem selectSoftwareSystem() {
    return _getSingle(cleon.conception.architecture.spec.arc42.javamodel.ISoftwareSystem.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software_softwareSystem);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software setSoftwareSystem(cleon.conception.architecture.spec.arc42.javamodel.ISoftwareSystem softwareSystem) {
    _setSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software_softwareSystem, softwareSystem);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem selectSystem() {
    return _getSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_system);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software setSystem(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem system) {
    _setSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_system, system);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext selectTechnicalContext() {
    return _getSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_technicalContext);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software setTechnicalContext(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext technicalContext) {
    _setSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_technicalContext, technicalContext);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.domain.javamodel.I__V_3_aE_01_aE_DomainContext.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_domainContext, visitor);
    _acceptList(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_neighboringSystems, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42.javamodel.ISoftwareSystem.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software_softwareSystem, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_system, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_technicalContext, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software selectToMeSoftwareSystem(cleon.conception.architecture.spec.arc42.javamodel.ISoftwareSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_aE_Software_softwareSystem, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7387e4e0-285f-11e8-9af4-b7d7a3bbddc1,u2rnSSNSr4MOygSWA+sdHRwTceY=] */