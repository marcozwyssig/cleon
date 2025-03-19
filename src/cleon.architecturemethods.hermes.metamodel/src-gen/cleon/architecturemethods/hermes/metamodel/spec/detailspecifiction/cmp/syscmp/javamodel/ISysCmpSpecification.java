package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISysCmpSpecification extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapterPath {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("60d7a195-e64b-11e8-9ed8-5f22de89d1df");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent selectSpecificationForSystemComponent();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> selectSystemConfigurationSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,60d7a195-e64b-11e8-9ed8-5f22de89d1df,p3ECfFuzMMYL1L/ETD8xJdWt3PM=] */
