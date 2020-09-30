package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GMSA_Account extends DynamicResource implements IGMSA_Account {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGMSA_Account> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGMSA_Account>() {
    
    @Override
    public IGMSA_Account create() {
      return new GMSA_Account();
    }
    
    @Override
    public IGMSA_Account create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GMSA_Account(resourceRepository, resource);
    }
  
  };

  public GMSA_Account() {
    super(IGMSA_Account.TYPE_ID);
  }
  
  public GMSA_Account(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGMSA_Account.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> selectActivitiesForAccount() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_activitiesForAccount);
  }

  public GMSA_Account setActivitiesForAccount(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> activitiesForAccount) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_activitiesForAccount, activitiesForAccount);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole> selectBuiltinRoles() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_builtinRoles);
  }

  public GMSA_Account setBuiltinRoles(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole> builtinRoles) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_builtinRoles, builtinRoles);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectSystemConfigurationForActivity() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_systemConfigurationForActivity);
  }

  public GMSA_Account setSystemConfigurationForActivity(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfigurationForActivity) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_systemConfigurationForActivity, systemConfigurationForActivity);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public GMSA_Account setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GMSA_Account setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_activitiesForAccount, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_builtinRoles, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.Account_systemConfigurationForActivity, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,06ea6eda-f333-11ea-9268-b5c52a12d7f9,38BVbQXwz9wFl4wbXkhY+Jv4bjQ=] */
