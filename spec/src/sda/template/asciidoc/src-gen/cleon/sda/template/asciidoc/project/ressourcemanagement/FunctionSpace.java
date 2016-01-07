package cleon.sda.template.asciidoc.project.ressourcemanagement;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[358e3a10-a7e9-11e5-82dd-3b995d9c840c,imports]] */

/* End Protected Region   [[358e3a10-a7e9-11e5-82dd-3b995d9c840c,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[358e3a10-a7e9-11e5-82dd-3b995d9c840c]] */
  
  /* End Protected Region   [[358e3a10-a7e9-11e5-82dd-3b995d9c840c]] */


  public static interface ISkillsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f76f134-a7eb-11e5-82dd-3b995d9c840c")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISkillsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SkillsFunctionsImpl implements ISkillsFunctionsImpl {

    public static final ISkillsFunctionsImpl INSTANCE = new SkillsFunctionsImpl();

    private SkillsFunctionsImpl() {}

  }
  
  public static class SkillsFunctions {

    private SkillsFunctions() {}

  }

  public static interface IPersonFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0367b039-b50c-11e5-aa95-235930e9af3d")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IPersonFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PersonFunctionsImpl implements IPersonFunctionsImpl {

    public static final IPersonFunctionsImpl INSTANCE = new PersonFunctionsImpl();

    private PersonFunctionsImpl() {}

  }
  
  public static class PersonFunctions {

    private PersonFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,358e3a10-a7e9-11e5-82dd-3b995d9c840c,vJWtC2DGTl5z7fd466M1OxAD6xM=] */
