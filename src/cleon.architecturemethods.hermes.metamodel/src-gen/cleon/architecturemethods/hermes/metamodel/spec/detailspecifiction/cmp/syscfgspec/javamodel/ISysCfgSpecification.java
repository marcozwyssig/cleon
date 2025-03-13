package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISysCfgSpecification extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3f1f77e0-e64c-11e8-9ed8-5f22de89d1df");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectSpecificationForSystemConfiguration();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.hardware.javamodel.ISysCfgHwCategorySpecification selectHw();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.os.javamodel.ISysCfgOsCategorySpecification selectOs();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.application.javamodel.ISysCfgAppCategorySpecification selectApp();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3f1f77e0-e64c-11e8-9ed8-5f22de89d1df,AzI7oj8vrq9zWsCs4cwOaYAcXIQ=] */
