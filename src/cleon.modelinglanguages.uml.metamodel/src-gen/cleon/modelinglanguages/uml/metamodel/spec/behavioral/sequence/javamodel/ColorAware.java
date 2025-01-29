package cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ColorAware extends DynamicResource implements IColorAware {

  // abstract implementation, only used for static method calls
  private ColorAware() {
    super(IColorAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IColorAware> selectToMeFillColor(ch.actifsource.core.javamodel.IColor object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IColorAware.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.ColorAware_fillColor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a9b3eec5-de56-11ef-81c7-3391f050addb,PbCh6OaSfj3YpyRkAYRMijio2GE=] */
