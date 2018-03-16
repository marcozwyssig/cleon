package cleon.conception.actifsource.template.importer;

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


  public static interface IImportClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("731c3fd9-237f-11e8-85f4-376150ff5cc0")
    public java.lang.String ClassName();

  }
  
  public static interface IImportClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImportClassFunctionsImpl implements IImportClassFunctionsImpl {

    public static final IImportClassFunctionsImpl INSTANCE = new ImportClassFunctionsImpl();

    private ImportClassFunctionsImpl() {}

  }
  
  public static class ImportClassFunctions {

    private ImportClassFunctions() {}

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

  public static interface IImportAttributeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("12fa5603-25ee-11e8-afb5-83603a67326a")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("200e6ae7-25ee-11e8-afb5-83603a67326a")
    public java.lang.String AttrName();

    @IDynamicResourceExtension.MethodId("da1b9524-26a5-11e8-a805-991f3ff583b7")
    public java.lang.String IsMandatoryOrOptional();

  }
  
  public static interface IImportAttributeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImportAttributeFunctionsImpl implements IImportAttributeFunctionsImpl {

    public static final IImportAttributeFunctionsImpl INSTANCE = new ImportAttributeFunctionsImpl();

    private ImportAttributeFunctionsImpl() {}

  }
  
  public static class ImportAttributeFunctions {

    private ImportAttributeFunctions() {}

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,38d2fc01-237f-11e8-85f4-376150ff5cc0,gwVF5+LYlE2vQNjpS2i6Zm10te4=] */
