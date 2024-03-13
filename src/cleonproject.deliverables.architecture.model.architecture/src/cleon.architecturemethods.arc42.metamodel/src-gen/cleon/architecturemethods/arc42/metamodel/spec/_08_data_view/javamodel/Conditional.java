package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Conditional extends DynamicResource implements IConditional {

  // abstract implementation, only used for static method calls
  private Conditional() {
    super(IConditional.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IConditional selectToMeCondition(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IConditional.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Conditional_condition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,982ba3b6-e11a-11ee-995f-5faf5f77d478,RXzDkZlw58re2hROXde2Xn1DS1I=] */
