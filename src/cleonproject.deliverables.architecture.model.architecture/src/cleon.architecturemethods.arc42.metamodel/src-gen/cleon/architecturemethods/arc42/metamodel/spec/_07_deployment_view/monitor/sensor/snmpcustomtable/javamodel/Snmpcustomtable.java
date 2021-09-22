package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpcustomtable extends DynamicResource implements ISnmpcustomtable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomtable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomtable>() {
    
    @Override
    public ISnmpcustomtable create() {
      return new Snmpcustomtable();
    }
    
    @Override
    public ISnmpcustomtable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpcustomtable(resourceRepository, resource);
    }
  
  };

  public Snmpcustomtable() {
    super(ISnmpcustomtable.TYPE_ID);
  }
  
  public Snmpcustomtable(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpcustomtable.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectColumns_check() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_columns_aE_check);
  }
    
  public void setColumns_check(java.lang.String columns_check) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_columns_aE_check, columns_check);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectIdent() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_ident);
  }
    
  public void setIdent(java.lang.String ident) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_ident, ident);
  }

  @Override
  public java.lang.String selectIdentcolumn() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_identcolumn);
  }
    
  public void setIdentcolumn(java.lang.String identcolumn) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_identcolumn, identcolumn);
  }

  @Override
  public java.lang.Integer selectInterval_aE__aA_s_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_);
  }
    
  public void setInterval_aE__aA_s_aC_(java.lang.Integer interval_aE__aA_s_aC_) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, interval_aE__aA_s_aC_);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectPuppet_ignore() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_puppet_aE_ignore);
  }
    
  public void setPuppet_ignore(java.lang.Boolean puppet_ignore) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_puppet_aE_ignore, puppet_ignore);
  }

  @Override
  public java.lang.String selectPuppet_qp() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_puppet_aE_qp);
  }
    
  public void setPuppet_qp(java.lang.String puppet_qp) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_puppet_aE_qp, puppet_qp);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel> selectSnmpCustomTableChannels() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_snmpCustomTableChannels);
  }

  public Snmpcustomtable setSnmpCustomTableChannels(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel> snmpCustomTableChannels) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_snmpCustomTableChannels, snmpCustomTableChannels);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpcustomtable setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_columns_aE_check, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_ident, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_identcolumn, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_puppet_aE_ignore, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_puppet_aE_qp, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_snmpCustomTableChannels, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpcustomtable selectToMeSnmpCustomTableChannels(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpcustomtable.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.Snmpcustomtable_snmpCustomTableChannels, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b9480-c1eb-11ea-820f-9931558a898c,pBl5TO97je0OjFYRn+LIyRbY1O0=] */
