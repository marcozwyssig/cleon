package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PortService extends DynamicResource implements IPortService {

  // abstract implementation, only used for static method calls
  private PortService() {
    super(IPortService.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a273b70a-6da3-11e9-8af5-2346ca56c2e2,fmdRWTSx0gZxvaqB/4k3TC/PqkI=] */
