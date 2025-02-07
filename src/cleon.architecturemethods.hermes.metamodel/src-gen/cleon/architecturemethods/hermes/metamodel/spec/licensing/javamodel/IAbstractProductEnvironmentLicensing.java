package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractProductEnvironmentLicensing extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("74d2b4cd-dfc2-11ef-b0be-9b4cac321140");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment selectLicenseForEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,74d2b4cd-dfc2-11ef-b0be-9b4cac321140,lroNU5Tz1iwWaP1AlM0o2zT3Rf4=] */
