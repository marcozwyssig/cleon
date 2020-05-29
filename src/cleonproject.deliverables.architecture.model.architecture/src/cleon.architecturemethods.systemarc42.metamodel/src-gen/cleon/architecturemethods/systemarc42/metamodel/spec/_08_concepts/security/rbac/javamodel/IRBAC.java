package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRBAC extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9db33409-6e8e-11ea-b8e8-f1a46e0c42f7");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectChapters();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Template> selectTemplates();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC> selectEnvironmentRBAC();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IResponsibilities selectResponsibilities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9db33409-6e8e-11ea-b8e8-f1a46e0c42f7,xm4utIa6MREL7VquUOlygQ9Wsag=] */
