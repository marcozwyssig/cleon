package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Service extends DynamicResource implements IService {

  // abstract implementation, only used for static method calls
  private Service() {
    super(IService.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,094d86bd-a0e2-11ea-8daa-afb4679c3497,PMe61IucGmBePFEMEhxzixDF0NY=] */
