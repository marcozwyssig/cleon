package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Select extends DynamicResource implements ISelect {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISelect> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISelect>() {
    
    @Override
    public ISelect create() {
      return new Select();
    }
    
    @Override
    public ISelect create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Select(resourceRepository, resource);
    }
  
  };

  public Select() {
    super(ISelect.TYPE_ID);
  }
  
  public Select(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISelect.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectSelectAllFields() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.Select_selectAllFields);
  }
    
  public void setSelectAllFields(java.lang.Boolean selectAllFields) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.Select_selectAllFields, selectAllFields);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelectColumn> selectSelect() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelectColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.Select_select);
  }

  public Select setSelect(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelectColumn> select) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.Select_select, select);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Select setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.Select_selectAllFields, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelectColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.Select_select, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect selectToMeSelect(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelectColumn object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.Select_select, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2dc7aaf7-d0cc-11ee-a38e-0b82bafb3097,18F1lKPaEUzDGlwuKcfhtr5D9NM=] */
