package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5353461a-4f8d-11e9-ad5d-977b17aab907,imports]] */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.IAbstractTestPrecondition;
import cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition;
import cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition;

/* End Protected Region   [[5353461a-4f8d-11e9-ad5d-977b17aab907,imports]] */

public class FunctionSpace_DynamicTest {

  /* Begin Protected Region [[5353461a-4f8d-11e9-ad5d-977b17aab907]] */
  
  /* End Protected Region   [[5353461a-4f8d-11e9-ad5d-977b17aab907]] */


  public static interface IFunctionalDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8aef9268-4f8d-11e9-ad5d-977b17aab907")
    public java.lang.String GetName();

  }
  
  public static interface IFunctionalDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionalDynamicTestFunctionsImpl implements IFunctionalDynamicTestFunctionsImpl {

    public static final IFunctionalDynamicTestFunctionsImpl INSTANCE = new FunctionalDynamicTestFunctionsImpl();

    private FunctionalDynamicTestFunctionsImpl() {}

  }
  
  public static class FunctionalDynamicTestFunctions {

    private FunctionalDynamicTestFunctions() {}

  }

  public static interface IQualityDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7a66937-4f8d-11e9-ad5d-977b17aab907")
    public java.lang.String GetName();

  }
  
  public static interface IQualityDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QualityDynamicTestFunctionsImpl implements IQualityDynamicTestFunctionsImpl {

    public static final IQualityDynamicTestFunctionsImpl INSTANCE = new QualityDynamicTestFunctionsImpl();

    private QualityDynamicTestFunctionsImpl() {}

  }
  
  public static class QualityDynamicTestFunctions {

    private QualityDynamicTestFunctions() {}

  }

  public static interface IDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8af66c32-5166-11e9-bb61-971a423d31e9")
    public java.lang.String GetTestName();

    @IDynamicResourceExtension.MethodId("d8bc7687-6b31-11e9-bd30-87fcf852dea7")
    public List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestInfrastractureAware> GetAllPrecondition();

    @IDynamicResourceExtension.MethodId("2f38f888-7191-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup GetGlobalPreconditionGroup();

  }
  
  public static interface IDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DynamicTestFunctionsImpl implements IDynamicTestFunctionsImpl {

    public static final IDynamicTestFunctionsImpl INSTANCE = new DynamicTestFunctionsImpl();

    private DynamicTestFunctionsImpl() {}

  }
  
  public static class DynamicTestFunctions {

    private DynamicTestFunctions() {}

  }

  public static interface IUsedTestGlobalPreconditionGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d8cc38d1-6b32-11e9-bd30-87fcf852dea7")
    public List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.IAbstractTestPrecondition> GetPreconditions();

  }
  
  public static interface IUsedTestGlobalPreconditionGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d8cc38d1-6b32-11e9-bd30-87fcf852dea7")
    public List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.IAbstractTestPrecondition> GetPreconditions(final cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup usedTestGlobalPreconditionGroup);

  }
  
  public static class UsedTestGlobalPreconditionGroupFunctionsImpl implements IUsedTestGlobalPreconditionGroupFunctionsImpl {

    public static final IUsedTestGlobalPreconditionGroupFunctionsImpl INSTANCE = new UsedTestGlobalPreconditionGroupFunctionsImpl();

    private UsedTestGlobalPreconditionGroupFunctionsImpl() {}

    @Override
    public List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.IAbstractTestPrecondition> GetPreconditions(final cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup usedTestGlobalPreconditionGroup) {
      /* Begin Protected Region [[d8cc38d1-6b32-11e9-bd30-87fcf852dea7]] */
    	List<IAbstractTestPrecondition> resultPreconditions = new ArrayList<>();
    	
		for( ITestPrecondition iterPrecondition : usedTestGlobalPreconditionGroup.selectTestGlobalPrecondition().selectTestPreconditions()) 
    	{	
    		if(usedTestGlobalPreconditionGroup.selectTestOverridePrecondition().containsKey(iterPrecondition.getResource()))
    		{
    			resultPreconditions.add(usedTestGlobalPreconditionGroup.selectTestOverridePrecondition().get(iterPrecondition.getResource()));
    		}
    		else
    		{
    			resultPreconditions.add(iterPrecondition);
    		}    			
    	}
    	return resultPreconditions;
   
      /* End Protected Region   [[d8cc38d1-6b32-11e9-bd30-87fcf852dea7]] */
    }

  }
  
  public static class UsedTestGlobalPreconditionGroupFunctions {

    private UsedTestGlobalPreconditionGroupFunctions() {}

    public static List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.IAbstractTestPrecondition> GetPreconditions(final cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup usedTestGlobalPreconditionGroup) {
      return DynamicResourceUtil.invoke(IUsedTestGlobalPreconditionGroupFunctionsImpl.class, UsedTestGlobalPreconditionGroupFunctionsImpl.INSTANCE, usedTestGlobalPreconditionGroup).GetPreconditions(usedTestGlobalPreconditionGroup);
    }

  }

  public static interface IGlobalPreconditionsAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("02863fe6-7191-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup GetGlobalPreconditionGroup();

  }
  
  public static interface IGlobalPreconditionsAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GlobalPreconditionsAwareFunctionsImpl implements IGlobalPreconditionsAwareFunctionsImpl {

    public static final IGlobalPreconditionsAwareFunctionsImpl INSTANCE = new GlobalPreconditionsAwareFunctionsImpl();

    private GlobalPreconditionsAwareFunctionsImpl() {}

  }
  
  public static class GlobalPreconditionsAwareFunctions {

    private GlobalPreconditionsAwareFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5353461a-4f8d-11e9-ad5d-977b17aab907,KVYHWBCuie6QHQcfIHfFmbiaXBk=] */
