package cleon.architecturemethods.arc42.metamodel.template.graphviz;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[524ff8ae-d204-11f0-8b7f-13e33648cd53,imports]] */

/* End Protected Region   [[524ff8ae-d204-11f0-8b7f-13e33648cd53,imports]] */

public class FunctionSpace_Graphviz {

  /* Begin Protected Region [[524ff8ae-d204-11f0-8b7f-13e33648cd53]] */
  
  /* End Protected Region   [[524ff8ae-d204-11f0-8b7f-13e33648cd53]] */


  public static interface IDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6f8589cb-d204-11f0-8b7f-13e33648cd53")
    public java.lang.String RenderGraphviz();

    @IDynamicResourceExtension.MethodId("f22de40c-7ea5-11ec-b55c-f5ca121c82b7")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource> AllSourceAndDestinctSourceAndService();

    @IDynamicResourceExtension.MethodId("ae5a7fa8-7ea6-11ec-b55c-f5ca121c82b7")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource> AllDestinationAndDestinctDestinationAndService();

  }
  
  public static interface IDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinationFunctionsImpl implements IDestinationFunctionsImpl {

    public static final IDestinationFunctionsImpl INSTANCE = new DestinationFunctionsImpl();

    private DestinationFunctionsImpl() {}

  }
  
  public static class DestinationFunctions {

    private DestinationFunctions() {}

  }

  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("65f5212f-eb05-11ec-84eb-43814bf81118")
    public java.lang.String Spaces();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,524ff8ae-d204-11f0-8b7f-13e33648cd53,ne/nejSVtc0VOi3nURgWWC7pgA8=] */
