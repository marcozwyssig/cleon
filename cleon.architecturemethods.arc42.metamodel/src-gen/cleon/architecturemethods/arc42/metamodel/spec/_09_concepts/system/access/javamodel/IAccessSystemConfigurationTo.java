package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessSystemConfigurationTo extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultFalseAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("885b4821-19c4-11eb-8585-65084a06c07f");
  
  public java.lang.Boolean selectUseIP();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource selectSourceForAccess();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectAccessConfigurationRDP();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectAccessConfigurationVNC();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb> selectAccessConfigurationWeb();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectAccessConfigurationSSH();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,885b4821-19c4-11eb-8585-65084a06c07f,sf8qWEJyJmnenpWs6xPtDVDaRpw=] */
