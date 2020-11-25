package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource;

/* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */

public class FunctionSpace_QoS {

  /* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */
  
  /* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */


  public static interface IQoSConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean();

  }
  
  public static interface IQoSConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept);

  }
  
  public static class QoSConceptFunctionsImpl implements IQoSConceptFunctionsImpl {

    public static final IQoSConceptFunctionsImpl INSTANCE = new QoSConceptFunctionsImpl();

    private QoSConceptFunctionsImpl() {}

    @Override
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      /* Begin Protected Region [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    	return qoSConcept.selectQosConfigurationConcept().values().stream().mapToInt(x -> {
    		final IQoSSystemConfigurationConceptFunctions functions = x.extension(IQoSSystemConfigurationConceptFunctions.class);
    		return functions.SumQoS_Mean();
    	}).sum();   
      /* End Protected Region   [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    }

  }
  
  public static class QoSConceptFunctions {

    private QoSConceptFunctions() {}

    public static java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      return DynamicResourceUtil.invoke(IQoSConceptFunctionsImpl.class, QoSConceptFunctionsImpl.INSTANCE, qoSConcept).SumQoS_Mean(qoSConcept);
    }

  }

  public static interface IQoSSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Integer SumQoS_Mean();

    @IDynamicResourceExtension.MethodId("cb87ba0f-c850-11ea-a92a-436f8b822db6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> SelectAllowedSource();

  }
  
  public static interface IQoSSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept);

  }
  
  public static class QoSSystemConfigurationConceptFunctionsImpl implements IQoSSystemConfigurationConceptFunctionsImpl {

    public static final IQoSSystemConfigurationConceptFunctionsImpl INSTANCE = new QoSSystemConfigurationConceptFunctionsImpl();

    private QoSSystemConfigurationConceptFunctionsImpl() {}

    @Override
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      /* Begin Protected Region [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
    	return qoSSystemConfigurationConcept.selectQoSSystemConfigurationDestination().values().stream().mapToInt( IQoSSystemConfigurationSource::selectEstimateMean_KBits ).sum();   
      /* End Protected Region   [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
    }

  }
  
  public static class QoSSystemConfigurationConceptFunctions {

    private QoSSystemConfigurationConceptFunctions() {}

    public static java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationConceptFunctionsImpl.class, QoSSystemConfigurationConceptFunctionsImpl.INSTANCE, qoSSystemConfigurationConcept).SumQoS_Mean(qoSSystemConfigurationConcept);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,010c10e4-a0c9-11ea-8daa-afb4679c3497,BO7W0I4yQYdC4cJBdAyOb0Fkp88=] */
