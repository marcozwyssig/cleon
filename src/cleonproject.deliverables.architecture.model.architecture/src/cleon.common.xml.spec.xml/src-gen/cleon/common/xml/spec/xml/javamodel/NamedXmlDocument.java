package cleon.common.xml.spec.xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedXmlDocument extends DynamicResource implements INamedXmlDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedXmlDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedXmlDocument>() {
    
    @Override
    public INamedXmlDocument create() {
      return new NamedXmlDocument();
    }
    
    @Override
    public INamedXmlDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedXmlDocument(resourceRepository, resource);
    }
  
  };

  public NamedXmlDocument() {
    super(INamedXmlDocument.TYPE_ID);
  }
  
  public NamedXmlDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedXmlDocument.TYPE_ID);
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
  public java.util.List<? extends cleon.common.xml.spec.xml.javamodel.IXmlElement> selectNodes() {
    return _getList(cleon.common.xml.spec.xml.javamodel.IXmlElement.class, cleon.common.xml.spec.xml.XmlPackage.XmlDocument_nodes);
  }

  public NamedXmlDocument setNodes(java.util.List<? extends cleon.common.xml.spec.xml.javamodel.IXmlElement> nodes) {
    _setList(cleon.common.xml.spec.xml.XmlPackage.XmlDocument_nodes, nodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedXmlDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.xml.spec.xml.javamodel.IXmlElement.class, cleon.common.xml.spec.xml.XmlPackage.XmlDocument_nodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8c6de6b3-2a25-11e9-b49d-072e4afacfc7,H+08yUTEI5PH0DRPirga03Rtv9A=] */
