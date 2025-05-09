package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LocalFileFromNetwork extends DynamicResource implements ILocalFileFromNetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocalFileFromNetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocalFileFromNetwork>() {
    
    @Override
    public ILocalFileFromNetwork create() {
      return new LocalFileFromNetwork();
    }
    
    @Override
    public ILocalFileFromNetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LocalFileFromNetwork(resourceRepository, resource);
    }
  
  };

  public LocalFileFromNetwork() {
    super(ILocalFileFromNetwork.TYPE_ID);
  }
  
  public LocalFileFromNetwork(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILocalFileFromNetwork.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectEnsure() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_ensure);
  }
    
  public void setEnsure(java.lang.String ensure) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_ensure, ensure);
  }

  @Override
  public java.lang.String selectFullPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_fullPath);
  }
    
  public void setFullPath(java.lang.String fullPath) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_fullPath, fullPath);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectSource() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_source);
  }
    
  public void setSource(java.lang.String source) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_source, source);
  }

  @Override
  public java.lang.String selectTarget() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_target);
  }
    
  public void setTarget(java.lang.String target) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_target, target);
  }

  @Override
  public java.lang.String selectTargetEnv() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_targetEnv);
  }
    
  public void setTargetEnv(java.lang.String targetEnv) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_targetEnv, targetEnv);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LocalFileFromNetwork setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_ensure, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_fullPath, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_source, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_target, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.LocalFileFromNetwork_targetEnv, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f662a0ff-1b5e-11f0-9c3a-8502b2fb88fb,KtXnbMqsDduV8wnE7kbCXvRIchI=] */
