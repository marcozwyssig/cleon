package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDNSConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1475e2c0-c7b9-11ec-a6a4-0b12dcfbdf90");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectCustomChapters();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSIntegration selectIntegration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1475e2c0-c7b9-11ec-a6a4-0b12dcfbdf90,1cgzFtoOQEE2CxwnmxZC6WbWk04=] */
