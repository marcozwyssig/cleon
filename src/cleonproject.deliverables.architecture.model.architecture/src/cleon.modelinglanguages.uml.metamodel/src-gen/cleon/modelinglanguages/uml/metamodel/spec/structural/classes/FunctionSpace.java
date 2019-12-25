package cleon.modelinglanguages.uml.metamodel.spec.structural.classes;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d76a5686-97d7-11e3-bb9a-e57bbf5647bb,imports]] */

/* End Protected Region   [[d76a5686-97d7-11e3-bb9a-e57bbf5647bb,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[d76a5686-97d7-11e3-bb9a-e57bbf5647bb]] */
  
  /* End Protected Region   [[d76a5686-97d7-11e3-bb9a-e57bbf5647bb]] */


  public static interface IFieldClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5ea98107-c0c3-11e4-b2f2-bbf951b71ec4")
    public List<cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField> AllFieldsWithBaseClass();

  }
  
  public static interface IFieldClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FieldClassFunctionsImpl implements IFieldClassFunctionsImpl {

    public static final IFieldClassFunctionsImpl INSTANCE = new FieldClassFunctionsImpl();

    private FieldClassFunctionsImpl() {}

  }
  
  public static class FieldClassFunctions {

    private FieldClassFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d76a5686-97d7-11e3-bb9a-e57bbf5647bb,ivT3vhBcRMf+hFWZHTgyTX6hDNU=] */
