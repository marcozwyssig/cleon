package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMulti_TN extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISite, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteComposition, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IOwnerAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e76727dd-e0ae-11ea-8946-bf83c1249a1c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> selectMss();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> selectHss();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITDM> selectTdm();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN> selectManagedBy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e76727dd-e0ae-11ea-8946-bf83c1249a1c,IizMesSF/SoJ79pZJv6sXiePhUs=] */
