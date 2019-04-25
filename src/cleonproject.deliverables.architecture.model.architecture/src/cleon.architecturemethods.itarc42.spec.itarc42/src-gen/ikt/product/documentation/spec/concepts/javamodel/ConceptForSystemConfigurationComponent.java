package ikt.product.documentation.spec.concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConceptForSystemConfigurationComponent extends DynamicResource implements IConceptForSystemConfigurationComponent {

  // abstract implementation, only used for static method calls
  private ConceptForSystemConfigurationComponent() {
    super(IConceptForSystemConfigurationComponent.TYPE_ID);
  }
  
  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.javamodel.IConceptForSystemConfigurationComponent selectToMeSystemConfigurationConcept(ikt.product.documentation.spec.concepts.javamodel.ISystemConfigurationComponentConcept object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.javamodel.IConceptForSystemConfigurationComponent.class, ikt.product.documentation.spec.concepts.ConceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1ab874a8-0b86-11e9-a136-69d076e48ed1,L5I8qPWGUYuXnlsfm63gPO2CNBI=] */
