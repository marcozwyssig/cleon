package cleon.sda.spec.requirementsmanagement.requirements.abstraction_level;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[944d3df2-e5f0-11e5-950a-cb0c4b71716c,imports]] */

/* End Protected Region   [[944d3df2-e5f0-11e5-950a-cb0c4b71716c,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[944d3df2-e5f0-11e5-950a-cb0c4b71716c]] */
  
  /* End Protected Region   [[944d3df2-e5f0-11e5-950a-cb0c4b71716c]] */


  public static interface IAbstractionLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9e661573-e5f0-11e5-950a-cb0c4b71716c")
    public java.lang.String GetAbbreviation();

  }
  
  public static interface IAbstractionLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractionLevelFunctionsImpl implements IAbstractionLevelFunctionsImpl {

    public static final IAbstractionLevelFunctionsImpl INSTANCE = new AbstractionLevelFunctionsImpl();

    private AbstractionLevelFunctionsImpl() {}

  }
  
  public static class AbstractionLevelFunctions {

    private AbstractionLevelFunctions() {}

  }

  public static interface ICapabilityLevelGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b3b4087f-e5f0-11e5-950a-cb0c4b71716c")
    public java.lang.String GetAbbreviation();

  }
  
  public static interface ICapabilityLevelGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CapabilityLevelGroupFunctionsImpl implements ICapabilityLevelGroupFunctionsImpl {

    public static final ICapabilityLevelGroupFunctionsImpl INSTANCE = new CapabilityLevelGroupFunctionsImpl();

    private CapabilityLevelGroupFunctionsImpl() {}

  }
  
  public static class CapabilityLevelGroupFunctions {

    private CapabilityLevelGroupFunctions() {}

  }

  public static interface IComponentLevelGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ca5dbabc-e5f0-11e5-950a-cb0c4b71716c")
    public java.lang.String GetAbbreviation();

  }
  
  public static interface IComponentLevelGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ComponentLevelGroupFunctionsImpl implements IComponentLevelGroupFunctionsImpl {

    public static final IComponentLevelGroupFunctionsImpl INSTANCE = new ComponentLevelGroupFunctionsImpl();

    private ComponentLevelGroupFunctionsImpl() {}

  }
  
  public static class ComponentLevelGroupFunctions {

    private ComponentLevelGroupFunctions() {}

  }

  public static interface IFeatureLevelGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ce424754-e5f0-11e5-950a-cb0c4b71716c")
    public java.lang.String GetAbbreviation();

  }
  
  public static interface IFeatureLevelGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FeatureLevelGroupFunctionsImpl implements IFeatureLevelGroupFunctionsImpl {

    public static final IFeatureLevelGroupFunctionsImpl INSTANCE = new FeatureLevelGroupFunctionsImpl();

    private FeatureLevelGroupFunctionsImpl() {}

  }
  
  public static class FeatureLevelGroupFunctions {

    private FeatureLevelGroupFunctions() {}

  }

  public static interface IFunctionLevelGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d8ee5d4c-e5f0-11e5-950a-cb0c4b71716c")
    public java.lang.String GetAbbreviation();

  }
  
  public static interface IFunctionLevelGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionLevelGroupFunctionsImpl implements IFunctionLevelGroupFunctionsImpl {

    public static final IFunctionLevelGroupFunctionsImpl INSTANCE = new FunctionLevelGroupFunctionsImpl();

    private FunctionLevelGroupFunctionsImpl() {}

  }
  
  public static class FunctionLevelGroupFunctions {

    private FunctionLevelGroupFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,944d3df2-e5f0-11e5-950a-cb0c4b71716c,MPiQJHGnoRnLcfkeO9BIXoUZQdM=] */
