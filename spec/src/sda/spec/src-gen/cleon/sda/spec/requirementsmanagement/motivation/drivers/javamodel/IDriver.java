package cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Stellt einen Treiber dar und kann somit als
 * Grundlage beziehungsweise Auslöser für ein
 * Vorhaben dienen
 */
public interface IDriver extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.javamodel.ISimpleDescription, cleon.sda.spec.requirementsmanagement.javamodel.INotes, cleon.sda.spec.javamodel.IBusinessObjectId, cleon.doc.spec.autor.javamodel.IAutors {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f1c309ff-a281-11e5-9332-1b5893de4362");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> selectOriginatesFromPrinciple();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFromSource();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f1c309ff-a281-11e5-9332-1b5893de4362,lC3E8d7lZZ2ryiWXI/jP5uEpBnk=] */
