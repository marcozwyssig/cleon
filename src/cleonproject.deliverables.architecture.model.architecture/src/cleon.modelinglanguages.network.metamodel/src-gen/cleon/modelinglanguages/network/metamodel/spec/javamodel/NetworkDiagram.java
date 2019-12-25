package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetworkDiagram extends DynamicResource implements INetworkDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkDiagram>() {
    
    @Override
    public INetworkDiagram create() {
      return new NetworkDiagram();
    }
    
    @Override
    public INetworkDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetworkDiagram(resourceRepository, resource);
    }
  
  };

  public NetworkDiagram() {
    super(INetworkDiagram.TYPE_ID);
  }
  
  public NetworkDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworkDiagram.TYPE_ID);
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
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.NetworkDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.NetworkDiagram_path, path);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public NetworkDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworks selectNetwork() {
    return _getSingle(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworks.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.NetworkDiagram_network);
  }

  public NetworkDiagram setNetwork(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworks network) {
    _setSingle(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.NetworkDiagram_network, network);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetworkDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.NetworkDiagram_path, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworks.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.NetworkDiagram_network, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkDiagram> selectToMeNetwork(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworks object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkDiagram.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.NetworkDiagram_network, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a6f94ec5-092f-11e9-8c40-11db3668c0c9,ECRDFWNApQ03IbY/34Wd2saNkRY=] */
