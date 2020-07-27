package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpdellequallogiclogicaldisk extends DynamicResource implements ISnmpdellequallogiclogicaldisk {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpdellequallogiclogicaldisk> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpdellequallogiclogicaldisk>() {
    
    @Override
    public ISnmpdellequallogiclogicaldisk create() {
      return new Snmpdellequallogiclogicaldisk();
    }
    
    @Override
    public ISnmpdellequallogiclogicaldisk create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpdellequallogiclogicaldisk(resourceRepository, resource);
    }
  
  };

  public Snmpdellequallogiclogicaldisk() {
    super(ISnmpdellequallogiclogicaldisk.TYPE_ID);
  }
  
  public Snmpdellequallogiclogicaldisk(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpdellequallogiclogicaldisk.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpdellequallogiclogicaldisk setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b9486-c1eb-11ea-820f-9931558a898c,XDUka//Bc3NITx2TyS5YhzGNlqY=] */
