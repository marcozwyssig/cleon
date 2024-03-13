package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Having extends DynamicResource implements IHaving {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHaving> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHaving>() {
    
    @Override
    public IHaving create() {
      return new Having();
    }
    
    @Override
    public IHaving create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Having(resourceRepository, resource);
    }
  
  };

  public Having() {
    super(IHaving.TYPE_ID);
  }
  
  public Having(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHaving.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition> selectCondition() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Conditional_condition);
  }

  public Having setCondition(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition> condition) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Conditional_condition, condition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Having setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Conditional_condition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e3e8e579-d0d0-11ee-bd60-4767a6be68d4,Y/Bw8o9VY71II7yyFgMomuDJ5fA=] */
