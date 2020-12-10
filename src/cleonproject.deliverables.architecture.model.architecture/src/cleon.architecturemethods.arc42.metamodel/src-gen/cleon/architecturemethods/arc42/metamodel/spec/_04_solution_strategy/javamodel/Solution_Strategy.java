package cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Solution_Strategy extends DynamicResource implements ISolution_Strategy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolution_Strategy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolution_Strategy>() {
    
    @Override
    public ISolution_Strategy create() {
      return new Solution_Strategy();
    }
    
    @Override
    public ISolution_Strategy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Solution_Strategy(resourceRepository, resource);
    }
  
  };

  public Solution_Strategy() {
    super(ISolution_Strategy.TYPE_ID);
  }
  
  public Solution_Strategy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolution_Strategy.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters);
  }

  public Solution_Strategy setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Solution_Strategy setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs);
  }

  public Solution_Strategy setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Solution_Strategy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,650ddeb2-e985-11e8-af5c-a5aa9dc47205,VwhHW5bHt25UzodeBbgvzkNy19o=] */
