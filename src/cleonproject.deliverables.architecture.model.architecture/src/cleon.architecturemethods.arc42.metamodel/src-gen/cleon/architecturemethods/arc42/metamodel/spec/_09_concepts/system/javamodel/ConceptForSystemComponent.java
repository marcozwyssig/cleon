package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConceptForSystemComponent extends DynamicResource implements IConceptForSystemComponent {

  // abstract implementation, only used for static method calls
  private ConceptForSystemComponent() {
    super(IConceptForSystemComponent.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystemComponent selectToMeSystemConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemComponentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.ConceptForSystemComponent_systemConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2d6d075b-0b80-11e9-a136-69d076e48ed1,e2lYsHC9uV4DEtvM9dDNjZigOQU=] */
