package cleon.modelinglanguages.network.spec.segmentation;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[49bf1abf-0b79-11e9-a136-69d076e48ed1,imports]] */

/* End Protected Region   [[49bf1abf-0b79-11e9-a136-69d076e48ed1,imports]] */

public class FunctionSpace_Segmentation {

  /* Begin Protected Region [[49bf1abf-0b79-11e9-a136-69d076e48ed1]] */
  
  /* End Protected Region   [[49bf1abf-0b79-11e9-a136-69d076e48ed1]] */


  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("518b1b93-0b79-11e9-a136-69d076e48ed1")
    public List<cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> GetAllParents();

    @IDynamicResourceExtension.MethodId("72a38c28-0b79-11e9-a136-69d076e48ed1")
    public cleon.modelinglanguages.network.spec.segmentation.javamodel.INetDomainZone GetNetDomainZone();

    @IDynamicResourceExtension.MethodId("93024aa3-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("a38fa265-0d1e-11e9-be4f-03130cc057ef")
    public List<cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> GetAllChildrenZone();

    @IDynamicResourceExtension.MethodId("efab4698-0d1e-11e9-be4f-03130cc057ef")
    public List<cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification> GetAllClassifications();

  }
  
  public static interface IZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ZoneFunctionsImpl implements IZoneFunctionsImpl {

    public static final IZoneFunctionsImpl INSTANCE = new ZoneFunctionsImpl();

    private ZoneFunctionsImpl() {}

  }
  
  public static class ZoneFunctions {

    private ZoneFunctions() {}

  }

  public static interface ISecuritySubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a8bfef69-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("0badd696-0d1f-11e9-be4f-03130cc057ef")
    public List<cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification> GetAllClassifications();

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

  }

  public static interface ISegmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7e001fa-0b79-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISegmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentFunctionsImpl implements ISegmentFunctionsImpl {

    public static final ISegmentFunctionsImpl INSTANCE = new SegmentFunctionsImpl();

    private SegmentFunctionsImpl() {}

  }
  
  public static class SegmentFunctions {

    private SegmentFunctions() {}

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

  public static interface IAnyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e9acffb2-0dc8-11e9-be4f-03130cc057ef")
    public <T> List<T> asList();

  }
  
  public static interface IAnyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e9acffb2-0dc8-11e9-be4f-03130cc057ef")
    public <T> List<T> asList(final T any);

  }
  
  public static class AnyFunctionsImpl implements IAnyFunctionsImpl {

    public static final IAnyFunctionsImpl INSTANCE = new AnyFunctionsImpl();

    private AnyFunctionsImpl() {}

    @Override
    public <T> List<T> asList(final T any) {
      return java.util.Arrays.asList(any);
    }

  }
  
  public static class AnyFunctions {

    private AnyFunctions() {}

    public static <T> List<T> asList(final T any) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, any).asList(any);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,49bf1abf-0b79-11e9-a136-69d076e48ed1,EdOnYM5RTTruWXXOxyiM/Yc0Q7Y=] */
