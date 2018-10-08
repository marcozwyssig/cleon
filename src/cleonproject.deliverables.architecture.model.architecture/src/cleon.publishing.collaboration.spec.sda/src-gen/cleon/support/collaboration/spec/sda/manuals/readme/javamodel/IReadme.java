package cleon.support.collaboration.spec.sda.manuals.readme.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IReadme extends cleon.support.collaboration.spec.sda.manuals.javamodel.IManual {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f35fd79-4e6b-11e5-b08e-673a0d02fb08");
  
  // relations
  
  public cleon.support.collaboration.spec.sda.manuals.readme.javamodel.IIntroduction selectIntroduction();
  
  public cleon.support.collaboration.spec.sda.manuals.readme.javamodel.IRequirements selectRequirements();
  
  public cleon.support.collaboration.spec.sda.manuals.readme.javamodel.IGettingStarted selectGettingStarted();
  
  public cleon.support.collaboration.spec.sda.manuals.readme.javamodel.ICopyright selectCopyright();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f35fd79-4e6b-11e5-b08e-673a0d02fb08,EwNJYXubhHeLvqukF/EqlT2rCNs=] */
