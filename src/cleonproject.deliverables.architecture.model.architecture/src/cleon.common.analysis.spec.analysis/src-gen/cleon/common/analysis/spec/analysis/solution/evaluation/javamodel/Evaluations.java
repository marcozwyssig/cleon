package cleon.common.analysis.spec.analysis.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Evaluations extends DynamicResource implements IEvaluations {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluations> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluations>() {
    
    @Override
    public IEvaluations create() {
      return new Evaluations();
    }
    
    @Override
    public IEvaluations create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Evaluations(resourceRepository, resource);
    }
  
  };

  public Evaluations() {
    super(IEvaluations.TYPE_ID);
  }
  
  public Evaluations(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEvaluations.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public Evaluations setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation> selectEvaluations() {
    return _getMap(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation.class, cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_evaluations);
  }

  public Evaluations setEvaluations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation> evaluations) {
    _setMap(cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_evaluations, evaluations);
    return this;
  }
    
  @Override
  public cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IResult selectResult() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IResult.class, cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_result);
  }

  public Evaluations setResult(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IResult result) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_result, result);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Evaluations setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptMap(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation.class, cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_evaluations, visitor);
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IResult.class, cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_result, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations selectToMeEvaluations(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations.class, cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_evaluations, object.getResource());
  }
  
  public static cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations selectToMeResult(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IResult object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations.class, cleon.common.analysis.spec.analysis.solution.evaluation.EvaluationPackage.Evaluations_result, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dcdfa04f-3c19-11e5-9962-cf3035adb922,t9Me3RXsyR248KM+2DzJtSusT5c=] */
