package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGitLab extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1ccfe941-ba46-11f0-9349-73cfbb54b949");
  
  // attributes
  
  public java.lang.String selectManage_upstream_edition();
  
  public java.lang.String selectPackage_name();
  
  public java.lang.Boolean selectLetsencrypt_enable();
  
  public java.lang.Boolean selectNginx_redirect_http_to_https();
  
  public java.lang.Boolean selectPrometheus_monitoring_enable();
  
  public java.lang.String selectExternal_url();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectGitlab_host();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1ccfe941-ba46-11f0-9349-73cfbb54b949,rbix0VzFGLOBVa9ul3JDrLxt+8Y=] */
