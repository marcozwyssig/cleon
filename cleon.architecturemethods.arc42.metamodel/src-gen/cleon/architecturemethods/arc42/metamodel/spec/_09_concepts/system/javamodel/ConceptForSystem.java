package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConceptForSystem extends DynamicResource implements IConceptForSystem {

  // abstract implementation, only used for static method calls
  private ConceptForSystem() {
    super(IConceptForSystem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystem selectToMeSystemConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystem.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.ConceptForSystem_systemConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,26771b9a-c93d-11eb-adc4-d18d1353eb6e,xyGT0Bn1Xukwjv8Fog8ufoBeaRA=] */
