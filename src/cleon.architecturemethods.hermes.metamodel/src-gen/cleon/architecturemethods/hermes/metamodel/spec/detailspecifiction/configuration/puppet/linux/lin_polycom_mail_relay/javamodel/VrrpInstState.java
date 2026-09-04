package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VrrpInstState extends DynamicResource implements IVrrpInstState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVrrpInstState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVrrpInstState>() {
    
    @Override
    public IVrrpInstState create() {
      return new VrrpInstState();
    }
    
    @Override
    public IVrrpInstState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VrrpInstState(resourceRepository, resource);
    }
  
  };

  public VrrpInstState() {
    super(IVrrpInstState.TYPE_ID);
  }
  
  public VrrpInstState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVrrpInstState.TYPE_ID);
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
  public java.lang.Integer selectPrio() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.Lin_polycom_mail_relayPackage.VrrpInstState_prio);
  }
    
  public void setPrio(java.lang.Integer prio) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.Lin_polycom_mail_relayPackage.VrrpInstState_prio, prio);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VrrpInstState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.Lin_polycom_mail_relayPackage.VrrpInstState_prio, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isMaster()) return visitor.visitMaster();
    if (isBackup()) return visitor.visitBackup();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isMaster()) {
      visitor.visitMaster();
      return;
    }
    if (isBackup()) {
      visitor.visitBackup();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isMaster() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.Lin_polycom_mail_relayPackage.VrrpInstState_Master);
  }
  
  @Override
  public boolean isBackup() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.Lin_polycom_mail_relayPackage.VrrpInstState_Backup);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d7c84576-57ec-11f0-b941-05f03c57551d,SVUTPNcBlO7TDVawM2QzNdSYllM=] */
