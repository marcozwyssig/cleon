package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractService extends DynamicResource implements IAbstractService {

  // abstract implementation, only used for static method calls
  private AbstractService() {
    super(IAbstractService.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> selectToMeUsedInCommunication(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.AbstractService_usedInCommunication, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> selectToMeUsedInGroup(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractServiceGroup object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.AbstractService_usedInGroup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9ccbced2-6da3-11e9-8af5-2346ca56c2e2,Br7L9AVn47Ijwm563ltdDpukGGM=] */
