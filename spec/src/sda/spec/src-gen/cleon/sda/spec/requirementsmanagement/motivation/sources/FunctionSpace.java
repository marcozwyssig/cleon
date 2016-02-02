package cleon.sda.spec.requirementsmanagement.motivation.sources;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4b8d7404-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("43b904fe-c97a-11e5-a64e-a5d84d8f1b45")
    public List<cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> GetAllSources();

    @IDynamicResourceExtension.MethodId("88b17f27-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4b8d7404-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource source);

  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource source) {
      /* Begin Protected Region [[4b8d7404-c58d-11e5-aeea-1db9268c0ee9]] */
    	return String.format("SR-%03d", source.selectIdentifier());     
      /* End Protected Region   [[4b8d7404-c58d-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).GetId(source);
    }

  }

  public static interface ISourcesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f861eef-c97a-11e5-a64e-a5d84d8f1b45")
    public List<cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> GetAllSources();

  }
  
  public static interface ISourcesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourcesFunctionsImpl implements ISourcesFunctionsImpl {

    public static final ISourcesFunctionsImpl INSTANCE = new SourcesFunctionsImpl();

    private SourcesFunctionsImpl() {}

  }
  
  public static class SourcesFunctions {

    private SourcesFunctions() {}

  }

  public static interface ISourceOrganisationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9bef2ff4-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourceOrganisationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceOrganisationFunctionsImpl implements ISourceOrganisationFunctionsImpl {

    public static final ISourceOrganisationFunctionsImpl INSTANCE = new SourceOrganisationFunctionsImpl();

    private SourceOrganisationFunctionsImpl() {}

  }
  
  public static class SourceOrganisationFunctions {

    private SourceOrganisationFunctions() {}

  }

  public static interface ISourceDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a924fd6d-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourceDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceDocumentFunctionsImpl implements ISourceDocumentFunctionsImpl {

    public static final ISourceDocumentFunctionsImpl INSTANCE = new SourceDocumentFunctionsImpl();

    private SourceDocumentFunctionsImpl() {}

  }
  
  public static class SourceDocumentFunctions {

    private SourceDocumentFunctions() {}

  }

  public static interface ISourceChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bcecc5af-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourceChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceChapterFunctionsImpl implements ISourceChapterFunctionsImpl {

    public static final ISourceChapterFunctionsImpl INSTANCE = new SourceChapterFunctionsImpl();

    private SourceChapterFunctionsImpl() {}

  }
  
  public static class SourceChapterFunctions {

    private SourceChapterFunctions() {}

  }

  public static interface ISourcePersonFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c60b5e06-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourcePersonFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourcePersonFunctionsImpl implements ISourcePersonFunctionsImpl {

    public static final ISourcePersonFunctionsImpl INSTANCE = new SourcePersonFunctionsImpl();

    private SourcePersonFunctionsImpl() {}

  }
  
  public static class SourcePersonFunctions {

    private SourcePersonFunctions() {}

  }

  public static interface ISourceWorkshopFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0d8b7e4-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourceWorkshopFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceWorkshopFunctionsImpl implements ISourceWorkshopFunctionsImpl {

    public static final ISourceWorkshopFunctionsImpl INSTANCE = new SourceWorkshopFunctionsImpl();

    private SourceWorkshopFunctionsImpl() {}

  }
  
  public static class SourceWorkshopFunctions {

    private SourceWorkshopFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4b8d7402-c58d-11e5-aeea-1db9268c0ee9,xfV7/fERXGex4OCwK9aZmKZOS8o=] */
