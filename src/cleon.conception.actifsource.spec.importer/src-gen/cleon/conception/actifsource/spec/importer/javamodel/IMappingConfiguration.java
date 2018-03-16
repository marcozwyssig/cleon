package cleon.conception.actifsource.spec.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMappingConfiguration extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9489a1fa-2217-11e8-8247-038452bbec5f");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportRootElementHandler> selectRootElementHandler();
  
  public ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard selectWizard();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9489a1fa-2217-11e8-8247-038452bbec5f,/g8Cz/2dGB6oSj+tS2OZnd3wbVU=] */
