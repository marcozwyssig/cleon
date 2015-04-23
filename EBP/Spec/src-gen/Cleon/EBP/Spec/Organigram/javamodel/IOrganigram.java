package Cleon.EBP.Spec.Organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganigram extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("45b76892-daaa-11e3-ae07-89aa80d5ec3d");
  
  // relations
  
  public java.util.List<? extends Cleon.EBP.Spec.Organigram.javamodel.IPeople> selectPeoples();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends Cleon.EBP.Spec.Organigram.javamodel.IEnterpriseOrganigram> selectEnterpriseOrganigram();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,45b76892-daaa-11e3-ae07-89aa80d5ec3d,hq4U3VD/PAH4VsYIYNVST7VPIAE=] */
