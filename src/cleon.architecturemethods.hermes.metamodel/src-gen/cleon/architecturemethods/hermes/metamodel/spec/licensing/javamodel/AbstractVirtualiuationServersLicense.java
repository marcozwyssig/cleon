package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractVirtualiuationServersLicense extends DynamicResource implements IAbstractVirtualiuationServersLicense {

  // abstract implementation, only used for static method calls
  private AbstractVirtualiuationServersLicense() {
    super(IAbstractVirtualiuationServersLicense.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractVirtualiuationServersLicense> selectToMeHosts(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.javamodel.INode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractVirtualiuationServersLicense.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractVirtualiuationServersLicense_hosts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,60bad69a-e4b7-11ef-a6bd-497168f25adc,SXNVG18IVSvRW3CcvR4buHJLH+A=] */
