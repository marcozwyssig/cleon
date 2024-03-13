package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class JoinBase extends DynamicResource implements IJoinBase {

  // abstract implementation, only used for static method calls
  private JoinBase() {
    super(IJoinBase.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoinBase> selectToMeWith(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoinBase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.JoinBase_with, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoinBase selectToMeOn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOnField object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoinBase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.JoinBase_on, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8c051e4d-e121-11ee-995f-5faf5f77d478,X1WIroacyo1Igp+cwN1b5tR8j8c=] */
