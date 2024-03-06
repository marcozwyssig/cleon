package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6649e37b-032a-11eb-af88-136a9a3b3817");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration selectAuthZForSystemOrSystemConfiguration();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission> selectAuthZBuildingBlockForPermission();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6649e37b-032a-11eb-af88-136a9a3b3817,W1NEvq2rw0Xg8inCAC4Gx06MrBM=] */
