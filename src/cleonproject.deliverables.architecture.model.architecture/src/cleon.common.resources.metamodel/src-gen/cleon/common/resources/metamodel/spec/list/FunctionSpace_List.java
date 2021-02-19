package cleon.common.resources.metamodel.spec.list;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4890b651-e9f6-11e8-9dfb-85981d867b8c,imports]] */
import java.util.stream.Collectors;
/* End Protected Region   [[4890b651-e9f6-11e8-9dfb-85981d867b8c,imports]] */

public class FunctionSpace_List {

  /* Begin Protected Region [[4890b651-e9f6-11e8-9dfb-85981d867b8c]] */
  
  /* End Protected Region   [[4890b651-e9f6-11e8-9dfb-85981d867b8c]] */


  public static interface IAnyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("720b4d7b-e9f6-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate0To20();

    @IDynamicResourceExtension.MethodId("67758174-ea4f-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate21To40();

    @IDynamicResourceExtension.MethodId("8bb486ef-ea4f-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate41To60();

    @IDynamicResourceExtension.MethodId("9a82d2a8-ea53-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate61To80();

    @IDynamicResourceExtension.MethodId("9b3002aa-ea53-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate81To100();

    @IDynamicResourceExtension.MethodId("e9acffb2-0dc8-11e9-be4f-03130cc057ef")
    public <T> List<T> asList();

  }
  
  public static interface IAnyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("720b4d7b-e9f6-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate0To20(final List<T> anyList);

    @IDynamicResourceExtension.MethodId("67758174-ea4f-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate21To40(final List<T> anyList);

    @IDynamicResourceExtension.MethodId("8bb486ef-ea4f-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate41To60(final List<T> anyList);

    @IDynamicResourceExtension.MethodId("9a82d2a8-ea53-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate61To80(final List<T> anyList);

    @IDynamicResourceExtension.MethodId("9b3002aa-ea53-11e8-9dfb-85981d867b8c")
    public <T> List<T> truncate81To100(final List<T> anyList);

    @IDynamicResourceExtension.MethodId("e9acffb2-0dc8-11e9-be4f-03130cc057ef")
    public <T> List<T> asList(final T any);

  }
  
  public static class AnyFunctionsImpl implements IAnyFunctionsImpl {

    public static final IAnyFunctionsImpl INSTANCE = new AnyFunctionsImpl();

    private AnyFunctionsImpl() {}

    @Override
    public <T> List<T> truncate0To20(final List<T> anyList) {
      /* Begin Protected Region [[720b4d7b-e9f6-11e8-9dfb-85981d867b8c]] */
       return anyList.stream()
        .limit(20)
        .collect(Collectors.toList());
      /* End Protected Region   [[720b4d7b-e9f6-11e8-9dfb-85981d867b8c]] */
    }

    @Override
    public <T> List<T> truncate21To40(final List<T> anyList) {
      /* Begin Protected Region [[67758174-ea4f-11e8-9dfb-85981d867b8c]] */
        return anyList.stream()
        		.skip(20)
                .limit(20)
                .collect(Collectors.toList());
      /* End Protected Region   [[67758174-ea4f-11e8-9dfb-85981d867b8c]] */
    }

    @Override
    public <T> List<T> truncate41To60(final List<T> anyList) {
      /* Begin Protected Region [[8bb486ef-ea4f-11e8-9dfb-85981d867b8c]] */
        return anyList.stream()
        		.skip(40)
                .limit(20)
                .collect(Collectors.toList());
      /* End Protected Region   [[8bb486ef-ea4f-11e8-9dfb-85981d867b8c]] */
    }

    @Override
    public <T> List<T> truncate61To80(final List<T> anyList) {
      /* Begin Protected Region [[9a82d2a8-ea53-11e8-9dfb-85981d867b8c]] */
        return anyList.stream()
        		.skip(60)
                .limit(20)
                .collect(Collectors.toList()); 
      /* End Protected Region   [[9a82d2a8-ea53-11e8-9dfb-85981d867b8c]] */
    }

    @Override
    public <T> List<T> truncate81To100(final List<T> anyList) {
      /* Begin Protected Region [[9b3002aa-ea53-11e8-9dfb-85981d867b8c]] */
        return anyList.stream()
        		.skip(80)
                .limit(20)
                .collect(Collectors.toList());      
      /* End Protected Region   [[9b3002aa-ea53-11e8-9dfb-85981d867b8c]] */
    }

    @Override
    public <T> List<T> asList(final T any) {
      return java.util.Arrays.asList(any);
    }

  }
  
  public static class AnyFunctions {

    private AnyFunctions() {}

    public static <T> List<T> truncate0To20(final List<T> anyList) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, anyList).truncate0To20(anyList);
    }

    public static <T> List<T> truncate21To40(final List<T> anyList) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, anyList).truncate21To40(anyList);
    }

    public static <T> List<T> truncate41To60(final List<T> anyList) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, anyList).truncate41To60(anyList);
    }

    public static <T> List<T> truncate61To80(final List<T> anyList) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, anyList).truncate61To80(anyList);
    }

    public static <T> List<T> truncate81To100(final List<T> anyList) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, anyList).truncate81To100(anyList);
    }

    public static <T> List<T> asList(final T any) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, any).asList(any);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4890b651-e9f6-11e8-9dfb-85981d867b8c,x+CWPvFz54h0koc9jA2+so6yn5w=] */
