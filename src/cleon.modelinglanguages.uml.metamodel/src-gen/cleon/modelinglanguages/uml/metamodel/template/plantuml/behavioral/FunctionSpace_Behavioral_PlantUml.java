package cleon.modelinglanguages.uml.metamodel.template.plantuml.behavioral;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fd8e4392-fa40-11e8-af47-e5bdd8100025,imports]] */

/* End Protected Region   [[fd8e4392-fa40-11e8-af47-e5bdd8100025,imports]] */

public class FunctionSpace_Behavioral_PlantUml {

  /* Begin Protected Region [[fd8e4392-fa40-11e8-af47-e5bdd8100025]] */
  
  /* End Protected Region   [[fd8e4392-fa40-11e8-af47-e5bdd8100025]] */


  public static interface IStateMachineDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fc072c5c-3537-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface IStateMachineDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StateMachineDiagramFunctionsImpl implements IStateMachineDiagramFunctionsImpl {

    public static final IStateMachineDiagramFunctionsImpl INSTANCE = new StateMachineDiagramFunctionsImpl();

    private StateMachineDiagramFunctionsImpl() {}

  }
  
  public static class StateMachineDiagramFunctions {

    private StateMachineDiagramFunctions() {}

  }

  public static interface ISequenceDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("88ea447b-de57-11ef-81c7-3391f050addb")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface ISequenceDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SequenceDiagramFunctionsImpl implements ISequenceDiagramFunctionsImpl {

    public static final ISequenceDiagramFunctionsImpl INSTANCE = new SequenceDiagramFunctionsImpl();

    private SequenceDiagramFunctionsImpl() {}

  }
  
  public static class SequenceDiagramFunctions {

    private SequenceDiagramFunctions() {}

  }

  public static interface IAbstractSequenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("670c6eb5-de5c-11ef-9708-6da740024446")
    public java.lang.String RenderUml();

  }
  
  public static interface IAbstractSequenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSequenceFunctionsImpl implements IAbstractSequenceFunctionsImpl {

    public static final IAbstractSequenceFunctionsImpl INSTANCE = new AbstractSequenceFunctionsImpl();

    private AbstractSequenceFunctionsImpl() {}

  }
  
  public static class AbstractSequenceFunctions {

    private AbstractSequenceFunctions() {}

  }

  public static interface IGroupSequenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7290e2ad-de5c-11ef-9708-6da740024446")
    public java.lang.String RenderUml();

  }
  
  public static interface IGroupSequenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GroupSequenceFunctionsImpl implements IGroupSequenceFunctionsImpl {

    public static final IGroupSequenceFunctionsImpl INSTANCE = new GroupSequenceFunctionsImpl();

    private GroupSequenceFunctionsImpl() {}

  }
  
  public static class GroupSequenceFunctions {

    private GroupSequenceFunctions() {}

  }

  public static interface IFlowSequenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("860b00a5-de5c-11ef-9708-6da740024446")
    public java.lang.String RenderUml();

  }
  
  public static interface IFlowSequenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FlowSequenceFunctionsImpl implements IFlowSequenceFunctionsImpl {

    public static final IFlowSequenceFunctionsImpl INSTANCE = new FlowSequenceFunctionsImpl();

    private FlowSequenceFunctionsImpl() {}

  }
  
  public static class FlowSequenceFunctions {

    private FlowSequenceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fd8e4392-fa40-11e8-af47-e5bdd8100025,thsuRM3y9ShOSm5FTpcpvHNke90=] */
