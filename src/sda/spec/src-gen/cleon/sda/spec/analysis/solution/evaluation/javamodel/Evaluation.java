package cleon.sda.spec.analysis.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Evaluation extends DynamicResource implements IEvaluation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluation>() {
    
    @Override
    public IEvaluation create() {
      return new Evaluation();
    }
    
    @Override
    public IEvaluation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Evaluation(resourceRepository, resource);
    }
  
  };

  public Evaluation() {
    super(IEvaluation.TYPE_ID);
  }
  
  public Evaluation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEvaluation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectSimpleDescription() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_simpleDescription);
  }
    
  public void setSimpleDescription(java.util.List<java.lang.String> simpleDescription) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_simpleDescription, simpleDescription);
  }

  // relations
  
  @Override
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectAssessment() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_assessment);
  }

  public Evaluation setAssessment(cleon.doc.spec.paragraph.javamodel.ITextParagraph assessment) {
    _setSingle(cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_assessment, assessment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Evaluation setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectColumnOwns() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns);
  }

  public Evaluation setColumnOwns(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> columnOwns) {
    _setList(cleon.doc.spec.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, columnOwns);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal selectGoal() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_goal);
  }

  public Evaluation setGoal(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal goal) {
    _setSingle(cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_goal, goal);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Evaluation setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Evaluation setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Evaluation setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.evaluation.javamodel.IScore selectScore() {
    return _getSingle(cleon.sda.spec.analysis.solution.evaluation.javamodel.IScore.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_score);
  }

  public Evaluation setScore(cleon.sda.spec.analysis.solution.evaluation.javamodel.IScore score) {
    _setSingle(cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_score, score);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Evaluation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Evaluation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_simpleDescription, visitor);
    // relations
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_assessment, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_goal, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.evaluation.javamodel.IScore.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_score, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation selectToMeAssessment(cleon.doc.spec.paragraph.javamodel.ITextParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_assessment, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation> selectToMeGoal(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_goal, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation> selectToMeScore(cleon.sda.spec.analysis.solution.evaluation.javamodel.IScore object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Evaluation_score, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,I1yQxCb451NVN+lS9AqETnK+dgQ=] */
