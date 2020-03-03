package cleon.architecturemethods.systemarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[94558f25-1d8d-11e9-b601-db75aa6f89a4,imports]] */

/* End Protected Region   [[94558f25-1d8d-11e9-b601-db75aa6f89a4,imports]] */

public class FunctionSpace_QoS {

  /* Begin Protected Region [[94558f25-1d8d-11e9-b601-db75aa6f89a4]] */
  
  /* End Protected Region   [[94558f25-1d8d-11e9-b601-db75aa6f89a4]] */


  public static interface IQoS_ConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a62fb841-1d8d-11e9-b601-db75aa6f89a4")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("7494a4f9-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS();

    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean();

  }
  
  public static interface IQoS_ConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7494a4f9-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoS_Concept qoS_Concept);

    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoS_Concept qoS_Concept);

  }
  
  public static class QoS_ConceptFunctionsImpl implements IQoS_ConceptFunctionsImpl {

    public static final IQoS_ConceptFunctionsImpl INSTANCE = new QoS_ConceptFunctionsImpl();

    private QoS_ConceptFunctionsImpl() {}

    @Override
    public java.lang.Integer SumQoS(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoS_Concept qoS_Concept) {
      /* Begin Protected Region [[7494a4f9-1d92-11e9-b601-db75aa6f89a4]] */
    	return qoS_Concept.selectQosConfigurationConcept().values().stream().mapToInt(x -> x.selectEstimate_KBits()).sum();
      /* End Protected Region   [[7494a4f9-1d92-11e9-b601-db75aa6f89a4]] */
    }

    @Override
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoS_Concept qoS_Concept) {
      /* Begin Protected Region [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    	return qoS_Concept.selectQosConfigurationConcept().values().stream().mapToInt(x -> x.selectEstimateMean_KBits()).sum();
      /* End Protected Region   [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    }

  }
  
  public static class QoS_ConceptFunctions {

    private QoS_ConceptFunctions() {}

    public static java.lang.Integer SumQoS(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoS_Concept qoS_Concept) {
      return DynamicResourceUtil.invoke(IQoS_ConceptFunctionsImpl.class, QoS_ConceptFunctionsImpl.INSTANCE, qoS_Concept).SumQoS(qoS_Concept);
    }

    public static java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoS_Concept qoS_Concept) {
      return DynamicResourceUtil.invoke(IQoS_ConceptFunctionsImpl.class, QoS_ConceptFunctionsImpl.INSTANCE, qoS_Concept).SumQoS_Mean(qoS_Concept);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,94558f25-1d8d-11e9-b601-db75aa6f89a4,YMFEmxRXHUI6z6fdWVRFhicDYeE=] */
