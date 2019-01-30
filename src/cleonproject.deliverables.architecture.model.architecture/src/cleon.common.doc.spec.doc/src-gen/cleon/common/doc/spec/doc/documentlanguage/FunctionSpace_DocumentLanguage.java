package cleon.common.doc.spec.doc.documentlanguage;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c84a0ac0-2234-11e9-a054-db6d80fba790,imports]] */

/* End Protected Region   [[c84a0ac0-2234-11e9-a054-db6d80fba790,imports]] */

public class FunctionSpace_DocumentLanguage {

  /* Begin Protected Region [[c84a0ac0-2234-11e9-a054-db6d80fba790]] */
  
  /* End Protected Region   [[c84a0ac0-2234-11e9-a054-db6d80fba790]] */


  public static interface IDocumentLanguageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e6e08bab-2234-11e9-a054-db6d80fba790")
    public java.lang.String RenderTextContent(final cleon.common.doc.spec.doc.paragraph.javamodel.IText text);

    @IDynamicResourceExtension.MethodId("8c68084f-2240-11e9-a054-db6d80fba790")
    public java.lang.String RenderDocumentContent(final cleon.common.doc.spec.doc.document.javamodel.IDocument document);

  }
  
  public static interface IDocumentLanguageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentLanguageFunctionsImpl implements IDocumentLanguageFunctionsImpl {

    public static final IDocumentLanguageFunctionsImpl INSTANCE = new DocumentLanguageFunctionsImpl();

    private DocumentLanguageFunctionsImpl() {}

  }
  
  public static class DocumentLanguageFunctions {

    private DocumentLanguageFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c84a0ac0-2234-11e9-a054-db6d80fba790,ZEzLKAQ4nau4f2YMenloWWgW/g8=] */
