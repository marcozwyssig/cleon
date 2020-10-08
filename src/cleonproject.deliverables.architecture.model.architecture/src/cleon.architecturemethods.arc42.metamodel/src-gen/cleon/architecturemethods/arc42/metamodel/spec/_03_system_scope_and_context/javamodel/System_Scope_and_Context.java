package cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System_Scope_and_Context extends DynamicResource implements ISystem_Scope_and_Context {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem_Scope_and_Context> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem_Scope_and_Context>() {
    
    @Override
    public ISystem_Scope_and_Context create() {
      return new System_Scope_and_Context();
    }
    
    @Override
    public ISystem_Scope_and_Context create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System_Scope_and_Context(resourceRepository, resource);
    }
  
  };

  public System_Scope_and_Context() {
    super(ISystem_Scope_and_Context.TYPE_ID);
  }
  
  public System_Scope_and_Context(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem_Scope_and_Context.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public System_Scope_and_Context setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public System_Scope_and_Context setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext selectDomainContext() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext);
  }

  public System_Scope_and_Context setDomainContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext domainContext) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, domainContext);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public System_Scope_and_Context setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext selectTechnicalContext() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext);
  }

  public System_Scope_and_Context setTechnicalContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext technicalContext) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, technicalContext);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System_Scope_and_Context setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context selectToMeDomainContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context selectToMeTechnicalContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04cf294a-ffca-11e5-bd7b-8b0acf27d441,T00q4Uudj0G+YbAFT2vw8T+fH7Q=] */
