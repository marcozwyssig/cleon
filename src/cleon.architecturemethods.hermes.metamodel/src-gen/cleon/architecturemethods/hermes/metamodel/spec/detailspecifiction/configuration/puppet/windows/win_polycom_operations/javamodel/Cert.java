package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Cert extends DynamicResource implements ICert {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICert> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICert>() {
    
    @Override
    public ICert create() {
      return new Cert();
    }
    
    @Override
    public ICert create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Cert(resourceRepository, resource);
    }
  
  };

  public Cert() {
    super(ICert.TYPE_ID);
  }
  
  public Cert(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICert.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCer_location() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_cer_aE_location);
  }
    
  public void setCer_location(java.lang.String cer_location) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_cer_aE_location, cer_location);
  }

  @Override
  public java.lang.String selectInstall_store() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_install_aE_store);
  }
    
  public void setInstall_store(java.lang.String install_store) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_install_aE_store, install_store);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectStore_dir() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_store_aE_dir);
  }
    
  public void setStore_dir(java.lang.String store_dir) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_store_aE_dir, store_dir);
  }

  @Override
  public java.lang.String selectThumbprint() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_thumbprint);
  }
    
  public void setThumbprint(java.lang.String thumbprint) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_thumbprint, thumbprint);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Cert setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_cer_aE_location, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_install_aE_store, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_store_aE_dir, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.Cert_thumbprint, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8e07530b-4791-11f0-bcdd-31d38803078d,WqrdlkdBUBj6O2Na//sLDov51o8=] */
