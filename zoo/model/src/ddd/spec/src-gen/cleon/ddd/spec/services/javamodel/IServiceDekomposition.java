package cleon.ddd.spec.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceDekomposition extends cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f97926d2-266f-11e5-95dc-8f1cdbd9db54");
  
  // relations
  
  public cleon.ddd.spec.services.javamodel.IDomainService selectDomainService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f97926d2-266f-11e5-95dc-8f1cdbd9db54,x8hj0Lky2XzYpj72MNtuTx1QYDU=] */
