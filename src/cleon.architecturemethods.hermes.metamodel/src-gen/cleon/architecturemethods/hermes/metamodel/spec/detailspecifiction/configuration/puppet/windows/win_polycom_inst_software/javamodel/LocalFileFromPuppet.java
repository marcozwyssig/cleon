package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LocalFileFromPuppet extends DynamicResource implements ILocalFileFromPuppet {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocalFileFromPuppet> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocalFileFromPuppet>() {
    
    @Override
    public ILocalFileFromPuppet create() {
      return new LocalFileFromPuppet();
    }
    
    @Override
    public ILocalFileFromPuppet create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LocalFileFromPuppet(resourceRepository, resource);
    }
  
  };

  public LocalFileFromPuppet() {
    super(ILocalFileFromPuppet.TYPE_ID);
  }
  
  public LocalFileFromPuppet(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILocalFileFromPuppet.TYPE_ID);
  }

  // attributes
  
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

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LocalFileFromPuppet setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_source, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.AbstractCopyFile_target, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bced6e66-1b6c-11f0-9c3a-8502b2fb88fb,tr4V1Jd1dYCBBJIbiG1X53oOSsc=] */
