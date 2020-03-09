package cleon.architecturemethods.systemarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f1b62d92-0d00-11e9-be4f-03130cc057ef,imports]] */

/* End Protected Region   [[f1b62d92-0d00-11e9-be4f-03130cc057ef,imports]] */

public class FunctionSpace_Segmentation_Docbook {

  /* Begin Protected Region [[f1b62d92-0d00-11e9-be4f-03130cc057ef]] */
  
  /* End Protected Region   [[f1b62d92-0d00-11e9-be4f-03130cc057ef]] */


  public static interface ISegmentationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4047d49d-0d1e-11e9-be4f-03130cc057ef")
    public java.lang.String Old_RenderContentElement();

  }
  
  public static interface ISegmentationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentationFunctionsImpl implements ISegmentationFunctionsImpl {

    public static final ISegmentationFunctionsImpl INSTANCE = new SegmentationFunctionsImpl();

    private SegmentationFunctionsImpl() {}

  }
  
  public static class SegmentationFunctions {

    private SegmentationFunctions() {}

  }

  public static interface ISegmentationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb430c4c-0e21-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderChapters();

  }
  
  public static interface ISegmentationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentationConceptFunctionsImpl implements ISegmentationConceptFunctionsImpl {

    public static final ISegmentationConceptFunctionsImpl INSTANCE = new SegmentationConceptFunctionsImpl();

    private SegmentationConceptFunctionsImpl() {}

  }
  
  public static class SegmentationConceptFunctions {

    private SegmentationConceptFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f1b62d92-0d00-11e9-be4f-03130cc057ef,tq8zk22Dyno0CJX/NK9GKkKS6ao=] */
