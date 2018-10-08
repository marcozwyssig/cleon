package cleon.conception.architecture.spec.eamod.chrv.motivation.sources;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace_Source {

  /* Begin Protected Region [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[4b8d7402-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4b8d7404-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("43b904fe-c97a-11e5-a64e-a5d84d8f1b45")
    public List<cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource> GetAllSources();

    @IDynamicResourceExtension.MethodId("88b17f27-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("b217619b-7c0b-11e6-a6f8-61123cfa9fd9")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("769bc163-38e7-11e8-8c35-85f8e4a22f42")
    public List<cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISourceAware> GetAllUsedSourceAware();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4b8d7404-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource source);

  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource source) {
      return String.format("Q%03d", source.selectIdentifier());   
    }

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

    public static java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).GetId(source);
    }

  }

  public static interface ISourcesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f861eef-c97a-11e5-a64e-a5d84d8f1b45")
    public List<cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource> GetAllSources();

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

  public static interface ISourceOrganizationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9bef2ff4-c992-11e5-b35b-8fb753dd0798")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourceOrganizationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceOrganizationFunctionsImpl implements ISourceOrganizationFunctionsImpl {

    public static final ISourceOrganizationFunctionsImpl INSTANCE = new SourceOrganizationFunctionsImpl();

    private SourceOrganizationFunctionsImpl() {}

  }
  
  public static class SourceOrganizationFunctions {

    private SourceOrganizationFunctions() {}

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

  public static interface ISourceReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("09e4b0d3-06f7-11e6-8d3e-13e5be4bd43b")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISourceReferenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceReferenceFunctionsImpl implements ISourceReferenceFunctionsImpl {

    public static final ISourceReferenceFunctionsImpl INSTANCE = new SourceReferenceFunctionsImpl();

    private SourceReferenceFunctionsImpl() {}

  }
  
  public static class SourceReferenceFunctions {

    private SourceReferenceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4b8d7402-c58d-11e5-aeea-1db9268c0ee9,fIdWQ11n7I/eiRAJvA2ih7IHrb4=] */
