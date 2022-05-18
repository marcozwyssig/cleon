package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessSystemConfigurationTo extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultFalseAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("885b4821-19c4-11eb-8585-65084a06c07f");
  
  public java.lang.Boolean selectUseIP();
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource selectSourceForAccess();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectAccessConfigurationRDP();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectAccessConfigurationVNC();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationWeb> selectAccessConfigurationWeb();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectAccessConfigurationSSH();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,885b4821-19c4-11eb-8585-65084a06c07f,7T+Ygy/AeNV8GWOQueBrY/u+6J0=] */
