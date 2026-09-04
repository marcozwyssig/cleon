package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDnsARecord extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IDnsRecord, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("672825f8-151b-11f0-8fa5-ad696b254e17");
  
  public java.lang.String selectHostName();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode selectNetworkHostNode();
  
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D selectIp();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,672825f8-151b-11f0-8fa5-ad696b254e17,SVTkIApOPQuo06RoaOKkgWPBwbk=] */
