package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class GroupAware extends DynamicResource implements IGroupAware {

  // abstract implementation, only used for static method calls
  private GroupAware() {
    super(IGroupAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroupAware selectToMeGroups(cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroupAware.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GroupAware_groups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b20f56ff-09ae-11e9-8c40-11db3668c0c9,TczHanzGBSX5VE6Gryp8R32Sv1Q=] */
