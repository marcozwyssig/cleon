package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConceptForSystemConfigurationComponent extends DynamicResource implements IConceptForSystemConfigurationComponent {

  // abstract implementation, only used for static method calls
  private ConceptForSystemConfigurationComponent() {
    super(IConceptForSystemConfigurationComponent.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystemConfigurationComponent selectToMeSystemConfigurationConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConfigurationComponentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystemConfigurationComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1ab874a8-0b86-11e9-a136-69d076e48ed1,r/P0XtKUKMe3fWSf29VTm7aWkT4=] */
