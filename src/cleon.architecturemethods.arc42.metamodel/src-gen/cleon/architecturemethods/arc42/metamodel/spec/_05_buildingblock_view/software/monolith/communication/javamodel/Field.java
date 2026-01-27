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
  public java.lang.String selectGRPCType() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPCType);
  }
    
  public void setGRPCType(java.lang.String gRPCType) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPCType, gRPCType);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column);
  }

  public Field setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column, column);
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
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectType() {
    return _getSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_type);
  }

  public Field setType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType type) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_type, type);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_dbType, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_gRPCType, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column, visitor);
    _acceptSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectToMeColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_column, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectToMeType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Field_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c78f20fa-fac6-11f0-81b8-83fdbb37c0b0,0AdiSftrAdDZjQNOHHAAlaibSOg=] */
