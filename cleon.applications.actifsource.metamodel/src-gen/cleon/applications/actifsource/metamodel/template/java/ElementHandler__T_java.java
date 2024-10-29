package cleon.applications.actifsource.metamodel.template.java;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[38d2fc01-237f-11e8-85f4-376150ff5cc0,imports]] */

/* End Protected Region   [[38d2fc01-237f-11e8-85f4-376150ff5cc0,imports]] */

public class ElementHandler__T_java {

  /* Begin Protected Region [[38d2fc01-237f-11e8-85f4-376150ff5cc0]] */
  
  /* End Protected Region   [[38d2fc01-237f-11e8-85f4-376150ff5cc0]] */


  public static interface IAbstractImportClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("731c3fd9-237f-11e8-85f4-376150ff5cc0")
    public java.lang.String ClassName();

    @IDynamicResourceExtension.MethodId("edb1917c-3280-11e8-925e-0378e2266aa0")
    public java.lang.String ClassNameToAllLower();

  }
  
  public static interface IAbstractImportClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractImportClassFunctionsImpl implements IAbstractImportClassFunctionsImpl {

    public static final IAbstractImportClassFunctionsImpl INSTANCE = new AbstractImportClassFunctionsImpl();

    private AbstractImportClassFunctionsImpl() {}

  }
  
  public static class AbstractImportClassFunctions {

    private AbstractImportClassFunctions() {}

  }

  public static interface IImportOwnRelationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a6a8e7c4-2390-11e8-85f4-376150ff5cc0")
    public java.lang.String propertyName();

  }
  
  public static interface IImportOwnRelationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImportOwnRelationFunctionsImpl implements IImportOwnRelationFunctionsImpl {

    public static final IImportOwnRelationFunctionsImpl INSTANCE = new ImportOwnRelationFunctionsImpl();

    private ImportOwnRelationFunctionsImpl() {}

  }
  
  public static class ImportOwnRelationFunctions {

    private ImportOwnRelationFunctions() {}

  }

  public static interface IAbstractImportAttributeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("12fa5603-25ee-11e8-afb5-83603a67326a")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("200e6ae7-25ee-11e8-afb5-83603a67326a")
    public java.lang.String AttrName();

    @IDynamicResourceExtension.MethodId("da1b9524-26a5-11e8-a805-991f3ff583b7")
    public java.lang.String IsMandatoryOrOptional();

  }
  
  public static interface IAbstractImportAttributeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractImportAttributeFunctionsImpl implements IAbstractImportAttributeFunctionsImpl {

    public static final IAbstractImportAttributeFunctionsImpl INSTANCE = new AbstractImportAttributeFunctionsImpl();

    private AbstractImportAttributeFunctionsImpl() {}

  }
  
  public static class AbstractImportAttributeFunctions {

    private AbstractImportAttributeFunctions() {}

  }

  public static interface IImportAssociationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("321d02ac-26dd-11e8-be68-2978d3dec2c0")
    public java.lang.String RefName();

    @IDynamicResourceExtension.MethodId("491db296-26e1-11e8-be68-2978d3dec2c0")
    public java.lang.String UpdateRefParameters();

  }
  
  public static interface IImportAssociationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImportAssociationFunctionsImpl implements IImportAssociationFunctionsImpl {

    public static final IImportAssociationFunctionsImpl INSTANCE = new ImportAssociationFunctionsImpl();

    private ImportAssociationFunctionsImpl() {}

  }
  
  public static class ImportAssociationFunctions {

    private ImportAssociationFunctions() {}

  }

  public static interface IAbstractOwnImportRelationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5bb288fe-25dc-11e8-afb5-83603a67326a")
    public java.lang.String CreateElementHandler();

  }
  
  public static interface IAbstractOwnImportRelationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractOwnImportRelationFunctionsImpl implements IAbstractOwnImportRelationFunctionsImpl {

    public static final IAbstractOwnImportRelationFunctionsImpl INSTANCE = new AbstractOwnImportRelationFunctionsImpl();

    private AbstractOwnImportRelationFunctionsImpl() {}

  }
  
  public static class AbstractOwnImportRelationFunctions {

    private AbstractOwnImportRelationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,38d2fc01-237f-11e8-85f4-376150ff5cc0,X6Xf5A6nzYFLS0PPA7yd8gBHvUQ=] */
