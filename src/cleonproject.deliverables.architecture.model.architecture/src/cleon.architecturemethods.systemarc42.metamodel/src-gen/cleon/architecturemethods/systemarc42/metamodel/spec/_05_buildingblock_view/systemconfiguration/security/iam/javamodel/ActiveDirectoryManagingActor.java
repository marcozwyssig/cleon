package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActiveDirectoryManagingActor extends DynamicResource implements IActiveDirectoryManagingActor {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActiveDirectoryManagingActor> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActiveDirectoryManagingActor>() {
    
    @Override
    public IActiveDirectoryManagingActor create() {
      return new ActiveDirectoryManagingActor();
    }
    
    @Override
    public IActiveDirectoryManagingActor create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActiveDirectoryManagingActor(resourceRepository, resource);
    }
  
  };

  public ActiveDirectoryManagingActor() {
    super(IActiveDirectoryManagingActor.TYPE_ID);
  }
  
  public ActiveDirectoryManagingActor(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActiveDirectoryManagingActor.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectActor() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.IamPackage.ActiveDirectoryManagingActor_actor);
  }

  public ActiveDirectoryManagingActor setActor(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor actor) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.IamPackage.ActiveDirectoryManagingActor_actor, actor);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ActiveDirectoryManagingActor setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActiveDirectoryManagingActor setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.IamPackage.ActiveDirectoryManagingActor_actor, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel.IActiveDirectoryManagingActor> selectToMeActor(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel.IActiveDirectoryManagingActor.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.IamPackage.ActiveDirectoryManagingActor_actor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e0d363b0-df5b-11eb-95f9-6d420979d010,97/LXjjGmyNya4NYsM7aa4xhJOU=] */
