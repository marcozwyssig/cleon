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

  }
  
  public static interface IClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f4d9ca2b-8546-11ea-9f0c-755186b47bc2")
    public ch.actifsource.core.javamodel.IColor FillColor(final ch.actifsource.core.javamodel.IClass class_);

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
      	final IClassFunctions functions = iterClass.extension(IClassFunctions.class);
      	final ch.actifsource.core.javamodel.IColor color = functions.FillColor();
      	if (color != null ) {
      		return color;
      	}
      }
      return null;    
      /* End Protected Region   [[f4d9ca2b-8546-11ea-9f0c-755186b47bc2]] */
    }

  }
  
  public static class ClassFunctions {

    private ClassFunctions() {}

    public static ch.actifsource.core.javamodel.IColor FillColor(final ch.actifsource.core.javamodel.IClass class_) {
      return DynamicResourceUtil.invoke(IClassFunctionsImpl.class, ClassFunctionsImpl.INSTANCE, class_).FillColor(class_);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,17d11fe8-bacb-11ea-ad63-c39dbaa0ce43,Q6gip4d3lwLDe5mtUQyuwXtEyZk=] */
