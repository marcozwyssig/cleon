package cleon.conception.arc.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * For many building blocks you can describe its interfaces directly in the black
 * box template of the building block. For complex interfaces – and external
 * interfaces are normally very complex – it is worth while to describe them in
 * separate sections. Use the following interface template to guide you towards
 * many questions that might be relevant for the interface.
 */
public interface IExternalInterfaces extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("65e40b4b-27d5-11e6-b263-9db62e053e59");
  
  // relations
  
  public java.util.List<? extends cleon.conception.arc.spec.arc42._03_system_scope_and_context.external_interfaces.javamodel.IExternalInterface> selectExternalInterfaces();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,65e40b4b-27d5-11e6-b263-9db62e053e59,Wddll9pVfhwRPeQeq42LVxVi6UU=] */
