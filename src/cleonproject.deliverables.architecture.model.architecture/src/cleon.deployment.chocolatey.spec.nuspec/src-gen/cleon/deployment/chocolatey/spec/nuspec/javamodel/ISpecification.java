package cleon.deployment.chocolatey.spec.nuspec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISpecification extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.naming.javamodel.IDisplayName, cleon.common.resources.spec.resources.versions.javamodel.IVersion, cleon.support.projectmanagement.spec.resource.persons.javamodel.IOwnerAware, cleon.support.projectmanagement.spec.resource.persons.javamodel.IAuthorsAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4652f766-4d0b-11e6-9043-01b29b61e580");
  
  // attributes
  
  public java.lang.Boolean selectRequireLicenseAcceptance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4652f766-4d0b-11e6-9043-01b29b61e580,aMFpVaoNbuYoA7YIA5ijHEA8hN0=] */
