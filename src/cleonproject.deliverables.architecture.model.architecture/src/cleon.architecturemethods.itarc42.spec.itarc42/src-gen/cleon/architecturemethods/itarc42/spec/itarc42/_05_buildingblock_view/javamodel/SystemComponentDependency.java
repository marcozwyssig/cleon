package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemComponentDependency extends DynamicResource implements ISystemComponentDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemComponentDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemComponentDependency>() {
    
    @Override
    public ISystemComponentDependency create() {
      return new SystemComponentDependency();
    }
    
    @Override
    public ISystemComponentDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemComponentDependency(resourceRepository, resource);
    }
  
  };

  public SystemComponentDependency() {
    super(ISystemComponentDependency.TYPE_ID);
  }
  
  public SystemComponentDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemComponentDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemComponent selectTo() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view._05_buildingblock_viewPackage.SystemComponentDependency_to);
  }

  public SystemComponentDependency setTo(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemComponent to) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view._05_buildingblock_viewPackage.SystemComponentDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemComponentDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view._05_buildingblock_viewPackage.SystemComponentDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemComponentDependency> selectToMeTo(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemComponentDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view._05_buildingblock_viewPackage.SystemComponentDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37c35592-01d9-11e9-9c9d-8d52d6745026,pAXio3fH1RKQCl+gqOIfxDAM4i8=] */
