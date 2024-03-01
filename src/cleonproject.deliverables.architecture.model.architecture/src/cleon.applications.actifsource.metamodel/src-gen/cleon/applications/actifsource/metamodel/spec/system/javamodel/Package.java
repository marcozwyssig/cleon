package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Package extends DynamicResource implements IPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackage>() {
    
    @Override
    public IPackage create() {
      return new Package();
    }
    
    @Override
    public IPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Package(resourceRepository, resource);
    }
  
  };

  public Package() {
    super(IPackage.TYPE_ID);
  }
  
  public Package(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackage.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Package setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> selectUsedIn() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Package_usedIn);
  }

  public Package setUsedIn(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> usedIn) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Package_usedIn, usedIn);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Package_usedIn, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> selectToMeUsedIn(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Package_usedIn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5ebf28c6-46d0-11eb-b318-ab9601344039,KjA12vw4i4svYlvLWaGa9T08MZ4=] */
