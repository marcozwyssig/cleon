package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d5f9ec72-c58b-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[d5f9ec72-c58b-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[d5f9ec72-c58b-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[d5f9ec72-c58b-11e5-aeea-1db9268c0ee9]] */


  public static interface IStoryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("db2a8186-c58b-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

  }
  
  public static interface IStoryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("db2a8186-c58b-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IStory story);

  }
  
  public static class StoryFunctionsImpl implements IStoryFunctionsImpl {

    public static final IStoryFunctionsImpl INSTANCE = new StoryFunctionsImpl();

    private StoryFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IStory story) {
      return String.format("S%03d", story.selectIdentifier());
    }

  }
  
  public static class StoryFunctions {

    private StoryFunctions() {}

    public static java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IStory story) {
      return DynamicResourceUtil.invoke(IStoryFunctionsImpl.class, StoryFunctionsImpl.INSTANCE, story).GetId(story);
    }

  }

  public static interface IActivityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a9d10320-1e7a-11e7-ba0d-79d7a7c79635")
    public java.lang.String GetId();

  }
  
  public static interface IActivityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a9d10320-1e7a-11e7-ba0d-79d7a7c79635")
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IActivity activity);

  }
  
  public static class ActivityFunctionsImpl implements IActivityFunctionsImpl {

    public static final IActivityFunctionsImpl INSTANCE = new ActivityFunctionsImpl();

    private ActivityFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IActivity activity) {
      return String.format("A%03d", activity.selectIdentifier());
    }

  }
  
  public static class ActivityFunctions {

    private ActivityFunctions() {}

    public static java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IActivity activity) {
      return DynamicResourceUtil.invoke(IActivityFunctionsImpl.class, ActivityFunctionsImpl.INSTANCE, activity).GetId(activity);
    }

  }

  public static interface IDefectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6d1def8-1e7a-11e7-ba0d-79d7a7c79635")
    public java.lang.String GetId();

  }
  
  public static interface IDefectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b6d1def8-1e7a-11e7-ba0d-79d7a7c79635")
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect defect);

  }
  
  public static class DefectFunctionsImpl implements IDefectFunctionsImpl {

    public static final IDefectFunctionsImpl INSTANCE = new DefectFunctionsImpl();

    private DefectFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect defect) {
      return String.format("D%03d", defect.selectIdentifier());
    }

  }
  
  public static class DefectFunctions {

    private DefectFunctions() {}

    public static java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect defect) {
      return DynamicResourceUtil.invoke(IDefectFunctionsImpl.class, DefectFunctionsImpl.INSTANCE, defect).GetId(defect);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d5f9ec72-c58b-11e5-aeea-1db9268c0ee9,mKsP3lGUXr0Fxmvi8UwQbdLiGSU=] */
