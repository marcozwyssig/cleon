package cleon.common.resources.spec.resources.list;

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

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4890b651-e9f6-11e8-9dfb-85981d867b8c,Ovnt/ueSZP2SKM86JO2gq5s8Yi0=] */
