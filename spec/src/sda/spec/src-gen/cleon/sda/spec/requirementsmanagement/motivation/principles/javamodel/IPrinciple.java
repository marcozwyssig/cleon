package cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPrinciple extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.javamodel.ISimpleDescription, cleon.sda.spec.requirementsmanagement.javamodel.INotes {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6f06a6ec-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> selectAggregation();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFromSource();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6f06a6ec-a951-11e5-bda2-a7fc3bd7c783,x7V8vbxJy3e1Fy/px41rZcs/bms=] */
