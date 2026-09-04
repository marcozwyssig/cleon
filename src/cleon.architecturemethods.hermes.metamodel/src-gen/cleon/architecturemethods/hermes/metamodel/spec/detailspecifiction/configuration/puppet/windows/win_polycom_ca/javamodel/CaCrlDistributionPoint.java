package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CaCrlDistributionPoint extends DynamicResource implements ICaCrlDistributionPoint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaCrlDistributionPoint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaCrlDistributionPoint>() {
    
    @Override
    public ICaCrlDistributionPoint create() {
      return new CaCrlDistributionPoint();
    }
    
    @Override
    public ICaCrlDistributionPoint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CaCrlDistributionPoint(resourceRepository, resource);
    }
  
  };

  public CaCrlDistributionPoint() {
    super(ICaCrlDistributionPoint.TYPE_ID);
  }
  
  public CaCrlDistributionPoint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICaCrlDistributionPoint.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAddToCertificateCdp() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCertificateCdp);
  }
    
  public void setAddToCertificateCdp(java.lang.Boolean addToCertificateCdp) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCertificateCdp, addToCertificateCdp);
  }

  @Override
  public java.lang.Boolean selectAddToCrlCdp() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCrlCdp);
  }
    
  public void setAddToCrlCdp(java.lang.Boolean addToCrlCdp) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCrlCdp, addToCrlCdp);
  }

  @Override
  public java.lang.Boolean selectAddToCrlIdp() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCrlIdp);
  }
    
  public void setAddToCrlIdp(java.lang.Boolean addToCrlIdp) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCrlIdp, addToCrlIdp);
  }

  @Override
  public java.lang.Boolean selectAddToFreshestCrl() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToFreshestCrl);
  }
    
  public void setAddToFreshestCrl(java.lang.Boolean addToFreshestCrl) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToFreshestCrl, addToFreshestCrl);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectPublishDeltaToServer() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_publishDeltaToServer);
  }
    
  public void setPublishDeltaToServer(java.lang.Boolean publishDeltaToServer) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_publishDeltaToServer, publishDeltaToServer);
  }

  @Override
  public java.lang.Boolean selectPublishToServer() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_publishToServer);
  }
    
  public void setPublishToServer(java.lang.Boolean publishToServer) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_publishToServer, publishToServer);
  }

  @Override
  public java.lang.String selectUri() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_uri);
  }
    
  public void setUri(java.lang.String uri) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_uri, uri);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CaCrlDistributionPoint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCertificateCdp, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCrlCdp, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToCrlIdp, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_addToFreshestCrl, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_publishDeltaToServer, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_publishToServer, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaCrlDistributionPoint_uri, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,18637d1f-0fd1-11f0-999f-c7e64e984aff,sIo1KKlJINO2Eh04A9eFy431LYw=] */
