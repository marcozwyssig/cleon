package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3fed1da8-d33b-11ef-802e-175af1a41dfa,imports]] */

/* End Protected Region   [[3fed1da8-d33b-11ef-802e-175af1a41dfa,imports]] */

public class FunctionSpace_Requirements {

  /* Begin Protected Region [[3fed1da8-d33b-11ef-802e-175af1a41dfa]] */
  
  /* End Protected Region   [[3fed1da8-d33b-11ef-802e-175af1a41dfa]] */


  public static interface IRequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("46beb88f-d33b-11ef-802e-175af1a41dfa")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IRequirementsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsFunctionsImpl implements IRequirementsFunctionsImpl {

    public static final IRequirementsFunctionsImpl INSTANCE = new RequirementsFunctionsImpl();

    private RequirementsFunctionsImpl() {}

  }
  
  public static class RequirementsFunctions {

    private RequirementsFunctions() {}

  }

  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("adaf9b3d-d33c-11ef-802e-175af1a41dfa")
    public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3fed1da8-d33b-11ef-802e-175af1a41dfa,8edlI59oPgqEZIGK5EAftJOObNc=] */
