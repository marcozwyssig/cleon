package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Inheritance extends DynamicResource implements IInheritance {

  // abstract implementation, only used for static method calls
  private Inheritance() {
    super(IInheritance.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.arc42.spec._05_buildingblockview.javamodel.IInheritance> selectToMeFrom(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.IInheritance.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.Inheritance_from, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d715af8c-ffba-11e4-ac0a-959b440f987f,iBjODtw4yJswK1fgnc15mCdKkuk=] */
