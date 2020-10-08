package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Assessments extends DynamicResource implements IAssessments {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssessments> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssessments>() {
    
    @Override
    public IAssessments create() {
      return new Assessments();
    }
    
    @Override
    public IAssessments create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Assessments(resourceRepository, resource);
    }
  
  };

  public Assessments() {
    super(IAssessments.TYPE_ID);
  }
  
  public Assessments(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAssessments.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment> selectAssessment() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_assessment);
  }

  public Assessments setAssessment(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment> assessment) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_assessment, assessment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Assessments setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectDay() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_day);
  }

  public Assessments setDay(cleon.common.calendar.metamodel.spec.javamodel.IDay day) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_day, day);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Assessments setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Assessments setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Assessments setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_assessment, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_day, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessments> selectToMeDay(cleon.common.calendar.metamodel.spec.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessments.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_day, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessments selectToMeAssessment(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessments.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessments_assessment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,24a6f9b1-324a-11e6-ab4d-73a9260c8088,bVs7pJjWsbV3J4LrWqglO77M7oU=] */
