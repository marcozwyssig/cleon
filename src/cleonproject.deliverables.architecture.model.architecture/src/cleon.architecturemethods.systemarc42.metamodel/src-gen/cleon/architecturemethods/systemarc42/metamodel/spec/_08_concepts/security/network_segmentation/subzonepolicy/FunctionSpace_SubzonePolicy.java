package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0ea7300c-b846-11e9-8760-2d4a9d15ec14,imports]] */
import java.util.stream.Collectors;

import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.SystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.IDestinationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.DestinationSubSecurityZone;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.FunctionSpace_Segmentation.ISecuritySubZoneFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.SourceSubZone;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.TopologyEnvironment;
import cleon.modelinglanguages.segmentation.metamodel.spec.FunctionSpace_Segmentation.IZoneFunctions;

/* End Protected Region   [[0ea7300c-b846-11e9-8760-2d4a9d15ec14,imports]] */

public class FunctionSpace_SubzonePolicy {

  /* Begin Protected Region [[0ea7300c-b846-11e9-8760-2d4a9d15ec14]] */

  /* End Protected Region   [[0ea7300c-b846-11e9-8760-2d4a9d15ec14]] */


  public static interface ISubZoneAccessPolicyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("22ab1685-b846-11e9-8760-2d4a9d15ec14")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("f9c1ff2d-b9cf-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

    @IDynamicResourceExtension.MethodId("672a5ec2-b9e5-11e9-828c-091526d036b6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("ba6db6f6-094f-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllSources();

    @IDynamicResourceExtension.MethodId("df365e20-094f-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllSourcesDistinct();

    @IDynamicResourceExtension.MethodId("adfed001-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources();

    @IDynamicResourceExtension.MethodId("e5fdbace-0df9-11ea-adc0-d5efa00b40ac")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src);

    @IDynamicResourceExtension.MethodId("299d0f3b-0dfc-11ea-adc0-d5efa00b40ac")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("6951b97c-afbb-11ea-9bc4-516448cfb46a")
    public java.lang.Boolean AllowRestrictedAccess();

  }
  
  public static interface ISubZoneAccessPolicyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("672a5ec2-b9e5-11e9-828c-091526d036b6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList);

    @IDynamicResourceExtension.MethodId("e5fdbace-0df9-11ea-adc0-d5efa00b40ac")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList);

    @IDynamicResourceExtension.MethodId("6951b97c-afbb-11ea-9bc4-516448cfb46a")
    public java.lang.Boolean AllowRestrictedAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy);

  }
  
  public static class SubZoneAccessPolicyFunctionsImpl implements ISubZoneAccessPolicyFunctionsImpl {

    public static final ISubZoneAccessPolicyFunctionsImpl INSTANCE = new SubZoneAccessPolicyFunctionsImpl();

    private SubZoneAccessPolicyFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      /* Begin Protected Region [[672a5ec2-b9e5-11e9-828c-091526d036b6]] */
      final var sourceCfg = source.selectSourceSystemConfiguration();
      final var configurationFunctions = sourceCfg.extension(ISystemConfigurationFunctions.class);
      final var destinationSubSecurityZone = DestinationSubSecurityZone
      		.selectToMeHasCommunicationFrom(source);

      return subZoneAccessPolicyList.stream()
      		.filter(x -> x.selectPolicyForDestinationSecuritySubZone()
      				.equals(destinationSubSecurityZone.selectInInterface().selectInterfaceInSecuritySubZone())
      				&& configurationFunctions.GetSubzonesAllDependsFromWithSelf().contains(
      						SourceSubZone.selectToMeDestinationSubZonePolicy(x).selectSourceSecuritySubZone()))
      		.collect(Collectors.toList());

      /* End Protected Region   [[672a5ec2-b9e5-11e9-828c-091526d036b6]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      /* Begin Protected Region [[e5fdbace-0df9-11ea-adc0-d5efa00b40ac]] */
      return subZoneAccessPolicyList.stream().filter(x -> x.extension(ISubZoneAccessPolicyFunctions.class).AllSystemConfigurations().contains(src.selectSourceSystemConfiguration())).collect(Collectors.toList());
      /* End Protected Region   [[e5fdbace-0df9-11ea-adc0-d5efa00b40ac]] */
    }

    @Override
    public java.lang.Boolean AllowRestrictedAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
      return false;
    }

  }
  
  public static class SubZoneAccessPolicyFunctions {

    private SubZoneAccessPolicyFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      return DynamicResourceUtil.invoke(ISubZoneAccessPolicyFunctionsImpl.class, SubZoneAccessPolicyFunctionsImpl.INSTANCE, subZoneAccessPolicyList).OnlyFromSource(source, subZoneAccessPolicyList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      return DynamicResourceUtil.invoke(ISubZoneAccessPolicyFunctionsImpl.class, SubZoneAccessPolicyFunctionsImpl.INSTANCE, subZoneAccessPolicyList).OnlyWhereSystemConfiguration(src, subZoneAccessPolicyList);
    }

    public static java.lang.Boolean AllowRestrictedAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(ISubZoneAccessPolicyFunctionsImpl.class, SubZoneAccessPolicyFunctionsImpl.INSTANCE, subZoneAccessPolicy).AllowRestrictedAccess(subZoneAccessPolicy);
    }

  }

  public static interface IIntraSubZoneAccessPolicyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2fbe687b-b846-11e9-8760-2d4a9d15ec14")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("074d6763-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

    @IDynamicResourceExtension.MethodId("db422f6e-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources();

  }
  
  public static interface IIntraSubZoneAccessPolicyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("074d6763-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy);

    @IDynamicResourceExtension.MethodId("db422f6e-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy);

  }
  
  public static class IntraSubZoneAccessPolicyFunctionsImpl implements IIntraSubZoneAccessPolicyFunctionsImpl {

    public static final IIntraSubZoneAccessPolicyFunctionsImpl INSTANCE = new IntraSubZoneAccessPolicyFunctionsImpl();

    private IntraSubZoneAccessPolicyFunctionsImpl() {}

    @Override
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      /* Begin Protected Region [[074d6763-b9d0-11e9-828c-091526d036b6]] */
      final var zoneFunctions = intraSubZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone().extension(IZoneFunctions.class);
      if( zoneFunctions.IsSingleUsed()) {
      	if(intraSubZoneAccessPolicy.selectRestriction().isAllowed()) {
      		return "G";
      	}
      	return "O";
      }
      if(intraSubZoneAccessPolicy.selectRestriction().isAllowed()) {
      	return "G/R";
      }
      return "O/R";
      /* End Protected Region   [[074d6763-b9d0-11e9-828c-091526d036b6]] */
    }

    @Override
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      /* Begin Protected Region [[db422f6e-0951-11ea-a9aa-d95ecdaa88c4]] */
      if (intraSubZoneAccessPolicy.selectRestriction().isAllowed()) {
      	return true;
      }

      return !intraSubZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class).AllSourcesDistinct().isEmpty();
      /* End Protected Region   [[db422f6e-0951-11ea-a9aa-d95ecdaa88c4]] */
    }

  }
  
  public static class IntraSubZoneAccessPolicyFunctions {

    private IntraSubZoneAccessPolicyFunctions() {}

    public static java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IIntraSubZoneAccessPolicyFunctionsImpl.class, IntraSubZoneAccessPolicyFunctionsImpl.INSTANCE, intraSubZoneAccessPolicy).EvaluatePolicy(source, intraSubZoneAccessPolicy);
    }

    public static java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IIntraSubZoneAccessPolicyFunctionsImpl.class, IntraSubZoneAccessPolicyFunctionsImpl.INSTANCE, intraSubZoneAccessPolicy).HasSources(intraSubZoneAccessPolicy);
    }

  }

  public static interface IInterSubZoneAccessPolicyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3d754da6-b846-11e9-8760-2d4a9d15ec14")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("16a32f0e-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

    @IDynamicResourceExtension.MethodId("bfada2ac-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources();

    @IDynamicResourceExtension.MethodId("7944f9b1-afbb-11ea-9bc4-516448cfb46a")
    public java.lang.Boolean AllowRestrictedAccess();

  }
  
  public static interface IInterSubZoneAccessPolicyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("16a32f0e-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy);

    @IDynamicResourceExtension.MethodId("bfada2ac-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy);

    @IDynamicResourceExtension.MethodId("7944f9b1-afbb-11ea-9bc4-516448cfb46a")
    public java.lang.Boolean AllowRestrictedAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy);

  }
  
  public static class InterSubZoneAccessPolicyFunctionsImpl implements IInterSubZoneAccessPolicyFunctionsImpl {

    public static final IInterSubZoneAccessPolicyFunctionsImpl INSTANCE = new InterSubZoneAccessPolicyFunctionsImpl();

    private InterSubZoneAccessPolicyFunctionsImpl() {}

    @Override
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      /* Begin Protected Region [[16a32f0e-b9d0-11e9-828c-091526d036b6]] */
      final var zoneFunctions = interSubZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone().extension(IZoneFunctions.class);
      if( zoneFunctions.IsSingleUsed()) {
      	return "O";
      }
      if( source.equals(interSubZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone())) {
      	return "G/O";
      }
      return "O";
      /* End Protected Region   [[16a32f0e-b9d0-11e9-828c-091526d036b6]] */
    }

    @Override
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      /* Begin Protected Region [[bfada2ac-0951-11ea-a9aa-d95ecdaa88c4]] */
      if (AllowRestrictedAccess(interSubZoneAccessPolicy)) {
      	return true;
      }

      return !interSubZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class).AllSourcesDistinct().isEmpty();

      /* End Protected Region   [[bfada2ac-0951-11ea-a9aa-d95ecdaa88c4]] */
    }

    @Override
    public java.lang.Boolean AllowRestrictedAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      /* Begin Protected Region [[7944f9b1-afbb-11ea-9bc4-516448cfb46a]] */
      return interSubZoneAccessPolicy.selectAllowRestrictedAccess() != null && interSubZoneAccessPolicy.selectAllowRestrictedAccess().booleanValue();
      /* End Protected Region   [[7944f9b1-afbb-11ea-9bc4-516448cfb46a]] */
    }

  }
  
  public static class InterSubZoneAccessPolicyFunctions {

    private InterSubZoneAccessPolicyFunctions() {}

    public static java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IInterSubZoneAccessPolicyFunctionsImpl.class, InterSubZoneAccessPolicyFunctionsImpl.INSTANCE, interSubZoneAccessPolicy).EvaluatePolicy(source, interSubZoneAccessPolicy);
    }

    public static java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IInterSubZoneAccessPolicyFunctionsImpl.class, InterSubZoneAccessPolicyFunctionsImpl.INSTANCE, interSubZoneAccessPolicy).HasSources(interSubZoneAccessPolicy);
    }

    public static java.lang.Boolean AllowRestrictedAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IInterSubZoneAccessPolicyFunctionsImpl.class, InterSubZoneAccessPolicyFunctionsImpl.INSTANCE, interSubZoneAccessPolicy).AllowRestrictedAccess(interSubZoneAccessPolicy);
    }

  }

  public static interface ISourceSubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b0d1f44b-094e-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSources();

    @IDynamicResourceExtension.MethodId("d4cd614b-094e-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSourcesDistinct();

  }
  
  public static interface ISourceSubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceSubZoneFunctionsImpl implements ISourceSubZoneFunctionsImpl {

    public static final ISourceSubZoneFunctionsImpl INSTANCE = new SourceSubZoneFunctionsImpl();

    private SourceSubZoneFunctionsImpl() {}

  }
  
  public static class SourceSubZoneFunctions {

    private SourceSubZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0ea7300c-b846-11e9-8760-2d4a9d15ec14,4m/Gouq1c7INQQc4+L2senZxuc8=] */
