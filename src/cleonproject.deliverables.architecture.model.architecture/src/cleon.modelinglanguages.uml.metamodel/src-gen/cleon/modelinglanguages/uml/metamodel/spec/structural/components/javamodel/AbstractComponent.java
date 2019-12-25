package cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractComponent extends DynamicResource implements IAbstractComponent {

  // abstract implementation, only used for static method calls
  private AbstractComponent() {
    super(IAbstractComponent.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectToMePorts_Out(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectToMePorts_In(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1090955f-85c1-11e3-be33-79789cf5eae3,6vohS0FbMGaBDPrmGEaYu/na4G4=] */
