package cleon.sda.spec.projectmanagement.scope.backlog.story;

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
    public java.lang.String GetId(final cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IStory story);

  }
  
  public static class StoryFunctionsImpl implements IStoryFunctionsImpl {

    public static final IStoryFunctionsImpl INSTANCE = new StoryFunctionsImpl();

    private StoryFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IStory story) {
      /* Begin Protected Region [[db2a8186-c58b-11e5-aeea-1db9268c0ee9]] */
    	return String.format("ST-%03d", story.selectIdentifier());     
      /* End Protected Region   [[db2a8186-c58b-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class StoryFunctions {

    private StoryFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IStory story) {
      return DynamicResourceUtil.invoke(IStoryFunctionsImpl.class, StoryFunctionsImpl.INSTANCE, story).GetId(story);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d5f9ec72-c58b-11e5-aeea-1db9268c0ee9,6F7iHqjK1o4zYdNtcgtYk2Rb1Ms=] */
