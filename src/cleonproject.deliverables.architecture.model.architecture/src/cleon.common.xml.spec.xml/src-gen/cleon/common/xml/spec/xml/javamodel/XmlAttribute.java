package cleon.common.xml.spec.xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class XmlAttribute extends DynamicResource implements IXmlAttribute {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IXmlAttribute> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IXmlAttribute>() {
    
    @Override
    public IXmlAttribute create() {
      return new XmlAttribute();
    }
    
    @Override
    public IXmlAttribute create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new XmlAttribute(resourceRepository, resource);
    }
  
  };

  public XmlAttribute() {
    super(IXmlAttribute.TYPE_ID);
  }
  
  public XmlAttribute(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IXmlAttribute.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.xml.spec.xml.javamodel.IXmlNode> selectNodes() {
    return _getList(cleon.common.xml.spec.xml.javamodel.IXmlNode.class, cleon.common.xml.spec.xml.XmlPackage.XmlAttribute_nodes);
  }

  public XmlAttribute setNodes(java.util.List<? extends cleon.common.xml.spec.xml.javamodel.IXmlNode> nodes) {
    _setList(cleon.common.xml.spec.xml.XmlPackage.XmlAttribute_nodes, nodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public XmlAttribute setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.xml.spec.xml.javamodel.IXmlAttribute selectToMeNodes(cleon.common.xml.spec.xml.javamodel.IXmlNode object) {
    return _getToMeSingle(object.getRepository(), cleon.common.xml.spec.xml.javamodel.IXmlAttribute.class, cleon.common.xml.spec.xml.XmlPackage.XmlAttribute_nodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ac013f5d-2a25-11e9-b49d-072e4afacfc7,g0+zW8t+gBvxUC1r25b7bY5e1C0=] */
