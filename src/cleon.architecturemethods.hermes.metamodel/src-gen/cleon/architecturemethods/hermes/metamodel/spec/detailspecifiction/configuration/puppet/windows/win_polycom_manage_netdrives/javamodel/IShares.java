package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IShares extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfigurationPermissions {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("91b93da6-07fa-11f0-bc12-1bbda1d7028e");
  
  public java.lang.String selectRootForShares();
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfsRootShare> selectDfsRoot();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IShare> selectShares();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,91b93da6-07fa-11f0-bc12-1bbda1d7028e,YkPFOVbuLi/r5D1mDNODUPyqVdg=] */
