package cleon.common.xml.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmlNode extends DynamicResource implements IXmlNode {

  // abstract implementation, only used for static method calls
  private XmlNode() {
    super(IXmlNode.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.xml.metamodel.spec.javamodel.IXmlNode selectToMeNodes(cleon.common.xml.metamodel.spec.javamodel.IXmlNode object) {
    return _getToMeSingle(object.getRepository(), cleon.common.xml.metamodel.spec.javamodel.IXmlNode.class, cleon.common.xml.metamodel.spec.SpecPackage.XmlNode_nodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6db97d0d-2a25-11e9-b49d-072e4afacfc7,ezlXjEUOWnRtsotzq1P8J6kw0yY=] */
