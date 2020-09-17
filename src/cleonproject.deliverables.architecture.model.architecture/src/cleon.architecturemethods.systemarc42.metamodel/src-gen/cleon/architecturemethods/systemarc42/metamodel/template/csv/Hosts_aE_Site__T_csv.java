package cleon.architecturemethods.systemarc42.metamodel.template.csv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[980e7efe-517d-11ea-a946-13c393300b57,imports]] */

/* End Protected Region   [[980e7efe-517d-11ea-a946-13c393300b57,imports]] */

public class Hosts_aE_Site__T_csv {

  /* Begin Protected Region [[980e7efe-517d-11ea-a946-13c393300b57]] */

  /* End Protected Region   [[980e7efe-517d-11ea-a946-13c393300b57]] */


  public static interface IAbstractSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4a42b462-f832-11ea-8aa5-7b39f57c0cbc")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite HasData(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain domain);

    @IDynamicResourceExtension.MethodId("b9388bca-f834-11ea-8aa5-7b39f57c0cbc")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> HasDataInSite(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain domain);

  }
  
  public static interface IAbstractSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a42b462-f832-11ea-8aa5-7b39f57c0cbc")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite HasData(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain domain, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite);

  }
  
  public static class AbstractSiteFunctionsImpl implements IAbstractSiteFunctionsImpl {

    public static final IAbstractSiteFunctionsImpl INSTANCE = new AbstractSiteFunctionsImpl();

    private AbstractSiteFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite HasData(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain domain, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite) {
      /* Begin Protected Region [[4a42b462-f832-11ea-8aa5-7b39f57c0cbc]] */
      final IAbstractSiteFunctions abstractSiteFunctions = abstractSite.extension(IAbstractSiteFunctions.class);
      if( abstractSiteFunctions.HasDataInSite(domain).isEmpty() == false) {
      	return abstractSite;
      }
      return null;
      /* End Protected Region   [[4a42b462-f832-11ea-8aa5-7b39f57c0cbc]] */
    }

  }
  
  public static class AbstractSiteFunctions {

    private AbstractSiteFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite HasData(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain domain, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite) {
      return DynamicResourceUtil.invoke(IAbstractSiteFunctionsImpl.class, AbstractSiteFunctionsImpl.INSTANCE, abstractSite).HasData(domain, abstractSite);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,980e7efe-517d-11ea-a946-13c393300b57,O+mJBKSlx38y5Ht4Bm0YuXK2bjc=] */
