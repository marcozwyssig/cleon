package cleon.conception.architecture.spec.eamod.ncv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICapability extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6c58e62c-bc80-11e6-beb6-85da12323ce9");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability> selectCapabilityComposition();
  
  public cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability selectCapabilitySpecialisation();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability> selectCapabilityDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6c58e62c-bc80-11e6-beb6-85da12323ce9,2G5bYT9PUJn7CurMQ3wwDV/6dJ4=] */
