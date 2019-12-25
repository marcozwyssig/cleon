package cleon.building.gradle.metamodel.template;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c8d09778-c0b0-11e7-9af7-bb81e9802ff6,imports]] */

/* End Protected Region   [[c8d09778-c0b0-11e7-9af7-bb81e9802ff6,imports]] */

public class Task__T_java {

  /* Begin Protected Region [[c8d09778-c0b0-11e7-9af7-bb81e9802ff6]] */
  
  /* End Protected Region   [[c8d09778-c0b0-11e7-9af7-bb81e9802ff6]] */


  public static interface ITaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ee1044b6-c0b0-11e7-9af7-bb81e9802ff6")
    public cleon.building.gradle.metamodel.spec.javamodel.IPlugin Plugin();

    @IDynamicResourceExtension.MethodId("df7af106-c0b1-11e7-9af7-bb81e9802ff6")
    public java.lang.String TaskName();

  }
  
  public static interface ITaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TaskFunctionsImpl implements ITaskFunctionsImpl {

    public static final ITaskFunctionsImpl INSTANCE = new TaskFunctionsImpl();

    private TaskFunctionsImpl() {}

  }
  
  public static class TaskFunctions {

    private TaskFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c8d09778-c0b0-11e7-9af7-bb81e9802ff6,FBt2XfgXLUncx6LELwnRp3LdNck=] */
