package cleon.ddd.spec.exceptions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IExceptionDekomposition extends cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("510327f6-266d-11e5-95dc-8f1cdbd9db54");
  
  // relations
  
  public cleon.ddd.spec.exceptions.javamodel.IDomainException selectException();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,510327f6-266d-11e5-95dc-8f1cdbd9db54,7461Akrd1RLVQUNNDPvCamWD0Q8=] */
