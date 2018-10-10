package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PrincipleAware extends DynamicResource implements IPrincipleAware {

  // abstract implementation, only used for static method calls
  private PrincipleAware() {
    super(IPrincipleAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrincipleAware> selectToMeOriginatesFromPrinciple(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrincipleAware.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.PrinciplesPackage.PrincipleAware_originatesFromPrinciple, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,38a641ef-0abf-11e6-85a2-61e22bb4d1e3,tg3F9xGH5h8SKwn7Ntnd8BPqYeE=] */
