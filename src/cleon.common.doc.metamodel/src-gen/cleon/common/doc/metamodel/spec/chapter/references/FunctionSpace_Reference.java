package cleon.common.doc.metamodel.spec.chapter.references;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b2eabf6e-1b3b-11e9-8cd4-efe75fb4587a,imports]] */

/* End Protected Region   [[b2eabf6e-1b3b-11e9-8cd4-efe75fb4587a,imports]] */

public class FunctionSpace_Reference {

  /* Begin Protected Region [[b2eabf6e-1b3b-11e9-8cd4-efe75fb4587a]] */
  
  /* End Protected Region   [[b2eabf6e-1b3b-11e9-8cd4-efe75fb4587a]] */


  public static interface IReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b8a656bf-1b3b-11e9-8cd4-efe75fb4587a")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("411777ce-1b3e-11e9-8cd4-efe75fb4587a")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("c80a30d4-1bf1-11e9-a649-37e63f24427a")
    public java.lang.String GetDescription();

  }
  
  public static interface IReferenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReferenceFunctionsImpl implements IReferenceFunctionsImpl {

    public static final IReferenceFunctionsImpl INSTANCE = new ReferenceFunctionsImpl();

    private ReferenceFunctionsImpl() {}

  }
  
  public static class ReferenceFunctions {

    private ReferenceFunctions() {}

  }

  public static interface INamedReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c3187100-1b3b-11e9-8cd4-efe75fb4587a")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("d421e516-1bf1-11e9-a649-37e63f24427a")
    public java.lang.String GetDescription();

  }
  
  public static interface INamedReferenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedReferenceFunctionsImpl implements INamedReferenceFunctionsImpl {

    public static final INamedReferenceFunctionsImpl INSTANCE = new NamedReferenceFunctionsImpl();

    private NamedReferenceFunctionsImpl() {}

  }
  
  public static class NamedReferenceFunctions {

    private NamedReferenceFunctions() {}

  }

  public static interface IReferencesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("08c0ee97-1b3c-11e9-8cd4-efe75fb4587a")
    public List<cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference> ReferenceOrder();

  }
  
  public static interface IReferencesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReferencesFunctionsImpl implements IReferencesFunctionsImpl {

    public static final IReferencesFunctionsImpl INSTANCE = new ReferencesFunctionsImpl();

    private ReferencesFunctionsImpl() {}

  }
  
  public static class ReferencesFunctions {

    private ReferencesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b2eabf6e-1b3b-11e9-8cd4-efe75fb4587a,Omczrp5NYZ9/mUyWCIKF3wqizoY=] */
