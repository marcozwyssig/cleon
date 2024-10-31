package cleon.common.doc.metamodel.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[128d1794-0d06-11e6-be97-7d1235599779,imports]] */
import java.util.ArrayList;
/* End Protected Region   [[128d1794-0d06-11e6-be97-7d1235599779,imports]] */

public class Gemfile {

  /* Begin Protected Region [[128d1794-0d06-11e6-be97-7d1235599779]] */
  
  /* End Protected Region   [[128d1794-0d06-11e6-be97-7d1235599779]] */


  public static interface IDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("471bacbf-aad2-11e8-b25a-7dd9f85a27ad")
    public List<java.lang.String> removeDuplicatePackages();

  }
  
  public static interface IDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("471bacbf-aad2-11e8-b25a-7dd9f85a27ad")
    public List<java.lang.String> removeDuplicatePackages(final List<cleon.common.doc.metamodel.spec.document.javamodel.IDocument> documentList);

  }
  
  public static class DocumentFunctionsImpl implements IDocumentFunctionsImpl {

    public static final IDocumentFunctionsImpl INSTANCE = new DocumentFunctionsImpl();

    private DocumentFunctionsImpl() {}

    @Override
    public List<java.lang.String> removeDuplicatePackages(final List<cleon.common.doc.metamodel.spec.document.javamodel.IDocument> documentList) {
      /* Begin Protected Region [[471bacbf-aad2-11e8-b25a-7dd9f85a27ad]] */
    	List<String> packages = new ArrayList<>();
    	for( cleon.common.doc.metamodel.spec.document.javamodel.IDocument document : documentList)
    	{
    		String packageName = document.extension(ch.actifsource.template.BuiltIn.IResourceFunctions.class).package_();
    		if(!packages.contains(packageName))
    		{
    			packages.add(packageName);
    		}
    	}
    	return packages;
      /* End Protected Region   [[471bacbf-aad2-11e8-b25a-7dd9f85a27ad]] */
    }

  }
  
  public static class DocumentFunctions {

    private DocumentFunctions() {}

    public static List<java.lang.String> removeDuplicatePackages(final List<cleon.common.doc.metamodel.spec.document.javamodel.IDocument> documentList) {
      return DynamicResourceUtil.invoke(IDocumentFunctionsImpl.class, DocumentFunctionsImpl.INSTANCE, documentList).removeDuplicatePackages(documentList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,128d1794-0d06-11e6-be97-7d1235599779,Te276k6I16voPXXST/8Dr6dSGhc=] */
