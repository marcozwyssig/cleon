package cleon.common.xml.spec.xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedXmlElement extends DynamicResource implements INamedXmlElement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedXmlElement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedXmlElement>() {
    
    @Override
    public INamedXmlElement create() {
      return new NamedXmlElement();
    }
    
    @Override
    public INamedXmlElement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedXmlElement(resourceRepository, resource);
    }
  
  };

  public NamedXmlElement() {
    super(INamedXmlElement.TYPE_ID);
  }
  
  public NamedXmlElement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedXmlElement.TYPE_ID);
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
  public java.util.List<? extends cleon.common.xml.spec.xml.javamodel.IXmlAttribute> selectNodes() {
    return _getList(cleon.common.xml.spec.xml.javamodel.IXmlAttribute.class, cleon.common.xml.spec.xml.XmlPackage.XmlElement_nodes);
  }

  public NamedXmlElement setNodes(java.util.List<? extends cleon.common.xml.spec.xml.javamodel.IXmlAttribute> nodes) {
    _setList(cleon.common.xml.spec.xml.XmlPackage.XmlElement_nodes, nodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedXmlElement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.xml.spec.xml.javamodel.IXmlAttribute.class, cleon.common.xml.spec.xml.XmlPackage.XmlElement_nodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9e9ff389-2a25-11e9-b49d-072e4afacfc7,7TXoHi6BHuVL6trULhZr0LT6jwQ=] */
