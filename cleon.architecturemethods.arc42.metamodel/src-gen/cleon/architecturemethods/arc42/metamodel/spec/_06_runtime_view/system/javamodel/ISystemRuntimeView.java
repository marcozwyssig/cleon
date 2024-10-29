package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemRuntimeView extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel.IRuntimeView {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a5c76a26-480f-11ea-8815-a3c0ce8e776e");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ICommunicationView selectCommunication();
  
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteractionView selectInteraction();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a5c76a26-480f-11ea-8815-a3c0ce8e776e,5fkoUaLunifFWcRnaus8SdkkihU=] */
