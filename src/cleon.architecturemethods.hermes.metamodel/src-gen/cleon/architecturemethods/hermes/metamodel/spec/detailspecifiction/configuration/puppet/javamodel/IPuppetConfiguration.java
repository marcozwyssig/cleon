package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPuppetConfiguration extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("776e4866-0013-11f0-945c-87b19aec41f4");
  
  public java.lang.String selectClassName();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> selectExtends();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,776e4866-0013-11f0-945c-87b19aec41f4,p7pStQy2l0YhAOKHT5gM8XwKXz4=] */
