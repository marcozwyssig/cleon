package cleon.architecturemethods.arc42.sample.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISampleBuildingBlock extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a19c100c-4376-11e6-a9d7-97cf4f7c398b");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> selectDecompose();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleDependency> selectHasSampleDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a19c100c-4376-11e6-a9d7-97cf4f7c398b,jBZUvrjBTQ1Hwcz5AwrJkcS1OVI=] */
