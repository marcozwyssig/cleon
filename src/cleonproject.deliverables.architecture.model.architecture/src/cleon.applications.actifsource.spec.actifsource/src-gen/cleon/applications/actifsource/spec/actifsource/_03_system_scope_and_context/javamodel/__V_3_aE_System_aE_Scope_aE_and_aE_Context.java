package cleon.applications.actifsource.spec.actifsource._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_3_aE_System_aE_Scope_aE_and_aE_Context extends DynamicResource implements I__V_3_aE_System_aE_Scope_aE_and_aE_Context {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_3_aE_System_aE_Scope_aE_and_aE_Context> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_3_aE_System_aE_Scope_aE_and_aE_Context>() {
    
    @Override
    public I__V_3_aE_System_aE_Scope_aE_and_aE_Context create() {
      return new __V_3_aE_System_aE_Scope_aE_and_aE_Context();
    }
    
    @Override
    public I__V_3_aE_System_aE_Scope_aE_and_aE_Context create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_3_aE_System_aE_Scope_aE_and_aE_Context(resourceRepository, resource);
    }
  
  };

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context() {
    super(I__V_3_aE_System_aE_Scope_aE_and_aE_Context.TYPE_ID);
  }
  
  public __V_3_aE_System_aE_Scope_aE_and_aE_Context(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_3_aE_System_aE_Scope_aE_and_aE_Context.TYPE_ID);
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

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext selectDomainContext() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setDomainContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext domainContext) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, domainContext);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem> selectNeighboringSystems() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_neighboringSystems);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setNeighboringSystems(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem> neighboringSystems) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_neighboringSystems, neighboringSystems);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42.javamodel.ISoftwareSystem selectSoftwareSystem() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42.javamodel.ISoftwareSystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_aE_Software_softwareSystem);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setSoftwareSystem(cleon.architecturemethods.arc42.spec.arc42.javamodel.ISoftwareSystem softwareSystem) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_aE_Software_softwareSystem, softwareSystem);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem selectSystem() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_system);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setSystem(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem system) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_system, system);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext selectTechnicalContext() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setTechnicalContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext technicalContext) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, technicalContext);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo selectZoo() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo.class, cleon.applications.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_zoo);
  }

  public __V_3_aE_System_aE_Scope_aE_and_aE_Context setZoo(cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo zoo) {
    _setSingle(cleon.applications.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_zoo, zoo);
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
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_neighboringSystems, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42.javamodel.ISoftwareSystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_aE_Software_softwareSystem, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_system, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo.class, cleon.applications.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_zoo, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.spec.actifsource._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context selectToMeZoo(cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.applications.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_zoo, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7a904739-3a02-11e6-a354-253097f89a49,IObBqcv08TRwCy+bvKzTyvT0Jys=] */
