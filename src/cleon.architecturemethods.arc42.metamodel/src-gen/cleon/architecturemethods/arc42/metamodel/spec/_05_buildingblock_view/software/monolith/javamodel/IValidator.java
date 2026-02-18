package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IValidator extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a60f06b0-fb85-11f0-919e-07363e802872");
  
  public java.lang.String selectCommand();
  
  public java.lang.Integer selectMin();
  
  public java.lang.String selectMax();
  
  // relations
  
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a60f06b0-fb85-11f0-919e-07363e802872,zltB0mndNaFkMT3Aih+C+4aOCzg=] */
