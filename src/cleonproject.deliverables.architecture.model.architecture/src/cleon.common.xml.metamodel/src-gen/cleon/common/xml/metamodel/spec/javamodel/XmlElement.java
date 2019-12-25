package cleon.common.xml.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmlElement extends DynamicResource implements IXmlElement {

  // abstract implementation, only used for static method calls
  private XmlElement() {
    super(IXmlElement.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.xml.metamodel.spec.javamodel.IXmlElement selectToMeNodes(cleon.common.xml.metamodel.spec.javamodel.IXmlAttribute object) {
    return _getToMeSingle(object.getRepository(), cleon.common.xml.metamodel.spec.javamodel.IXmlElement.class, cleon.common.xml.metamodel.spec.SpecPackage.XmlElement_nodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7bdfed35-2a25-11e9-b49d-072e4afacfc7,P27C3PWGVRwTllYt1fKc2QCd/0U=] */
