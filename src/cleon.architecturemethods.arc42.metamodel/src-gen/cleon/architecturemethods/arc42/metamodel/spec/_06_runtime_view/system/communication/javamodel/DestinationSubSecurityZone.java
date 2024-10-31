package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DestinationSubSecurityZone extends DynamicResource implements IDestinationSubSecurityZone {

  // abstract implementation, only used for static method calls
  private DestinationSubSecurityZone() {
    super(IDestinationSubSecurityZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestinationSubSecurityZone> selectToMeInInterface(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationInterface object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestinationSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_inInterface, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestinationSubSecurityZone> selectToMeDestinationSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestinationSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_destinationSecuritySubZone, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestinationSubSecurityZone selectToMeHasCommunicationFrom(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestinationSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_hasCommunicationFrom, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0b182d4f-5528-11ed-a5a9-572b13f613fe,mwr0CupS8AxX6V3hq92yn5jNvgM=] */
