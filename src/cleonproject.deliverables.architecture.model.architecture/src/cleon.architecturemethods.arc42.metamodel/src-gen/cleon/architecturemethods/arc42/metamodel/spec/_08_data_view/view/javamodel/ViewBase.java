package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ViewBase extends DynamicResource implements IViewBase {

  // abstract implementation, only used for static method calls
  private ViewBase() {
    super(IViewBase.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase selectToMeSelect(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_select, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase> selectToMeFrom(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_from, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase selectToMeGroupby(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IGroup_By object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_groupby, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase selectToMeJoin(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoin object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IViewBase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_join, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c400e4bd-e120-11ee-995f-5faf5f77d478,1fOxvZgrjIWlvnqo9f468XqwOqA=] */
