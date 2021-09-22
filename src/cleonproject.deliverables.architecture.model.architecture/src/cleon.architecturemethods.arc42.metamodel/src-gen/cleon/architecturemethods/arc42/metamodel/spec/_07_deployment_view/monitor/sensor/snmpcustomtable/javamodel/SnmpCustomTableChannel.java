package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SnmpCustomTableChannel extends DynamicResource implements ISnmpCustomTableChannel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpCustomTableChannel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpCustomTableChannel>() {
    
    @Override
    public ISnmpCustomTableChannel create() {
      return new SnmpCustomTableChannel();
    }
    
    @Override
    public ISnmpCustomTableChannel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SnmpCustomTableChannel(resourceRepository, resource);
    }
  
  };

  public SnmpCustomTableChannel() {
    super(ISnmpCustomTableChannel.TYPE_ID);
  }
  
  public SnmpCustomTableChannel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpCustomTableChannel.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectColumn() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_column);
  }
    
  public void setColumn(java.lang.String column) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_column, column);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectSnmptype() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_snmptype);
  }
    
  public void setSnmptype(java.lang.String snmptype) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_snmptype, snmptype);
  }

  @Override
  public java.lang.String selectUnit() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_unit);
  }
    
  public void setUnit(java.lang.String unit) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_unit, unit);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SnmpCustomTableChannel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_column, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_snmptype, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.SnmpcustomtablePackage.SnmpCustomTableChannel_unit, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,67afe306-1ba0-11ec-b0bc-a9ea4d75c042,vdSeK8vvA9NMgBJcRgQXcS/I7gg=] */
