package cleon.architecturemethods.arc42.spec.arc42;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[16226571-09c9-11e9-9915-0d353533f3da,imports]] */

/* End Protected Region   [[16226571-09c9-11e9-9915-0d353533f3da,imports]] */

public class FunctionSpace_Arc42 {

  /* Begin Protected Region [[16226571-09c9-11e9-9915-0d353533f3da]] */
  
  /* End Protected Region   [[16226571-09c9-11e9-9915-0d353533f3da]] */


  public static interface Iarc42Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("271a6bec-09c9-11e9-9915-0d353533f3da")
    public List<cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface Iarc42FunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class arc42FunctionsImpl implements Iarc42FunctionsImpl {

    public static final Iarc42FunctionsImpl INSTANCE = new arc42FunctionsImpl();

    private arc42FunctionsImpl() {}

  }
  
  public static class arc42Functions {

    private arc42Functions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,16226571-09c9-11e9-9915-0d353533f3da,NgA0uxZWHFoY48EdaYTBNBloyXk=] */
