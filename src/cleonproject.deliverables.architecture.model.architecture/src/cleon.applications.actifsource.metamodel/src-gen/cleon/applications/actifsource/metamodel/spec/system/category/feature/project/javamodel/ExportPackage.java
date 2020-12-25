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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> selectSubPackage() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_subPackage);
  }

  public ExportPackage setSubPackage(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> subPackage) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_subPackage, subPackage);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_subPackage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage selectToMeSubPackage(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.ExportPackage_subPackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,437b1d5a-b87e-11e5-a463-ff45aa361315,qvnxEgzcYV3GqOr5QOk1pqIjyjM=] */
