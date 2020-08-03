package cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2788307c-052b-11e9-95f7-3b0c47908608,imports]] */

/* End Protected Region   [[2788307c-052b-11e9-95f7-3b0c47908608,imports]] */

public class FunctionSpace_DomainContext {

  /* Begin Protected Region [[2788307c-052b-11e9-95f7-3b0c47908608]] */
  
  /* End Protected Region   [[2788307c-052b-11e9-95f7-3b0c47908608]] */


  public static interface IDomainContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2d5923e2-052b-11e9-95f7-3b0c47908608")
    public List<cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> SelectAllComponents();

    @IDynamicResourceExtension.MethodId("d148c2de-052b-11e9-95f7-3b0c47908608")
    public List<cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> SelectAllComponentsDistinct();

    @IDynamicResourceExtension.MethodId("0b0d2cb2-01e2-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderStandardDescription();

  }
  
  public static interface IDomainContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DomainContextFunctionsImpl implements IDomainContextFunctionsImpl {

    public static final IDomainContextFunctionsImpl INSTANCE = new DomainContextFunctionsImpl();

    private DomainContextFunctionsImpl() {}

  }
  
  public static class DomainContextFunctions {

    private DomainContextFunctions() {}

  }

  public static interface IDomainFlow_InFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("599e9b79-052b-11e9-95f7-3b0c47908608")
    public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent GetComponent();

  }
  
  public static interface IDomainFlow_InFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DomainFlow_InFunctionsImpl implements IDomainFlow_InFunctionsImpl {

    public static final IDomainFlow_InFunctionsImpl INSTANCE = new DomainFlow_InFunctionsImpl();

    private DomainFlow_InFunctionsImpl() {}

  }
  
  public static class DomainFlow_InFunctions {

    private DomainFlow_InFunctions() {}

  }

  public static interface IDomainFlow_OutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b31d3859-052b-11e9-95f7-3b0c47908608")
    public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent GetComponent();

  }
  
  public static interface IDomainFlow_OutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DomainFlow_OutFunctionsImpl implements IDomainFlow_OutFunctionsImpl {

    public static final IDomainFlow_OutFunctionsImpl INSTANCE = new DomainFlow_OutFunctionsImpl();

    private DomainFlow_OutFunctionsImpl() {}

  }
  
  public static class DomainFlow_OutFunctions {

    private DomainFlow_OutFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2788307c-052b-11e9-95f7-3b0c47908608,vQIB8TvoCblfEa3Hs49zHvuc5VI=] */
