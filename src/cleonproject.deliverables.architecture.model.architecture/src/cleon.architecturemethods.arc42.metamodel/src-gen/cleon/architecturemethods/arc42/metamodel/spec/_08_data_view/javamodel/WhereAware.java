package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WhereAware extends DynamicResource implements IWhereAware {

  // abstract implementation, only used for static method calls
  private WhereAware() {
    super(IWhereAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhereAware selectToMeWhere(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhere object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhereAware.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.WhereAware_where, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2264d31d-e120-11ee-995f-5faf5f77d478,508YcO13E5kdOfCLNkJUHysp1Jk=] */
