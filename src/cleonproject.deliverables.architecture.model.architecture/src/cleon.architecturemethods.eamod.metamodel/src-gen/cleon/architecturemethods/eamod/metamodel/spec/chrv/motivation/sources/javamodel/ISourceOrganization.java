package cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceOrganization extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1b0ca733-bb80-11e5-b2f7-f515c847fa35");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISourcePerson> selectPersons();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISourceDocument> selectDocuments();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISourceWorkshop> selectWorkshop();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1b0ca733-bb80-11e5-b2f7-f515c847fa35,rLzIgGJNxGJFmYbm8Ak7sELdnNs=] */
