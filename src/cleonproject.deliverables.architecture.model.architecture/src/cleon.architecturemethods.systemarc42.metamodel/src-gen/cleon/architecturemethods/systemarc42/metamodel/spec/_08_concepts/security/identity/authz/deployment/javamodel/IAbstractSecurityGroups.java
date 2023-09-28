package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSecurityGroups extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel.IAbstractGroups, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ff9a619e-1d99-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectResponsible();
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectApproval();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ff9a619e-1d99-11e9-b601-db75aa6f89a4,SGYMFyjm82xUToiPY2h6oT56OEQ=] */
