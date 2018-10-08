package cleon.deployment.devops.spec.deploy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Environment extends DynamicResource implements IEnvironment {

  // abstract implementation, only used for static method calls
  private Environment() {
    super(IEnvironment.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0bbfeb7d-4070-11e5-b5f0-5b1ce9c3de3e,HInTraMR0KTa1VInQMl+e0nVY00=] */
