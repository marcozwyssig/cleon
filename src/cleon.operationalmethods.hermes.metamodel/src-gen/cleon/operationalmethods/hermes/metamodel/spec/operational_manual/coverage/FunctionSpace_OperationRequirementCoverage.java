package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[dfea1164-1bf4-11e9-9d15-bdc420ac8f00,imports]] */

/* End Protected Region   [[dfea1164-1bf4-11e9-9d15-bdc420ac8f00,imports]] */

public class FunctionSpace_OperationRequirementCoverage {

  /* Begin Protected Region [[dfea1164-1bf4-11e9-9d15-bdc420ac8f00]] */
  
  /* End Protected Region   [[dfea1164-1bf4-11e9-9d15-bdc420ac8f00]] */


  public static interface IOperationRequirementsCoveragesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("03c09161-1bf5-11e9-9d15-bdc420ac8f00")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea> SelectSubjectareas();

  }
  
  public static interface IOperationRequirementsCoveragesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OperationRequirementsCoveragesFunctionsImpl implements IOperationRequirementsCoveragesFunctionsImpl {

    public static final IOperationRequirementsCoveragesFunctionsImpl INSTANCE = new OperationRequirementsCoveragesFunctionsImpl();

    private OperationRequirementsCoveragesFunctionsImpl() {}

  }
  
  public static class OperationRequirementsCoveragesFunctions {

    private OperationRequirementsCoveragesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,dfea1164-1bf4-11e9-9d15-bdc420ac8f00,5mgY9F98ALrwVrunhqZmX1VnqR0=] */
