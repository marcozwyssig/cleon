package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CrosscuttingConcepts extends DynamicResource implements ICrosscuttingConcepts {

  // abstract implementation, only used for static method calls
  private CrosscuttingConcepts() {
    super(ICrosscuttingConcepts.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.ICrosscuttingConcepts selectToMeConcepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.ICrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.CrosscuttingConcepts_concepts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,648f65bf-d0b4-11e8-b005-f7630e4c29c0,/76vnZVbzDDaFrTqE/zYQCsUbnI=] */
