package cleon.architecturemethods.systemarc42.metamodel.template;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bd04ffbc-0b72-11ea-891d-81e208cfce61,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication;
/* End Protected Region   [[bd04ffbc-0b72-11ea-891d-81e208cfce61,imports]] */

public class FunctionsSpace_systemArc42_Template {

  /* Begin Protected Region [[bd04ffbc-0b72-11ea-891d-81e208cfce61]] */
  
  /* End Protected Region   [[bd04ffbc-0b72-11ea-891d-81e208cfce61]] */


  public static interface Iarc42DocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b0ca591b-0b0e-11ea-b483-3fffd745ba7d")
    public java.lang.String SourceColumns();

    @IDynamicResourceExtension.MethodId("428245a8-0b0f-11ea-b483-3fffd745ba7d")
    public java.lang.String DestinationColumns();

    @IDynamicResourceExtension.MethodId("b6da7457-0b5f-11ea-bef6-75a700135135")
    public java.lang.String ServiceColumns();

  }
  
  public static interface Iarc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b0ca591b-0b0e-11ea-b483-3fffd745ba7d")
    public java.lang.String SourceColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document);

    @IDynamicResourceExtension.MethodId("428245a8-0b0f-11ea-b483-3fffd745ba7d")
    public java.lang.String DestinationColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document);

    @IDynamicResourceExtension.MethodId("b6da7457-0b5f-11ea-bef6-75a700135135")
    public java.lang.String ServiceColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document);

  }
  
  public static class arc42DocumentFunctionsImpl implements Iarc42DocumentFunctionsImpl {

    public static final Iarc42DocumentFunctionsImpl INSTANCE = new arc42DocumentFunctionsImpl();

    private arc42DocumentFunctionsImpl() {}

    @Override
    public java.lang.String SourceColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      /* Begin Protected Region [[b0ca591b-0b0e-11ea-b483-3fffd745ba7d]] */
    	final StringBuilder result = new StringBuilder();
    	for(int i=1;i<FunctionSpace_Communication.MAX_COLUMNS;++i) {
    		result.append("source." + i);
    		result.append(System.lineSeparator());
    	}
    	return result.toString();      
      /* End Protected Region   [[b0ca591b-0b0e-11ea-b483-3fffd745ba7d]] */
    }

    @Override
    public java.lang.String DestinationColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      /* Begin Protected Region [[428245a8-0b0f-11ea-b483-3fffd745ba7d]] */
    	final StringBuilder result = new StringBuilder();
    	for(int i=1;i<FunctionSpace_Communication.MAX_COLUMNS;++i) {
    		result.append("destination." + i);
    		result.append(System.lineSeparator());
    	}
    	return result.toString();     
      /* End Protected Region   [[428245a8-0b0f-11ea-b483-3fffd745ba7d]] */
    }

    @Override
    public java.lang.String ServiceColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      /* Begin Protected Region [[b6da7457-0b5f-11ea-bef6-75a700135135]] */
    	final StringBuilder result = new StringBuilder();
    	for(int i=1;i<FunctionSpace_Communication.MAX_COLUMNS;++i) {
    		result.append("service." + i);
    		result.append(System.lineSeparator());
    	}
    	return result.toString();    
      /* End Protected Region   [[b6da7457-0b5f-11ea-bef6-75a700135135]] */
    }

  }
  
  public static class arc42DocumentFunctions {

    private arc42DocumentFunctions() {}

    public static java.lang.String SourceColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      return DynamicResourceUtil.invoke(Iarc42DocumentFunctionsImpl.class, arc42DocumentFunctionsImpl.INSTANCE, arc42Document).SourceColumns(arc42Document);
    }

    public static java.lang.String DestinationColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      return DynamicResourceUtil.invoke(Iarc42DocumentFunctionsImpl.class, arc42DocumentFunctionsImpl.INSTANCE, arc42Document).DestinationColumns(arc42Document);
    }

    public static java.lang.String ServiceColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      return DynamicResourceUtil.invoke(Iarc42DocumentFunctionsImpl.class, arc42DocumentFunctionsImpl.INSTANCE, arc42Document).ServiceColumns(arc42Document);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bd04ffbc-0b72-11ea-891d-81e208cfce61,3lBf4yP05+W3iVeEnIntWxEPiy0=] */
