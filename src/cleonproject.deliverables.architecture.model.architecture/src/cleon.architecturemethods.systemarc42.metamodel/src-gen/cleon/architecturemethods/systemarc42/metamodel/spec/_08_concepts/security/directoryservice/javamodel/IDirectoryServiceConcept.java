package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDirectoryServiceConcept extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.IAbstractSecurityConcept, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ebac8bd2-0eaf-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration> selectDirectoryServiceForSystemConfigurations();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService> selectDirectoryService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ebac8bd2-0eaf-11e9-9f19-6d15636f4ecc,e68h9k6Nq992M3cUoRS0zdVlrxg=] */
