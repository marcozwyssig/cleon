package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInteractionSystemComponent extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6ece79d2-6827-11ea-94e8-6d7d386ab4e1");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent selectInteractionSystemComponent();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteraction> selectInteraction();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6ece79d2-6827-11ea-94e8-6d7d386ab4e1,UOHoeFR5X/rVbJDdIykLs2kARh0=] */
