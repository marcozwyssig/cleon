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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4b8d7402-c58d-11e5-aeea-1db9268c0ee9,SLc+ewEfTEwmClDWdKHQHx+Itcg=] */
