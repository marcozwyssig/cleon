package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeployement_Template extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3d0c231d-8017-11ea-b039-9728191a5cdc");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode> selectTemplateNode();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3d0c231d-8017-11ea-b039-9728191a5cdc,R6pqiqJlalUQAVJ3z/+B/Eji5UA=] */
