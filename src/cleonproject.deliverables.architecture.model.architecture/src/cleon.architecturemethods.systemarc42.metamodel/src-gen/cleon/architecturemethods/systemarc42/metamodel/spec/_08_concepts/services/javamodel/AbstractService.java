package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractService extends DynamicResource implements IAbstractService {

  // abstract implementation, only used for static method calls
  private AbstractService() {
    super(IAbstractService.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9ccbced2-6da3-11e9-8af5-2346ca56c2e2,JSg012qgOfVqKO/oPBDTWNJIvYM=] */
