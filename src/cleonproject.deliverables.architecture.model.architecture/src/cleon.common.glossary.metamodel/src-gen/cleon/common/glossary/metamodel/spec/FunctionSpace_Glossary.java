package cleon.common.glossary.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[29100f47-cd3d-11ec-85c9-011c467ea292,imports]] */

/* End Protected Region   [[29100f47-cd3d-11ec-85c9-011c467ea292,imports]] */

public class FunctionSpace_Glossary {

  /* Begin Protected Region [[29100f47-cd3d-11ec-85c9-011c467ea292]] */
  
  /* End Protected Region   [[29100f47-cd3d-11ec-85c9-011c467ea292]] */


  public static interface ITermFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("79775c13-cd3c-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface ITermFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TermFunctionsImpl implements ITermFunctionsImpl {

    public static final ITermFunctionsImpl INSTANCE = new TermFunctionsImpl();

    private TermFunctionsImpl() {}

  }
  
  public static class TermFunctions {

    private TermFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,29100f47-cd3d-11ec-85c9-011c467ea292,vi8xTtBOM+aISebZ8NnqcKp2w6U=] */
