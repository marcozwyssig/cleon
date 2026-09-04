package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CaAuthorityInformationAccess extends DynamicResource implements ICaAuthorityInformationAccess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaAuthorityInformationAccess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaAuthorityInformationAccess>() {
    
    @Override
    public ICaAuthorityInformationAccess create() {
      return new CaAuthorityInformationAccess();
    }
    
    @Override
    public ICaAuthorityInformationAccess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CaAuthorityInformationAccess(resourceRepository, resource);
    }
  
  };

  public CaAuthorityInformationAccess() {
    super(ICaAuthorityInformationAccess.TYPE_ID);
  }
  
  public CaAuthorityInformationAccess(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICaAuthorityInformationAccess.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAddToCertificateAia() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_addToCertificateAia);
  }
    
  public void setAddToCertificateAia(java.lang.Boolean addToCertificateAia) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_addToCertificateAia, addToCertificateAia);
  }

  @Override
  public java.lang.Boolean selectAddToCertificateOcsp() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_addToCertificateOcsp);
  }
    
  public void setAddToCertificateOcsp(java.lang.Boolean addToCertificateOcsp) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_addToCertificateOcsp, addToCertificateOcsp);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectUri() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_uri);
  }
    
  public void setUri(java.lang.String uri) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_uri, uri);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CaAuthorityInformationAccess setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_addToCertificateAia, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_addToCertificateOcsp, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaAuthorityInformationAccess_uri, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,74a901ea-0fd1-11f0-999f-c7e64e984aff,lEe0Avtjr+GpX8s3d3j7Lx719VA=] */
