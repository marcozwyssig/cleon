package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentationConcept extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d56c10bc-04ed-11e9-8ff2-6313785a338c");
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentation selectSegmentation();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZonePolicies selectSubzonePolicies();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomains selectDomains();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d56c10bc-04ed-11e9-8ff2-6313785a338c,QIOG+j/KXaMNWPQ+1d0Es4w7jBA=] */
