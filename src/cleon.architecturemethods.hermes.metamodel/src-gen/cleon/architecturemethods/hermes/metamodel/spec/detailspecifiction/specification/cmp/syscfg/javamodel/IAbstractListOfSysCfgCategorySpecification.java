package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractListOfSysCfgCategorySpecification extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f3285f19-0023-11f0-945c-87b19aec41f4");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.hardware.javamodel.ISysCfgHwCategorySpecification selectHw();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.os.javamodel.ISysCfgOsCategorySpecification selectOs();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.application.javamodel.ISysCfgAppCategorySpecification selectApp();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f3285f19-0023-11f0-945c-87b19aec41f4,3Xr6dGHy8zZ/KIkv+zhk1Z+kIkg=] */
