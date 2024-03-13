package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class View extends DynamicResource implements IView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IView>() {
    
    @Override
    public IView create() {
      return new View();
    }
    
    @Override
    public IView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new View(resourceRepository, resource);
    }
  
  };

  public View() {
    super(IView.TYPE_ID);
  }
  
  public View(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IView.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectUsed() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_used);
  }
    
  public void setUsed(java.lang.Boolean used) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_used, used);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable selectFrom() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_from);
  }

  public View setFrom(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable from) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_from, from);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By selectGroupby() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_groupby);
  }

  public View setGroupby(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By groupby) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_groupby, groupby);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin> selectJoin() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_join);
  }

  public View setJoin(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin> join) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_join, join);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelect selectSelect() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelect.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_select);
  }

  public View setSelect(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelect select) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_select, select);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public View setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public View setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhere> selectWhere() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhere.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_where);
  }

  public View setWhere(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhere> where) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_where, where);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_used, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_from, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_groupby, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_join, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelect.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_select, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhere.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_where, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView selectToMeSelect(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelect object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_select, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView> selectToMeFrom(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_from, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView selectToMeGroupby(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_groupby, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView selectToMeJoin(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_join, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView selectToMeWhere(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IWhere object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.View_where, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d1f10a4f-d0ca-11ee-a38e-0b82bafb3097,lq2ICYjR5WbUFCad1V0ATiUpQ64=] */
