package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDetailSpecificationDocument extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4663eec9-e64b-11e8-9ed8-5f22de89d1df");
  
  // relations
  
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment selectEnvironment();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel.IEnvironmentSpecifications selectEnvironmentSpecification();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.javamodel.IComponentSpecifications selectComponentSpecification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4663eec9-e64b-11e8-9ed8-5f22de89d1df,QRF3hhqGF/tDW4/pvvDUN8YI7cw=] */
