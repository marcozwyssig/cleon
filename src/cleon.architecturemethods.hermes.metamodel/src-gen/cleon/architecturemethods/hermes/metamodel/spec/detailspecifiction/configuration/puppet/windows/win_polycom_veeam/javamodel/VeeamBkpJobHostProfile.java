package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VeeamBkpJobHostProfile extends DynamicResource implements IVeeamBkpJobHostProfile {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamBkpJobHostProfile> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamBkpJobHostProfile>() {
    
    @Override
    public IVeeamBkpJobHostProfile create() {
      return new VeeamBkpJobHostProfile();
    }
    
    @Override
    public IVeeamBkpJobHostProfile create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VeeamBkpJobHostProfile(resourceRepository, resource);
    }
  
  };

  public VeeamBkpJobHostProfile() {
    super(IVeeamBkpJobHostProfile.TYPE_ID);
  }
  
  public VeeamBkpJobHostProfile(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVeeamBkpJobHostProfile.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAdIntegrated() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobHostProfile_adIntegrated);
  }
    
  public void setAdIntegrated(java.lang.Boolean adIntegrated) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobHostProfile_adIntegrated, adIntegrated);
  }

  @Override
  public java.util.List<java.lang.String> selectIncludedDisks() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobHostProfile_includedDisks);
  }
    
  public void setIncludedDisks(java.util.List<java.lang.String> includedDisks) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobHostProfile_includedDisks, includedDisks);
  }

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

  public VeeamBkpJobHostProfile setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobHostProfile_adIntegrated, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobHostProfile_includedDisks, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7a5a8f18-4864-11f0-ab73-2116b4504ace,zJc90Zyobm/vPeFkdE3/WFkQ0HM=] */
