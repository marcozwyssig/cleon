package cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Contents
 * The context view defines the boundaries of the system under development to
 * distinguish it from neighboring systems. It thereby identifies the system’s
 * relevant external interfaces.
 * Make sure that the interfaces are specified with all their relevant aspects
 * (what is communicated, in which format is it communicated, what is the transport
 * medium, …), even though some popular diagrams (such as the UML use case diagram)
 * represent only a few aspects of the interface.
 * 
 * Motivation
 * The interfaces to neighboring systems are among most critical and risky aspects
 * of a project. Ensure early on that you have understood them in their entirety.
 * 
 * Form
 * 
 * * Various context diagram (see below)
 * * Lists of neighboring systems and their interfaces.
 */
public interface I__V_3_aE_System_aE_Scope_aE_and_aE_Context extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("04cf294a-ffca-11e5-bd7b-8b0acf27d441");
  
  // relations
  
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem selectSystem();
  
  public java.util.List<? extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem> selectNeighboringSystems();
  
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.domain.javamodel.I__V_3_aE_01_aE_DomainContext selectDomainContext();
  
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext selectTechnicalContext();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,04cf294a-ffca-11e5-bd7b-8b0acf27d441,5RSdVfwk3j1riSbalwUmzfEANj0=] */
