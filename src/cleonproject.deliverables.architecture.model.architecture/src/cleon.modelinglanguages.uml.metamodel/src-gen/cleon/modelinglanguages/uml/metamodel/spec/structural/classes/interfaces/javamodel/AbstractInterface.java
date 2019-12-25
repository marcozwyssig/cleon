package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractInterface extends DynamicResource implements IAbstractInterface {

  // abstract implementation, only used for static method calls
  private AbstractInterface() {
    super(IAbstractInterface.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IAbstractInterface> selectToMeData(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterfaceData object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IAbstractInterface.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.InterfacesPackage.AbstractInterface_data, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b626174f-26c1-11e3-a71a-b71d2dda9f8e,Bj2J93nqaP/kcMyOBLhXj5KoYko=] */
