package cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Participant extends DynamicResource implements IParticipant {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IParticipant> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IParticipant>() {
    
    @Override
    public IParticipant create() {
      return new Participant();
    }
    
    @Override
    public IParticipant create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Participant(resourceRepository, resource);
    }
  
  };

  public Participant() {
    super(IParticipant.TYPE_ID);
  }
  
  public Participant(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IParticipant.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectStereotype() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.Participant_stereotype);
  }
    
  public void setStereotype(java.lang.String stereotype) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.Participant_stereotype, stereotype);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IColor selectFillColor() {
    return _getSingle(ch.actifsource.core.javamodel.IColor.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.ColorAware_fillColor);
  }

  public Participant setFillColor(ch.actifsource.core.javamodel.IColor fillColor) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.ColorAware_fillColor, fillColor);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Participant setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.Participant_stereotype, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IColor.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.ColorAware_fillColor, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,974de17b-de53-11ef-81c7-3391f050addb,FJVyc+ZMeIwdkWljjHq1lfALmVQ=] */
