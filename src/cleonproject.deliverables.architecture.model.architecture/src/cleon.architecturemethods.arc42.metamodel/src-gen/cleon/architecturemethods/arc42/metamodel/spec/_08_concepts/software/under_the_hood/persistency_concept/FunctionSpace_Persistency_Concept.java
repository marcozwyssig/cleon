package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef,imports]] */

/* End Protected Region   [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef,imports]] */

public class FunctionSpace_Persistency_Concept {

  /* Begin Protected Region [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef]] */
  
  /* End Protected Region   [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef]] */


  public static interface IPrimaryKeyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fe9f4f89-b936-11ee-a0d0-e953bcbfaeef")
    public java.lang.String ColumnsAsList();

  }
  
  public static interface IPrimaryKeyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrimaryKeyFunctionsImpl implements IPrimaryKeyFunctionsImpl {

    public static final IPrimaryKeyFunctionsImpl INSTANCE = new PrimaryKeyFunctionsImpl();

    private PrimaryKeyFunctionsImpl() {}

  }
  
  public static class PrimaryKeyFunctions {

    private PrimaryKeyFunctions() {}

  }

  public static interface ILiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("442330d7-b93b-11ee-a0d0-e953bcbfaeef")
    public java.lang.String ToType();

  }
  
  public static interface ILiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LiteralFunctionsImpl implements ILiteralFunctionsImpl {

    public static final ILiteralFunctionsImpl INSTANCE = new LiteralFunctionsImpl();

    private LiteralFunctionsImpl() {}

  }
  
  public static class LiteralFunctions {

    private LiteralFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f837c1a7-b936-11ee-a0d0-e953bcbfaeef,/FWWUIll30RTgBH0wymzQu08AHc=] */
