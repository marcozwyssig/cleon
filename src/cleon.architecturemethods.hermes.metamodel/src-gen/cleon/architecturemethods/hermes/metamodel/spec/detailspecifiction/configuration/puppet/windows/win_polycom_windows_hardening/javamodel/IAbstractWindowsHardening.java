package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractWindowsHardening extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("030fc40c-5e43-11f0-a5db-972145eef50c");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISProfileType selectProfile_type();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISEnforcementLevel selectEnforcement_level();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,030fc40c-5e43-11f0-a5db-972145eef50c,9ZYfeNLCtBKGv1veHsYbrnrTHtw=] */
