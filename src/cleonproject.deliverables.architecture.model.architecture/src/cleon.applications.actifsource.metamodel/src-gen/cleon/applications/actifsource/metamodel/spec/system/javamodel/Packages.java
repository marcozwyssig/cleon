package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Packages extends DynamicResource implements IPackages {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackages> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackages>() {
    
    @Override
    public IPackages create() {
      return new Packages();
    }
    
    @Override
    public IPackages create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Packages(resourceRepository, resource);
    }
  
  };

  public Packages() {
    super(IPackages.TYPE_ID);
  }
  
  public Packages(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackages.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> selectPackages() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Packages_packages);
  }

  public Packages setPackages(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> packages) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Packages_packages, packages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Packages setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Packages_packages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages selectToMePackages(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.Packages_packages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,48859dc9-46d0-11eb-b318-ab9601344039,6msUMz9odx+asX6tNDvw77R8YrQ=] */
