package cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2f80f055-ac13-11ef-afba-fb66280e2230,imports]] */

/* End Protected Region   [[2f80f055-ac13-11ef-afba-fb66280e2230,imports]] */

public class FunctionSpace_Architecture_Constraints {

  /* Begin Protected Region [[2f80f055-ac13-11ef-afba-fb66280e2230]] */
  
  /* End Protected Region   [[2f80f055-ac13-11ef-afba-fb66280e2230]] */


  public static interface ITechnicalConstraintFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3f5166c7-ac13-11ef-afba-fb66280e2230")
    public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface ITechnicalConstraintFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnicalConstraintFunctionsImpl implements ITechnicalConstraintFunctionsImpl {

    public static final ITechnicalConstraintFunctionsImpl INSTANCE = new TechnicalConstraintFunctionsImpl();

    private TechnicalConstraintFunctionsImpl() {}

  }
  
  public static class TechnicalConstraintFunctions {

    private TechnicalConstraintFunctions() {}

  }

  public static interface IOrganizationalConstraintFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7d487069-ac13-11ef-afba-fb66280e2230")
    public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IOrganizationalConstraintFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OrganizationalConstraintFunctionsImpl implements IOrganizationalConstraintFunctionsImpl {

    public static final IOrganizationalConstraintFunctionsImpl INSTANCE = new OrganizationalConstraintFunctionsImpl();

    private OrganizationalConstraintFunctionsImpl() {}

  }
  
  public static class OrganizationalConstraintFunctions {

    private OrganizationalConstraintFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2f80f055-ac13-11ef-afba-fb66280e2230,l1KaEC+iuY/uNKUo8dZ2Nl0TSWE=] */
