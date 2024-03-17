package cleon.architecturemethods.arc42.metamodel.spec;

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


  public static interface Iarc42DocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("271a6bec-09c9-11e9-9915-0d353533f3da")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

    @IDynamicResourceExtension.MethodId("a82f97f3-2ad6-11e9-b83f-8be423c00623")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem GetRootSystem();

    @IDynamicResourceExtension.MethodId("c9c2693d-2ad6-11e9-b83f-8be423c00623")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView GetDeployment();

    @IDynamicResourceExtension.MethodId("0e855eeb-5a01-11ea-b898-0bc71a0508a9")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllComponents();

    @IDynamicResourceExtension.MethodId("2639f1b1-5a01-11ea-b898-0bc71a0508a9")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllExternalComponents();

    @IDynamicResourceExtension.MethodId("2e7618a9-5a01-11ea-b898-0bc71a0508a9")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllBuildComponents();

    @IDynamicResourceExtension.MethodId("1c3a1cb2-6490-11ea-bfcc-4306924cb4fe")
    public List<cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor> AllActors();

  }
  
  public static interface Iarc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class arc42DocumentFunctionsImpl implements Iarc42DocumentFunctionsImpl {

    public static final Iarc42DocumentFunctionsImpl INSTANCE = new arc42DocumentFunctionsImpl();

    private arc42DocumentFunctionsImpl() {}

  }
  
  public static class arc42DocumentFunctions {

    private arc42DocumentFunctions() {}

  }

  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9eb0520b-8017-11ea-b039-9728191a5cdc")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document();

  }
  
  public static interface IDocumentElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentElementFunctionsImpl implements IDocumentElementFunctionsImpl {

    public static final IDocumentElementFunctionsImpl INSTANCE = new DocumentElementFunctionsImpl();

    private DocumentElementFunctionsImpl() {}

  }
  
  public static class DocumentElementFunctions {

    private DocumentElementFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,16226571-09c9-11e9-9915-0d353533f3da,4oY1/oykgJfQEdDm4lgh0aaJXAg=] */
