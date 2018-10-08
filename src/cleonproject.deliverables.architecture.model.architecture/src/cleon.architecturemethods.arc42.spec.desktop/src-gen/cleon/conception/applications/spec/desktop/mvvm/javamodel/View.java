package cleon.conception.applications.spec.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class View extends DynamicResource implements IView {

  // abstract implementation, only used for static method calls
  private View() {
    super(IView.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.applications.spec.desktop.mvvm.javamodel.IView> selectToMeExtends(cleon.conception.applications.spec.desktop.mvvm.javamodel.IView object) {
    return _getToMeList(object.getRepository(), cleon.conception.applications.spec.desktop.mvvm.javamodel.IView.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.View_extends, object.getResource());
  }
  
  public static cleon.conception.applications.spec.desktop.mvvm.javamodel.IView selectToMeViewModel(cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModelDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.desktop.mvvm.javamodel.IView.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.View_viewModel, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,497ab35f-5286-11e3-999a-25b1389b65ab,5iI28PjI2kzSjlsEq1v58hG6IOw=] */
