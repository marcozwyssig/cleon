package cleon.applications.actifsource.metamodel.template.eclipse.src.as;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6,imports]] */
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.IActifsource;
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IJava;
/* End Protected Region   [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6,imports]] */

public class __T_asproject {

  /* Begin Protected Region [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6]] */
  
  /* End Protected Region   [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6]] */


  public static interface IAbstractProjectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("88e4db85-41a1-11e8-81d0-774e4d9334dd")
    public java.lang.Boolean GenerateJavaModel();

  }
  
  public static interface IAbstractProjectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("88e4db85-41a1-11e8-81d0-774e4d9334dd")
    public java.lang.Boolean GenerateJavaModel(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject abstractProject);

  }
  
  public static class AbstractProjectFunctionsImpl implements IAbstractProjectFunctionsImpl {

    public static final IAbstractProjectFunctionsImpl INSTANCE = new AbstractProjectFunctionsImpl();

    private AbstractProjectFunctionsImpl() {}

    @Override
    public java.lang.Boolean GenerateJavaModel(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject abstractProject) {
      /* Begin Protected Region [[88e4db85-41a1-11e8-81d0-774e4d9334dd]] */
    	IActifsource actifsource = abstractProject.selectActifsource();
    	if( actifsource == null)
    	{
    		return false;
    	}
    	
    	IJava java = abstractProject.selectJava();
    	if( java == null)
    	{
    		return false;
    	}
		return true;   
      /* End Protected Region   [[88e4db85-41a1-11e8-81d0-774e4d9334dd]] */
    }

  }
  
  public static class AbstractProjectFunctions {

    private AbstractProjectFunctions() {}

    public static java.lang.Boolean GenerateJavaModel(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject abstractProject) {
      return DynamicResourceUtil.invoke(IAbstractProjectFunctionsImpl.class, AbstractProjectFunctionsImpl.INSTANCE, abstractProject).GenerateJavaModel(abstractProject);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a9f07baf-11e9-11e5-b568-55f5f05bd6f6,71GMRSaEo4Zx48x9+FW2zU2zwzA=] */
