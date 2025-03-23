package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INSShare extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5fcf2c59-07f5-11f0-bc12-1bbda1d7028e");
  
  public java.lang.String selectName();
  
  public java.lang.String selectShareName();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare selectShare();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5fcf2c59-07f5-11f0-bc12-1bbda1d7028e,/UXYkUdMZhvY++sRC+VZERTKghs=] */
