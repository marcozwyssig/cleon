package cleon.architecturemethods.systemarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

/* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

public class FunctionSpace_Docbook_ItArc42 {

  /* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */
  
  /* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */


  public static interface ISystemArc42DocumentFunctions extends IDynamicResourceExtension {

  }
  
  public static interface ISystemArc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemArc42DocumentFunctionsImpl implements ISystemArc42DocumentFunctionsImpl {

    public static final ISystemArc42DocumentFunctionsImpl INSTANCE = new SystemArc42DocumentFunctionsImpl();

    private SystemArc42DocumentFunctionsImpl() {}

  }
  
  public static class SystemArc42DocumentFunctions {

    private SystemArc42DocumentFunctions() {}

  }

  public static interface INetworkConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d97e499e-61d2-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters();

  }
  
  public static interface INetworkConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d97e499e-61d2-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept networkConcept);

  }
  
  public static class NetworkConceptFunctionsImpl implements INetworkConceptFunctionsImpl {

    public static final INetworkConceptFunctionsImpl INSTANCE = new NetworkConceptFunctionsImpl();

    private NetworkConceptFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept networkConcept) {
      return null;
    }

  }
  
  public static class NetworkConceptFunctions {

    private NetworkConceptFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept networkConcept) {
      return DynamicResourceUtil.invoke(INetworkConceptFunctionsImpl.class, NetworkConceptFunctionsImpl.INSTANCE, networkConcept).RenderChapters(networkConcept);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fb58b09d-d181-11e8-b18f-df1540bb7a5c,1g/zgzLuP6kWKTPfBvXC4r97PVc=] */
