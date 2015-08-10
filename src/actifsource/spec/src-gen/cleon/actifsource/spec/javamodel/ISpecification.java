package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISpecification extends cleon.actifsource.spec.javamodel.IProject, ch.actifsource.core.javamodel.INamedResource, cleon.arc42.spec._05_buildingblockview.javamodel.IReferenceOwnDecomposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2cdf0732-e9ba-11e4-848b-0509e3792151");
  
  // relations
  
  public java.util.List<? extends cleon.actifsource.spec.javamodel.IModel> selectModel();
  
  public java.util.List<? extends cleon.actifsource.spec.javamodel.ITemplate> selectTemplates();
  
  public cleon.actifsource.spec.javamodel.ISample selectSample();
  
  public java.util.List<? extends cleon.actifsource.spec.javamodel.IDiagram> selectDiagrams();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2cdf0732-e9ba-11e4-848b-0509e3792151,DGU7JArrwPP/G1/p/dZp26JZlEc=] */
