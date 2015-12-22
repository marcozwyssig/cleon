package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ReferenceOwnDecomposite extends DynamicResource implements IReferenceOwnDecomposite {

  // abstract implementation, only used for static method calls
  private ReferenceOwnDecomposite() {
    super(IReferenceOwnDecomposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.arc42.spec._05_buildingblockview.javamodel.IReferenceOwnDecomposite selectToMeOwnDecompositions(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.IReferenceOwnDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.ReferenceOwnDecomposite_ownDecompositions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,10095348-175a-11e5-9ca7-d1bb57b73459,wCBAE048zVvJhk8v8fyS3i7tqsw=] */
