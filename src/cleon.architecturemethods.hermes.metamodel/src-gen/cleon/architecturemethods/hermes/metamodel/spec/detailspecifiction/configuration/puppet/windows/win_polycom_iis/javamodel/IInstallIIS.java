package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallIIS extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83d10e71-115a-11f0-a4f9-b5f995a9e0fe");
  
  // attributes
  
  public java.lang.String selectLogpath();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISPool> selectIISPools();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISShare> selectIISShares();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83d10e71-115a-11f0-a4f9-b5f995a9e0fe,RRQQ9GHhrT+SdUadfU9Yjf8q0s4=] */
