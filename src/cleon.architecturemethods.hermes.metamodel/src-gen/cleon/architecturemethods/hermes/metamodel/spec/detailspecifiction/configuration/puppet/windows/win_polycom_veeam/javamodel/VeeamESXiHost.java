package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VeeamESXiHost extends DynamicResource implements IVeeamESXiHost {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamESXiHost> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamESXiHost>() {
    
    @Override
    public IVeeamESXiHost create() {
      return new VeeamESXiHost();
    }
    
    @Override
    public IVeeamESXiHost create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VeeamESXiHost(resourceRepository, resource);
    }
  
  };

  public VeeamESXiHost() {
    super(IVeeamESXiHost.TYPE_ID);
  }
  
  public VeeamESXiHost(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVeeamESXiHost.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public VeeamESXiHost setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VeeamESXiHost setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser selectVeeamMasterUser() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_veeamMasterUser);
  }

  public VeeamESXiHost setVeeamMasterUser(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser veeamMasterUser) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_veeamMasterUser, veeamMasterUser);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectVmhHost() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_vmhHost);
  }

  public VeeamESXiHost setVmhHost(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost vmhHost) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_vmhHost, vmhHost);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_veeamMasterUser, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_vmhHost, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost> selectToMeVmhHost(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_vmhHost, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost> selectToMeVeeamMasterUser(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamESXiHost_veeamMasterUser, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53453086-4867-11f0-ab73-2116b4504ace,Ucaha03zupgc9wwnkI3a/fbyx+4=] */
