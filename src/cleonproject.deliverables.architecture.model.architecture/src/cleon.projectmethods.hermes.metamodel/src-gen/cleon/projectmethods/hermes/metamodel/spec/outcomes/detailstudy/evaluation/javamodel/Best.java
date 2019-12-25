package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel;

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
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation selectBest() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Best_best);
  }

  public Best setBest(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation best) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Best_best, best);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Best setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
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
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Best_best, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IBest> selectToMeBest(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IBest.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Best_best, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d930ffa1-3d16-11e5-871f-6beac6a7c24b,sGzWKNQSOpd4+lj8HBg6az6v6w4=] */
