package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5d7c5d12-2479-11f1-8a5a-5da401746046,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.ServicelayerPackage;

/* End Protected Region   [[5d7c5d12-2479-11f1-8a5a-5da401746046,imports]] */

public class FunctionSpace_Architecture_Patterns {

  /* Begin Protected Region [[5d7c5d12-2479-11f1-8a5a-5da401746046]] */
  
  /* End Protected Region   [[5d7c5d12-2479-11f1-8a5a-5da401746046]] */


  public static interface IComponentByTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("664ab281-2479-11f1-8a5a-5da401746046")
    public java.lang.String Object();

  }
  
  public static interface IComponentByTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("664ab281-2479-11f1-8a5a-5da401746046")
    public java.lang.String Object(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate componentByTemplate);

  }
  
  public static class ComponentByTemplateFunctionsImpl implements IComponentByTemplateFunctionsImpl {

    public static final IComponentByTemplateFunctionsImpl INSTANCE = new ComponentByTemplateFunctionsImpl();

    private ComponentByTemplateFunctionsImpl() {}

    @Override
    public java.lang.String Object(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate componentByTemplate) {
      /* Begin Protected Region [[664ab281-2479-11f1-8a5a-5da401746046]] */
    	return Architecture_patternPackage.ComponentByTemplate_components.getId().asGuid();
      /* End Protected Region   [[664ab281-2479-11f1-8a5a-5da401746046]] */
    }

  }
  
  public static class ComponentByTemplateFunctions {

    private ComponentByTemplateFunctions() {}

    public static java.lang.String Object(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate componentByTemplate) {
      return DynamicResourceUtil.invoke(IComponentByTemplateFunctionsImpl.class, ComponentByTemplateFunctionsImpl.INSTANCE, componentByTemplate).Object(componentByTemplate);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5d7c5d12-2479-11f1-8a5a-5da401746046,P2lvzVyVJIE8P/TWEK6u43+TYHk=] */
