package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISysCmpSpecificationAware extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapterPath {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7bd287b7-059b-11f0-a294-67d88c30f2e4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> selectSystemConfigurationSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7bd287b7-059b-11f0-a294-67d88c30f2e4,inHXe/YJ9libSyFu04OdiVS0K+g=] */
