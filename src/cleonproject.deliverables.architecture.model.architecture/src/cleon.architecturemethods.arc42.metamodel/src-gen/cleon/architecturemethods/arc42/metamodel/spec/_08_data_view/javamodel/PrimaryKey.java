package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PrimaryKey extends DynamicResource implements IPrimaryKey {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrimaryKey> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrimaryKey>() {
    
    @Override
    public IPrimaryKey create() {
      return new PrimaryKey();
    }
    
    @Override
    public IPrimaryKey create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PrimaryKey(resourceRepository, resource);
    }
  
  };

  public PrimaryKey() {
    super(IPrimaryKey.TYPE_ID);
  }
  
  public PrimaryKey(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPrimaryKey.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn> selectColumns() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.PrimaryKey_columns);
  }

  public PrimaryKey setColumns(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn> columns) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.PrimaryKey_columns, columns);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PrimaryKey setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.PrimaryKey_columns, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IPrimaryKey> selectToMeColumns(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IPrimaryKey.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.PrimaryKey_columns, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fc12f568-b935-11ee-a0d0-e953bcbfaeef,lEUg6ZhQerTom0YAT15wiGyD0z0=] */
