package cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Dependency extends DynamicResource implements IDependency {

  // abstract implementation, only used for static method calls
  private Dependency() {
    super(IDependency.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency> selectToMeTo(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency.class, cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.Dependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9416ead6-ffb9-11e4-ac0a-959b440f987f,vL4P+IjwdAWRD5DtTeLkxA0zPQk=] */
