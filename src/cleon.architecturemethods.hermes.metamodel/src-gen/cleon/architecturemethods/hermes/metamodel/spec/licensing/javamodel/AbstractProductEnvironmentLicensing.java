package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractProductEnvironmentLicensing extends DynamicResource implements IAbstractProductEnvironmentLicensing {

  // abstract implementation, only used for static method calls
  private AbstractProductEnvironmentLicensing() {
    super(IAbstractProductEnvironmentLicensing.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing> selectToMeEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractProductEnvironmentLicensing_environment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,74d2b4cd-dfc2-11ef-b0be-9b4cac321140,aP+mwNL5BFbPyRHoULE5ylvlENQ=] */
