package cleon.conception.architecture.spec.uml.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackageInClassifierDecomposition extends DynamicResource implements IPackageInClassifierDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageInClassifierDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageInClassifierDecomposition>() {
    
    @Override
    public IPackageInClassifierDecomposition create() {
      return new PackageInClassifierDecomposition();
    }
    
    @Override
    public IPackageInClassifierDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackageInClassifierDecomposition(resourceRepository, resource);
    }
  
  };

  public PackageInClassifierDecomposition() {
    super(IPackageInClassifierDecomposition.TYPE_ID);
  }
  
  public PackageInClassifierDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackageInClassifierDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier selectInto() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.architecture.spec.uml.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into);
  }

  public PackageInClassifierDecomposition setInto(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier into) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackageInClassifierDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.architecture.spec.uml.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition selectToMeInto(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.conception.architecture.spec.uml.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c64a4da0-1757-11e5-9ca7-d1bb57b73459,o2DgVy1cxJG3O7qAfozioxTp0c0=] */
