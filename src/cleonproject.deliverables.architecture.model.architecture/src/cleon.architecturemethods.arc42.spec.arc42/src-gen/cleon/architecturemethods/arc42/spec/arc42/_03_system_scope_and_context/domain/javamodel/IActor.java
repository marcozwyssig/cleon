package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActor extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a037dbde-2660-11e6-ae54-e50d44645ae7");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow_Out> selectDomainFlow_Out();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow_In> selectDomainFlow_In();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a037dbde-2660-11e6-ae54-e50d44645ae7,uRxYvohH2iiRQaCd/E60y0nOVq4=] */
