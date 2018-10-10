package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class StakeholderAware extends DynamicResource implements IStakeholderAware {

  // abstract implementation, only used for static method calls
  private StakeholderAware() {
    super(IStakeholderAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholderAware> selectToMeOwners(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholderAware.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,33ff7368-0d07-11e6-be97-7d1235599779,jiuWuRNyLm+p4Lv0ObfO/cLRaBU=] */
