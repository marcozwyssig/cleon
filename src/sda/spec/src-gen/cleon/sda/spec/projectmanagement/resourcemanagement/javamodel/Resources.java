package cleon.sda.spec.projectmanagement.resourcemanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Resources extends DynamicResource implements IResources {

  // abstract implementation, only used for static method calls
  private Resources() {
    super(IResources.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResources selectToMeResources(cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResources.class, cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.Resources_resources, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,81e4d2c5-ff9e-11e4-ac0a-959b440f987f,cocK4zjDPViQheas++uXh0LZE48=] */
