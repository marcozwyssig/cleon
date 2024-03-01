package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExportPackage extends DynamicResource implements IExportPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExportPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExportPackage>() {
    
    @Override
    public IExportPackage create() {
      return new ExportPackage();
    }
    
    @Override
    public IExportPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExportPackage(resourceRepository, resource);
    }
  
  };

  public ExportPackage() {
    super(IExportPackage.TYPE_ID);
  }
  
  public ExportPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExportPackage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsExport() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_isExport);
  }
    
  public void setIsExport(java.lang.Boolean isExport) {
     _setSingleAttribute(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_isExport, isExport);
  }

  @Override
  public java.lang.Boolean selectWithJavaModel() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_withJavaModel);
  }
    
  public void setWithJavaModel(java.lang.Boolean withJavaModel) {
     _setSingleAttribute(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_withJavaModel, withJavaModel);
  }

  // relations
  
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage selectPackage() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_package);
  }

  public ExportPackage setPackage(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage package_) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_package, package_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ExportPackage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExportPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_isExport, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_withJavaModel, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_package, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage selectToMePackage(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_package, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,437b1d5a-b87e-11e5-a463-ff45aa361315,PlNjitUPJ8MRtUAJromDmwaN3ts=] */
