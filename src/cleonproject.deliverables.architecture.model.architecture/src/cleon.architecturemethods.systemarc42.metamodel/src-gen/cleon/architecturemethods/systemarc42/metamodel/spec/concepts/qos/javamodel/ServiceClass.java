package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceClass extends DynamicResource implements IServiceClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceClass>() {
    
    @Override
    public IServiceClass create() {
      return new ServiceClass();
    }
    
    @Override
    public IServiceClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceClass(resourceRepository, resource);
    }
  
  };

  public ServiceClass() {
    super(IServiceClass.TYPE_ID);
  }
  
  public ServiceClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectDSCP() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_DSCP);
  }
    
  public void setDSCP(java.lang.Integer dSCP) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_DSCP, dSCP);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

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

  public ServiceClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_DSCP, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isAF11__F___S___F_High__F_Throughput__F_Data()) return visitor.visitAF11__F___S___F_High__F_Throughput__F_Data();
    if (isAF21__F___S___F_Low__F_Latency__F_Data()) return visitor.visitAF21__F___S___F_Low__F_Latency__F_Data();
    if (isAF31__F___S___F_Multimedia__F_Streaming()) return visitor.visitAF31__F___S___F_Multimedia__F_Streaming();
    if (isAF41__F___S___F_Multimedia__F_Conferencing()) return visitor.visitAF41__F___S___F_Multimedia__F_Conferencing();
    if (isCS1__F___S___F_Low__S_Priority__F_Data()) return visitor.visitCS1__F___S___F_Low__S_Priority__F_Data();
    if (isCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_()) return visitor.visitCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_();
    if (isCS3__F___S___F_Broadcast__F_Video()) return visitor.visitCS3__F___S___F_Broadcast__F_Video();
    if (isCS4__F___S___F_Real__F_time__F_Interactive()) return visitor.visitCS4__F___S___F_Real__F_time__F_Interactive();
    if (isCS5__F___S___F_Signalling()) return visitor.visitCS5__F___S___F_Signalling();
    if (isCS6__F___S___F_Network__F_Control__F___N_Access__O_()) return visitor.visitCS6__F___S___F_Network__F_Control__F___N_Access__O_();
    if (isCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_()) return visitor.visitCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_();
    if (isDF__F___S___F_Standard()) return visitor.visitDF__F___S___F_Standard();
    if (isEF__F___S___F_Telephony()) return visitor.visitEF__F___S___F_Telephony();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isAF11__F___S___F_High__F_Throughput__F_Data()) {
      visitor.visitAF11__F___S___F_High__F_Throughput__F_Data();
      return;
    }
    if (isAF21__F___S___F_Low__F_Latency__F_Data()) {
      visitor.visitAF21__F___S___F_Low__F_Latency__F_Data();
      return;
    }
    if (isAF31__F___S___F_Multimedia__F_Streaming()) {
      visitor.visitAF31__F___S___F_Multimedia__F_Streaming();
      return;
    }
    if (isAF41__F___S___F_Multimedia__F_Conferencing()) {
      visitor.visitAF41__F___S___F_Multimedia__F_Conferencing();
      return;
    }
    if (isCS1__F___S___F_Low__S_Priority__F_Data()) {
      visitor.visitCS1__F___S___F_Low__S_Priority__F_Data();
      return;
    }
    if (isCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_()) {
      visitor.visitCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_();
      return;
    }
    if (isCS3__F___S___F_Broadcast__F_Video()) {
      visitor.visitCS3__F___S___F_Broadcast__F_Video();
      return;
    }
    if (isCS4__F___S___F_Real__F_time__F_Interactive()) {
      visitor.visitCS4__F___S___F_Real__F_time__F_Interactive();
      return;
    }
    if (isCS5__F___S___F_Signalling()) {
      visitor.visitCS5__F___S___F_Signalling();
      return;
    }
    if (isCS6__F___S___F_Network__F_Control__F___N_Access__O_()) {
      visitor.visitCS6__F___S___F_Network__F_Control__F___N_Access__O_();
      return;
    }
    if (isCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_()) {
      visitor.visitCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_();
      return;
    }
    if (isDF__F___S___F_Standard()) {
      visitor.visitDF__F___S___F_Standard();
      return;
    }
    if (isEF__F___S___F_Telephony()) {
      visitor.visitEF__F___S___F_Telephony();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isAF11__F___S___F_High__F_Throughput__F_Data() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_AF11__F___S___F_High__F_Throughput__F_Data);
  }
  
  @Override
  public boolean isAF21__F___S___F_Low__F_Latency__F_Data() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_AF21__F___S___F_Low__F_Latency__F_Data);
  }
  
  @Override
  public boolean isAF31__F___S___F_Multimedia__F_Streaming() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_AF31__F___S___F_Multimedia__F_Streaming);
  }
  
  @Override
  public boolean isAF41__F___S___F_Multimedia__F_Conferencing() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_AF41__F___S___F_Multimedia__F_Conferencing);
  }
  
  @Override
  public boolean isCS1__F___S___F_Low__S_Priority__F_Data() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_CS1__F___S___F_Low__S_Priority__F_Data);
  }
  
  @Override
  public boolean isCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_CS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_);
  }
  
  @Override
  public boolean isCS3__F___S___F_Broadcast__F_Video() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_CS3__F___S___F_Broadcast__F_Video);
  }
  
  @Override
  public boolean isCS4__F___S___F_Real__F_time__F_Interactive() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_CS4__F___S___F_Real__F_time__F_Interactive);
  }
  
  @Override
  public boolean isCS5__F___S___F_Signalling() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_CS5__F___S___F_Signalling);
  }
  
  @Override
  public boolean isCS6__F___S___F_Network__F_Control__F___N_Access__O_() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_CS6__F___S___F_Network__F_Control__F___N_Access__O_);
  }
  
  @Override
  public boolean isCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_CS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_);
  }
  
  @Override
  public boolean isDF__F___S___F_Standard() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_DF__F___S___F_Standard);
  }
  
  @Override
  public boolean isEF__F___S___F_Telephony() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.QosPackage.ServiceClass_EF__F___S___F_Telephony);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,af43badb-1d88-11e9-b601-db75aa6f89a4,pDxgYHGj7SV+2eN3sj3hQkC5DGg=] */
