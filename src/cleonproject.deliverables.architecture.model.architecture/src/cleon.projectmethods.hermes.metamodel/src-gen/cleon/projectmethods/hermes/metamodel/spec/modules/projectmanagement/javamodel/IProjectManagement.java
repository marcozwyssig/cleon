package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * 020_Contract-Exec
 */
public interface IProjectManagement extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1ee9b306-bdf8-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols selectProtocols();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.javamodel.ISteering selectSteering();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IProcurement selectProcurement();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1ee9b306-bdf8-11e6-a3f0-c7681ee45a3f,tyNmxCa/4ZXI1EaNo6JjUVMT3cs=] */
