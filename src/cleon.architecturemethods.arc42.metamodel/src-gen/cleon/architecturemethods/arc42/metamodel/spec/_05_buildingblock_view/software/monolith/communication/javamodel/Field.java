package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Field extends DynamicResource implements IField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IField>() {
    
    @Override
    public IField create() {
      return new Field();
    }
    
    @Override
    public IField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Field(resourceRepository, resource);
    }
  
  };

  public Field() {
    super(IField.TYPE_ID);
  }
  
  public Field(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IField.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDbType() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_dbType);
  }
    
  public void setDbType(java.lang.String dbType) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_dbType, dbType);
  }

  @Override
  public java.lang.String selectGRPCType_Name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPCType_aE_Name);
  }
    
  public void setGRPCType_Name(java.lang.String gRPCType_Name) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPCType_aE_Name, gRPCType_Name);
  }

  @Override
  public java.lang.Integer selectPosition() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_position);
  }
    
  public void setPosition(java.lang.Integer position) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_position, position);
  }

  // relations
  
  @Override
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectAssignedType() {
    return _getSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_assignedType);
  }

  public Field setAssignedType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType assignedType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_assignedType, assignedType);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column);
  }

  public Field setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectGRPC_Type() {
    return _getSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPC_aE_Type);
  }

  public Field setGRPC_Type(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType gRPC_Type) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPC_aE_Type, gRPC_Type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Field setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Field setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IValidator selectValidator() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IValidator.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_validator);
  }

  public Field setValidator(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IValidator validator) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_validator, validator);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_dbType, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPCType_aE_Name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_position, visitor);
    // relations
    _acceptSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_assignedType, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column, visitor);
    _acceptSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPC_aE_Type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IValidator.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_validator, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectToMeColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectToMeGRPC_Type(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPC_aE_Type, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectToMeAssignedType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_assignedType, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectToMeValidator(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IValidator object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_validator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c78f20fa-fac6-11f0-81b8-83fdbb37c0b0,AQGADLYKqT7Wr5l4FOCR95UyJt8=] */
