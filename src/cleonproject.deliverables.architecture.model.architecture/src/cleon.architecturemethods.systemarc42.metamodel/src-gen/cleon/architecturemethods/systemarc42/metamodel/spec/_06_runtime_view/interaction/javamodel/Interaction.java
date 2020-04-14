package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Interaction extends DynamicResource implements IInteraction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInteraction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInteraction>() {
    
    @Override
    public IInteraction create() {
      return new Interaction();
    }
    
    @Override
    public IInteraction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Interaction(resourceRepository, resource);
    }
  
  };

  public Interaction() {
    super(IInteraction.TYPE_ID);
  }
  
  public Interaction(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInteraction.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters);
  }

  public Interaction setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Interaction setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.InteractionPackage.Interaction_noChapters);
  }

  public Interaction setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.InteractionPackage.Interaction_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs);
  }

  public Interaction setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Interaction setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel.IInteraction selectToMeNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel.IInteraction.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.InteractionPackage.Interaction_noChapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dedda25b-7e58-11ea-9262-7b7e0e9cb204,fLRuART91reGgzC2YjpAjILDSdw=] */
