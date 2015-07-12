package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class UseDecomposite extends DynamicResource implements IUseDecomposite {

  // abstract implementation, only used for static method calls
  private UseDecomposite() {
    super(IUseDecomposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.arc42.spec._05_buildingblockview.javamodel.IUseDecomposite selectToMeDecompose(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.IUseDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53d51c49-7ad7-11e4-a6e2-23d949480f96,Nyea5eb/ziB0eg8NZr18IDmzVvE=] */
