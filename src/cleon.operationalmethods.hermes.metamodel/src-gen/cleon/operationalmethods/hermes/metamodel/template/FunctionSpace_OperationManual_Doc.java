package cleon.operationalmethods.hermes.metamodel.template;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ae974293-994e-11ec-ac2c-1f8a98b38b26,imports]] */

/* End Protected Region   [[ae974293-994e-11ec-ac2c-1f8a98b38b26,imports]] */

public class FunctionSpace_OperationManual_Doc {

  /* Begin Protected Region [[ae974293-994e-11ec-ac2c-1f8a98b38b26]] */
  
  /* End Protected Region   [[ae974293-994e-11ec-ac2c-1f8a98b38b26]] */


  public static interface IOperatingManualFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c9cb382e-994e-11ec-ac2c-1f8a98b38b26")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface IOperatingManualFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OperatingManualFunctionsImpl implements IOperatingManualFunctionsImpl {

    public static final IOperatingManualFunctionsImpl INSTANCE = new OperatingManualFunctionsImpl();

    private OperatingManualFunctionsImpl() {}

  }
  
  public static class OperatingManualFunctions {

    private OperatingManualFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ae974293-994e-11ec-ac2c-1f8a98b38b26,38wgDVaGHCc403WFv7WSV7Pj/yc=] */
