package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d,imports]] */

/* End Protected Region   [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d,imports]] */

public class FunctionSpace_Services {

  /* Begin Protected Region [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d]] */
  
  /* End Protected Region   [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d]] */


  public static interface IAbstractServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("df34f394-9340-11e9-a1f7-0765a2e4170d")
    public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServiceGroup Parent();

    @IDynamicResourceExtension.MethodId("119cb311-9341-11e9-a1f7-0765a2e4170d")
    public java.lang.Integer Position();

    @IDynamicResourceExtension.MethodId("3b777729-cfeb-11e9-83dd-7d113aa47006")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService> All();

  }
  
  public static interface IAbstractServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("119cb311-9341-11e9-a1f7-0765a2e4170d")
    public java.lang.Integer Position(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService abstractService);

  }
  
  public static class AbstractServiceFunctionsImpl implements IAbstractServiceFunctionsImpl {

    public static final IAbstractServiceFunctionsImpl INSTANCE = new AbstractServiceFunctionsImpl();

    private AbstractServiceFunctionsImpl() {}

    @Override
    public java.lang.Integer Position(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService abstractService) {
      /* Begin Protected Region [[119cb311-9341-11e9-a1f7-0765a2e4170d]] */
    	IAbstractServiceFunctions functions = abstractService.extension(IAbstractServiceFunctions.class);
    	cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServiceGroup parent = functions.Parent();
    	
    	int i = 0;
    	for( cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService child : parent.selectServices())
    	{
    		++i;
    		if( child.equals(abstractService))
    		{
    			return i;
    		}
    	}
    	
    	return i;      
      /* End Protected Region   [[119cb311-9341-11e9-a1f7-0765a2e4170d]] */
    }

  }
  
  public static class AbstractServiceFunctions {

    private AbstractServiceFunctions() {}

    public static java.lang.Integer Position(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService abstractService) {
      return DynamicResourceUtil.invoke(IAbstractServiceFunctionsImpl.class, AbstractServiceFunctionsImpl.INSTANCE, abstractService).Position(abstractService);
    }

  }

  public static interface IPortServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("89eb159a-cfeb-11e9-83dd-7d113aa47006")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService> All();

  }
  
  public static interface IPortServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PortServiceFunctionsImpl implements IPortServiceFunctionsImpl {

    public static final IPortServiceFunctionsImpl INSTANCE = new PortServiceFunctionsImpl();

    private PortServiceFunctionsImpl() {}

  }
  
  public static class PortServiceFunctions {

    private PortServiceFunctions() {}

  }

  public static interface IServiceGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9baed0f0-cfeb-11e9-83dd-7d113aa47006")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService> All();

  }
  
  public static interface IServiceGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceGroupFunctionsImpl implements IServiceGroupFunctionsImpl {

    public static final IServiceGroupFunctionsImpl INSTANCE = new ServiceGroupFunctionsImpl();

    private ServiceGroupFunctionsImpl() {}

  }
  
  public static class ServiceGroupFunctions {

    private ServiceGroupFunctions() {}

  }

  public static interface IFWStandardServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b5124b9f-cfeb-11e9-83dd-7d113aa47006")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService> All();

  }
  
  public static interface IFWStandardServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FWStandardServiceFunctionsImpl implements IFWStandardServiceFunctionsImpl {

    public static final IFWStandardServiceFunctionsImpl INSTANCE = new FWStandardServiceFunctionsImpl();

    private FWStandardServiceFunctionsImpl() {}

  }
  
  public static class FWStandardServiceFunctions {

    private FWStandardServiceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d1f3b31c-9340-11e9-a1f7-0765a2e4170d,NamIrGN56YkH30AcjQmLXLw5Im8=] */
