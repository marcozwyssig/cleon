package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IPermissionTemplateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6649e37b-032a-11eb-af88-136a9a3b3817");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration selectAuthZForSystemOrSystemConfiguration();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IAuthZBuildingBlockPermission> selectAuthZBuildingBlockForPermission();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration> selectDependsOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6649e37b-032a-11eb-af88-136a9a3b3817,9amKHCCkQC4Qn+lf70pdWc6lo7w=] */
