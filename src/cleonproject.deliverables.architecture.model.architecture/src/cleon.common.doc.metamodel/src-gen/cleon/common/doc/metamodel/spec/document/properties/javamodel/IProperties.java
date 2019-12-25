package cleon.common.doc.metamodel.spec.document.properties.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProperties extends cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors, cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware, cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersionAware, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IReviewers, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IDistributers, cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassificationAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a052f72d-47f5-11e6-b388-8539f6ff7310");
  
  // attributes
  
  public java.lang.String selectDocumentType();
  
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProject selectProject();
  
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.ICustomer selectCustomer();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a052f72d-47f5-11e6-b388-8539f6ff7310,QzlUY/lq3DyEcG7ki4klGUCX43c=] */
