package cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WorkpackageDependency extends DynamicResource implements IWorkpackageDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkpackageDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkpackageDependency>() {
    
    @Override
    public IWorkpackageDependency create() {
      return new WorkpackageDependency();
    }
    
    @Override
    public IWorkpackageDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WorkpackageDependency(resourceRepository, resource);
    }
  
  };

  public WorkpackageDependency() {
    super(IWorkpackageDependency.TYPE_ID);
  }
  
  public WorkpackageDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkpackageDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.WorkpackagePackage.WorkpackageDependency_reason);
  }
    
  public void setReason(java.lang.String reason) {
     _setSingleAttribute(cleon.support.projectmanagement.spec.planning.scope.workpackage.WorkpackagePackage.WorkpackageDependency_reason, reason);
  }

  // relations
  
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage selectTo() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.WorkpackagePackage.WorkpackageDependency_to);
  }

  public WorkpackageDependency setTo(cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage to) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.WorkpackagePackage.WorkpackageDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WorkpackageDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.WorkpackagePackage.WorkpackageDependency_reason, visitor);
    // relations
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.WorkpackagePackage.WorkpackageDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackageDependency> selectToMeTo(cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackageDependency.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.WorkpackagePackage.WorkpackageDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c4251482-d654-11e6-a65b-3d568b0606cc,nMysAWuXuCeTRI0wIj8dSCQOLB4=] */
