package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRBAC_Role_Template extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54511297-7fec-11ea-97af-7d8bb186ed8f");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Actor_Template> selectActors();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54511297-7fec-11ea-97af-7d8bb186ed8f,TYOq4XUcGlejmykeKzCAUASTaAg=] */
