package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CommentAware extends DynamicResource implements ICommentAware {

  // abstract implementation, only used for static method calls
  private CommentAware() {
    super(ICommentAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ICommentAware selectToMeComment(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IComment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ICommentAware.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.CommentAware_comment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,29dd605d-bf65-11ee-bc81-331d6caf9305,Njui7/BcHvGST+6CZTZrSvABJGs=] */
