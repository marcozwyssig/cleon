package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel;

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

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITable selectFrom() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_from);
  }

  public View setFrom(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITable from) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_from, from);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IGroup_By selectGroupby() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_groupby);
  }

  public View setGroupby(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IGroup_By groupby) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_groupby, groupby);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IHaving selectHaving() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IHaving.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_having);
  }

  public View setHaving(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IHaving having) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_having, having);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISelect selectSelect() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISelect.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_select);
  }

  public View setSelect(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISelect select) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_select, select);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_from, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_groupby, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IHaving.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_having, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISelect.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_select, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView selectToMeSelect(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISelect object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_select, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView> selectToMeFrom(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITable object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_from, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView selectToMeGroupby(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IGroup_By object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_groupby, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView selectToMeHaving(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IHaving object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.DatabasePackage.View_having, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d1f10a4f-d0ca-11ee-a38e-0b82bafb3097,/gVARMGPiqLmM6uCbOw3msAGbNY=] */
