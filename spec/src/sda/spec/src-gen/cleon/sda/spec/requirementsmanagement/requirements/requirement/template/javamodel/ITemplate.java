package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITemplate extends ch.actifsource.core.javamodel.IResource, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.IConditionAware, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportanceAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1b9992b4-d574-11e5-89ea-2d8d86e9ef89");
  
  // relations
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition selectCondition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1b9992b4-d574-11e5-89ea-2d8d86e9ef89,G09GY1RscoP1/9ev/lwJ3Osm0ic=] */
