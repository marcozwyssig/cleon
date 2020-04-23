package cleon.architecturemethods.systemarc42.metamodel.template.graphviz;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[863f9dab-2ecd-11e9-9ca2-d7354798e154,imports]] */

/* End Protected Region   [[863f9dab-2ecd-11e9-9ca2-d7354798e154,imports]] */

public class Deployment__T_dot {

  /* Begin Protected Region [[863f9dab-2ecd-11e9-9ca2-d7354798e154]] */
  
  /* End Protected Region   [[863f9dab-2ecd-11e9-9ca2-d7354798e154]] */


  public static interface INodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cc21c372-853f-11ea-9f0c-755186b47bc2")
    public java.lang.String RenderNode();

  }
  
  public static interface INodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

  }
  
  public static class NodeFunctions {

    private NodeFunctions() {}

  }

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
    	for( ch.actifsource.core.javamodel.IClass iterClass : class_.selectExtends()) {
    		IClassFunctions functions = iterClass.extension(IClassFunctions.class);
    		ch.actifsource.core.javamodel.IColor color = functions.FillColor();
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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,863f9dab-2ecd-11e9-9ca2-d7354798e154,CPQ9SlXQ+js8dFQ4zmbgAuq4Tak=] */
