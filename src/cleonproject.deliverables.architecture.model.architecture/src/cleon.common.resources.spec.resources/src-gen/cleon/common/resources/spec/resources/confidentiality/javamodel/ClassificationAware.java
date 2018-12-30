package cleon.common.resources.spec.resources.confidentiality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ClassificationAware extends DynamicResource implements IClassificationAware {

  // abstract implementation, only used for static method calls
  private ClassificationAware() {
    super(IClassificationAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.resources.spec.resources.confidentiality.javamodel.IClassificationAware> selectToMeClassification(cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.spec.resources.confidentiality.javamodel.IClassificationAware.class, cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ClassificationAware_classification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3506d11a-0b7c-11e9-8a28-597a9a8945ea,W3+zCCOnZ0dilXiPHJpPqhKdlF0=] */
