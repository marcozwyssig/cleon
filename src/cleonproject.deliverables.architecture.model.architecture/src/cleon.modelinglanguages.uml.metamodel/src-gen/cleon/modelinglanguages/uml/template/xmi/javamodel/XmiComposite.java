package cleon.modelinglanguages.uml.template.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class XmiComposite extends DynamicResource implements IXmiComposite {

  // abstract implementation, only used for static method calls
  private XmiComposite() {
    super(IXmiComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiComposite selectToMeComposites(cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiComposite.class, cleon.modelinglanguages.uml.template.xmi.XmiPackage.XmiComposite_composites, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e77f7342-6c8c-11e7-8bc1-2fb13127901b,RKt3I2imvNx8il2dIEFxBj+iCDg=] */
