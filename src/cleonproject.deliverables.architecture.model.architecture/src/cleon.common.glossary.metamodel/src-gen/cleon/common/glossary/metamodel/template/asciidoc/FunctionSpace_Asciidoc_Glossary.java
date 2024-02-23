package cleon.common.glossary.metamodel.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[97c78ae7-4f0b-11e6-9af7-359fc86da633,imports]] */

/* End Protected Region   [[97c78ae7-4f0b-11e6-9af7-359fc86da633,imports]] */

public class FunctionSpace_Asciidoc_Glossary {

  /* Begin Protected Region [[97c78ae7-4f0b-11e6-9af7-359fc86da633]] */
  
  /* End Protected Region   [[97c78ae7-4f0b-11e6-9af7-359fc86da633]] */


  public static interface IGlossaryAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("97c78af6-4f0b-11e6-9af7-359fc86da633")
    public java.lang.String RenderGlossary();

    @IDynamicResourceExtension.MethodId("40921bc6-d239-11ee-b255-49ab47716ebd")
    public java.lang.String RenderGlossary_EN();

  }
  
  public static interface IGlossaryAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GlossaryAwareFunctionsImpl implements IGlossaryAwareFunctionsImpl {

    public static final IGlossaryAwareFunctionsImpl INSTANCE = new GlossaryAwareFunctionsImpl();

    private GlossaryAwareFunctionsImpl() {}

  }
  
  public static class GlossaryAwareFunctions {

    private GlossaryAwareFunctions() {}

  }

  public static interface IGlossaryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("42df1433-0de0-11e6-a33d-238391a68770")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("5102f098-d239-11ee-b255-49ab47716ebd")
    public java.lang.String RenderContentElement_EN();

    @IDynamicResourceExtension.MethodId("02cdf937-98ad-11ec-aefb-ab0e6078b7ea")
    public java.lang.String GetIndent();

    @IDynamicResourceExtension.MethodId("1cb80d58-d24e-11ee-b255-49ab47716ebd")
    public java.lang.String RenderContent_EN();

  }
  
  public static interface IGlossaryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GlossaryFunctionsImpl implements IGlossaryFunctionsImpl {

    public static final IGlossaryFunctionsImpl INSTANCE = new GlossaryFunctionsImpl();

    private GlossaryFunctionsImpl() {}

  }
  
  public static class GlossaryFunctions {

    private GlossaryFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,97c78ae7-4f0b-11e6-9af7-359fc86da633,kB61rtU443SpgnqDuMLuEJqJ85U=] */
