package cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITechnicalFlow extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.IFlow {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8ca0b7d4-2801-11e6-b263-9db62e053e59");
  
  // relations
  
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember selectFrom();
  
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8ca0b7d4-2801-11e6-b263-9db62e053e59,Stqe0HA6hBmNSB6SDQRx5AernCI=] */
