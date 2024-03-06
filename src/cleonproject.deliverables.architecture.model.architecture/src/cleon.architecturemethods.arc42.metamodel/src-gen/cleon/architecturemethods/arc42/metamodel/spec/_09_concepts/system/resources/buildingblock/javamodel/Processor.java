package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Processor extends DynamicResource implements IProcessor {

  // abstract implementation, only used for static method calls
  private Processor() {
    super(IProcessor.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e21ab957-2aff-11e9-9692-65766bc2daa5,+swoq4f0ZfcE1veP4jd8B+f5boA=] */
