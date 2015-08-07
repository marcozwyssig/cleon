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

  // attributes
  
  @Override
  public java.lang.String selectAssessment() {
    return _getSingleAttribute(java.lang.String.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_assessment);
  }
    
  public void setAssessment(java.lang.String assessment) {
     _setSingleAttribute(cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_assessment, assessment);
  }

  @Override
  public java.util.List<java.lang.Void> selectColumns() {
    return _getListAttribute(java.lang.Void.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columns);
  }
    
  public void setColumns(java.util.List<java.lang.Void> columns) {
     _setListAttribute(cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columns, columns);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescription() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description);
  }
    
  public void setDescription(java.util.List<java.lang.String> description) {
     _setListAttribute(cleon.doc.spec.chapter.ChapterPackage.Description_description, description);
  }

  // relations
  
  @Override
  public cleon.analysis.spec.drivers.javamodel.IGoal selectGoal() {
    return _getSingle(cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal);
  }

  public Evaluation setGoal(cleon.analysis.spec.drivers.javamodel.IGoal goal) {
    _setSingle(cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal, goal);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_assessment, visitor);
    _acceptListAttribute(java.lang.Void.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columns, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description, visitor);
    // relations
    _acceptSingle(cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal, visitor);
    _acceptSingle(cleon.analysis.spec.evaluation.javamodel.IScore.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_score, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.analysis.spec.evaluation.javamodel.IEvaluation> selectToMeGoal(cleon.analysis.spec.drivers.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_goal, object.getResource());
  }
  
  public static java.util.List<cleon.analysis.spec.evaluation.javamodel.IEvaluation> selectToMeScore(cleon.analysis.spec.evaluation.javamodel.IScore object) {
    return _getToMeList(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluation_score, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,ymXFuokr6/xqR+DjZ8Op8J9ehLc=] */
