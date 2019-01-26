package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Outcomes extends DynamicResource implements IOutcomes {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomes> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomes>() {
    
    @Override
    public IOutcomes create() {
      return new Outcomes();
    }
    
    @Override
    public IOutcomes create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Outcomes(resourceRepository, resource);
    }
  
  };

  public Outcomes() {
    super(IOutcomes.TYPE_ID);
  }
  
  public Outcomes(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutcomes.TYPE_ID);
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

  public Outcomes setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Outcomes setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IDocumentOutcome> selectDocumentOutcomes() {
    return _getMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IDocumentOutcome.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_documentOutcomes);
  }

  public Outcomes setDocumentOutcomes(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IDocumentOutcome> documentOutcomes) {
    _setMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_documentOutcomes, documentOutcomes);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IManagementOutcome> selectManagementOutcomes() {
    return _getMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IManagementOutcome.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_managementOutcomes);
  }

  public Outcomes setManagementOutcomes(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IManagementOutcome> managementOutcomes) {
    _setMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_managementOutcomes, managementOutcomes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Outcomes setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.ISystemOutcome> selectSystemOutcomes() {
    return _getMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.ISystemOutcome.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_systemOutcomes);
  }

  public Outcomes setSystemOutcomes(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.ISystemOutcome> systemOutcomes) {
    _setMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_systemOutcomes, systemOutcomes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Outcomes setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IDocumentOutcome.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_documentOutcomes, visitor);
    _acceptMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IManagementOutcome.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_managementOutcomes, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.ISystemOutcome.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_systemOutcomes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomes selectToMeSystemOutcomes(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.ISystemOutcome object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomes.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_systemOutcomes, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomes selectToMeDocumentOutcomes(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IDocumentOutcome object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomes.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_documentOutcomes, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomes selectToMeManagementOutcomes(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IManagementOutcome object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomes.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcomes_managementOutcomes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fdf40175-b53c-11e5-bc0c-f35b68c3609a,i0VPbGB5GEurqaye2yECy9nzEvs=] */
