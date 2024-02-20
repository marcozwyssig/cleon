package cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoSubPackages extends DynamicResource implements INoSubPackages {

  // abstract implementation, only used for static method calls
  private NoSubPackages() {
    super(INoSubPackages.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.INoSubPackages selectToMeNoSubPackages(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.INoSubPackages.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.NoSubPackages_noSubPackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83786f5f-d016-11ee-baaf-c3eae2c9d524,s3qMpIKuV+hUZ6t5+mZJy8shty4=] */
