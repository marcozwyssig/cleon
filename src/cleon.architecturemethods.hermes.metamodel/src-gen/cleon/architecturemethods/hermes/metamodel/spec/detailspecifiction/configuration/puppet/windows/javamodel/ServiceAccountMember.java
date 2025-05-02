package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceAccountMember extends DynamicResource implements IServiceAccountMember {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountMember> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountMember>() {
    
    @Override
    public IServiceAccountMember create() {
      return new ServiceAccountMember();
    }
    
    @Override
    public IServiceAccountMember create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceAccountMember(resourceRepository, resource);
    }
  
  };

  public ServiceAccountMember() {
    super(IServiceAccountMember.TYPE_ID);
  }
  
  public ServiceAccountMember(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceAccountMember.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectLogonAs() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.ServiceAccountMember_logonAs);
  }
    
  public void setLogonAs(java.lang.String logonAs) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.ServiceAccountMember_logonAs, logonAs);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount selectServiceAccount() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.ServiceAccountMember_serviceAccount);
  }

  public ServiceAccountMember setServiceAccount(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.ServiceAccountMember_serviceAccount, serviceAccount);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceAccountMember setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.ServiceAccountMember_logonAs, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.ServiceAccountMember_serviceAccount, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IServiceAccountMember> selectToMeServiceAccount(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IServiceAccountMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.ServiceAccountMember_serviceAccount, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,707d30a3-21c2-11f0-83ae-df5418a109a4,98FyGaeu+Vdulju/NHS8zph+0mw=] */
