package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISatelliteRegistration extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f6aefe38-ba3d-11f0-9349-73cfbb54b949");
  
  public java.lang.String selectUrl();
  
  public java.lang.String selectCa_rpm_url();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectSatellite_host();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f6aefe38-ba3d-11f0-9349-73cfbb54b949,21GsrnIn/gEiGlzfqy9+Wy0088I=] */
