package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleUtilization extends DynamicResource implements IRoleUtilization {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleUtilization> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleUtilization>() {
    
    @Override
    public IRoleUtilization create() {
      return new RoleUtilization();
    }
    
    @Override
    public IRoleUtilization create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleUtilization(resourceRepository, resource);
    }
  
  };

  public RoleUtilization() {
    super(IRoleUtilization.TYPE_ID);
  }
  
  public RoleUtilization(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleUtilization.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectAllocation() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.RoleUtilization_allocation);
  }
    
  public void setAllocation(java.lang.Integer allocation) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.RoleUtilization_allocation, allocation);
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
  public cleon.initialization.projectmanagement.spec.planning.organisation.roles.javamodel.IRole selectRole() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.organisation.roles.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.RoleUtilization_role);
  }

  public RoleUtilization setRole(cleon.initialization.projectmanagement.spec.planning.organisation.roles.javamodel.IRole role) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.RoleUtilization_role, role);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleUtilization setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleUtilization setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.RoleUtilization_allocation, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.organisation.roles.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.RoleUtilization_role, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectToMeRole(cleon.initialization.projectmanagement.spec.planning.organisation.roles.javamodel.IRole object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.RoleUtilization_role, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,75e4e41e-c291-11e6-ba8e-05f5391bcda8,J1ZfZcajnfOj6jaiLp55IJs9P6c=] */
