package cleon.arc42.spec._07_deployment_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Contents
 * This view describes the environment within which the system is executed. It
 * describes the geographic distribution of the system or the structure of the
 * hardware components that execute the software. It documents workstations,
 * processors, network topologies and channels, as well as other elements of the
 * physical system environment. The deployment view shows the system from the
 * operator’s point of view.
 * Please explain how the systems’ building blocks are aggregated or packaged into
 * deployment artifacts or deployment units.
 * 
 * Motivation
 * Software is not much use without hardware. The minimum that is needed by you as
 * a software architect is sufficient detail of the underlying (hardware)
 * deployment so that you can assign each software building block that is relevant
 * for the system’s operations to some hardware element. (This also holds for any
 * COTS that is a prerequisite for the operations of the overall system.) These
 * models should enable the operator to properly install the software.
 * 
 * Form
 * The UML provides deployment diagrams for describing this view. Use these –
 * possibly in a nested manner if necessary. (The top level deployment diagram
 * should already be part of your context view, showing your infrastructure as a
 * single black box (cf. chapter 3.2). Here you are zooming into this black box
 * with additional deployment diagrams.)
 * Diagrams by your hardware-oriented colleagues who describe processors and
 * channels are also usable. You should abstract these to aspects relevant for
 * software deployment.
 */
public interface I__V_7_aE_DeploymentView extends cleon.arc42.spec.javamodel.IArc42_SubDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b47acb73-314c-11e5-bd99-eda9ce254b0b");
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b47acb73-314c-11e5-bd99-eda9ce254b0b,5vvj0e8F54IW4PgUugCoeEckgQU=] */
