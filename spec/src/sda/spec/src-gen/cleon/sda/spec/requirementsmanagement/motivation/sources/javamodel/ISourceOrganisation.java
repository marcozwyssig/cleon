package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceOrganisation extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1b0ca733-bb80-11e5-b2f7-f515c847fa35");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourcePerson> selectPersons();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceDocument> selectDocuments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1b0ca733-bb80-11e5-b2f7-f515c847fa35,OcYYXTTNbJfowgSbDcGysV1oJ0k=] */
