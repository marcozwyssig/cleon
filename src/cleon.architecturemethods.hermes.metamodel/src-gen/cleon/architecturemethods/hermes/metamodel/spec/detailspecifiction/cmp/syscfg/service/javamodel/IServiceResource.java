package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceResource extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9c7325a1-ef3f-11e8-be8a-b748ff8f0a75");
  
  public java.lang.Boolean selectEnabled();
  
  public java.lang.String selectOptions();
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IState selectEnsure();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9c7325a1-ef3f-11e8-be8a-b748ff8f0a75,bvUcaZ2oLA4EtudiYqh/9x/Q8EE=] */
