package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSolutionVariant extends DynamicResource implements IAbstractSolutionVariant {

  // abstract implementation, only used for static method calls
  private AbstractSolutionVariant() {
    super(IAbstractSolutionVariant.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,408a39e6-d8b7-11ef-a46f-a1c9ec5f966b,zS1PcpjEr8NgyPtoNJpJSZRqO34=] */
