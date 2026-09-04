package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Column extends DynamicResource implements IColumn {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumn> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumn>() {
    
    @Override
    public IColumn create() {
      return new Column();
    }
    
    @Override
    public IColumn create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Column(resourceRepository, resource);
    }
  
  };

  public Column() {
    super(IColumn.TYPE_ID);
  }
  
  public Column(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumn.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectAllowedValuesByType() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_allowedValuesByType);
  }
    
  public void setAllowedValuesByType(java.util.List<java.lang.String> allowedValuesByType) {
     _setListAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_allowedValuesByType, allowedValuesByType);
  }

  @Override
  public java.lang.String selectDbType() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_dbType);
  }
    
  public void setDbType(java.lang.String dbType) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_dbType, dbType);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectNotInDb() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_notInDb);
  }
    
  public void setNotInDb(java.lang.Boolean notInDb) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_notInDb, notInDb);
  }

  @Override
  public java.lang.Boolean selectNullable() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_nullable);
  }
    
  public void setNullable(java.lang.Boolean nullable) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_nullable, nullable);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue> selectAllowedValues() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_allowedValues);
  }

  public Column setAllowedValues(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue> allowedValues) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_allowedValues, allowedValues);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> selectAssignedForeignKeys() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_assignedForeignKeys);
  }

  public Column setAssignedForeignKeys(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> assignedForeignKeys) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_assignedForeignKeys, assignedForeignKeys);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IComment selectComment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IComment.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.CommentAware_comment);
  }

  public Column setComment(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IComment comment) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.CommentAware_comment, comment);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation selectForeignKey() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_foreignKey);
  }

  public Column setForeignKey(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation foreignKey) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_foreignKey, foreignKey);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractColumnStandardValue selectStandardValue() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractColumnStandardValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_standardValue);
  }

  public Column setStandardValue(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractColumnStandardValue standardValue) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_standardValue, standardValue);
    return this;
  }
    
  @Override
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectType() {
    return _getSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_type);
  }

  public Column setType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType type) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Column setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_allowedValuesByType, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_dbType, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_notInDb, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_nullable, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_allowedValues, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_assignedForeignKeys, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IComment.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.CommentAware_comment, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_foreignKey, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractColumnStandardValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_standardValue, visitor);
    _acceptSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> selectToMeType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_type, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> selectToMeAllowedValues(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_allowedValues, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectToMeStandardValue(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractColumnStandardValue object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_standardValue, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectToMeForeignKey(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_foreignKey, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> selectToMeAssignedForeignKeys(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.Column_assignedForeignKeys, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a757c855-b934-11ee-a0d0-e953bcbfaeef,rxI6RzpLjHHCw4E1/gXHXaww0zI=] */
