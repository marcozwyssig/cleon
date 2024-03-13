package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractColumn extends DynamicResource implements IAbstractColumn {

  // abstract implementation, only used for static method calls
  private AbstractColumn() {
    super(IAbstractColumn.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IAbstractColumn> selectToMeColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IAbstractColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractColumn_column, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b32e6875-d0cd-11ee-a38e-0b82bafb3097,EoroGOw+t8zv0UMO9q1GiPY6fL8=] */
