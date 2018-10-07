package cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StateInheritance extends DynamicResource implements IStateInheritance {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateInheritance> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateInheritance>() {
    
    @Override
    public IStateInheritance create() {
      return new StateInheritance();
    }
    
    @Override
    public IStateInheritance create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StateInheritance(resourceRepository, resource);
    }
  
  };

  public StateInheritance() {
    super(IStateInheritance.TYPE_ID);
  }
  
  public StateInheritance(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStateInheritance.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState selectFrom() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateInheritance_from);
  }

  public StateInheritance setFrom(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState from) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateInheritance_from, from);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StateInheritance setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateInheritance_from, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateInheritance> selectToMeFrom(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateInheritance.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateInheritance_from, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2286a3f1-39ae-11e5-ae84-4f300f079f41,1IxAJr7oztAalk164DWdw/YUkAM=] */
