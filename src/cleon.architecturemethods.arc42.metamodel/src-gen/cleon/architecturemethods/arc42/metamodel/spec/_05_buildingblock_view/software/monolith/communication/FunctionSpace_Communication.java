package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b938d789-cf1f-11ee-8c06-a5102392725a,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.Message;

/* End Protected Region   [[b938d789-cf1f-11ee-8c06-a5102392725a,imports]] */

public class FunctionSpace_Communication {

  /* Begin Protected Region [[b938d789-cf1f-11ee-8c06-a5102392725a]] */
  
  /* End Protected Region   [[b938d789-cf1f-11ee-8c06-a5102392725a]] */


  public static interface IEnumerationValueFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4edcab4a-cf28-11ee-8c06-a5102392725a")
    public java.lang.String SimpleName();

  }
  
  public static interface IEnumerationValueFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnumerationValueFunctionsImpl implements IEnumerationValueFunctionsImpl {

    public static final IEnumerationValueFunctionsImpl INSTANCE = new EnumerationValueFunctionsImpl();

    private EnumerationValueFunctionsImpl() {}

  }
  
  public static class EnumerationValueFunctions {

    private EnumerationValueFunctions() {}

  }

  public static interface IFieldFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f2670945-fac7-11f0-81b8-83fdbb37c0b0")
    public java.lang.String FieldName();

    @IDynamicResourceExtension.MethodId("4851d0e2-fac8-11f0-81b8-83fdbb37c0b0")
    public java.lang.Integer FieldPosition();

    @IDynamicResourceExtension.MethodId("503aa8fb-fac8-11f0-81b8-83fdbb37c0b0")
    public java.lang.String SimpleName();

  }
  
  public static interface IFieldFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4851d0e2-fac8-11f0-81b8-83fdbb37c0b0")
    public java.lang.Integer FieldPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField field);

  }
  
  public static class FieldFunctionsImpl implements IFieldFunctionsImpl {

    public static final IFieldFunctionsImpl INSTANCE = new FieldFunctionsImpl();

    private FieldFunctionsImpl() {}

    @Override
    public java.lang.Integer FieldPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField field) {
      /* Begin Protected Region [[4851d0e2-fac8-11f0-81b8-83fdbb37c0b0]] */
    	var fieldIndex = 1;
    	for (var currentField : Message.selectToMeFields(field).selectFields().values()) {
    	    if (currentField.equals(field)) {
    	        return fieldIndex;
    	    }
    	    fieldIndex++;
    	}
    	return -1;
      /* End Protected Region   [[4851d0e2-fac8-11f0-81b8-83fdbb37c0b0]] */
    }

  }
  
  public static class FieldFunctions {

    private FieldFunctions() {}

    public static java.lang.Integer FieldPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField field) {
      return DynamicResourceUtil.invoke(IFieldFunctionsImpl.class, FieldFunctionsImpl.INSTANCE, field).FieldPosition(field);
    }

  }

  public static interface IRelationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("47f2df49-fb80-11f0-919e-07363e802872")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("4c802ed5-fb80-11f0-919e-07363e802872")
    public java.lang.String RelationName();

    @IDynamicResourceExtension.MethodId("4c802ee1-fb80-11f0-919e-07363e802872")
    public java.lang.Integer RelationPosition();

  }
  
  public static interface IRelationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4c802ee1-fb80-11f0-919e-07363e802872")
    public java.lang.Integer RelationPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation relation);

  }
  
  public static class RelationFunctionsImpl implements IRelationFunctionsImpl {

    public static final IRelationFunctionsImpl INSTANCE = new RelationFunctionsImpl();

    private RelationFunctionsImpl() {}

    @Override
    public java.lang.Integer RelationPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation relation) {
      /* Begin Protected Region [[4c802ee1-fb80-11f0-919e-07363e802872]] */
    	var relationIndex = 100;
    	for (var currentRelation : Message.selectToMeRelation(relation).selectRelation().values()  ) {
    	    if (currentRelation.equals(relation)) {
    	        return relationIndex;
    	    }
    	    relationIndex++;
    	}
    	return -1;
   
      /* End Protected Region   [[4c802ee1-fb80-11f0-919e-07363e802872]] */
    }

  }
  
  public static class RelationFunctions {

    private RelationFunctions() {}

    public static java.lang.Integer RelationPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation relation) {
      return DynamicResourceUtil.invoke(IRelationFunctionsImpl.class, RelationFunctionsImpl.INSTANCE, relation).RelationPosition(relation);
    }

  }

  public static interface IAbstractTableRelationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("62f8ca3e-fb81-11f0-919e-07363e802872")
    public java.lang.String CardinalityType();

  }
  
  public static interface IAbstractTableRelationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractTableRelationFunctionsImpl implements IAbstractTableRelationFunctionsImpl {

    public static final IAbstractTableRelationFunctionsImpl INSTANCE = new AbstractTableRelationFunctionsImpl();

    private AbstractTableRelationFunctionsImpl() {}

  }
  
  public static class AbstractTableRelationFunctions {

    private AbstractTableRelationFunctions() {}

  }

  public static interface ITableRelationOneToOneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7f42c2d8-fb81-11f0-919e-07363e802872")
    public java.lang.String CardinalityType();

  }
  
  public static interface ITableRelationOneToOneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7f42c2d8-fb81-11f0-919e-07363e802872")
    public java.lang.String CardinalityType(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableRelationOneToOne tableRelationOneToOne);

  }
  
  public static class TableRelationOneToOneFunctionsImpl implements ITableRelationOneToOneFunctionsImpl {

    public static final ITableRelationOneToOneFunctionsImpl INSTANCE = new TableRelationOneToOneFunctionsImpl();

    private TableRelationOneToOneFunctionsImpl() {}

    @Override
    public java.lang.String CardinalityType(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableRelationOneToOne tableRelationOneToOne) {
      return null;
    }

  }
  
  public static class TableRelationOneToOneFunctions {

    private TableRelationOneToOneFunctions() {}

    public static java.lang.String CardinalityType(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableRelationOneToOne tableRelationOneToOne) {
      return DynamicResourceUtil.invoke(ITableRelationOneToOneFunctionsImpl.class, TableRelationOneToOneFunctionsImpl.INSTANCE, tableRelationOneToOne).CardinalityType(tableRelationOneToOne);
    }

  }

  public static interface ITableRelationManyToOneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("899e96d3-fb81-11f0-919e-07363e802872")
    public java.lang.String CardinalityType();

  }
  
  public static interface ITableRelationManyToOneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableRelationManyToOneFunctionsImpl implements ITableRelationManyToOneFunctionsImpl {

    public static final ITableRelationManyToOneFunctionsImpl INSTANCE = new TableRelationManyToOneFunctionsImpl();

    private TableRelationManyToOneFunctionsImpl() {}

  }
  
  public static class TableRelationManyToOneFunctions {

    private TableRelationManyToOneFunctions() {}

  }

  public static interface IValidatorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("81616ace-fb86-11f0-919e-07363e802872")
    public java.lang.String gRPC();

  }
  
  public static interface IValidatorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ValidatorFunctionsImpl implements IValidatorFunctionsImpl {

    public static final IValidatorFunctionsImpl INSTANCE = new ValidatorFunctionsImpl();

    private ValidatorFunctionsImpl() {}

  }
  
  public static class ValidatorFunctions {

    private ValidatorFunctions() {}

  }

  public static interface ITypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9e7cb69d-fb89-11f0-919e-07363e802872")
    public java.lang.String gRPC_Type_Name();

  }
  
  public static interface ITypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TypeFunctionsImpl implements ITypeFunctionsImpl {

    public static final ITypeFunctionsImpl INSTANCE = new TypeFunctionsImpl();

    private TypeFunctionsImpl() {}

  }
  
  public static class TypeFunctions {

    private TypeFunctions() {}

  }

  public static interface IEnumTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cbdf0f9a-fb89-11f0-919e-07363e802872")
    public java.lang.String gRPC_Type_Name();

  }
  
  public static interface IEnumTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnumTypeFunctionsImpl implements IEnumTypeFunctionsImpl {

    public static final IEnumTypeFunctionsImpl INSTANCE = new EnumTypeFunctionsImpl();

    private EnumTypeFunctionsImpl() {}

  }
  
  public static class EnumTypeFunctions {

    private EnumTypeFunctions() {}

  }

  public static interface IStandardTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("48a3a549-fb8d-11f0-919e-07363e802872")
    public java.lang.String gRPC_Type_Name();

    @IDynamicResourceExtension.MethodId("9763360d-fb8c-11f0-919e-07363e802872")
    public java.lang.String Map_gRPC_Type_Name();

  }
  
  public static interface IStandardTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9763360d-fb8c-11f0-919e-07363e802872")
    public java.lang.String Map_gRPC_Type_Name(final ch.actifsource.solution.datatype.generic.datatype.javamodel.IStandardType standardType);

  }
  
  public static class StandardTypeFunctionsImpl implements IStandardTypeFunctionsImpl {

    public static final IStandardTypeFunctionsImpl INSTANCE = new StandardTypeFunctionsImpl();

    private StandardTypeFunctionsImpl() {}

    @Override
    public java.lang.String Map_gRPC_Type_Name(final ch.actifsource.solution.datatype.generic.datatype.javamodel.IStandardType standardType) {
      /* Begin Protected Region [[9763360d-fb8c-11f0-919e-07363e802872]] */
    	if (standardType.selectName().equals("INTEGER")) {
    		return "int32";
    	}
    	
    	if (standardType.selectName().equals("BIGINT")) {
    		return "int64";
    	}
    	
    	return null;
      /* End Protected Region   [[9763360d-fb8c-11f0-919e-07363e802872]] */
    }

  }
  
  public static class StandardTypeFunctions {

    private StandardTypeFunctions() {}

    public static java.lang.String Map_gRPC_Type_Name(final ch.actifsource.solution.datatype.generic.datatype.javamodel.IStandardType standardType) {
      return DynamicResourceUtil.invoke(IStandardTypeFunctionsImpl.class, StandardTypeFunctionsImpl.INSTANCE, standardType).Map_gRPC_Type_Name(standardType);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b938d789-cf1f-11ee-8c06-a5102392725a,KvvFH1YCdYQEyFk00AXKgQYQR10=] */
