package cleon.modelinglanguages.segmentation.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[49bf1abf-0b79-11e9-a136-69d076e48ed1,imports]] */
import cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone;
import java.util.stream.Collectors;
import java.util.Comparator;
/* End Protected Region   [[49bf1abf-0b79-11e9-a136-69d076e48ed1,imports]] */

public class FunctionSpace_Segmentation {

  /* Begin Protected Region [[49bf1abf-0b79-11e9-a136-69d076e48ed1]] */

  /* End Protected Region   [[49bf1abf-0b79-11e9-a136-69d076e48ed1]] */


  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("518b1b93-0b79-11e9-a136-69d076e48ed1")
    public List<ch.actifsource.core.javamodel.IResource> GetAllParents();

    @IDynamicResourceExtension.MethodId("72a38c28-0b79-11e9-a136-69d076e48ed1")
    public ch.actifsource.core.javamodel.INamedResource GetNetDomainZone();

    @IDynamicResourceExtension.MethodId("93024aa3-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("a38fa265-0d1e-11e9-be4f-03130cc057ef")
    public List<ch.actifsource.core.javamodel.IResource> GetAllChildrenZone();

    @IDynamicResourceExtension.MethodId("b186e30d-6918-11ea-bc2c-91c30a68f7c3")
    public List<ch.actifsource.core.javamodel.INamedResource> GetAllChildrenSubzone();

    @IDynamicResourceExtension.MethodId("efab4698-0d1e-11e9-be4f-03130cc057ef")
    public List<ch.actifsource.core.javamodel.IEnumValue> GetAllClassifications();

    @IDynamicResourceExtension.MethodId("63d03ca5-b9d3-11e9-828c-091526d036b6")
    public java.lang.Boolean IsSingleUsed();

    @IDynamicResourceExtension.MethodId("0bb8e351-c365-11e9-a43f-07b58a157d3c")
    public List<ch.actifsource.core.javamodel.INamedResource> sortByVLAN();

  }
  
  public static interface IZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0bb8e351-c365-11e9-a43f-07b58a157d3c")
    public List<ch.actifsource.core.javamodel.INamedResource> sortByVLAN(final List<ch.actifsource.core.javamodel.IResource> zoneList);

  }
  
  public static class ZoneFunctionsImpl implements IZoneFunctionsImpl {

    public static final IZoneFunctionsImpl INSTANCE = new ZoneFunctionsImpl();

    private ZoneFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.INamedResource> sortByVLAN(final List<ch.actifsource.core.javamodel.IResource> zoneList) {
      /* Begin Protected Region [[0bb8e351-c365-11e9-a43f-07b58a157d3c]] */
      return zoneList.stream().filter(x -> x instanceof ISecuritySubZone).map(x -> (ISecuritySubZone)x).sorted(Comparator.comparingInt(x -> x.selectDefaultVlan().selectVlan_no())).collect(Collectors.toList());   
      /* End Protected Region   [[0bb8e351-c365-11e9-a43f-07b58a157d3c]] */
    }

  }
  
  public static class ZoneFunctions {

    private ZoneFunctions() {}

    public static List<ch.actifsource.core.javamodel.INamedResource> sortByVLAN(final List<ch.actifsource.core.javamodel.IResource> zoneList) {
      return DynamicResourceUtil.invoke(IZoneFunctionsImpl.class, ZoneFunctionsImpl.INSTANCE, zoneList).sortByVLAN(zoneList);
    }

  }

  public static interface ISecuritySubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a8bfef69-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("0badd696-0d1f-11e9-be4f-03130cc057ef")
    public List<ch.actifsource.core.javamodel.IEnumValue> GetAllClassifications();

    @IDynamicResourceExtension.MethodId("d79ec6ec-6918-11ea-bc2c-91c30a68f7c3")
    public List<ch.actifsource.core.javamodel.INamedResource> OnlyExport();

    @IDynamicResourceExtension.MethodId("9e849f53-c789-11ea-b0b6-e5df79e86bc2")
    public java.lang.String NameWithSecurityZoneName();

    @IDynamicResourceExtension.MethodId("e26ab347-f75c-11ef-9619-857aad3ec118")
    public List<ch.actifsource.core.javamodel.IResource> Vlans();

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d79ec6ec-6918-11ea-bc2c-91c30a68f7c3")
    public List<ch.actifsource.core.javamodel.INamedResource> OnlyExport(final List<ch.actifsource.core.javamodel.INamedResource> securitySubZoneList);

  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.INamedResource> OnlyExport(final List<ch.actifsource.core.javamodel.INamedResource> securitySubZoneList) {
      /* Begin Protected Region [[d79ec6ec-6918-11ea-bc2c-91c30a68f7c3]] */
      return securitySubZoneList.stream().filter(x -> x.selectExport() == null || x.selectExport().booleanValue() ).collect(Collectors.toList());
      /* End Protected Region   [[d79ec6ec-6918-11ea-bc2c-91c30a68f7c3]] */
    }

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

    public static List<ch.actifsource.core.javamodel.INamedResource> OnlyExport(final List<ch.actifsource.core.javamodel.INamedResource> securitySubZoneList) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZoneList).OnlyExport(securitySubZoneList);
    }

  }

  public static interface ISegmentZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7e001fa-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISegmentZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentZoneFunctionsImpl implements ISegmentZoneFunctionsImpl {

    public static final ISegmentZoneFunctionsImpl INSTANCE = new SegmentZoneFunctionsImpl();

    private SegmentZoneFunctionsImpl() {}

  }
  
  public static class SegmentZoneFunctions {

    private SegmentZoneFunctions() {}

  }

  public static interface ISecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3c79d5d9-a961-11e9-bf83-7bacdb6991f7")
    public java.lang.Boolean IsAllowed(final ch.actifsource.core.javamodel.INamedResource source);

    @IDynamicResourceExtension.MethodId("c6f6ee19-f5b2-11ef-b301-37bf6b79be8f")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3c79d5d9-a961-11e9-bf83-7bacdb6991f7")
    public java.lang.Boolean IsAllowed(final ch.actifsource.core.javamodel.INamedResource source, final ch.actifsource.core.javamodel.INamedResource securityZone);

  }
  
  public static class SecurityZoneFunctionsImpl implements ISecurityZoneFunctionsImpl {

    public static final ISecurityZoneFunctionsImpl INSTANCE = new SecurityZoneFunctionsImpl();

    private SecurityZoneFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsAllowed(final ch.actifsource.core.javamodel.INamedResource source, final ch.actifsource.core.javamodel.INamedResource securityZone) {
      /* Begin Protected Region [[3c79d5d9-a961-11e9-bf83-7bacdb6991f7]] */
      return source.selectAllowedAccessTo().contains(securityZone);   
      /* End Protected Region   [[3c79d5d9-a961-11e9-bf83-7bacdb6991f7]] */
    }

  }
  
  public static class SecurityZoneFunctions {

    private SecurityZoneFunctions() {}

    public static java.lang.Boolean IsAllowed(final ch.actifsource.core.javamodel.INamedResource source, final ch.actifsource.core.javamodel.INamedResource securityZone) {
      return DynamicResourceUtil.invoke(ISecurityZoneFunctionsImpl.class, SecurityZoneFunctionsImpl.INSTANCE, securityZone).IsAllowed(source, securityZone);
    }

  }

  public static interface ISecurityExternalZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd399b3b-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityExternalZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityExternalZoneFunctionsImpl implements ISecurityExternalZoneFunctionsImpl {

    public static final ISecurityExternalZoneFunctionsImpl INSTANCE = new SecurityExternalZoneFunctionsImpl();

    private SecurityExternalZoneFunctionsImpl() {}

  }
  
  public static class SecurityExternalZoneFunctions {

    private SecurityExternalZoneFunctions() {}

  }

  public static interface ISecurityManagementZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("208f03fb-0b7a-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityManagementZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityManagementZoneFunctionsImpl implements ISecurityManagementZoneFunctionsImpl {

    public static final ISecurityManagementZoneFunctionsImpl INSTANCE = new SecurityManagementZoneFunctionsImpl();

    private SecurityManagementZoneFunctionsImpl() {}

  }
  
  public static class SecurityManagementZoneFunctions {

    private SecurityManagementZoneFunctions() {}

  }

  public static interface ISecurityPolicyEnforcementZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2aea62b2-0b7a-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityPolicyEnforcementZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityPolicyEnforcementZoneFunctionsImpl implements ISecurityPolicyEnforcementZoneFunctionsImpl {

    public static final ISecurityPolicyEnforcementZoneFunctionsImpl INSTANCE = new SecurityPolicyEnforcementZoneFunctionsImpl();

    private SecurityPolicyEnforcementZoneFunctionsImpl() {}

  }
  
  public static class SecurityPolicyEnforcementZoneFunctions {

    private SecurityPolicyEnforcementZoneFunctions() {}

  }

  public static interface ISecurityServerZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3beeeb6e-0b7a-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityServerZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityServerZoneFunctionsImpl implements ISecurityServerZoneFunctionsImpl {

    public static final ISecurityServerZoneFunctionsImpl INSTANCE = new SecurityServerZoneFunctionsImpl();

    private SecurityServerZoneFunctionsImpl() {}

  }
  
  public static class SecurityServerZoneFunctions {

    private SecurityServerZoneFunctions() {}

  }

  public static interface ISecurityServicesZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("45e3bfdd-0b7a-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityServicesZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityServicesZoneFunctionsImpl implements ISecurityServicesZoneFunctionsImpl {

    public static final ISecurityServicesZoneFunctionsImpl INSTANCE = new SecurityServicesZoneFunctionsImpl();

    private SecurityServicesZoneFunctionsImpl() {}

  }
  
  public static class SecurityServicesZoneFunctions {

    private SecurityServicesZoneFunctions() {}

  }

  public static interface ISecurityClientZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b2ddf885-f5b2-11ef-b301-37bf6b79be8f")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityClientZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityClientZoneFunctionsImpl implements ISecurityClientZoneFunctionsImpl {

    public static final ISecurityClientZoneFunctionsImpl INSTANCE = new SecurityClientZoneFunctionsImpl();

    private SecurityClientZoneFunctionsImpl() {}

  }
  
  public static class SecurityClientZoneFunctions {

    private SecurityClientZoneFunctions() {}

  }

  public static interface ISecurityInternetZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("10fd1249-8e06-11ea-b01b-6bc31a0e971d")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISecurityInternetZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityInternetZoneFunctionsImpl implements ISecurityInternetZoneFunctionsImpl {

    public static final ISecurityInternetZoneFunctionsImpl INSTANCE = new SecurityInternetZoneFunctionsImpl();

    private SecurityInternetZoneFunctionsImpl() {}

  }
  
  public static class SecurityInternetZoneFunctions {

    private SecurityInternetZoneFunctions() {}

  }

  public static interface IMulitpleUsedNetdomainZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("252e0f1a-a543-11ec-9f8a-6b362fcb922a")
    public java.lang.Boolean IsSingleUsed();

  }
  
  public static interface IMulitpleUsedNetdomainZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("252e0f1a-a543-11ec-9f8a-6b362fcb922a")
    public java.lang.Boolean IsSingleUsed(final ch.actifsource.core.javamodel.INamedResource mulitpleUsedNetdomainZone);

  }
  
  public static class MulitpleUsedNetdomainZoneFunctionsImpl implements IMulitpleUsedNetdomainZoneFunctionsImpl {

    public static final IMulitpleUsedNetdomainZoneFunctionsImpl INSTANCE = new MulitpleUsedNetdomainZoneFunctionsImpl();

    private MulitpleUsedNetdomainZoneFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSingleUsed(final ch.actifsource.core.javamodel.INamedResource mulitpleUsedNetdomainZone) {
      return false;
    }

  }
  
  public static class MulitpleUsedNetdomainZoneFunctions {

    private MulitpleUsedNetdomainZoneFunctions() {}

    public static java.lang.Boolean IsSingleUsed(final ch.actifsource.core.javamodel.INamedResource mulitpleUsedNetdomainZone) {
      return DynamicResourceUtil.invoke(IMulitpleUsedNetdomainZoneFunctionsImpl.class, MulitpleUsedNetdomainZoneFunctionsImpl.INSTANCE, mulitpleUsedNetdomainZone).IsSingleUsed(mulitpleUsedNetdomainZone);
    }

  }

  public static interface ISingleUsedNetdomainZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f0e9808-a543-11ec-9f8a-6b362fcb922a")
    public java.lang.Boolean IsSingleUsed();

  }
  
  public static interface ISingleUsedNetdomainZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2f0e9808-a543-11ec-9f8a-6b362fcb922a")
    public java.lang.Boolean IsSingleUsed(final ch.actifsource.core.javamodel.INamedResource singleUsedNetdomainZone);

  }
  
  public static class SingleUsedNetdomainZoneFunctionsImpl implements ISingleUsedNetdomainZoneFunctionsImpl {

    public static final ISingleUsedNetdomainZoneFunctionsImpl INSTANCE = new SingleUsedNetdomainZoneFunctionsImpl();

    private SingleUsedNetdomainZoneFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSingleUsed(final ch.actifsource.core.javamodel.INamedResource singleUsedNetdomainZone) {
      return true;
    }

  }
  
  public static class SingleUsedNetdomainZoneFunctions {

    private SingleUsedNetdomainZoneFunctions() {}

    public static java.lang.Boolean IsSingleUsed(final ch.actifsource.core.javamodel.INamedResource singleUsedNetdomainZone) {
      return DynamicResourceUtil.invoke(ISingleUsedNetdomainZoneFunctionsImpl.class, SingleUsedNetdomainZoneFunctionsImpl.INSTANCE, singleUsedNetdomainZone).IsSingleUsed(singleUsedNetdomainZone);
    }

  }

  public static interface INetdomainZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d50f94fe-a544-11ec-9f8a-6b362fcb922a")
    public java.lang.String GetTypeName();

  }
  
  public static interface INetdomainZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetdomainZoneFunctionsImpl implements INetdomainZoneFunctionsImpl {

    public static final INetdomainZoneFunctionsImpl INSTANCE = new NetdomainZoneFunctionsImpl();

    private NetdomainZoneFunctionsImpl() {}

  }
  
  public static class NetdomainZoneFunctions {

    private NetdomainZoneFunctions() {}

  }

  public static interface IAbstractVlanFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("24dbecaa-f758-11ef-9619-857aad3ec118")
    public List<ch.actifsource.core.javamodel.IResource> VLANs();

  }
  
  public static interface IAbstractVlanFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractVlanFunctionsImpl implements IAbstractVlanFunctionsImpl {

    public static final IAbstractVlanFunctionsImpl INSTANCE = new AbstractVlanFunctionsImpl();

    private AbstractVlanFunctionsImpl() {}

  }
  
  public static class AbstractVlanFunctions {

    private AbstractVlanFunctions() {}

  }

  public static interface IVlanValuesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cc5a9051-f756-11ef-9619-857aad3ec118")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("51b7fe3c-f758-11ef-9619-857aad3ec118")
    public List<ch.actifsource.core.javamodel.IResource> VLANs();

  }
  
  public static interface IVlanValuesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VlanValuesFunctionsImpl implements IVlanValuesFunctionsImpl {

    public static final IVlanValuesFunctionsImpl INSTANCE = new VlanValuesFunctionsImpl();

    private VlanValuesFunctionsImpl() {}

  }
  
  public static class VlanValuesFunctions {

    private VlanValuesFunctions() {}

  }

  public static interface IVlanRangeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("60895471-f758-11ef-9619-857aad3ec118")
    public List<ch.actifsource.core.javamodel.IResource> VLANs();

  }
  
  public static interface IVlanRangeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("60895471-f758-11ef-9619-857aad3ec118")
    public List<ch.actifsource.core.javamodel.IResource> VLANs(final ch.actifsource.core.javamodel.IResource vlanRange);

  }
  
  public static class VlanRangeFunctionsImpl implements IVlanRangeFunctionsImpl {

    public static final IVlanRangeFunctionsImpl INSTANCE = new VlanRangeFunctionsImpl();

    private VlanRangeFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.IResource> VLANs(final ch.actifsource.core.javamodel.IResource vlanRange) {
      return null;
    }

  }
  
  public static class VlanRangeFunctions {

    private VlanRangeFunctions() {}

    public static List<ch.actifsource.core.javamodel.IResource> VLANs(final ch.actifsource.core.javamodel.IResource vlanRange) {
      return DynamicResourceUtil.invoke(IVlanRangeFunctionsImpl.class, VlanRangeFunctionsImpl.INSTANCE, vlanRange).VLANs(vlanRange);
    }

  }

  public static interface IVlanFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cd978089-f75a-11ef-9619-857aad3ec118")
    public List<ch.actifsource.core.javamodel.IResource> VLANs();

  }
  
  public static interface IVlanFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VlanFunctionsImpl implements IVlanFunctionsImpl {

    public static final IVlanFunctionsImpl INSTANCE = new VlanFunctionsImpl();

    private VlanFunctionsImpl() {}

  }
  
  public static class VlanFunctions {

    private VlanFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,49bf1abf-0b79-11e9-a136-69d076e48ed1,yN3O0Rx0og6A/g3XwS1ufWJkTxw=] */
