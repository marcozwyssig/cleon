package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Group_By extends DynamicResource implements IGroup_By {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroup_By> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroup_By>() {
    
    @Override
    public IGroup_By create() {
      return new Group_By();
    }
    
    @Override
    public IGroup_By create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Group_By(resourceRepository, resource);
    }
  
  };

  public Group_By() {
    super(IGroup_By.TYPE_ID);
  }
  
  public Group_By(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGroup_By.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroupByField> selectGroupByField() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroupByField.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_groupByField);
  }

  public Group_By setGroupByField(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroupByField> groupByField) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_groupByField, groupByField);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IHaving selectHaving() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IHaving.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_having);
  }

  public Group_By setHaving(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IHaving having) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_having, having);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Group_By setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroupByField.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_groupByField, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IHaving.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_having, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By selectToMeGroupByField(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroupByField object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_groupByField, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By selectToMeHaving(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IHaving object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Group_aE_By_having, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7bb8684b-d0cd-11ee-a38e-0b82bafb3097,56EdAcovLRDgG1bCC/0OHS9zHbk=] */
