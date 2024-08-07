package cleon.common.glossary.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ce79e17c-4f0a-11e6-9af7-359fc86da633,imports]] */

/* End Protected Region   [[ce79e17c-4f0a-11e6-9af7-359fc86da633,imports]] */

public class FunctionSpace_DocBook_Glossary {

  /* Begin Protected Region [[ce79e17c-4f0a-11e6-9af7-359fc86da633]] */
  
  /* End Protected Region   [[ce79e17c-4f0a-11e6-9af7-359fc86da633]] */


  public static interface IGlossaryAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d5dc4ac1-4f0a-11e6-9af7-359fc86da633")
    public java.lang.String RenderGlossary();

    @IDynamicResourceExtension.MethodId("79326986-13eb-11e9-a836-9d144e5bc2a5")
    public java.lang.String RenderChapters();

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

    @IDynamicResourceExtension.MethodId("0f687b00-3e06-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("162af23c-13f1-11e9-a836-9d144e5bc2a5")
    public java.lang.String RenderElementName();

  }
  
  public static interface IGlossaryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("162af23c-13f1-11e9-a836-9d144e5bc2a5")
    public java.lang.String RenderElementName(final cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary);

  }
  
  public static class GlossaryFunctionsImpl implements IGlossaryFunctionsImpl {

    public static final IGlossaryFunctionsImpl INSTANCE = new GlossaryFunctionsImpl();

    private GlossaryFunctionsImpl() {}

    @Override
    public java.lang.String RenderElementName(final cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
      return "chapter";
    }

  }
  
  public static class GlossaryFunctions {

    private GlossaryFunctions() {}

    public static java.lang.String RenderElementName(final cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
      return DynamicResourceUtil.invoke(IGlossaryFunctionsImpl.class, GlossaryFunctionsImpl.INSTANCE, glossary).RenderElementName(glossary);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ce79e17c-4f0a-11e6-9af7-359fc86da633,7cWrz1RTG2ns3BXuE9iqERgp4bY=] */
