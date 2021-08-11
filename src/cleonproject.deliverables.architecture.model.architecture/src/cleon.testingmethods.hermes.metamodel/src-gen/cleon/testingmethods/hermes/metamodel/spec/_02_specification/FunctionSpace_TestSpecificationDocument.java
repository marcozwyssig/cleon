package cleon.testingmethods.hermes.metamodel.spec._02_specification;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[71c344e3-51af-11e9-9ffb-eb7c70212990,imports]] */

/* End Protected Region   [[71c344e3-51af-11e9-9ffb-eb7c70212990,imports]] */

public class FunctionSpace_TestSpecificationDocument {

  /* Begin Protected Region [[71c344e3-51af-11e9-9ffb-eb7c70212990]] */
  
  /* End Protected Region   [[71c344e3-51af-11e9-9ffb-eb7c70212990]] */


  public static interface ITestSpecificationDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("80c68059-51af-11e9-9ffb-eb7c70212990")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface ITestSpecificationDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestSpecificationDocumentFunctionsImpl implements ITestSpecificationDocumentFunctionsImpl {

    public static final ITestSpecificationDocumentFunctionsImpl INSTANCE = new TestSpecificationDocumentFunctionsImpl();

    private TestSpecificationDocumentFunctionsImpl() {}

  }
  
  public static class TestSpecificationDocumentFunctions {

    private TestSpecificationDocumentFunctions() {}

  }

  public static interface ITestSpecificationDocumentsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f1d60576-fa98-11eb-be75-2537968f2820")
    public cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.ITestConceptDocument TestConcept();

  }
  
  public static interface ITestSpecificationDocumentsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestSpecificationDocumentsFunctionsImpl implements ITestSpecificationDocumentsFunctionsImpl {

    public static final ITestSpecificationDocumentsFunctionsImpl INSTANCE = new TestSpecificationDocumentsFunctionsImpl();

    private TestSpecificationDocumentsFunctionsImpl() {}

  }
  
  public static class TestSpecificationDocumentsFunctions {

    private TestSpecificationDocumentsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,71c344e3-51af-11e9-9ffb-eb7c70212990,P5YnfMeEN//UgV7th1PsYYsb3fQ=] */
