package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.pkg.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackageResource extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("07e7a2ec-ef3b-11e8-be8a-b748ff8f0a75");
  
  public java.lang.String selectSource();
  
  public java.lang.String selectOptions();
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState selectEnsure();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,07e7a2ec-ef3b-11e8-be8a-b748ff8f0a75,+7t+ynBJ6U8Z0sBFOw8QPXG9JSM=] */
