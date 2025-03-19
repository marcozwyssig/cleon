package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractConfigurationSpecification extends DynamicResource implements IAbstractConfigurationSpecification {

  // abstract implementation, only used for static method calls
  private AbstractConfigurationSpecification() {
    super(IAbstractConfigurationSpecification.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,637a66b7-0013-11f0-945c-87b19aec41f4,fp7myTiPr/H1yN1h3Vlv6H0qgFE=] */
