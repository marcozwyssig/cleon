package cleon.architecturemethods.hermes.metamodel.template.asciidoc.detailspecifiction;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1db6c3df-d21f-11ee-8171-1959ddc2a1e5,imports]] */

/* End Protected Region   [[1db6c3df-d21f-11ee-8171-1959ddc2a1e5,imports]] */

public class SysCmpSpecification__T_adoc {

  /* Begin Protected Region [[1db6c3df-d21f-11ee-8171-1959ddc2a1e5]] */
  
  /* End Protected Region   [[1db6c3df-d21f-11ee-8171-1959ddc2a1e5]] */


  public static interface ISysCmpSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1db6c3ea-d21f-11ee-8171-1959ddc2a1e5")
    public java.lang.String GetComponentPath();

    @IDynamicResourceExtension.MethodId("4f1f91c5-d236-11ee-b255-49ab47716ebd")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("686110eb-d237-11ee-b255-49ab47716ebd")
    public java.lang.String RenderChapters(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISysCmpSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCmpSpecificationFunctionsImpl implements ISysCmpSpecificationFunctionsImpl {

    public static final ISysCmpSpecificationFunctionsImpl INSTANCE = new SysCmpSpecificationFunctionsImpl();

    private SysCmpSpecificationFunctionsImpl() {}

  }
  
  public static class SysCmpSpecificationFunctions {

    private SysCmpSpecificationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1db6c3df-d21f-11ee-8171-1959ddc2a1e5,lPF+nq7VVbUMoSrdiYvgbvlg/TU=] */
