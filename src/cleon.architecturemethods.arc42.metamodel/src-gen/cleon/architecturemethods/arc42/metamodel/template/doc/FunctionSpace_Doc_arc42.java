package cleon.architecturemethods.arc42.metamodel.template.doc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[90076f51-d051-11f0-b3c1-d5cb64e8ca32,imports]] */

/* End Protected Region   [[90076f51-d051-11f0-b3c1-d5cb64e8ca32,imports]] */

public class FunctionSpace_Doc_arc42 {

  /* Begin Protected Region [[90076f51-d051-11f0-b3c1-d5cb64e8ca32]] */
  
  /* End Protected Region   [[90076f51-d051-11f0-b3c1-d5cb64e8ca32]] */


  public static interface IMonitoringFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3048a09a-cce3-11ea-8b73-6b1c6b53a7a6")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface IMonitoringFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MonitoringFunctionsImpl implements IMonitoringFunctionsImpl {

    public static final IMonitoringFunctionsImpl INSTANCE = new MonitoringFunctionsImpl();

    private MonitoringFunctionsImpl() {}

  }
  
  public static class MonitoringFunctions {

    private MonitoringFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,90076f51-d051-11f0-b3c1-d5cb64e8ca32,HrAfUJjLmKDgv/KJDOT95BO4qmU=] */
