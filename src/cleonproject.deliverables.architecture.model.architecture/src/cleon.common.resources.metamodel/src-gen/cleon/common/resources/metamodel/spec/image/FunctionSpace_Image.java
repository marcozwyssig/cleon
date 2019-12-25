package cleon.common.resources.metamodel.spec.image;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9f2fd672-09af-11e9-8c40-11db3668c0c9,imports]] */

/* End Protected Region   [[9f2fd672-09af-11e9-8c40-11db3668c0c9,imports]] */

public class FunctionSpace_Image {

  /* Begin Protected Region [[9f2fd672-09af-11e9-8c40-11db3668c0c9]] */
  
  /* End Protected Region   [[9f2fd672-09af-11e9-8c40-11db3668c0c9]] */


  public static interface IColorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a6b112fa-09af-11e9-8c40-11db3668c0c9")
    public java.lang.String hex();

  }
  
  public static interface IColorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a6b112fa-09af-11e9-8c40-11db3668c0c9")
    public java.lang.String hex(final ch.actifsource.core.javamodel.IColor color);

  }
  
  public static class ColorFunctionsImpl implements IColorFunctionsImpl {

    public static final IColorFunctionsImpl INSTANCE = new ColorFunctionsImpl();

    private ColorFunctionsImpl() {}

    @Override
    public java.lang.String hex(final ch.actifsource.core.javamodel.IColor color) {
      return String.format("#%02x%02x%02x", color.selectRed(), color.selectGreen(), color.selectBlue());
    }

  }
  
  public static class ColorFunctions {

    private ColorFunctions() {}

    public static java.lang.String hex(final ch.actifsource.core.javamodel.IColor color) {
      return DynamicResourceUtil.invoke(IColorFunctionsImpl.class, ColorFunctionsImpl.INSTANCE, color).hex(color);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9f2fd672-09af-11e9-8c40-11db3668c0c9,PkdmPqwS7sD2ILe17tdUBOT8dJE=] */
