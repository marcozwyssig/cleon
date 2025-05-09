package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c6f7726e-95c6-11ea-9744-7dd962dc1878,imports]] */

/* End Protected Region   [[c6f7726e-95c6-11ea-9744-7dd962dc1878,imports]] */

public class FunctionSpace_Conducting {

  /* Begin Protected Region [[c6f7726e-95c6-11ea-9744-7dd962dc1878]] */
  
  /* End Protected Region   [[c6f7726e-95c6-11ea-9744-7dd962dc1878]] */


  public static interface IConductingAndSupervisingSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cded376b-95c6-11ea-9744-7dd962dc1878")
    public List<ch.actifsource.core.javamodel.IResource> ChapterOrder();

  }
  
  public static interface IConductingAndSupervisingSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConductingAndSupervisingSystemConfigurationFunctionsImpl implements IConductingAndSupervisingSystemConfigurationFunctionsImpl {

    public static final IConductingAndSupervisingSystemConfigurationFunctionsImpl INSTANCE = new ConductingAndSupervisingSystemConfigurationFunctionsImpl();

    private ConductingAndSupervisingSystemConfigurationFunctionsImpl() {}

  }
  
  public static class ConductingAndSupervisingSystemConfigurationFunctions {

    private ConductingAndSupervisingSystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c6f7726e-95c6-11ea-9744-7dd962dc1878,RrCQqnIYpVzzgsJnBYPScmNTqh0=] */
