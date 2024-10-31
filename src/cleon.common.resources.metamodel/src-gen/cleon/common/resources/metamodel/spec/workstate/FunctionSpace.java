package cleon.common.resources.metamodel.spec.workstate;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[11326bb1-cb74-11e5-bc87-a1fadf56ded8,imports]] */

/* End Protected Region   [[11326bb1-cb74-11e5-bc87-a1fadf56ded8,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[11326bb1-cb74-11e5-bc87-a1fadf56ded8]] */
  
  /* End Protected Region   [[11326bb1-cb74-11e5-bc87-a1fadf56ded8]] */


  public static interface IWorkStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("53663476-cb74-11e5-bc87-a1fadf56ded8")
    public java.lang.Boolean IsOpenOrInWork();

    @IDynamicResourceExtension.MethodId("ba4c85f4-cb74-11e5-bc87-a1fadf56ded8")
    public java.lang.Boolean IsDone();

  }
  
  public static interface IWorkStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("53663476-cb74-11e5-bc87-a1fadf56ded8")
    public java.lang.Boolean IsOpenOrInWork(final cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState workState);

    @IDynamicResourceExtension.MethodId("ba4c85f4-cb74-11e5-bc87-a1fadf56ded8")
    public java.lang.Boolean IsDone(final cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState workState);

  }
  
  public static class WorkStateFunctionsImpl implements IWorkStateFunctionsImpl {

    public static final IWorkStateFunctionsImpl INSTANCE = new WorkStateFunctionsImpl();

    private WorkStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsOpenOrInWork(final cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState workState) {
      return workState.isOpen() || workState.isIn__F_Progress();
    }

    @Override
    public java.lang.Boolean IsDone(final cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState workState) {
      return workState.isDone();
    }

  }
  
  public static class WorkStateFunctions {

    private WorkStateFunctions() {}

    public static java.lang.Boolean IsOpenOrInWork(final cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState workState) {
      return DynamicResourceUtil.invoke(IWorkStateFunctionsImpl.class, WorkStateFunctionsImpl.INSTANCE, workState).IsOpenOrInWork(workState);
    }

    public static java.lang.Boolean IsDone(final cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState workState) {
      return DynamicResourceUtil.invoke(IWorkStateFunctionsImpl.class, WorkStateFunctionsImpl.INSTANCE, workState).IsDone(workState);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,11326bb1-cb74-11e5-bc87-a1fadf56ded8,b+HON+YW4htKvNv57D1tft0fFP4=] */
