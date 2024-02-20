package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnumerationMappingView extends DynamicResource implements IEnumerationMappingView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumerationMappingView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumerationMappingView>() {
    
    @Override
    public IEnumerationMappingView create() {
      return new EnumerationMappingView();
    }
    
    @Override
    public IEnumerationMappingView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnumerationMappingView(resourceRepository, resource);
    }
  
  };

  public EnumerationMappingView() {
    super(IEnumerationMappingView.TYPE_ID);
  }
  
  public EnumerationMappingView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnumerationMappingView.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration selectScope() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_scope);
  }

  public EnumerationMappingView setScope(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration scope) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_scope, scope);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITableMappingView> selectTableMappingView() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITableMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_tableMappingView);
  }

  public EnumerationMappingView setTableMappingView(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITableMappingView> tableMappingView) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_tableMappingView, tableMappingView);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnumerationMappingView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_scope, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITableMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_tableMappingView, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IEnumerationMappingView selectToMeTableMappingView(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITableMappingView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IEnumerationMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_tableMappingView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IEnumerationMappingView selectToMeScope(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IEnumerationMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.EnumerationMappingView_scope, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8fa61b6b-cffc-11ee-9bb8-5f4f5b483c01,YDO2XM8d4aadR4BLEqjvBuwhZVw=] */
