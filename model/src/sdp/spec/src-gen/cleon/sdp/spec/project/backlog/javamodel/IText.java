package cleon.sdp.spec.project.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IText extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6f6f942-36ad-11e5-95d9-2b04d7ab02d9");
  
  public java.lang.String selectDate();
  
  public java.lang.String selectText();
  
  // relations
  
  public cleon.sdp.spec.project.javamodel.IPerson selectWriter();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6f6f942-36ad-11e5-95d9-2b04d7ab02d9,4PXXxg5QSNg97Wr1AqqmFefScdI=] */
