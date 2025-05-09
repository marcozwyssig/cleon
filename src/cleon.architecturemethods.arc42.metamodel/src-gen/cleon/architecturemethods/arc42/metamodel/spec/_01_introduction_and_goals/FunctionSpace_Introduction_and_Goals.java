package cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e5f12d9f-ae66-11ef-9f76-697f8eef04ad,imports]] */

/* End Protected Region   [[e5f12d9f-ae66-11ef-9f76-697f8eef04ad,imports]] */

public class FunctionSpace_Introduction_and_Goals {

  /* Begin Protected Region [[e5f12d9f-ae66-11ef-9f76-697f8eef04ad]] */
  
  /* End Protected Region   [[e5f12d9f-ae66-11ef-9f76-697f8eef04ad]] */


  public static interface IQualityGoalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ee6813de-ae66-11ef-9f76-697f8eef04ad")
    public ch.actifsource.core.javamodel.IResource LanguageSettings();

  }
  
  public static interface IQualityGoalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QualityGoalFunctionsImpl implements IQualityGoalFunctionsImpl {

    public static final IQualityGoalFunctionsImpl INSTANCE = new QualityGoalFunctionsImpl();

    private QualityGoalFunctionsImpl() {}

  }
  
  public static class QualityGoalFunctions {

    private QualityGoalFunctions() {}

  }

  public static interface IIntroductionAndGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6f06d02e-bc8e-11ef-ae21-efb936bba898")
    public List<ch.actifsource.core.javamodel.IResource> ChapterOrder();

  }
  
  public static interface IIntroductionAndGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IntroductionAndGoalsFunctionsImpl implements IIntroductionAndGoalsFunctionsImpl {

    public static final IIntroductionAndGoalsFunctionsImpl INSTANCE = new IntroductionAndGoalsFunctionsImpl();

    private IntroductionAndGoalsFunctionsImpl() {}

  }
  
  public static class IntroductionAndGoalsFunctions {

    private IntroductionAndGoalsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e5f12d9f-ae66-11ef-9f76-697f8eef04ad,fLGZBZmzA3waAVVgyS/wq7qXc8Y=] */
