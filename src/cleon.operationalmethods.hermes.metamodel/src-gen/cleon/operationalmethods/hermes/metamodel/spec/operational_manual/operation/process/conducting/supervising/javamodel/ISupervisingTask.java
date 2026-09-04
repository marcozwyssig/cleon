package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISupervisingTask extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2b160603-95c9-11ea-9744-7dd962dc1878");
  
  // relations
  
  public java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel.ISupervisingStep> selectSupervisingStep();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2b160603-95c9-11ea-9744-7dd962dc1878,jCaAxwVE/h+MZWAcss4YU8rHKGw=] */
