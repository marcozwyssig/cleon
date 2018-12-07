package cleon.architecturemethods.itarc42.spec.itarc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System_Scope_and_Context_System extends DynamicResource implements ISystem_Scope_and_Context_System {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem_Scope_and_Context_System> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem_Scope_and_Context_System>() {
    
    @Override
    public ISystem_Scope_and_Context_System create() {
      return new System_Scope_and_Context_System();
    }
    
    @Override
    public ISystem_Scope_and_Context_System create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System_Scope_and_Context_System(resourceRepository, resource);
    }
  
  };

  public System_Scope_and_Context_System() {
    super(ISystem_Scope_and_Context_System.TYPE_ID);
  }
  
  public System_Scope_and_Context_System(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem_Scope_and_Context_System.TYPE_ID);
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

  public System_Scope_and_Context_System setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext selectDomainContext() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext);
  }

  public System_Scope_and_Context_System setDomainContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext domainContext) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, domainContext);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem> selectNeighboringSystems() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_neighboringSystems);
  }

  public System_Scope_and_Context_System setNeighboringSystems(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem> neighboringSystems) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_neighboringSystems, neighboringSystems);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystem selectPlattform() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystem.class, cleon.architecturemethods.itarc42.spec.itarc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_aE_System_plattform);
  }

  public System_Scope_and_Context_System setPlattform(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystem plattform) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_aE_System_plattform, plattform);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem selectSystem() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_system);
  }

  public System_Scope_and_Context_System setSystem(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem system) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_system, system);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext selectTechnicalContext() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext);
  }

  public System_Scope_and_Context_System setTechnicalContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext technicalContext) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, technicalContext);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System_Scope_and_Context_System setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_neighboringSystems, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystem.class, cleon.architecturemethods.itarc42.spec.itarc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_aE_System_plattform, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_system, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context_System selectToMePlattform(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context_System.class, cleon.architecturemethods.itarc42.spec.itarc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_aE_System_plattform, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,979ed992-99aa-11e8-8f58-219af2c5d6d9,2Hk/3zc3cfDBlDtg3/zWopnHy98=] */
