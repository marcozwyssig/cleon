package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITable extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("09a46257-b934-11ee-a0d0-e953bcbfaeef");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IColumn> selectColumns();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IPrimaryKey selectPrimary_key();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,09a46257-b934-11ee-a0d0-e953bcbfaeef,vVV5+z4LzutBq5kk8sHtH72LXCY=] */
