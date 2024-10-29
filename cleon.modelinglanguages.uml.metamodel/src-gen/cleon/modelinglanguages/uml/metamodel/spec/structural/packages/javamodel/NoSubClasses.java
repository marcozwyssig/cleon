package cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoSubClasses extends DynamicResource implements INoSubClasses {

  // abstract implementation, only used for static method calls
  private NoSubClasses() {
    super(INoSubClasses.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.INoSubClasses selectToMeNoSubClasses(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.INoSubClasses.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.NoSubClasses_noSubClasses, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8a1e1823-d016-11ee-baaf-c3eae2c9d524,NcgaYn3aBSXhaqtfJTqwWvPbvFM=] */
