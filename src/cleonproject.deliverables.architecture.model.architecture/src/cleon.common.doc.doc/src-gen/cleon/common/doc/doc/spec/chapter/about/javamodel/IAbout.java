package cleon.common.doc.doc.spec.chapter.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbout extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7dee7074-077f-11e9-812a-c3c7ef540adf");
  
  // relations
  
  public cleon.common.doc.doc.spec.chapter.about.javamodel.ITask selectTask();
  
  public cleon.common.doc.doc.spec.chapter.about.javamodel.IPurpose selectPurpose();
  
  public cleon.common.doc.doc.spec.chapter.about.javamodel.IDistinction selectDistinction();
  
  public cleon.common.doc.doc.spec.chapter.about.javamodel.IDependencies selectDependencies();
  
  public cleon.common.doc.doc.spec.chapter.about.javamodel.IAudiences selectAudiences();
  
  public cleon.common.doc.doc.spec.chapter.about.javamodel.ILayout selectLayout();
  
  public cleon.common.doc.doc.spec.chapter.about.javamodel.IMethod selectMethod();
  
  public cleon.common.doc.doc.spec.chapter.references.javamodel.IReferences selectReferences();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7dee7074-077f-11e9-812a-c3c7ef540adf,C0Gt6Z51tIuzzaYyFE66ub2SLS8=] */
