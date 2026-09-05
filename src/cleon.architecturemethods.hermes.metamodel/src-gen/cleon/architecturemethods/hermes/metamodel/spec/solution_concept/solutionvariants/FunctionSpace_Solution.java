package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b7500adc-d35d-11ef-a461-2ff990df4683,imports]] */

/* End Protected Region   [[b7500adc-d35d-11ef-a461-2ff990df4683,imports]] */

public class FunctionSpace_Solution {

  /* Begin Protected Region [[b7500adc-d35d-11ef-a461-2ff990df4683]] */
  
  /* End Protected Region   [[b7500adc-d35d-11ef-a461-2ff990df4683]] */


  public static interface IAbstractSolutionOptionsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c472ed5c-d35d-11ef-a461-2ff990df4683")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IAbstractSolutionOptionsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSolutionOptionsFunctionsImpl implements IAbstractSolutionOptionsFunctionsImpl {

    public static final IAbstractSolutionOptionsFunctionsImpl INSTANCE = new AbstractSolutionOptionsFunctionsImpl();

    private AbstractSolutionOptionsFunctionsImpl() {}

  }
  
  public static class AbstractSolutionOptionsFunctions {

    private AbstractSolutionOptionsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b7500adc-d35d-11ef-a461-2ff990df4683,GvKwF9EF1flBXNKPVY+uLTIC1xs=] */
