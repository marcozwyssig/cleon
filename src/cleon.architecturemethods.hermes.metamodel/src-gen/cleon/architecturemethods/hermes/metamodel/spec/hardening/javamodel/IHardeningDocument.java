package cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHardeningDocument extends cleon.common.doc.metamodel.spec.document.javamodel.IDocument, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("623fb404-5e4d-11f0-a5db-972145eef50c");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document selectSystemArchitecture();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,623fb404-5e4d-11f0-a5db-972145eef50c,MpcpjxQvLvKgqyq+Fjv3t8IMz18=] */
