package cleon.common.resources.metamodel.spec.clazz;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[17d11fe8-bacb-11ea-ad63-c39dbaa0ce43,imports]] */

/* End Protected Region   [[17d11fe8-bacb-11ea-ad63-c39dbaa0ce43,imports]] */

public class FunctionSpace_Clazz {

  /* Begin Protected Region [[17d11fe8-bacb-11ea-ad63-c39dbaa0ce43]] */

  /* End Protected Region   [[17d11fe8-bacb-11ea-ad63-c39dbaa0ce43]] */


  public static interface IClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f4d9ca2b-8546-11ea-9f0c-755186b47bc2")
    public ch.actifsource.core.javamodel.IColor FillColor();

    @IDynamicResourceExtension.MethodId("0a48f95d-66ab-11ef-a7d1-0f66f239ffd9")
    public java.lang.String Color();

  }
  
  public static interface IClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f4d9ca2b-8546-11ea-9f0c-755186b47bc2")
    public ch.actifsource.core.javamodel.IColor FillColor(final ch.actifsource.core.javamodel.IClass class_);

    @IDynamicResourceExtension.MethodId("0a48f95d-66ab-11ef-a7d1-0f66f239ffd9")
    public java.lang.String Color(final ch.actifsource.core.javamodel.IClass class_);

  }
  
  public static class ClassFunctionsImpl implements IClassFunctionsImpl {

    public static final IClassFunctionsImpl INSTANCE = new ClassFunctionsImpl();

    private ClassFunctionsImpl() {}

    @Override
    public ch.actifsource.core.javamodel.IColor FillColor(final ch.actifsource.core.javamodel.IClass class_) {
      /* Begin Protected Region [[f4d9ca2b-8546-11ea-9f0c-755186b47bc2]] */
      if( class_.selectFillColor() != null ) {
      	return class_.selectFillColor();
      }
      for( final ch.actifsource.core.javamodel.IClass iterClass : class_.selectExtends()) {
      	if( iterClass.selectExtends().contains(iterClass)) {
      		continue;
      	}
      	final var functions = iterClass.extension(IClassFunctions.class);
      	final var color = functions.FillColor();
      	if (color != null ) {
      		return color;
      	}
      }
      return null;
      /* End Protected Region   [[f4d9ca2b-8546-11ea-9f0c-755186b47bc2]] */
    }

    @Override
    public java.lang.String Color(final ch.actifsource.core.javamodel.IClass class_) {
      /* Begin Protected Region [[0a48f95d-66ab-11ef-a7d1-0f66f239ffd9]] */
      final var fillColor = FillColor(class_);
      if (fillColor == null) {
      	return null;
      }

      final var darkenFactor = 0.7f;


      // Apply darkenFactor to each color component (red, green, blue)
      var redValue = (int) (fillColor.selectRed() * darkenFactor);
      var greenValue = (int) (fillColor.selectGreen() * darkenFactor);
      var blueValue = (int) (fillColor.selectBlue() * darkenFactor);

      // Ensure the values are within the valid range [0, 255]
      redValue = Math.max(0, Math.min(255, redValue));
      greenValue = Math.max(0, Math.min(255, greenValue));
      blueValue = Math.max(0, Math.min(255, blueValue));

      // Convert to hex code
      return String.format("#%02X%02X%02X", redValue, greenValue, blueValue);
      /* End Protected Region   [[0a48f95d-66ab-11ef-a7d1-0f66f239ffd9]] */
    }

  }
  
  public static class ClassFunctions {

    private ClassFunctions() {}

    public static ch.actifsource.core.javamodel.IColor FillColor(final ch.actifsource.core.javamodel.IClass class_) {
      return DynamicResourceUtil.invoke(IClassFunctionsImpl.class, ClassFunctionsImpl.INSTANCE, class_).FillColor(class_);
    }

    public static java.lang.String Color(final ch.actifsource.core.javamodel.IClass class_) {
      return DynamicResourceUtil.invoke(IClassFunctionsImpl.class, ClassFunctionsImpl.INSTANCE, class_).Color(class_);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,17d11fe8-bacb-11ea-ad63-c39dbaa0ce43,PwtJ5z48X9WDPSd8zCFQrlpIL+M=] */
