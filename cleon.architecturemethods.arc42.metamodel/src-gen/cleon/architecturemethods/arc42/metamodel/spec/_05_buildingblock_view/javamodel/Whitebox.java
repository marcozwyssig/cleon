package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Whitebox extends DynamicResource implements IWhitebox {

  // abstract implementation, only used for static method calls
  private Whitebox() {
    super(IWhitebox.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox selectToMeWhitebox(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox selectToMeBlackboxes(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox selectToMeChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7bbfe5fd-e085-11ee-a506-c5335c4d5040,l+nz4GytrLAssvY8FA2ZltZWTiQ=] */
