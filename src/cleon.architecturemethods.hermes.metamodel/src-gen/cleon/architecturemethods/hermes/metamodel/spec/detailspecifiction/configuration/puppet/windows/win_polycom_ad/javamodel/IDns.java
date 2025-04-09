package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDns extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2da3b935-151b-11f0-8fa5-ad696b254e17");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IDnsZone> selectDnsZone();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IDnsARecord> selectA_DNS_Records();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2da3b935-151b-11f0-8fa5-ad696b254e17,JcDUNDbN+gwK003RVnK4cSLfB0I=] */
