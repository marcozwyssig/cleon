package cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class HasDeploymentArtefact extends DynamicResource implements IHasDeploymentArtefact {

  // abstract implementation, only used for static method calls
  private HasDeploymentArtefact() {
    super(IHasDeploymentArtefact.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IHasDeploymentArtefact selectToMeDeploymentArtefacts(cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IDeploymentArtefact object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IHasDeploymentArtefact.class, cleon.architecturemethods.arc42.spec.devops.spec.release.ReleasePackage.HasDeploymentArtefact_deploymentArtefacts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c4cc02f2-4507-11e5-84bb-b76bc2368798,e227mEV/ijo1ON3IAFfWnGrEbTw=] */
