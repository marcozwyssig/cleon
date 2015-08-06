package cleon.uml.spec.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAssociationClass extends cleon.uml.spec.structural.classes.javamodel.IClassifier, cleon.arc42.spec._05_buildingblockview.javamodel.IDependentBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("deb55644-13d3-11e3-9736-a3484832b481");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.association.javamodel.IAssociation> selectRelations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,deb55644-13d3-11e3-9736-a3484832b481,CYWPmEBQf+QRsR7Ion5FuV+cXGI=] */
