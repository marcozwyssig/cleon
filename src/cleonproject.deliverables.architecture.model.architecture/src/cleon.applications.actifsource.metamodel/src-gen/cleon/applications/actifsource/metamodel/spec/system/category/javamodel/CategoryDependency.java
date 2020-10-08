package cleon.applications.actifsource.metamodel.spec.system.category.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CategoryDependency extends DynamicResource implements ICategoryDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategoryDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategoryDependency>() {
    
    @Override
    public ICategoryDependency create() {
      return new CategoryDependency();
    }
    
    @Override
    public ICategoryDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CategoryDependency(resourceRepository, resource);
    }
  
  };

  public CategoryDependency() {
    super(ICategoryDependency.TYPE_ID);
  }
  
  public CategoryDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICategoryDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory selectTo() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory.class, cleon.applications.actifsource.metamodel.spec.system.category.CategoryPackage.CategoryDependency_to);
  }

  public CategoryDependency setTo(cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory to) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.CategoryPackage.CategoryDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CategoryDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory.class, cleon.applications.actifsource.metamodel.spec.system.category.CategoryPackage.CategoryDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategoryDependency> selectToMeTo(cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategoryDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.CategoryPackage.CategoryDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27c04268-3c6a-11e6-aafa-bd565efc0ead,XXo1jkAg8GaM0C+BnBi7wPBJc0c=] */
