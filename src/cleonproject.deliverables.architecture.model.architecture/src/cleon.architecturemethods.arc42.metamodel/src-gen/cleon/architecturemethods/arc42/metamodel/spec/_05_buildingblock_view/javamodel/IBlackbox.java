package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBlackbox extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.resources.metamodel.spec.descriptions.javamodel.INoDescription, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d58842b6-2858-11e8-9af4-b7d7a3bbddc1");
  
  // attributes
  
  public java.util.List<java.lang.String> selectPurpose();
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBlackbox();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox_Dependencies selectBlackbox_dependencies();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox_Requirements selectBlackbox_requirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d58842b6-2858-11e8-9af4-b7d7a3bbddc1,LdqSNmSHl43NPzE4XIv/WojYX4E=] */
