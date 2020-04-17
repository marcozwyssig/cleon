package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRBAC_Role_Actor_Template extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c467126f-7fec-11ea-97af-7d8bb186ed8f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectActor();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template selectResponsibilities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c467126f-7fec-11ea-97af-7d8bb186ed8f,zH71jjVXw+TAVKcg+tZjT31mQII=] */
