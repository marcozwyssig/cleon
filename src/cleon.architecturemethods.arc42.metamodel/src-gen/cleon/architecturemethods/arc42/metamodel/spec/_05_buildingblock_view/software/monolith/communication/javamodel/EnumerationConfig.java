package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnumerationConfig extends DynamicResource implements IEnumerationConfig {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumerationConfig> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumerationConfig>() {
    
    @Override
    public IEnumerationConfig create() {
      return new EnumerationConfig();
    }
    
    @Override
    public IEnumerationConfig create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnumerationConfig(resourceRepository, resource);
    }
  
  };

  public EnumerationConfig() {
    super(IEnumerationConfig.TYPE_ID);
  }
  
  public EnumerationConfig(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnumerationConfig.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectEnumIndex() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.EnumerationConfig_enumIndex);
  }
    
  public void setEnumIndex(java.lang.Integer enumIndex) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.EnumerationConfig_enumIndex, enumIndex);
  }

  // relations
  
  @Override
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IEnumType selectEnumType() {
    return _getSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IEnumType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.EnumerationConfig_enumType);
  }

  public EnumerationConfig setEnumType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IEnumType enumType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.EnumerationConfig_enumType, enumType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public EnumerationConfig setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnumerationConfig setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.EnumerationConfig_enumIndex, visitor);
    // relations
    _acceptSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IEnumType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.EnumerationConfig_enumType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationConfig> selectToMeEnumType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IEnumType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationConfig.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.EnumerationConfig_enumType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27d841df-fb98-11f0-919e-07363e802872,QtHD/GT9Qw/Cl4jiOszfEKOTQfI=] */
