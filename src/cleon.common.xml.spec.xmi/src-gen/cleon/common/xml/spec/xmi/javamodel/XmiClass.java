package cleon.common.xml.spec.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmiClass extends DynamicResource implements IXmiClass {

  // abstract implementation, only used for static method calls
  private XmiClass() {
    super(IXmiClass.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,305770aa-6c80-11e7-acfe-cd993eb63ee2,sU+oXbYbsxOVTMKJ8J+YTAIEEYg=] */
