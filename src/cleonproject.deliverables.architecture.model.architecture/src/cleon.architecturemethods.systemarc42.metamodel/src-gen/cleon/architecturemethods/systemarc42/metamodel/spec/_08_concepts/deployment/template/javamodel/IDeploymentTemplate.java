package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentTemplate extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d8e75caa-800e-11ea-915d-8592596896f8");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplateNode> selectTemplateNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d8e75caa-800e-11ea-915d-8592596896f8,f7JhFo1f45quTZOtgxJQkVRVBHY=] */
