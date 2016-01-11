package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Project extends DynamicResource implements IProject {

  // abstract implementation, only used for static method calls
  private Project() {
    super(IProject.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.actifsource.spec.javamodel.IProject selectToMeDependsOn(cleon.actifsource.spec.javamodel.IProjectDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.Project_dependsOn, object.getResource());
  }
  
  public static cleon.actifsource.spec.javamodel.IProject selectToMeResources(cleon.actifsource.spec.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.Project_resources, object.getResource());
  }
  
  public static cleon.actifsource.spec.javamodel.IProject selectToMeTargetPaths(cleon.actifsource.spec.javamodel.ITargetPath object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.Project_targetPaths, object.getResource());
  }
  
  public static cleon.actifsource.spec.javamodel.IProject selectToMeExportPackage(cleon.actifsource.spec.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.Project_exportPackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,gxV+QGEIbNdHHkjO22NFrtxFkY8=] */
