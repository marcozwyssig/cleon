package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Role extends DynamicResource implements IRole {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRole> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRole>() {
    
    @Override
    public IRole create() {
      return new Role();
    }
    
    @Override
    public IRole create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Role(resourceRepository, resource);
    }
  
  };

  public Role() {
    super(IRole.TYPE_ID);
  }
  
  public Role(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRole.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IActivity> selectHasActivities() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IActivity.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_hasActivities);
  }

  public Role setHasActivities(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IActivity> hasActivities) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_hasActivities, hasActivities);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.INamedSystemComponent selectSystemComponent() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.INamedSystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_systemComponent);
  }

  public Role setSystemComponent(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.INamedSystemComponent systemComponent) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_systemComponent, systemComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Role setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Role setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IActivity.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_hasActivities, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.INamedSystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_systemComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IRole> selectToMeSystemComponent(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.INamedSystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IRole.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_systemComponent, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IRole> selectToMeHasActivities(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IActivity object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IRole.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.Role_hasActivities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,MtjT55TqYbYPL9XUSQVsFl2iBDs=] */
