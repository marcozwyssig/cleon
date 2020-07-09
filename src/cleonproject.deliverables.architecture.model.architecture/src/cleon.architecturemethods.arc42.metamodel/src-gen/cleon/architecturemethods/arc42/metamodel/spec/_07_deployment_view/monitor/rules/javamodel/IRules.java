package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRules extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0bb30754-8993-11e8-8250-d9b67f7d5f7f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.operators.javamodel.IOperators selectOperators();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScripts selectScripts();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IDeviceBehaviours selectDeviceBehaviours();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0bb30754-8993-11e8-8250-d9b67f7d5f7f,vlB7VETdxEhw5U2eilOGYD01M78=] */
