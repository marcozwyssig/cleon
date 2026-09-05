package cleon.common.doc.metamodel.spec.paragraph.image;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[aa0f2fc2-d8ca-11ef-8dec-7d07d45d9f8c,imports]] */

/* End Protected Region   [[aa0f2fc2-d8ca-11ef-8dec-7d07d45d9f8c,imports]] */

public class FunctionSpace_Image {

  /* Begin Protected Region [[aa0f2fc2-d8ca-11ef-8dec-7d07d45d9f8c]] */
  
  /* End Protected Region   [[aa0f2fc2-d8ca-11ef-8dec-7d07d45d9f8c]] */


  public static interface IAbstractImageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b656cd9b-d8ca-11ef-8dec-7d07d45d9f8c")
    public java.lang.String Path();

  }
  
  public static interface IAbstractImageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractImageFunctionsImpl implements IAbstractImageFunctionsImpl {

    public static final IAbstractImageFunctionsImpl INSTANCE = new AbstractImageFunctionsImpl();

    private AbstractImageFunctionsImpl() {}

  }
  
  public static class AbstractImageFunctions {

    private AbstractImageFunctions() {}

  }

  public static interface IImageUrlFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c3d0f7f6-d8ca-11ef-8dec-7d07d45d9f8c")
    public java.lang.String Path();

  }
  
  public static interface IImageUrlFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImageUrlFunctionsImpl implements IImageUrlFunctionsImpl {

    public static final IImageUrlFunctionsImpl INSTANCE = new ImageUrlFunctionsImpl();

    private ImageUrlFunctionsImpl() {}

  }
  
  public static class ImageUrlFunctions {

    private ImageUrlFunctions() {}

  }

  public static interface IImageFileNameFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f1b3a44e-d8ca-11ef-8dec-7d07d45d9f8c")
    public java.lang.String Path();

  }
  
  public static interface IImageFileNameFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImageFileNameFunctionsImpl implements IImageFileNameFunctionsImpl {

    public static final IImageFileNameFunctionsImpl INSTANCE = new ImageFileNameFunctionsImpl();

    private ImageFileNameFunctionsImpl() {}

  }
  
  public static class ImageFileNameFunctions {

    private ImageFileNameFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,aa0f2fc2-d8ca-11ef-8dec-7d07d45d9f8c,RfmBfp4d2ecYb3ay1XOFLZ/rvGk=] */
