package cleon.modelinglanguages.uml.template.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmiAggregation extends DynamicResource implements IXmiAggregation {

  // abstract implementation, only used for static method calls
  private XmiAggregation() {
    super(IXmiAggregation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiAggregation selectToMeAggregates(cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiAggregation.class, cleon.modelinglanguages.uml.template.xmi.XmiPackage.XmiAggregation_aggregates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a54a5c70-6c8a-11e7-acfe-cd993eb63ee2,1z7QPabZs/rd7eMC4n/LhGGfzhc=] */
