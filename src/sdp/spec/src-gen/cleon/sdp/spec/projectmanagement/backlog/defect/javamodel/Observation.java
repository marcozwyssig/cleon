package cleon.sdp.spec.projectmanagement.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Observation extends DynamicResource implements IObservation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IObservation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IObservation>() {
    
    @Override
    public IObservation create() {
      return new Observation();
    }
    
    @Override
    public IObservation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Observation(resourceRepository, resource);
    }
  
  };

  public Observation() {
    super(IObservation.TYPE_ID);
  }
  
  public Observation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IObservation.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Observation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isA__F___N_reproduzierbar__O_()) return visitor.visitA__F___N_reproduzierbar__O_();
    if (isB__F___N_wiederholtes__F_Auftreten__O_()) return visitor.visitB__F___N_wiederholtes__F_Auftreten__O_();
    if (isC__F___N_seltenes__F_Auftreten__O_()) return visitor.visitC__F___N_seltenes__F_Auftreten__O_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isA__F___N_reproduzierbar__O_()) {
      visitor.visitA__F___N_reproduzierbar__O_();
      return;
    }
    if (isB__F___N_wiederholtes__F_Auftreten__O_()) {
      visitor.visitB__F___N_wiederholtes__F_Auftreten__O_();
      return;
    }
    if (isC__F___N_seltenes__F_Auftreten__O_()) {
      visitor.visitC__F___N_seltenes__F_Auftreten__O_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isA__F___N_reproduzierbar__O_() {
    return getResource().equals(cleon.sdp.spec.projectmanagement.backlog.defect.DefectPackage.Observation_A__F___N_reproduzierbar__O_);
  }
  
  @Override
  public boolean isB__F___N_wiederholtes__F_Auftreten__O_() {
    return getResource().equals(cleon.sdp.spec.projectmanagement.backlog.defect.DefectPackage.Observation_B__F___N_wiederholtes__F_Auftreten__O_);
  }
  
  @Override
  public boolean isC__F___N_seltenes__F_Auftreten__O_() {
    return getResource().equals(cleon.sdp.spec.projectmanagement.backlog.defect.DefectPackage.Observation_C__F___N_seltenes__F_Auftreten__O_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a6933d32-3765-11e5-95d9-2b04d7ab02d9,s5EM8v8sR50SgV/w4KpsrafkX10=] */
