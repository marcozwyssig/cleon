package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSolutionVariants extends DynamicResource implements IAbstractSolutionVariants {

  // abstract implementation, only used for static method calls
  private AbstractSolutionVariants() {
    super(IAbstractSolutionVariants.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.javamodel.IAbstractSolutionVariants selectToMeSolutionVariants(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.javamodel.IAbstractSolutionVariant object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.javamodel.IAbstractSolutionVariants.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.SolutionvariantsPackage.AbstractSolutionVariants_solutionVariants, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,438ffd0c-d357-11ef-a461-2ff990df4683,Vl4aPpEWPwR7tbLrsHaGKxVusa8=] */
