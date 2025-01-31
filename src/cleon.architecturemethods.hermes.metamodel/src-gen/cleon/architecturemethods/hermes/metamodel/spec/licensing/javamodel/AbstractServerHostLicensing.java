package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractServerHostLicensing extends DynamicResource implements IAbstractServerHostLicensing {

  // abstract implementation, only used for static method calls
  private AbstractServerHostLicensing() {
    super(IAbstractServerHostLicensing.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractServerHostLicensing> selectToMeHost(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractServerHostLicensing.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_host, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8e15c70-dfdd-11ef-8b41-bffcdee4ee9e,mtxgj0QPY9TPDLuLuljYUkiyZKY=] */
