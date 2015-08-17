package cleon.analysis.spec.evaluation.javamodel;

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

  // relations
  
  @Override
  public cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph selectAssessment() {
    return _getSingle(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_assessment);
  }

  public Evaluation setAssessment(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph assessment) {
    _setSingle(cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_assessment, assessment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public Evaluation setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectColumnOwns() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns);
  }

  public Evaluation setColumnOwns(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> columnOwns) {
    _setList(cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, columnOwns);
    return this;
  }
    
  @Override
  public cleon.analysis.spec.drivers.javamodel.IGoal selectGoal() {
    return _getSingle(cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal);
  }

  public Evaluation setGoal(cleon.analysis.spec.drivers.javamodel.IGoal goal) {
    _setSingle(cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal, goal);
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
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public Evaluation setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.analysis.spec.evaluation.javamodel.IScore selectScore() {
    return _getSingle(cleon.analysis.spec.evaluation.javamodel.IScore.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_score);
  }

  public Evaluation setScore(cleon.analysis.spec.evaluation.javamodel.IScore score) {
    _setSingle(cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_score, score);
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
    // relations
    _acceptSingle(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_assessment, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, visitor);
    _acceptSingle(cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(cleon.analysis.spec.evaluation.javamodel.IScore.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_score, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.analysis.spec.evaluation.javamodel.IEvaluation selectToMeAssessment(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_assessment, object.getResource());
  }
  
  public static java.util.List<cleon.analysis.spec.evaluation.javamodel.IEvaluation> selectToMeGoal(cleon.analysis.spec.drivers.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal, object.getResource());
  }
  
  public static java.util.List<cleon.analysis.spec.evaluation.javamodel.IEvaluation> selectToMeScore(cleon.analysis.spec.evaluation.javamodel.IScore object) {
    return _getToMeList(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_score, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,UmJmN2Ip8aHUz47WrqwN9zTL7nA=] */
