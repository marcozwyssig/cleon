package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConceptForSystem extends DynamicResource implements IConceptForSystem {

  // abstract implementation, only used for static method calls
  private ConceptForSystem() {
    super(IConceptForSystem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.IConceptForSystem selectToMeSystemConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.IConceptForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystem_systemConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,26771b9a-c93d-11eb-adc4-d18d1353eb6e,JZdGUf1lYLuuuyHo2L5soc8LGq4=] */
