package cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IntroductionAndGoals extends DynamicResource implements IIntroductionAndGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntroductionAndGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntroductionAndGoals>() {
    
    @Override
    public IIntroductionAndGoals create() {
      return new IntroductionAndGoals();
    }
    
    @Override
    public IIntroductionAndGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IntroductionAndGoals(resourceRepository, resource);
    }
  
  };

  public IntroductionAndGoals() {
    super(IIntroductionAndGoals.TYPE_ID);
  }
  
  public IntroductionAndGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIntroductionAndGoals.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public IntroductionAndGoals setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public IntroductionAndGoals setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public IntroductionAndGoals setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals selectQualityGoals() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals);
  }

  public IntroductionAndGoals setQualityGoals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals qualityGoals) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals, qualityGoals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements selectRequirementsOverview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirementsOverview);
  }

  public IntroductionAndGoals setRequirementsOverview(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements requirementsOverview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirementsOverview, requirementsOverview);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IntroductionAndGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirementsOverview, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals selectToMeRequirementsOverview(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirementsOverview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals selectToMeQualityGoals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1708484-11fc-11e5-848b-017a3a98ae34,T1FcK9gFuKu06eap4mShBZ7id+M=] */
