package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[adf37890-5162-11e9-bb61-971a423d31e9,imports]] */

/* End Protected Region   [[adf37890-5162-11e9-bb61-971a423d31e9,imports]] */

public class FunctionSpace_Coverage {

  /* Begin Protected Region [[adf37890-5162-11e9-bb61-971a423d31e9]] */
  
  /* End Protected Region   [[adf37890-5162-11e9-bb61-971a423d31e9]] */


  public static interface ITestRequirementCoveragesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("adf3789b-5162-11e9-bb61-971a423d31e9")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea> SelectSubjectareas();

  }
  
  public static interface ITestRequirementCoveragesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestRequirementCoveragesFunctionsImpl implements ITestRequirementCoveragesFunctionsImpl {

    public static final ITestRequirementCoveragesFunctionsImpl INSTANCE = new TestRequirementCoveragesFunctionsImpl();

    private TestRequirementCoveragesFunctionsImpl() {}

  }
  
  public static class TestRequirementCoveragesFunctions {

    private TestRequirementCoveragesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,adf37890-5162-11e9-bb61-971a423d31e9,JxjijAKCxf3MYXikA429yJlim2g=] */
