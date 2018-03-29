package cleon.common.resources.spec.language.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMultilingualDescription extends cleon.common.resources.spec.language.javamodel.IAbstractMultilingual {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a9e3052c-335e-11e8-a9fe-87ba35d8f5c4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.resources.spec.language.javamodel.ILanguageDescription> selectDefaultDescription();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.resources.spec.language.javamodel.ILanguageDescription> selectDescription();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a9e3052c-335e-11e8-a9fe-87ba35d8f5c4,jYmc3dCPYClvmXISJrOk60s2dOs=] */
