package cleon.common.xml.spec.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmiAggregation extends DynamicResource implements IXmiAggregation {

  // abstract implementation, only used for static method calls
  private XmiAggregation() {
    super(IXmiAggregation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.xml.spec.xmi.javamodel.IXmiAggregation selectToMeAggregates(cleon.common.xml.spec.xmi.javamodel.IXmiClass object) {
    return _getToMeSingle(object.getRepository(), cleon.common.xml.spec.xmi.javamodel.IXmiAggregation.class, cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a54a5c70-6c8a-11e7-acfe-cd993eb63ee2,LFV3xrW+tE+m0+g28ub7QL4exKM=] */
