package cleon.architecturemethods.eamod.metamodel.spec.chrv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cee52fb0-52eb-11ea-939d-7ff813a040ec,imports]] */

/* End Protected Region   [[cee52fb0-52eb-11ea-939d-7ff813a040ec,imports]] */

public class FunctionSpace_CHRV {

  /* Begin Protected Region [[cee52fb0-52eb-11ea-939d-7ff813a040ec]] */
  
  /* End Protected Region   [[cee52fb0-52eb-11ea-939d-7ff813a040ec]] */


  public static interface IRequirementsDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("18dae6df-52ec-11ea-939d-7ff813a040ec")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface IRequirementsDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsDocumentFunctionsImpl implements IRequirementsDocumentFunctionsImpl {

    public static final IRequirementsDocumentFunctionsImpl INSTANCE = new RequirementsDocumentFunctionsImpl();

    private RequirementsDocumentFunctionsImpl() {}

  }
  
  public static class RequirementsDocumentFunctions {

    private RequirementsDocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cee52fb0-52eb-11ea-939d-7ff813a040ec,Gt6BPxw4VI2JrIkks2bORxm6RL8=] */
