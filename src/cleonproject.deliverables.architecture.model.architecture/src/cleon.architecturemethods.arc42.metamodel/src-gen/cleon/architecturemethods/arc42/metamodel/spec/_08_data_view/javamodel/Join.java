package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Join extends DynamicResource implements IJoin {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IJoin> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IJoin>() {
    
    @Override
    public IJoin create() {
      return new Join();
    }
    
    @Override
    public IJoin create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Join(resourceRepository, resource);
    }
  
  };

  public Join() {
    super(IJoin.TYPE_ID);
  }
  
  public Join(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IJoin.TYPE_ID);
  }

  // relations
  
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField> selectOn() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_on);
  }

  public Join setOn(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField> on) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_on, on);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Join setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable selectWith() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_with);
  }

  public Join setWith(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable with) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_with, with);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_on, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_with, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin> selectToMeWith(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_with, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin selectToMeOn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Join_on, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,31b588e1-e114-11ee-995f-5faf5f77d478,4EhhGWI+eUuy52cPl1jwq3cYxo8=] */
