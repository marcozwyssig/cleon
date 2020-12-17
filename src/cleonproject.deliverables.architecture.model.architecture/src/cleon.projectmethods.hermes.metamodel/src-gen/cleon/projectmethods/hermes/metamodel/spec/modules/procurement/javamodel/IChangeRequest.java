package cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IChangeRequest extends cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IContract, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("80ae052c-4058-11eb-aaa9-61838d129c8c");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IMainContract selectMainContract();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,80ae052c-4058-11eb-aaa9-61838d129c8c,fOgz2zoudW7aujFWBu/+wM1/Lh4=] */
