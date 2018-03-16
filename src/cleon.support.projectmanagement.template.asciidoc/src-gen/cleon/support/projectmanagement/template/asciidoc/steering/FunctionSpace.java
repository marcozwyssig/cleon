package cleon.support.projectmanagement.template.asciidoc.steering;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9cea9132-be09-11e6-a3f0-c7681ee45a3f,imports]] */

/* End Protected Region   [[9cea9132-be09-11e6-a3f0-c7681ee45a3f,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[9cea9132-be09-11e6-a3f0-c7681ee45a3f]] */
  
  /* End Protected Region   [[9cea9132-be09-11e6-a3f0-c7681ee45a3f]] */


  public static interface IModuleControllingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f3aea6a-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("9f3aeaa3-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.String RenderChapters();

  }
  
  public static interface IModuleControllingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModuleControllingFunctionsImpl implements IModuleControllingFunctionsImpl {

    public static final IModuleControllingFunctionsImpl INSTANCE = new ModuleControllingFunctionsImpl();

    private ModuleControllingFunctionsImpl() {}

  }
  
  public static class ModuleControllingFunctions {

    private ModuleControllingFunctions() {}

  }

  public static interface IModuleRisksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f3b12b4-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IModuleRisksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModuleRisksFunctionsImpl implements IModuleRisksFunctionsImpl {

    public static final IModuleRisksFunctionsImpl INSTANCE = new ModuleRisksFunctionsImpl();

    private ModuleRisksFunctionsImpl() {}

  }
  
  public static class ModuleRisksFunctions {

    private ModuleRisksFunctions() {}

  }

  public static interface IModuleLampFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f3b12da-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.String RenderState();

    @IDynamicResourceExtension.MethodId("9f3b12e8-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.String RenderDescription();

  }
  
  public static interface IModuleLampFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModuleLampFunctionsImpl implements IModuleLampFunctionsImpl {

    public static final IModuleLampFunctionsImpl INSTANCE = new ModuleLampFunctionsImpl();

    private ModuleLampFunctionsImpl() {}

  }
  
  public static class ModuleLampFunctions {

    private ModuleLampFunctions() {}

  }

  public static interface IModuleLampStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f3b12eb-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.Boolean IsRed();

    @IDynamicResourceExtension.MethodId("9f3b12ed-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.Boolean IsYellow();

    @IDynamicResourceExtension.MethodId("9f3b12ef-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.Boolean IsGreen();

  }
  
  public static interface IModuleLampStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9f3b12eb-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.Boolean IsRed(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState);

    @IDynamicResourceExtension.MethodId("9f3b12ed-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.Boolean IsYellow(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState);

    @IDynamicResourceExtension.MethodId("9f3b12ef-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.Boolean IsGreen(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState);

  }
  
  public static class ModuleLampStateFunctionsImpl implements IModuleLampStateFunctionsImpl {

    public static final IModuleLampStateFunctionsImpl INSTANCE = new ModuleLampStateFunctionsImpl();

    private ModuleLampStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsRed(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState) {
      return moduleLampState.isRed();
    }

    @Override
    public java.lang.Boolean IsYellow(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState) {
      return moduleLampState.isYellow();
    }

    @Override
    public java.lang.Boolean IsGreen(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState) {
      return moduleLampState.isGreen();
    }

  }
  
  public static class ModuleLampStateFunctions {

    private ModuleLampStateFunctions() {}

    public static java.lang.Boolean IsRed(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState) {
      return DynamicResourceUtil.invoke(IModuleLampStateFunctionsImpl.class, ModuleLampStateFunctionsImpl.INSTANCE, moduleLampState).IsRed(moduleLampState);
    }

    public static java.lang.Boolean IsYellow(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState) {
      return DynamicResourceUtil.invoke(IModuleLampStateFunctionsImpl.class, ModuleLampStateFunctionsImpl.INSTANCE, moduleLampState).IsYellow(moduleLampState);
    }

    public static java.lang.Boolean IsGreen(final cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState moduleLampState) {
      return DynamicResourceUtil.invoke(IModuleLampStateFunctionsImpl.class, ModuleLampStateFunctionsImpl.INSTANCE, moduleLampState).IsGreen(moduleLampState);
    }

  }

  public static interface IModuleImpedimentsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f3b39b0-be09-11e6-a3f0-c7681ee45a3f")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IModuleImpedimentsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModuleImpedimentsFunctionsImpl implements IModuleImpedimentsFunctionsImpl {

    public static final IModuleImpedimentsFunctionsImpl INSTANCE = new ModuleImpedimentsFunctionsImpl();

    private ModuleImpedimentsFunctionsImpl() {}

  }
  
  public static class ModuleImpedimentsFunctions {

    private ModuleImpedimentsFunctions() {}

  }

  public static interface IImpedimentsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("403315c0-3387-11e6-b251-57783f5929b3")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IImpedimentsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImpedimentsFunctionsImpl implements IImpedimentsFunctionsImpl {

    public static final IImpedimentsFunctionsImpl INSTANCE = new ImpedimentsFunctionsImpl();

    private ImpedimentsFunctionsImpl() {}

  }
  
  public static class ImpedimentsFunctions {

    private ImpedimentsFunctions() {}

  }

  public static interface IRisksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ededf7e6-2f0b-11e6-8bd9-a77b8d2a3a0e")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRisksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RisksFunctionsImpl implements IRisksFunctionsImpl {

    public static final IRisksFunctionsImpl INSTANCE = new RisksFunctionsImpl();

    private RisksFunctionsImpl() {}

  }
  
  public static class RisksFunctions {

    private RisksFunctions() {}

  }

  public static interface IAssessmentsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0dff656f-3251-11e6-ab4d-73a9260c8088")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAssessmentsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AssessmentsFunctionsImpl implements IAssessmentsFunctionsImpl {

    public static final IAssessmentsFunctionsImpl INSTANCE = new AssessmentsFunctionsImpl();

    private AssessmentsFunctionsImpl() {}

  }
  
  public static class AssessmentsFunctions {

    private AssessmentsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9cea9132-be09-11e6-a3f0-c7681ee45a3f,1N7c1+928MSdVXI225a6Xopfl74=] */
