package cleon.common.resources.spec.resources.id;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b13eb1c7-a551-11e8-8163-815a23011093,imports]] */
import java.util.stream.Collectors;
/* End Protected Region   [[b13eb1c7-a551-11e8-8163-815a23011093,imports]] */

public class FunctionSpace_Id {

  /* Begin Protected Region [[b13eb1c7-a551-11e8-8163-815a23011093]] */
  
  /* End Protected Region   [[b13eb1c7-a551-11e8-8163-815a23011093]] */


  public static interface IIntegerBusinessObjectIdFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7ffd23e-a551-11e8-8163-815a23011093")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("fdcf13c6-ea50-11e8-9dfb-85981d867b8c")
    public <T extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId> List<T> sortById();

  }
  
  public static interface IIntegerBusinessObjectIdFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("fdcf13c6-ea50-11e8-9dfb-85981d867b8c")
    public <T extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId> List<T> sortById(final List<T> integerBusinessObjectIdList);

  }
  
  public static class IntegerBusinessObjectIdFunctionsImpl implements IIntegerBusinessObjectIdFunctionsImpl {

    public static final IIntegerBusinessObjectIdFunctionsImpl INSTANCE = new IntegerBusinessObjectIdFunctionsImpl();

    private IntegerBusinessObjectIdFunctionsImpl() {}

    @Override
    public <T extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId> List<T> sortById(final List<T> integerBusinessObjectIdList) {
      /* Begin Protected Region [[fdcf13c6-ea50-11e8-9dfb-85981d867b8c]] */
    	return integerBusinessObjectIdList.stream().sorted((x,y) -> x.selectIdentifier().compareTo(y.selectIdentifier())).collect(Collectors.toList());
      /* End Protected Region   [[fdcf13c6-ea50-11e8-9dfb-85981d867b8c]] */
    }

  }
  
  public static class IntegerBusinessObjectIdFunctions {

    private IntegerBusinessObjectIdFunctions() {}

    public static <T extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId> List<T> sortById(final List<T> integerBusinessObjectIdList) {
      return DynamicResourceUtil.invoke(IIntegerBusinessObjectIdFunctionsImpl.class, IntegerBusinessObjectIdFunctionsImpl.INSTANCE, integerBusinessObjectIdList).sortById(integerBusinessObjectIdList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b13eb1c7-a551-11e8-8163-815a23011093,e/GVWpbwaJTGKAvoFfsPod5emp0=] */
