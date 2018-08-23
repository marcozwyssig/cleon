package cleon.conception.architecture.spec.analysis.detailedstudy;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */

/* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */

public class FunctionSpace_DetailedStudy {

  /* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */
  
  /* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */


  public static interface IRequirementsAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d7a738b2-a6fc-11e8-9c81-8bd68c62e435")
    public java.lang.Integer GetWeighting();

  }
  
  public static interface IRequirementsAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d7a738b2-a6fc-11e8-9c81-8bd68c62e435")
    public java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementsAggregate requirementsAggregate);

  }
  
  public static class RequirementsAggregateFunctionsImpl implements IRequirementsAggregateFunctionsImpl {

    public static final IRequirementsAggregateFunctionsImpl INSTANCE = new RequirementsAggregateFunctionsImpl();

    private RequirementsAggregateFunctionsImpl() {}

    @Override
    public java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementsAggregate requirementsAggregate) {
      /* Begin Protected Region [[d7a738b2-a6fc-11e8-9c81-8bd68c62e435]] */
    	return requirementsAggregate.selectPriorityWeighting().values().stream().mapToInt(x -> x.selectWeighting()).sum();
      /* End Protected Region   [[d7a738b2-a6fc-11e8-9c81-8bd68c62e435]] */
    }

  }
  
  public static class RequirementsAggregateFunctions {

    private RequirementsAggregateFunctions() {}

    public static java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementsAggregate requirementsAggregate) {
      return DynamicResourceUtil.invoke(IRequirementsAggregateFunctionsImpl.class, RequirementsAggregateFunctionsImpl.INSTANCE, requirementsAggregate).GetWeighting(requirementsAggregate);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c51aafe9-a6fc-11e8-9c81-8bd68c62e435,vHJOfN6pVqJ44FHEYOTScHDkBls=] */
