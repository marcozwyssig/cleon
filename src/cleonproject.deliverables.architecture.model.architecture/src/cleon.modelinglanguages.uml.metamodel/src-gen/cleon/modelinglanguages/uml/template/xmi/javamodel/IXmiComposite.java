package cleon.modelinglanguages.uml.template.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IXmiComposite extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e77f7342-6c8c-11e7-8bc1-2fb13127901b");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass> selectComposites();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e77f7342-6c8c-11e7-8bc1-2fb13127901b,G7GF0ILMDlSF/HyLnKtGldsW040=] */
