package cleon.architecturemethods.eamod.spec.eamod.chrv.coverage;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fa76f2b7-1be9-11e9-a3c2-fd06554474a5,imports]] */

/* End Protected Region   [[fa76f2b7-1be9-11e9-a3c2-fd06554474a5,imports]] */

public class FunctionSpace_Coverage {

  /* Begin Protected Region [[fa76f2b7-1be9-11e9-a3c2-fd06554474a5]] */
  
  /* End Protected Region   [[fa76f2b7-1be9-11e9-a3c2-fd06554474a5]] */


  public static interface IRequirementsCoveragesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ac73c269-1bec-11e9-a649-37e63f24427a")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea> SelectSubjectareas();

  }
  
  public static interface IRequirementsCoveragesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsCoveragesFunctionsImpl implements IRequirementsCoveragesFunctionsImpl {

    public static final IRequirementsCoveragesFunctionsImpl INSTANCE = new RequirementsCoveragesFunctionsImpl();

    private RequirementsCoveragesFunctionsImpl() {}

  }
  
  public static class RequirementsCoveragesFunctions {

    private RequirementsCoveragesFunctions() {}

  }

  public static interface IRequirementCoverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fedd4bfe-1bef-11e9-a649-37e63f24427a")
    public java.lang.String RenderCoverageName();

  }
  
  public static interface IRequirementCoverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementCoverFunctionsImpl implements IRequirementCoverFunctionsImpl {

    public static final IRequirementCoverFunctionsImpl INSTANCE = new RequirementCoverFunctionsImpl();

    private RequirementCoverFunctionsImpl() {}

  }
  
  public static class RequirementCoverFunctions {

    private RequirementCoverFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fa76f2b7-1be9-11e9-a3c2-fd06554474a5,b1qRpXg4mZcOJeRJacHvgMh2Yos=] */
