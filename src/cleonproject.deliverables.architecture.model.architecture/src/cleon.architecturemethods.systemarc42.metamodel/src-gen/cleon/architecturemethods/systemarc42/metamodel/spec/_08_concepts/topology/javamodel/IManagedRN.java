package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IManagedRN extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e1de521f-e0b4-11ea-8443-8f528e21caa3");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN selectMss();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN> selectManagedHss();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM> selectManagedTDM();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e1de521f-e0b4-11ea-8443-8f528e21caa3,LyE+3C4TLtnaTp4rTN/SPREERhA=] */