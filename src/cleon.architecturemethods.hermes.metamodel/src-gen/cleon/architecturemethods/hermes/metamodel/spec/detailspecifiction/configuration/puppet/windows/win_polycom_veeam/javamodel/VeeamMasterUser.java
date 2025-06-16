package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VeeamMasterUser extends DynamicResource implements IVeeamMasterUser {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamMasterUser> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamMasterUser>() {
    
    @Override
    public IVeeamMasterUser create() {
      return new VeeamMasterUser();
    }
    
    @Override
    public IVeeamMasterUser create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VeeamMasterUser(resourceRepository, resource);
    }
  
  };

  public VeeamMasterUser() {
    super(IVeeamMasterUser.TYPE_ID);
  }
  
  public VeeamMasterUser(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVeeamMasterUser.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VeeamMasterUser setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectVeeamESXiUsername() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamMasterUser_veeamESXiUsername);
  }

  public VeeamMasterUser setVeeamESXiUsername(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount veeamESXiUsername) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamMasterUser_veeamESXiUsername, veeamESXiUsername);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamMasterUser_veeamESXiUsername, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser> selectToMeVeeamESXiUsername(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamMasterUser_veeamESXiUsername, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,559b0bbf-4860-11f0-ab73-2116b4504ace,lqs4a30SM22Jf3DEVC6JX92wFMU=] */
