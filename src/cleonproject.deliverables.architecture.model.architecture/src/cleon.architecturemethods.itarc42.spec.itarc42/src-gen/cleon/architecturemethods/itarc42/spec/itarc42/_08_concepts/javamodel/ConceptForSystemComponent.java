package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConceptForSystemComponent extends DynamicResource implements IConceptForSystemComponent {

  // abstract implementation, only used for static method calls
  private ConceptForSystemComponent() {
    super(IConceptForSystemComponent.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.IConceptForSystemComponent selectToMeSystemComponentConcept(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemComponentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.IConceptForSystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts._08_conceptsPackage.ConceptForSystemComponent_systemComponentConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2d6d075b-0b80-11e9-a136-69d076e48ed1,mhjJ9fb8VT5SYQzZozln5W+Vso8=] */
