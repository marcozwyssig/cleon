package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSolutionOption extends DynamicResource implements IAbstractSolutionOption {

  // abstract implementation, only used for static method calls
  private AbstractSolutionOption() {
    super(IAbstractSolutionOption.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,408a39e6-d8b7-11ef-a46f-a1c9ec5f966b,2W4x8aLWSLp+nTPKQmXjFg0+0ho=] */
