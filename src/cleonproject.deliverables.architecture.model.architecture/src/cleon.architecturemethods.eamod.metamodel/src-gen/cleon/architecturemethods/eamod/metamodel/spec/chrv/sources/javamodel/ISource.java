package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISource extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3b2b59c5-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> selectComposites();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3b2b59c5-a951-11e5-bda2-a7fc3bd7c783,ta2vH/bs5Qw8zItN1XHv2MlmnpU=] */
