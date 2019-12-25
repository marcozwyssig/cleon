package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e643372c-20b6-11e6-9bb5-2b7a5dccc043,imports]] */

/* End Protected Region   [[e643372c-20b6-11e6-9bb5-2b7a5dccc043,imports]] */

public class FunctionSpace_Protocols {

  /* Begin Protected Region [[e643372c-20b6-11e6-9bb5-2b7a5dccc043]] */
  
  /* End Protected Region   [[e643372c-20b6-11e6-9bb5-2b7a5dccc043]] */


  public static interface IProtocolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1918f9b4-20b7-11e6-9bb5-2b7a5dccc043")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.protocolsitems.javamodel.ITask> SelectAllTasks();

  }
  
  public static interface IProtocolFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolFunctionsImpl implements IProtocolFunctionsImpl {

    public static final IProtocolFunctionsImpl INSTANCE = new ProtocolFunctionsImpl();

    private ProtocolFunctionsImpl() {}

  }
  
  public static class ProtocolFunctions {

    private ProtocolFunctions() {}

  }

  public static interface IProtocolItemsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3932e752-20b7-11e6-9bb5-2b7a5dccc043")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.protocolsitems.javamodel.ITask> SelectAllTasks();

  }
  
  public static interface IProtocolItemsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolItemsFunctionsImpl implements IProtocolItemsFunctionsImpl {

    public static final IProtocolItemsFunctionsImpl INSTANCE = new ProtocolItemsFunctionsImpl();

    private ProtocolItemsFunctionsImpl() {}

  }
  
  public static class ProtocolItemsFunctions {

    private ProtocolItemsFunctions() {}

  }

  public static interface IProtocolItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9375b6ee-2ef1-11e6-8bd9-a77b8d2a3a0e")
    public java.lang.String GetId();

  }
  
  public static interface IProtocolItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9375b6ee-2ef1-11e6-8bd9-a77b8d2a3a0e")
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem protocolItem);

  }
  
  public static class ProtocolItemFunctionsImpl implements IProtocolItemFunctionsImpl {

    public static final IProtocolItemFunctionsImpl INSTANCE = new ProtocolItemFunctionsImpl();

    private ProtocolItemFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem protocolItem) {
      return java.lang.String.format("PO-%04d", protocolItem.selectIdentifier());
    }

  }
  
  public static class ProtocolItemFunctions {

    private ProtocolItemFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem protocolItem) {
      return DynamicResourceUtil.invoke(IProtocolItemFunctionsImpl.class, ProtocolItemFunctionsImpl.INSTANCE, protocolItem).GetId(protocolItem);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e643372c-20b6-11e6-9bb5-2b7a5dccc043,YmsWJnJpkq57awiu1WhL45egZos=] */
