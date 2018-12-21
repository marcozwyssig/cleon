package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bc58e3f2-052d-11e9-95f7-3b0c47908608,imports]] */

/* End Protected Region   [[bc58e3f2-052d-11e9-95f7-3b0c47908608,imports]] */

public class FunctionSpace_TechnicalContext {

  /* Begin Protected Region [[bc58e3f2-052d-11e9-95f7-3b0c47908608]] */
  
  /* End Protected Region   [[bc58e3f2-052d-11e9-95f7-3b0c47908608]] */


  public static interface ITechnicalContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bc58e404-052d-11e9-95f7-3b0c47908608")
    public List<cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent> SelectAllComponents();

    @IDynamicResourceExtension.MethodId("bc58e40c-052d-11e9-95f7-3b0c47908608")
    public List<cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent> SelectAllComponentsDistinct();

  }
  
  public static interface ITechnicalContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnicalContextFunctionsImpl implements ITechnicalContextFunctionsImpl {

    public static final ITechnicalContextFunctionsImpl INSTANCE = new TechnicalContextFunctionsImpl();

    private TechnicalContextFunctionsImpl() {}

  }
  
  public static class TechnicalContextFunctions {

    private TechnicalContextFunctions() {}

  }

  public static interface IPort_RequiredFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fddf2eab-052d-11e9-95f7-3b0c47908608")
    public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent SelectAllComponents();

  }
  
  public static interface IPort_RequiredFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Port_RequiredFunctionsImpl implements IPort_RequiredFunctionsImpl {

    public static final IPort_RequiredFunctionsImpl INSTANCE = new Port_RequiredFunctionsImpl();

    private Port_RequiredFunctionsImpl() {}

  }
  
  public static class Port_RequiredFunctions {

    private Port_RequiredFunctions() {}

  }

  public static interface IPort_ProviderFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1c716abd-052e-11e9-95f7-3b0c47908608")
    public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent SelectAllComponents();

  }
  
  public static interface IPort_ProviderFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Port_ProviderFunctionsImpl implements IPort_ProviderFunctionsImpl {

    public static final IPort_ProviderFunctionsImpl INSTANCE = new Port_ProviderFunctionsImpl();

    private Port_ProviderFunctionsImpl() {}

  }
  
  public static class Port_ProviderFunctions {

    private Port_ProviderFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bc58e3f2-052d-11e9-95f7-3b0c47908608,LwbTEBwV4hh9MC4Bm+dhQQlR7Ws=] */
