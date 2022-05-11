package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DNSSystemConfigurationIntegration extends DynamicResource implements IDNSSystemConfigurationIntegration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDNSSystemConfigurationIntegration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDNSSystemConfigurationIntegration>() {
    
    @Override
    public IDNSSystemConfigurationIntegration create() {
      return new DNSSystemConfigurationIntegration();
    }
    
    @Override
    public IDNSSystemConfigurationIntegration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DNSSystemConfigurationIntegration(resourceRepository, resource);
    }
  
  };

  public DNSSystemConfigurationIntegration() {
    super(IDNSSystemConfigurationIntegration.TYPE_ID);
  }
  
  public DNSSystemConfigurationIntegration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDNSSystemConfigurationIntegration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowDNSRecords() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSSystemConfigurationIntegration_allowDNSRecords);
  }
    
  public void setAllowDNSRecords(java.lang.Boolean allowDNSRecords) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSSystemConfigurationIntegration_allowDNSRecords, allowDNSRecords);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectDnsForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSSystemConfigurationIntegration_dnsForSystemConfiguration);
  }

  public DNSSystemConfigurationIntegration setDnsForSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration dnsForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSSystemConfigurationIntegration_dnsForSystemConfiguration, dnsForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DNSSystemConfigurationIntegration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DNSSystemConfigurationIntegration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSSystemConfigurationIntegration_allowDNSRecords, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSSystemConfigurationIntegration_dnsForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSSystemConfigurationIntegration> selectToMeDnsForSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSSystemConfigurationIntegration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSSystemConfigurationIntegration_dnsForSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9bc16fa5-c7bb-11ec-a6a4-0b12dcfbdf90,xl1MbhXiGEvYJ01aTZAD82npr5w=] */
