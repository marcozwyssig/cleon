package cleon.common.resources.spec.resources.confidentiality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConfidentialityClassificationAware extends DynamicResource implements IConfidentialityClassificationAware {

  // abstract implementation, only used for static method calls
  private ConfidentialityClassificationAware() {
    super(IConfidentialityClassificationAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassificationAware> selectToMeConfidentialityClassification(cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassificationAware.class, cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ConfidentialityClassificationAware_confidentialityClassification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8368597-0b7b-11e9-8a28-597a9a8945ea,HjswkW8ZX6lwxw1lqTY92561hMs=] */
