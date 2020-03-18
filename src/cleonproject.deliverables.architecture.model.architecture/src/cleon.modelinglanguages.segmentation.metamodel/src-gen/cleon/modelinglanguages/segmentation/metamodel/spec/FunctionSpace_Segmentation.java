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

/* End Protected Region   [[49bf1abf-0b79-11e9-a136-69d076e48ed1,imports]] */

public class FunctionSpace_Segmentation {

  /* Begin Protected Region [[49bf1abf-0b79-11e9-a136-69d076e48ed1]] */
  
  /* End Protected Region   [[49bf1abf-0b79-11e9-a136-69d076e48ed1]] */


  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("518b1b93-0b79-11e9-a136-69d076e48ed1")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> GetAllParents();

    @IDynamicResourceExtension.MethodId("72a38c28-0b79-11e9-a136-69d076e48ed1")
    public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone GetNetDomainZone();

    @IDynamicResourceExtension.MethodId("93024aa3-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("a38fa265-0d1e-11e9-be4f-03130cc057ef")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> GetAllChildrenZone();

    @IDynamicResourceExtension.MethodId("b186e30d-6918-11ea-bc2c-91c30a68f7c3")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> GetAllChildrenSubzone();

    @IDynamicResourceExtension.MethodId("efab4698-0d1e-11e9-be4f-03130cc057ef")
    public List<cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassification> GetAllClassifications();

    @IDynamicResourceExtension.MethodId("63d03ca5-b9d3-11e9-828c-091526d036b6")
    public java.lang.Boolean IsLocalOnly();

    @IDynamicResourceExtension.MethodId("0bb8e351-c365-11e9-a43f-07b58a157d3c")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> sortByVLAN();

  }
  
  public static interface IZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0bb8e351-c365-11e9-a43f-07b58a157d3c")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> sortByVLAN(final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> zoneList);

  }
  
  public static class ZoneFunctionsImpl implements IZoneFunctionsImpl {

    public static final IZoneFunctionsImpl INSTANCE = new ZoneFunctionsImpl();

    private ZoneFunctionsImpl() {}

    @Override
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> sortByVLAN(final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> zoneList) {
      /* Begin Protected Region [[0bb8e351-c365-11e9-a43f-07b58a157d3c]] */
    	return zoneList.stream().filter(x -> x instanceof ISecuritySubZone).map(x -> (ISecuritySubZone)x).sorted(java.util.Comparator.comparing(ISecuritySubZone::selectVLAN_No)).collect(Collectors.toList());   
      /* End Protected Region   [[0bb8e351-c365-11e9-a43f-07b58a157d3c]] */
    }

  }
  
  public static class ZoneFunctions {

    private ZoneFunctions() {}

    public static List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> sortByVLAN(final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> zoneList) {
      return DynamicResourceUtil.invoke(IZoneFunctionsImpl.class, ZoneFunctionsImpl.INSTANCE, zoneList).sortByVLAN(zoneList);
    }

  }

  public static interface ISecuritySubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a8bfef69-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("0badd696-0d1f-11e9-be4f-03130cc057ef")
    public List<cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassification> GetAllClassifications();

    @IDynamicResourceExtension.MethodId("d79ec6ec-6918-11ea-bc2c-91c30a68f7c3")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyExport();

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d79ec6ec-6918-11ea-bc2c-91c30a68f7c3")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyExport(final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList);

  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

    @Override
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyExport(final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList) {
      /* Begin Protected Region [[d79ec6ec-6918-11ea-bc2c-91c30a68f7c3]] */
    	return securitySubZoneList.stream().filter(x -> x.selectExport() == null || x.selectExport().booleanValue() ).collect(Collectors.toList());
      /* End Protected Region   [[d79ec6ec-6918-11ea-bc2c-91c30a68f7c3]] */
    }

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

    public static List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyExport(final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList) {
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
    public java.lang.Boolean IsAllowed(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone source);

  }
  
  public static interface ISecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3c79d5d9-a961-11e9-bf83-7bacdb6991f7")
    public java.lang.Boolean IsAllowed(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone securityZone);

  }
  
  public static class SecurityZoneFunctionsImpl implements ISecurityZoneFunctionsImpl {

    public static final ISecurityZoneFunctionsImpl INSTANCE = new SecurityZoneFunctionsImpl();

    private SecurityZoneFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsAllowed(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone securityZone) {
      /* Begin Protected Region [[3c79d5d9-a961-11e9-bf83-7bacdb6991f7]] */
    	return source.selectAllowedAccessTo().contains(securityZone);   
      /* End Protected Region   [[3c79d5d9-a961-11e9-bf83-7bacdb6991f7]] */
    }

  }
  
  public static class SecurityZoneFunctions {

    private SecurityZoneFunctions() {}

    public static java.lang.Boolean IsAllowed(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone securityZone) {
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

  public static interface INetDomainZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e9c4f2e3-b9d2-11e9-828c-091526d036b6")
    public java.lang.Boolean IsLocalOnly();

  }
  
  public static interface INetDomainZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e9c4f2e3-b9d2-11e9-828c-091526d036b6")
    public java.lang.Boolean IsLocalOnly(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone netDomainZone);

  }
  
  public static class NetDomainZoneFunctionsImpl implements INetDomainZoneFunctionsImpl {

    public static final INetDomainZoneFunctionsImpl INSTANCE = new NetDomainZoneFunctionsImpl();

    private NetDomainZoneFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsLocalOnly(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone netDomainZone) {
      /* Begin Protected Region [[e9c4f2e3-b9d2-11e9-828c-091526d036b6]] */
        return !(netDomainZone.selectName().contains("CH"));   
      /* End Protected Region   [[e9c4f2e3-b9d2-11e9-828c-091526d036b6]] */
    }

  }
  
  public static class NetDomainZoneFunctions {

    private NetDomainZoneFunctions() {}

    public static java.lang.Boolean IsLocalOnly(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone netDomainZone) {
      return DynamicResourceUtil.invoke(INetDomainZoneFunctionsImpl.class, NetDomainZoneFunctionsImpl.INSTANCE, netDomainZone).IsLocalOnly(netDomainZone);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,49bf1abf-0b79-11e9-a136-69d076e48ed1,CmhItdkiUg73SXXooByd+i9Uw+w=] */
