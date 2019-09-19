package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExternalInterfaces extends DynamicResource implements IExternalInterfaces {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExternalInterfaces> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExternalInterfaces>() {
    
    @Override
    public IExternalInterfaces create() {
      return new ExternalInterfaces();
    }
    
    @Override
    public IExternalInterfaces create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExternalInterfaces(resourceRepository, resource);
    }
  
  };

  public ExternalInterfaces() {
    super(IExternalInterfaces.TYPE_ID);
  }
  
  public ExternalInterfaces(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExternalInterfaces.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public ExternalInterfaces setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ExternalInterfaces setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterface> selectExternalInterfaces() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterface.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.External_interfacesPackage.ExternalInterfaces_externalInterfaces);
  }

  public ExternalInterfaces setExternalInterfaces(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterface> externalInterfaces) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.External_interfacesPackage.ExternalInterfaces_externalInterfaces, externalInterfaces);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ExternalInterfaces setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExternalInterfaces setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterface.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.External_interfacesPackage.ExternalInterfaces_externalInterfaces, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterfaces selectToMeExternalInterfaces(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterface object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterfaces.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.external_interfaces.External_interfacesPackage.ExternalInterfaces_externalInterfaces, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,65e40b4b-27d5-11e6-b263-9db62e053e59,b8Rs3gKDpJ3XzK6XwcdUJLmRpWg=] */
