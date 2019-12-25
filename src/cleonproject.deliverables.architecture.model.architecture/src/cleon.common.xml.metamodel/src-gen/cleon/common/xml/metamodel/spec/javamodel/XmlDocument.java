package cleon.common.xml.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmlDocument extends DynamicResource implements IXmlDocument {

  // abstract implementation, only used for static method calls
  private XmlDocument() {
    super(IXmlDocument.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.xml.metamodel.spec.javamodel.IXmlDocument selectToMeNodes(cleon.common.xml.metamodel.spec.javamodel.IXmlElement object) {
    return _getToMeSingle(object.getRepository(), cleon.common.xml.metamodel.spec.javamodel.IXmlDocument.class, cleon.common.xml.metamodel.spec.SpecPackage.XmlDocument_nodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0324f207-2a25-11e9-b49d-072e4afacfc7,Azyh1eD4Ag8/PNX22mvX/3iNFng=] */
