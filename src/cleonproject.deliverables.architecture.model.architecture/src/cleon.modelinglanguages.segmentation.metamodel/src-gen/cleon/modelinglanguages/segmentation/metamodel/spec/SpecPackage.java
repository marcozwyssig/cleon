package cleon.modelinglanguages.segmentation.metamodel.spec;

import ch.actifsource.core.Resource;

public class SpecPackage {
  
  public static final Resource NetdomainZone = new Resource("da24cca3-0b73-11e9-a136-69d076e48ed1");
  public static final Resource SegmentZone = new Resource("e820f880-0b73-11e9-a136-69d076e48ed1");
  public static final Resource NetdomainZone_segments = new Resource("ed08c4db-0b73-11e9-a136-69d076e48ed1");
  public static final Resource Zone = new Resource("fb4a0fa3-0b73-11e9-a136-69d076e48ed1");
  public static final Resource Zone_zones = new Resource("6a57a031-0b74-11e9-a136-69d076e48ed1");
  public static final Resource Segmentation_zones = new Resource("86ac6ecc-0b74-11e9-a136-69d076e48ed1");
  public static final Resource SecurityZone = new Resource("32beba1e-0b75-11e9-a136-69d076e48ed1");
  public static final Resource SecurityServerZone = new Resource("3af87037-0b75-11e9-a136-69d076e48ed1");
  public static final Resource SecurityManagementZone = new Resource("44286d9e-0b75-11e9-a136-69d076e48ed1");
  public static final Resource SegmentZone_securityZones = new Resource("4c4d8b1a-0b75-11e9-a136-69d076e48ed1");
  public static final Resource SecuritySubZone = new Resource("7f40c131-0b75-11e9-a136-69d076e48ed1");
  public static final Resource SecurityZone_securitySubZones = new Resource("84990280-0b75-11e9-a136-69d076e48ed1");
  public static final Resource SecuritySubZone_noZones = new Resource("8c36a06f-0b75-11e9-a136-69d076e48ed1");
  public static final Resource SecurityServicesZone = new Resource("0e3a9edc-0b76-11e9-a136-69d076e48ed1");
  public static final Resource SecurityPolicyEnforcementZone = new Resource("5112e54f-0b76-11e9-a136-69d076e48ed1");
  public static final Resource NamedZone = new Resource("0325c007-0b77-11e9-a136-69d076e48ed1");
  public static final Resource SecurityExternalZone = new Resource("ae271ab1-0b78-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_Zone = new Resource("4b715ede-0b79-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_SecuritySubZone = new Resource("a20a67e4-0b79-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_SegmentZone = new Resource("b7e001f7-0b79-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_SecurityExternalZone = new Resource("fd399b38-0b79-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_SecurityManagementZone = new Resource("208f03f8-0b7a-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_SecurityPolicyEnforcementZone = new Resource("2aea62af-0b7a-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_SecurityServerZone = new Resource("3beeeb6b-0b7a-11e9-a136-69d076e48ed1");
  public static final Resource FunctionSpace_aE_Segmentation_SecurityServicesZone = new Resource("45e3bfda-0b7a-11e9-a136-69d076e48ed1");
  public static final Resource SecuritySubZoneAware = new Resource("02abe8e7-0b84-11e9-a136-69d076e48ed1");
  public static final Resource Segmentation = new Resource("ccaeef49-0d1d-11e9-be4f-03130cc057ef");
  public static final Resource SecuritySubZone_VLAN_aE_No = new Resource("cd3bbd8b-7ae3-11e9-a70f-4dc03941a024");
  public static final Resource Zone_allowedAccessTo = new Resource("bbfbf3d7-a92b-11e9-b094-b12ff339b432");
  public static final Resource NetdomainZone_allowed = new Resource("4d3fe8f1-a937-11e9-b094-b12ff339b432");
  public static final Resource SegmentZone_allowed = new Resource("7037d269-a938-11e9-b094-b12ff339b432");
  public static final Resource SecurityZone_allowedAccessTo = new Resource("ad7e2a2b-a938-11e9-b094-b12ff339b432");
  public static final Resource SecuritySubZone_allowedAccessTo = new Resource("fd840116-a938-11e9-b094-b12ff339b432");
  public static final Resource FunctionSpace_aE_Segmentation_SecurityZone = new Resource("35a3f4a4-a961-11e9-bf83-7bacdb6991f7");
  public static final Resource SecuritySubZone_mask = new Resource("556d25a3-f625-11e9-882b-7b3dd7e5bc17");
  public static final Resource SecuritySubZone_export = new Resource("deb1ca21-6913-11ea-bc2c-91c30a68f7c3");
  public static final Resource SecurityInternetZone = new Resource("1c8b3612-8e04-11ea-b01b-6bc31a0e971d");
  public static final Resource FunctionSpace_aE_Segmentation_SecurityInternetZone = new Resource("f70ff4e8-8e05-11ea-b01b-6bc31a0e971d");
  public static final Resource SingleUsedNetdomainZone = new Resource("c556d70e-a542-11ec-9f8a-6b362fcb922a");
  public static final Resource MulitpleUsedNetdomainZone = new Resource("dac3c399-a542-11ec-9f8a-6b362fcb922a");
  public static final Resource FunctionSpace_aE_Segmentation_MulitpleUsedNetdomainZone = new Resource("1a18618f-a543-11ec-9f8a-6b362fcb922a");
  public static final Resource FunctionSpace_aE_Segmentation_SingleUsedNetdomainZone = new Resource("2f0e9806-a543-11ec-9f8a-6b362fcb922a");
  public static final Resource FunctionSpace_aE_Segmentation_NetdomainZone = new Resource("cd8e58c1-a544-11ec-9f8a-6b362fcb922a");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private SpecPackage() {}
  
  public static final String getScopeName() {
    return "cleon.modelinglanguages.segmentation.metamodel";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.modelinglanguages.segmentation.metamodel.spec";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.modelinglanguages.segmentation.metamodel.spec,Dqe0qEhZP/x2zSWIsJaAVcxPcMw=] */
