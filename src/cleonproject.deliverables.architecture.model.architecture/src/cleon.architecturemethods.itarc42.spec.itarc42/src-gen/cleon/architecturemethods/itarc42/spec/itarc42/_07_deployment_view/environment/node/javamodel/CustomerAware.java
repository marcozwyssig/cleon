package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CustomerAware extends DynamicResource implements ICustomerAware {

  // abstract implementation, only used for static method calls
  private CustomerAware() {
    super(ICustomerAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.ICustomerAware> selectToMeCustomer(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.ICustomer object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.ICustomerAware.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.CustomerAware_customer, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0d8d6d96-02d6-11e9-9e58-33d596257b14,6zr7YpomkpKM/UmTyHrYqtPSTSY=] */
