package cleon.architecturemethods.eamod.spec.eamod.chsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILevelCapConf extends cleon.architecturemethods.eamod.spec.eamod.nsv.javamodel.ICapabilityConfiguration, ch.actifsource.core.javamodel.INamedResource, cleon.common.doc.doc.spec.document.properties.member.javamodel.IAuthors, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ddc2c098-a7fa-11e7-9807-4f1f5d43f7c9");
  
  // attributes
  
  public java.lang.String selectCheopsNr();
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDecommission();
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEndOfLife();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ddc2c098-a7fa-11e7-9807-4f1f5d43f7c9,94OOYM55NYb7Hl1iRhxxchOiVi0=] */
