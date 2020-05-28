package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQoSSystemConfigurationSource extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fcc35d62-a0c3-11ea-8daa-afb4679c3497");
  
  public java.lang.Integer selectEstimateMean_KBits();
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource selectSource();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IServiceClass selectServiceClass();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fcc35d62-a0c3-11ea-8daa-afb4679c3497,W3COuQErdAXe2vG3Tt52Iqc4mIg=] */
