package cleon.architecturemethods.systemarc42.metamodel.template.csv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1f215ea6-009c-11ea-9b43-0b5ecf12c553,imports]] */

/* End Protected Region   [[1f215ea6-009c-11ea-9b43-0b5ecf12c553,imports]] */

public class ServiceGroups__T_csv {

  /* Begin Protected Region [[1f215ea6-009c-11ea-9b43-0b5ecf12c553]] */
  
  /* End Protected Region   [[1f215ea6-009c-11ea-9b43-0b5ecf12c553]] */


  public static interface Iarc42DocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6e631f5f-0b6a-11ea-bef6-75a700135135")
    public java.lang.String MemberColumns();

  }
  
  public static interface Iarc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6e631f5f-0b6a-11ea-bef6-75a700135135")
    public java.lang.String MemberColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document);

  }
  
  public static class arc42DocumentFunctionsImpl implements Iarc42DocumentFunctionsImpl {

    public static final Iarc42DocumentFunctionsImpl INSTANCE = new arc42DocumentFunctionsImpl();

    private arc42DocumentFunctionsImpl() {}

    @Override
    public java.lang.String MemberColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      /* Begin Protected Region [[6e631f5f-0b6a-11ea-bef6-75a700135135]] */
    	StringBuilder result = new StringBuilder();
    	for(int i=1;i<40;++i) {
    		result.append("members." + i);
    		result.append(System.lineSeparator());
    	}
    	return result.toString();	   
      /* End Protected Region   [[6e631f5f-0b6a-11ea-bef6-75a700135135]] */
    }

  }
  
  public static class arc42DocumentFunctions {

    private arc42DocumentFunctions() {}

    public static java.lang.String MemberColumns(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document) {
      return DynamicResourceUtil.invoke(Iarc42DocumentFunctionsImpl.class, arc42DocumentFunctionsImpl.INSTANCE, arc42Document).MemberColumns(arc42Document);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1f215ea6-009c-11ea-9b43-0b5ecf12c553,fM5tUouuNki6uawgB1ZAI1u148E=] */
