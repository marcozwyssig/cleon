package cleon.analysis.spec.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Best extends DynamicResource implements IBest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBest>() {
    
    @Override
    public IBest create() {
      return new Best();
    }
    
    @Override
    public IBest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Best(resourceRepository, resource);
    }
  
  };

  public Best() {
    super(IBest.TYPE_ID);
  }
  
  public Best(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBest.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation selectBest() {
    return _getSingle(cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Best_best);
  }

  public Best setBest(cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation best) {
    _setSingle(cleon.analysis.spec.evaluation.EvaluationPackage.Best_best, best);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Best setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Best_best, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.analysis.spec.evaluation.javamodel.IBest> selectToMeBest(cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation object) {
    return _getToMeList(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IBest.class, cleon.analysis.spec.evaluation.EvaluationPackage.Best_best, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d930ffa1-3d16-11e5-871f-6beac6a7c24b,BZbdQpQysQ1NRJN/CPvymCW7rsQ=] */
