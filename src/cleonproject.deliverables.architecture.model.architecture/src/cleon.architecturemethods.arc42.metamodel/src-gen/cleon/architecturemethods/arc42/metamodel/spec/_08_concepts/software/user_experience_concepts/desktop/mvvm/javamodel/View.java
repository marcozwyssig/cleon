package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class View extends DynamicResource implements IView {

  // abstract implementation, only used for static method calls
  private View() {
    super(IView.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IView> selectToMeExtends(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IView object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.View_extends, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IView selectToMeViewModel(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IViewModelDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.View_viewModel, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,497ab35f-5286-11e3-999a-25b1389b65ab,7+PrxkxB1tUiSxAPnL4Ekpkblv8=] */
