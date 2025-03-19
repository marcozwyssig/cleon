package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentSpecifications extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapterPath {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f43825a-d21b-11ee-9471-713ee8ae5987");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel.ISysCmpSpecification> selectSystemComponentSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f43825a-d21b-11ee-9471-713ee8ae5987,2A3N6nmQHwxgKU98cI6a+6hg35E=] */
