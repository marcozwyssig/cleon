package cleon.conception.framework.spec.arc42._03_system_scope_and_context.domain.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Contents
 * Identify *all*[^all_neighboring_systems] neighboring systems and specify all
 * logical business data that is exchanged with the system under development. Add
 * data formats and communication protocols with neighboring systems and the
 * general environment if these are not specified in detail with the relevant
 * components.
 * 
 * [^all_neighboring_systems]: We often tend to a pragmatic approach – but here we
 * **insist** on a list of all (a-l-l) neighboring systems. Too many projects have
 * failed because they were not aware of their neighbors. :-(
 * 
 * Motivation
 * Understanding the information exchange with neighboring systems (i.e. all input
 * flows and all output flows).
 * 
 * Form
 * Logical context diagram.
 * In UML this can be simulated e.g. by class diagrams, use case diagrams,
 * communications diagrams – i.e. all diagrams that represent the system as a black
 * box and explain its interfaces to neighboring systems (in varying degrees of
 * detail).
 * If there are many neighboring systems you can substitute the context diagram
 * with a table, including all the neighboring systems, their inputs and their
 * outputs.
 * 
 */
public interface I__V_3_aE_01_aE_DomainContext extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("98021cfc-2660-11e6-ae54-e50d44645ae7");
  
  // relations
  
  public java.util.List<? extends cleon.conception.framework.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor> selectActors();
  
  public java.util.List<? extends cleon.conception.framework.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow> selectFlows();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,98021cfc-2660-11e6-ae54-e50d44645ae7,YAc66Gr2a3UFXY3tWwz/+6QVIAE=] */
