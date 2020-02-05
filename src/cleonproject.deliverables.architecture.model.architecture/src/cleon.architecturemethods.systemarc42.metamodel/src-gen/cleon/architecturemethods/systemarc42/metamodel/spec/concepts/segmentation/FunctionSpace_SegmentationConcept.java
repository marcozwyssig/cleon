package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d422151a-4607-11ea-857e-99d5aa1ed1cd,imports]] */

/* End Protected Region   [[d422151a-4607-11ea-857e-99d5aa1ed1cd,imports]] */

public class FunctionSpace_SegmentationConcept {

  /* Begin Protected Region [[d422151a-4607-11ea-857e-99d5aa1ed1cd]] */
  
  /* End Protected Region   [[d422151a-4607-11ea-857e-99d5aa1ed1cd]] */


  public static interface ISegmentationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dac350e2-4607-11ea-857e-99d5aa1ed1cd")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> GetAllZones();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d422151a-4607-11ea-857e-99d5aa1ed1cd,tbFnVkzC/oWTRPHKjoRX3wPqPQk=] */
