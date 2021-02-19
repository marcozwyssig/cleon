package cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProcurement extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b4733279-4058-11eb-aaa9-61838d129c8c");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IContract> selectContracts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b4733279-4058-11eb-aaa9-61838d129c8c,MUyuG8U8ES7AHJyxTzAjBVntJJc=] */
