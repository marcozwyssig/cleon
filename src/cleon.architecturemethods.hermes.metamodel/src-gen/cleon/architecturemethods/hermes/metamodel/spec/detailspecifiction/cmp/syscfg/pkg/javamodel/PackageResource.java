package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackageResource extends DynamicResource implements IPackageResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageResource>() {
    
    @Override
    public IPackageResource create() {
      return new PackageResource();
    }
    
    @Override
    public IPackageResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackageResource(resourceRepository, resource);
    }
  
  };

  public PackageResource() {
    super(IPackageResource.TYPE_ID);
  }
  
  public PackageResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackageResource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectOptions() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_options);
  }
    
  public void setOptions(java.lang.String options) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_options, options);
  }

  @Override
  public java.lang.String selectSource() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_source);
  }
    
  public void setSource(java.lang.String source) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_source, source);
  }

  @Override
  public java.lang.String selectTitle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title);
  }
    
  public void setTitle(java.lang.String title) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, title);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState selectEnsure() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_ensure);
  }

  public PackageResource setEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState ensure) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_ensure, ensure);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackageResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_options, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_source, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_ensure, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.javamodel.IPackageResource> selectToMeEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.javamodel.IPackageResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.PkgPackage.PackageResource_ensure, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,07e7a2ec-ef3b-11e8-be8a-b748ff8f0a75,2unvKmwtB16Q8h5KSPSdB3+eLVg=] */
