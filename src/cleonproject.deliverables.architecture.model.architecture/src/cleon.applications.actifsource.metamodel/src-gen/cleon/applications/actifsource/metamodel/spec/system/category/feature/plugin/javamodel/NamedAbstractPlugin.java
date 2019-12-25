package cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NamedAbstractPlugin extends DynamicResource implements INamedAbstractPlugin {

  // abstract implementation, only used for static method calls
  private NamedAbstractPlugin() {
    super(INamedAbstractPlugin.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b3b2cfb4-1d2f-11ea-8d56-0bb865e0c576,3gwOaTlTDumAqapKwgVIHgTeCJw=] */
