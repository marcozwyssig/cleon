package cleon.architecturemethods.systemarc42.metamodel.template.csv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7b0f9ed3-04be-11ea-b1ce-b1de8a8d414c,imports]] */

/* End Protected Region   [[7b0f9ed3-04be-11ea-b1ce-b1de8a8d414c,imports]] */

public class INTER__S_Global__S_Policy__T_csv {

  /* Begin Protected Region [[7b0f9ed3-04be-11ea-b1ce-b1de8a8d414c]] */
  
  /* End Protected Region   [[7b0f9ed3-04be-11ea-b1ce-b1de8a8d414c]] */


  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("42b9ccb5-0b60-11ea-bef6-75a700135135")
    public java.lang.String Tag(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination destination);

    @IDynamicResourceExtension.MethodId("95f34c82-0b5f-11ea-bef6-75a700135135")
    public java.lang.String RuleName(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dstSz);

    @IDynamicResourceExtension.MethodId("5516bcc2-0b64-11ea-bef6-75a700135135")
    public java.lang.String ServiceName();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b0f9ed3-04be-11ea-b1ce-b1de8a8d414c,GvetwUriYxPm9feFHaWn/pP/ULg=] */
