package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HavingField extends DynamicResource implements IHavingField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHavingField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHavingField>() {
    
    @Override
    public IHavingField create() {
      return new HavingField();
    }
    
    @Override
    public IHavingField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HavingField(resourceRepository, resource);
    }
  
  };

  public HavingField() {
    super(IHavingField.TYPE_ID);
  }
  
  public HavingField(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHavingField.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.HavingField_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.HavingField_value, value);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.AbstractField_column);
  }

  public HavingField setColumn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.AbstractField_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.core.validation.javamodel.IConditionalOperator selectOperator() {
    return _getSingle(ch.actifsource.core.validation.javamodel.IConditionalOperator.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.HavingField_operator);
  }

  public HavingField setOperator(ch.actifsource.core.validation.javamodel.IConditionalOperator operator) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.HavingField_operator, operator);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public HavingField setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HavingField setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.HavingField_value, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.AbstractField_column, visitor);
    _acceptSingle(ch.actifsource.core.validation.javamodel.IConditionalOperator.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.HavingField_operator, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IHavingField> selectToMeOperator(ch.actifsource.core.validation.javamodel.IConditionalOperator object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IHavingField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.HavingField_operator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f75c24b0-d0d0-11ee-bd60-4767a6be68d4,bwkmXMItFsJJDKIgmj3MvoNuqMk=] */
