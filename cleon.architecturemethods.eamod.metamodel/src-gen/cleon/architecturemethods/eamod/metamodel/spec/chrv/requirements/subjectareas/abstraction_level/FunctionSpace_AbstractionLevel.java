package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[944d3df2-e5f0-11e5-950a-cb0c4b71716c,imports]] */

/* End Protected Region   [[944d3df2-e5f0-11e5-950a-cb0c4b71716c,imports]] */

public class FunctionSpace_AbstractionLevel {

  /* Begin Protected Region [[944d3df2-e5f0-11e5-950a-cb0c4b71716c]] */
  
  /* End Protected Region   [[944d3df2-e5f0-11e5-950a-cb0c4b71716c]] */


  public static interface IAbstractionLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9e661573-e5f0-11e5-950a-cb0c4b71716c")
    public java.lang.String GetAbbreviation();

  }
  
  public static interface IAbstractionLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractionLevelFunctionsImpl implements IAbstractionLevelFunctionsImpl {

    public static final IAbstractionLevelFunctionsImpl INSTANCE = new AbstractionLevelFunctionsImpl();

    private AbstractionLevelFunctionsImpl() {}

  }
  
  public static class AbstractionLevelFunctions {

    private AbstractionLevelFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,944d3df2-e5f0-11e5-950a-cb0c4b71716c,RcLQN3fdUAOXTufIT6bYsG9BFYE=] */
