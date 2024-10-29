package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceAware extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9f082e63-06cb-11e6-a881-5729d6667c93");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> selectOriginatesFromSource();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9f082e63-06cb-11e6-a881-5729d6667c93,4AS/+X78Sqw99DKQM2pmpGfnrv8=] */
