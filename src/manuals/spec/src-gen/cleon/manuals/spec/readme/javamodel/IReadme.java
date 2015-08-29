package cleon.manuals.spec.readme.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IReadme extends cleon.manuals.spec.javamodel.IManual {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f35fd79-4e6b-11e5-b08e-673a0d02fb08");
  
  // relations
  
  public cleon.manuals.spec.readme.javamodel.IIntroduction selectIntroduction();
  
  public cleon.manuals.spec.readme.javamodel.IRequirements selectRequirements();
  
  public cleon.manuals.spec.readme.javamodel.IGettingStarted selectGettingStarted();
  
  public cleon.manuals.spec.readme.javamodel.ICopyright selectCopyright();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f35fd79-4e6b-11e5-b08e-673a0d02fb08,NgWBCuq+GYccCw8eMGXds2VZRSk=] */
