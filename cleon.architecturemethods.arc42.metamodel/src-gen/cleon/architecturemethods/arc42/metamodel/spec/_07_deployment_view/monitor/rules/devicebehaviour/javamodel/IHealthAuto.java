package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHealthAuto extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthComponentBehaviour {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f6838d4-8993-11e8-8250-d9b67f7d5f7f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript selectScript();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthParameter> selectParameters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f6838d4-8993-11e8-8250-d9b67f7d5f7f,IG7fZFxzjY9utjNbe7SoultfAuo=] */
