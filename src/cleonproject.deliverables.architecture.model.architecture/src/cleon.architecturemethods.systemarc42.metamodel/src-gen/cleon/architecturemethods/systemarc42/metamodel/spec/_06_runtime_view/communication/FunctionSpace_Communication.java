package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[536f3fea-8833-11e9-80ce-fbaba21c141b,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy;
import ch.actifsource.util.character.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* End Protected Region   [[536f3fea-8833-11e9-80ce-fbaba21c141b,imports]] */

public class FunctionSpace_Communication {

  /* Begin Protected Region [[536f3fea-8833-11e9-80ce-fbaba21c141b]] */
  public static class ListUtil
  {
	@SafeVarargs
	private static <T> Predicate<T> distinctByKeys(final Function<? super T, ?>... keyExtractors) 
	  {
	    final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();
	     
	    return t -> 
	    {
	      final List<?> keys = Arrays.stream(keyExtractors)
	                  .map(ke -> ke.apply(t))
	                  .collect(Collectors.toList());
	       
	      return seen.putIfAbsent(keys, Boolean.TRUE) == null;
	    };
	  }	  
  }
  
  public static final int MAX_COLUMNS = 90; 
  /* End Protected Region   [[536f3fea-8833-11e9-80ce-fbaba21c141b]] */


  public static interface IDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("58d69bff-8833-11e9-80ce-fbaba21c141b")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem System();

    @IDynamicResourceExtension.MethodId("c788343a-883f-11e9-80ce-fbaba21c141b")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("795a998b-88f0-11e9-9b22-1b5fbbd90cc8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllSources();

    @IDynamicResourceExtension.MethodId("ed28063b-b203-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllAllowedSystemConfigurations();

    @IDynamicResourceExtension.MethodId("044ab964-b204-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsFromDependsFrom();

    @IDynamicResourceExtension.MethodId("24774474-b204-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsDependsOn();

    @IDynamicResourceExtension.MethodId("d19f4a17-e07a-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInterSourcesDistinct();

    @IDynamicResourceExtension.MethodId("18fdb44b-0b15-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInterSources();

    @IDynamicResourceExtension.MethodId("00b7e96c-e07c-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntraSources();

    @IDynamicResourceExtension.MethodId("00b7e976-e07c-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntraSourcesDistinct();

    @IDynamicResourceExtension.MethodId("834d67d8-0b18-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInterSourcesDistinctByService();

    @IDynamicResourceExtension.MethodId("7c66a18d-0b19-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter();

    @IDynamicResourceExtension.MethodId("66ad1d73-0b72-11ea-891d-81e208cfce61")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra();

    @IDynamicResourceExtension.MethodId("32c46ff9-80bd-11ea-b18a-9db09f26536a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AccessAsSource();

  }
  
  public static interface IDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7c66a18d-0b19-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList);

    @IDynamicResourceExtension.MethodId("66ad1d73-0b72-11ea-891d-81e208cfce61")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList);

  }
  
  public static class DestinationFunctionsImpl implements IDestinationFunctionsImpl {

    public static final IDestinationFunctionsImpl INSTANCE = new DestinationFunctionsImpl();

    private DestinationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      /* Begin Protected Region [[7c66a18d-0b19-11ea-b483-3fffd745ba7d]] */
    	return destinationList.stream().filter(x -> x.extension(IDestinationFunctions.class).OnlyInterSourcesDistinct().isEmpty() == false).collect(Collectors.toList()); 
      /* End Protected Region   [[7c66a18d-0b19-11ea-b483-3fffd745ba7d]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      /* Begin Protected Region [[66ad1d73-0b72-11ea-891d-81e208cfce61]] */
    	return destinationList.stream().filter(x -> x.extension(IDestinationFunctions.class).OnlyIntraSourcesDistinct().isEmpty() == false).collect(Collectors.toList());   
      /* End Protected Region   [[66ad1d73-0b72-11ea-891d-81e208cfce61]] */
    }

  }
  
  public static class DestinationFunctions {

    private DestinationFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      return DynamicResourceUtil.invoke(IDestinationFunctionsImpl.class, DestinationFunctionsImpl.INSTANCE, destinationList).OnlyInter(destinationList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      return DynamicResourceUtil.invoke(IDestinationFunctionsImpl.class, DestinationFunctionsImpl.INSTANCE, destinationList).OnlyIntra(destinationList);
    }

  }

  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("645ee604-b886-11e9-8760-2d4a9d15ec14")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> GetAllSecuritySubzones();

    @IDynamicResourceExtension.MethodId("85bc9b26-df87-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter();

    @IDynamicResourceExtension.MethodId("820fd60a-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra();

    @IDynamicResourceExtension.MethodId("ff2ddc87-df89-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy> GetInterConnection();

    @IDynamicResourceExtension.MethodId("983f4fe1-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection();

    @IDynamicResourceExtension.MethodId("28012e2a-dfa3-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllServices();

    @IDynamicResourceExtension.MethodId("c71161b1-e03e-11e9-aa67-4505845acdbd")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination Destination();

    @IDynamicResourceExtension.MethodId("db988228-e03e-11e9-aa67-4505845acdbd")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone DestinationSubSecurityZone();

    @IDynamicResourceExtension.MethodId("55674b0d-e07c-11e9-aa67-4505845acdbd")
    public java.lang.String SubLayerName();

    @IDynamicResourceExtension.MethodId("859b1670-051f-11ea-83f8-cdeda7a40e11")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetAllIntraConnection();

    @IDynamicResourceExtension.MethodId("11651668-04c4-11ea-8fff-bb311a3ad127")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService();

    @IDynamicResourceExtension.MethodId("a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService();

    @IDynamicResourceExtension.MethodId("3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("81c86001-0b16-11ea-b483-3fffd745ba7d")
    public java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("cfcd27c4-0b71-11ea-891d-81e208cfce61")
    public java.lang.String Tag(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination destination);

    @IDynamicResourceExtension.MethodId("cfcd4eec-0b71-11ea-891d-81e208cfce61")
    public java.lang.String InterRuleName(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dstSz);

    @IDynamicResourceExtension.MethodId("28d5e66c-0b74-11ea-afff-b52fab62d0fd")
    public java.lang.String IntraRuleName(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dstSz);

    @IDynamicResourceExtension.MethodId("cfcd4efd-0b71-11ea-891d-81e208cfce61")
    public java.lang.String ServiceName();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("85bc9b26-df87-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("820fd60a-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("983f4fe1-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("11651668-04c4-11ea-8fff-bb311a3ad127")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("81c86001-0b16-11ea-b483-3fffd745ba7d")
    public java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[85bc9b26-df87-11e9-9827-a1514ee8d06a]] */
    	final List<ISource> result = new ArrayList<>();
    	for( final ISource source : sourceList ) {
    		final ISourceFunctions functions = source.extension(ISourceFunctions.class);
    		if(!functions.GetInterConnection().isEmpty()) {
    			result.add(source);
    		}
    	}
    		
    	return result;
      /* End Protected Region   [[85bc9b26-df87-11e9-9827-a1514ee8d06a]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[820fd60a-e042-11e9-aa67-4505845acdbd]] */
    	final List<ISource> result = new ArrayList<>();
    	for( final ISource source : sourceList ) {
    		final ISourceFunctions functions = source.extension(ISourceFunctions.class);    		
    		if(!functions.GetIntraConnection().isEmpty()) {
    			result.add(source);
    		}
    	}
    		
    	return result;   
      /* End Protected Region   [[820fd60a-e042-11e9-aa67-4505845acdbd]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[983f4fe1-e042-11e9-aa67-4505845acdbd]] */
    	final ISourceFunctions sourceFunctions = source.extension(ISourceFunctions.class);
    	if( !sourceFunctions.GetInterConnection().isEmpty())
    		return null;

    	return sourceFunctions.GetAllIntraConnection();
      /* End Protected Region   [[983f4fe1-e042-11e9-aa67-4505845acdbd]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[11651668-04c4-11ea-8fff-bb311a3ad127]] */
        final Predicate<ISource> distinctByKeys = ListUtil.distinctByKeys(ISource::selectSourceSystemConfiguration, ISource::selectCommunicatesWith);
		return sourceList.stream()
                .filter(distinctByKeys)
                .collect(Collectors.toList());    	
      /* End Protected Region   [[11651668-04c4-11ea-8fff-bb311a3ad127]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53]] */
        final Predicate<ISource> distinctByKeys = ListUtil.distinctByKeys(ISource::selectCommunicatesWith);
		return sourceList.stream()
                .filter(distinctByKeys)
                .collect(Collectors.toList());     
      /* End Protected Region   [[a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53]] */
    }

    @Override
    public java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53]] */
    	final HashSet<String> results = new HashSet<>();
    	final IDestinationSubSecurityZoneFunctions destinationfunctions = dst.extension(IDestinationSubSecurityZoneFunctions.class);
    	for( final ISource src : destinationfunctions.AllInterSourceDistinctByService()) {
    		if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith()) ) {
            	for( final ISourceSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
            		final ISourceSubSecurityZoneFunctions functions = sourceSubsecurity.extension(ISourceSubSecurityZoneFunctions.class);
            		final String grpResults = functions.RenderSourceHostGroups(src, env);
            		for( final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {            			
            			if( result.length() != 0) {
            				results.add(result);
            			}
            		}
            	}    		    			
    		}    	
    	}
    	
    	final StringBuilder builder = new StringBuilder();
    	for( final String result : results ) {
    		builder.append(result + ",");
    	}
    	return builder.toString();
      /* End Protected Region   [[3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53]] */
    }

    @Override
    public java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[81c86001-0b16-11ea-b483-3fffd745ba7d]] */
    	final HashSet<String> results = new HashSet<>();
    	final IDestinationSubSecurityZoneFunctions destinationfunctions = dst.extension(IDestinationSubSecurityZoneFunctions.class);
    	for( final ISource src : destinationfunctions.AllInterSourceDistinctByService()) {
    		if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith()) ) {
            	for( final ISourceSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
            		final ISourceSubSecurityZoneFunctions functions = sourceSubsecurity.extension(ISourceSubSecurityZoneFunctions.class);
            		final String grpResults = functions.RenderDestinationHostGroups(src, env);
            		for( final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {            			
            			if( result.length() != 0) {
            				results.add(result);           				
            			}
            		}
            		
            	}    		    			
    		}    	
    	}    	
    	final StringBuilder builder = new StringBuilder();
    	for( final String result : results ) {
    		builder.append(result + ",");
    	}
    	return builder.toString();   
      /* End Protected Region   [[81c86001-0b16-11ea-b483-3fffd745ba7d]] */
    }

    @Override
    public java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb]] */
    	final HashSet<String> results = new HashSet<>();
    	final IDestinationSubSecurityZoneFunctions destinationfunctions = dst.extension(IDestinationSubSecurityZoneFunctions.class);
    	for( final ISource src : destinationfunctions.AllIntraSourceDistinctByService()) {
    		if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith()) ) {
            	for( final ISourceSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
            		final ISourceSubSecurityZoneFunctions functions = sourceSubsecurity.extension(ISourceSubSecurityZoneFunctions.class);
            		final String grpResults = functions.RenderSourceHostGroups(src, env);
            		for( final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {            			
            			if( result.length() != 0) {
            				results.add(result);
            			}
            		}
            	}    		    			
    		}    	
    	}
    	
    	final StringBuilder builder = new StringBuilder();
    	for( final String result : results ) {
    		builder.append(result + ",");
    	}
    	return builder.toString();   
      /* End Protected Region   [[5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb]] */
    }

    @Override
    public java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb]] */
    	final HashSet<String> results = new HashSet<>();
    	final IDestinationSubSecurityZoneFunctions destinationfunctions = dst.extension(IDestinationSubSecurityZoneFunctions.class);
    	for( final ISource src : destinationfunctions.AllIntraSourceDistinctByService()) {
    		if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith()) ) {
            	for( final ISourceSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
            		final ISourceSubSecurityZoneFunctions functions = sourceSubsecurity.extension(ISourceSubSecurityZoneFunctions.class);
            		final String grpResults = functions.RenderDestinationHostGroups(src, env);
            		for( final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {            			
            			if( result.length() != 0) {
            				results.add(result);           				
            			}
            		}
            		
            	}    		    			
    		}    	
    	}    	
    	final StringBuilder builder = new StringBuilder();
    	for( final String result : results ) {
    		builder.append(result + ",");
    	}
    	return builder.toString();      
      /* End Protected Region   [[66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb]] */
    }

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).OnlyInter(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).OnlyIntra(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).GetIntraConnection(source);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).distinctBySourceAndService(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).distinctByService(sourceList);
    }

    public static java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderInterSourceHostGroups(env, dst, source);
    }

    public static java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderInterDestinationHostGroups(env, dst, source);
    }

    public static java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderIntraSourceHostGroups(env, dst, source);
    }

    public static java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderIntraDestinationHostGroups(env, dst, source);
    }

  }

  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

  }

  public static interface IDestinationSubSecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("36af6bc0-dfa3-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllServices();

    @IDynamicResourceExtension.MethodId("41d7b661-dfa3-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllServicesDistinct();

    @IDynamicResourceExtension.MethodId("10be3e5b-e041-11e9-aa67-4505845acdbd")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination Destination();

    @IDynamicResourceExtension.MethodId("7af335a7-e077-11e9-aa67-4505845acdbd")
    public java.lang.String SubLayerName(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunication communication);

    @IDynamicResourceExtension.MethodId("fb35f7dd-0b62-11ea-bef6-75a700135135")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllInterSourceDistinctByService();

    @IDynamicResourceExtension.MethodId("03f7288e-0b75-11ea-afff-b52fab62d0fd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllIntraSourceDistinctByService();

    @IDynamicResourceExtension.MethodId("46eb2383-9f4b-11ea-bb18-b13480f8c543")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> SystemConfigurations();

  }
  
  public static interface IDestinationSubSecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinationSubSecurityZoneFunctionsImpl implements IDestinationSubSecurityZoneFunctionsImpl {

    public static final IDestinationSubSecurityZoneFunctionsImpl INSTANCE = new DestinationSubSecurityZoneFunctionsImpl();

    private DestinationSubSecurityZoneFunctionsImpl() {}

  }
  
  public static class DestinationSubSecurityZoneFunctions {

    private DestinationSubSecurityZoneFunctions() {}

  }

  public static interface ISourceSubSecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73e2a655-e05b-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone> OnlyInter();

    @IDynamicResourceExtension.MethodId("3b514034-e065-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> UsedSystemConfigurationDistinct(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("2ed88ad2-e066-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> UsedSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("16752bad-09f0-11ea-baed-218c3e076b56")
    public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone SourceSubZone();

    @IDynamicResourceExtension.MethodId("b3fe9d43-0a0a-11ea-baed-218c3e076b56")
    public java.lang.String RenderSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("e3ffdf58-0a36-11ea-baed-218c3e076b56")
    public java.lang.String RenderDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("b1f1ebfa-69cf-11ea-a748-452677f0eb7c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> CommunicatesWith();

    @IDynamicResourceExtension.MethodId("29249a94-b9e7-11ea-b29c-1fc1209c2c7a")
    public java.lang.Boolean IsAny();

  }
  
  public static interface ISourceSubSecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("73e2a655-e05b-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone> sourceSubSecurityZoneList);

  }
  
  public static class SourceSubSecurityZoneFunctionsImpl implements ISourceSubSecurityZoneFunctionsImpl {

    public static final ISourceSubSecurityZoneFunctionsImpl INSTANCE = new SourceSubSecurityZoneFunctionsImpl();

    private SourceSubSecurityZoneFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone> sourceSubSecurityZoneList) {
      /* Begin Protected Region [[73e2a655-e05b-11e9-aa67-4505845acdbd]] */
    	return sourceSubSecurityZoneList.stream().filter(x -> x.selectSubZoneAccessPolicy() instanceof IInterSubZoneAccessPolicy).collect(Collectors.toList());
      /* End Protected Region   [[73e2a655-e05b-11e9-aa67-4505845acdbd]] */
    }

  }
  
  public static class SourceSubSecurityZoneFunctions {

    private SourceSubSecurityZoneFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceSubSecurityZone> sourceSubSecurityZoneList) {
      return DynamicResourceUtil.invoke(ISourceSubSecurityZoneFunctionsImpl.class, SourceSubSecurityZoneFunctionsImpl.INSTANCE, sourceSubSecurityZoneList).OnlyInter(sourceSubSecurityZoneList);
    }

  }

  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("885686bf-0ae2-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String includeMissingCommas();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("885686bf-0ae2-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String includeMissingCommas(final java.lang.String textLiteral);

  }
  
  public static class TextLiteralFunctionsImpl implements ITextLiteralFunctionsImpl {

    public static final ITextLiteralFunctionsImpl INSTANCE = new TextLiteralFunctionsImpl();

    private TextLiteralFunctionsImpl() {}

    @Override
    public java.lang.String includeMissingCommas(final java.lang.String textLiteral) {
      /* Begin Protected Region [[885686bf-0ae2-11ea-bf24-ff0f7ff0bb53]] */
    	final int maxSize = MAX_COLUMNS - 2;
    	if( textLiteral.length() == 0) {
    		return StringUtil.repeat(",", maxSize);
    	}    
    	
    	final int size = textLiteral.split(",").length;
    	if( maxSize - size < 0 ) {
    		throw new RuntimeException(String.format("Size %d for missingCommas to high", size));
    	}
    	return textLiteral + StringUtil.repeat(",", maxSize - size);
      /* End Protected Region   [[885686bf-0ae2-11ea-bf24-ff0f7ff0bb53]] */
    }

  }
  
  public static class TextLiteralFunctions {

    private TextLiteralFunctions() {}

    public static java.lang.String includeMissingCommas(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).includeMissingCommas(textLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,536f3fea-8833-11e9-80ce-fbaba21c141b,1b+xNBf3MXv2cRxx1nbCwaXoHlY=] */
