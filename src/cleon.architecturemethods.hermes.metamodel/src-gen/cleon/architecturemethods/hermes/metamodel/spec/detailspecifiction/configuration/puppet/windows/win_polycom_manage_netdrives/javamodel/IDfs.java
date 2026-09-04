package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDfs extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1e93d1c4-05a2-11f0-a294-67d88c30f2e4");
  
  // attributes
  
  public java.lang.String selectDFSrootName();
  
  public java.lang.String selectDFSrootShareName();
  
  public java.lang.String selectDFSstagingQuota();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.INSShare> selectShare();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> selectMembers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1e93d1c4-05a2-11f0-a294-67d88c30f2e4,SCbrVGd6nRWWZu7wp8pWGE62/Iw=] */
