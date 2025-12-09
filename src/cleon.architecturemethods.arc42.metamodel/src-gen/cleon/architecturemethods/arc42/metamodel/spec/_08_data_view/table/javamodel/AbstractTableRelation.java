package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractTableRelation extends DynamicResource implements IAbstractTableRelation {

  // abstract implementation, only used for static method calls
  private AbstractTableRelation() {
    super(IAbstractTableRelation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> selectToMeToTable(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_toTable, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> selectToMePrimaryKey(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_primaryKey, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6fc728b3-621a-11f0-8ed9-1d79caf8da43,ca962NXC7EYfK9hCA4DL+E5YHUk=] */
