package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ServiceClassAware extends DynamicResource implements IServiceClassAware {

  // abstract implementation, only used for static method calls
  private ServiceClassAware() {
    super(IServiceClassAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IServiceClassAware> selectToMeServiceClass(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IServiceClassAware.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.ServiceClassAware_serviceClass, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df6aa85c-02e5-11ef-90b2-b7186629189e,lOue8fFvWzJUCHuYuYEMv8IfEeY=] */
