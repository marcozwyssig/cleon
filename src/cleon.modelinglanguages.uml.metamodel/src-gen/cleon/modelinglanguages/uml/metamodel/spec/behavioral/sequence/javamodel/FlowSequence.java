package cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FlowSequence extends DynamicResource implements IFlowSequence {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFlowSequence> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFlowSequence>() {
    
    @Override
    public IFlowSequence create() {
      return new FlowSequence();
    }
    
    @Override
    public IFlowSequence create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FlowSequence(resourceRepository, resource);
    }
  
  };

  public FlowSequence() {
    super(IFlowSequence.TYPE_ID);
  }
  
  public FlowSequence(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFlowSequence.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IColor selectFillColor() {
    return _getSingle(ch.actifsource.core.javamodel.IColor.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.ColorAware_fillColor);
  }

  public FlowSequence setFillColor(ch.actifsource.core.javamodel.IColor fillColor) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.ColorAware_fillColor, fillColor);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant selectFrom() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_from);
  }

  public FlowSequence setFrom(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant from) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_from, from);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant selectTo() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_to);
  }

  public FlowSequence setTo(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant to) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FlowSequence setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IColor.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.ColorAware_fillColor, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_from, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IFlowSequence> selectToMeFrom(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IFlowSequence.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_from, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IFlowSequence> selectToMeTo(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IFlowSequence.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.FlowSequence_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f054a44c-de55-11ef-81c7-3391f050addb,e1rPvEhlStEHa7q0mcmovT8FUo8=] */
