package cleon.common.resources.spec.resources.versions;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0f662315-7d8a-11e7-a9ca-85a6566b931d,imports]] */
import java.text.SimpleDateFormat;
import java.util.Date;
/* End Protected Region   [[0f662315-7d8a-11e7-a9ca-85a6566b931d,imports]] */

public class VersionFunctionSpace {

  /* Begin Protected Region [[0f662315-7d8a-11e7-a9ca-85a6566b931d]] */
  
  /* End Protected Region   [[0f662315-7d8a-11e7-a9ca-85a6566b931d]] */


  public static interface ISemanticVersionAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2c0eb746-7d8a-11e7-a9ca-85a6566b931d")
    public java.lang.String GetVersion();

  }
  
  public static interface ISemanticVersionAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SemanticVersionAwareFunctionsImpl implements ISemanticVersionAwareFunctionsImpl {

    public static final ISemanticVersionAwareFunctionsImpl INSTANCE = new SemanticVersionAwareFunctionsImpl();

    private SemanticVersionAwareFunctionsImpl() {}

  }
  
  public static class SemanticVersionAwareFunctions {

    private SemanticVersionAwareFunctions() {}

  }

  public static interface ISemanticVersionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("416f47d9-7d8a-11e7-a9ca-85a6566b931d")
    public java.lang.String GetVersion();

    @IDynamicResourceExtension.MethodId("727a5d2b-7d8a-11e7-a9ca-85a6566b931d")
    public java.lang.String GetTimeStamp();

  }
  
  public static interface ISemanticVersionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("727a5d2b-7d8a-11e7-a9ca-85a6566b931d")
    public java.lang.String GetTimeStamp(final cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion semanticVersion);

  }
  
  public static class SemanticVersionFunctionsImpl implements ISemanticVersionFunctionsImpl {

    public static final ISemanticVersionFunctionsImpl INSTANCE = new SemanticVersionFunctionsImpl();

    private SemanticVersionFunctionsImpl() {}

    @Override
    public java.lang.String GetTimeStamp(final cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion semanticVersion) {
      /* Begin Protected Region [[727a5d2b-7d8a-11e7-a9ca-85a6566b931d]] */
    	Date now = new Date();
    	return new SimpleDateFormat("yyyyMMddHHmm", java.util.Locale.ENGLISH).format(now);
      /* End Protected Region   [[727a5d2b-7d8a-11e7-a9ca-85a6566b931d]] */
    }

  }
  
  public static class SemanticVersionFunctions {

    private SemanticVersionFunctions() {}

    public static java.lang.String GetTimeStamp(final cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion semanticVersion) {
      return DynamicResourceUtil.invoke(ISemanticVersionFunctionsImpl.class, SemanticVersionFunctionsImpl.INSTANCE, semanticVersion).GetTimeStamp(semanticVersion);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0f662315-7d8a-11e7-a9ca-85a6566b931d,vndZ5HxbiZPTNEvH1tejyZDO9rM=] */
