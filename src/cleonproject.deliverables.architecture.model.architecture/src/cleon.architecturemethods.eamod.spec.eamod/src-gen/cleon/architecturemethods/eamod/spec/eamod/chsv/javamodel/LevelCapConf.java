package cleon.architecturemethods.eamod.spec.eamod.chsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class LevelCapConf extends DynamicResource implements ILevelCapConf {

  // abstract implementation, only used for static method calls
  private LevelCapConf() {
    super(ILevelCapConf.TYPE_ID);
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chsv.javamodel.ILevelCapConf> selectToMeDecommission(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chsv.javamodel.ILevelCapConf.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_Decommission, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chsv.javamodel.ILevelCapConf> selectToMeEndOfLife(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chsv.javamodel.ILevelCapConf.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_EndOfLife, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ddc2c098-a7fa-11e7-9807-4f1f5d43f7c9,RIE89RjXVdTLnoPh28kf1fvqnL4=] */
