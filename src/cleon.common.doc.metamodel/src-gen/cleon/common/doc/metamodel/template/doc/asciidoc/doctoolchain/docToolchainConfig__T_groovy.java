package cleon.common.doc.metamodel.template.doc.asciidoc.doctoolchain;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[092bb4d8-a5a9-11ef-99b4-af3541bfa2c3,imports]] */

/* End Protected Region   [[092bb4d8-a5a9-11ef-99b4-af3541bfa2c3,imports]] */

public class docToolchainConfig__T_groovy {

  /* Begin Protected Region [[092bb4d8-a5a9-11ef-99b4-af3541bfa2c3]] */
  
  /* End Protected Region   [[092bb4d8-a5a9-11ef-99b4-af3541bfa2c3]] */


  public static interface ILanguageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a59204be-a5ad-11ef-9b8e-f9190cfb496d")
    public java.lang.String GetFileName(final cleon.common.doc.metamodel.spec.document.javamodel.IDocument document__F_);

  }
  
  public static interface ILanguageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LanguageFunctionsImpl implements ILanguageFunctionsImpl {

    public static final ILanguageFunctionsImpl INSTANCE = new LanguageFunctionsImpl();

    private LanguageFunctionsImpl() {}

  }
  
  public static class LanguageFunctions {

    private LanguageFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,092bb4d8-a5a9-11ef-99b4-af3541bfa2c3,WzvHq6QMLtKMoDFI2r8dPKoixkI=] */
