package cleon.uml.spec.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ClassifierDecomposition extends DynamicResource implements IClassifierDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClassifierDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClassifierDecomposition>() {
    
    @Override
    public IClassifierDecomposition create() {
      return new ClassifierDecomposition();
    }
    
    @Override
    public IClassifierDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ClassifierDecomposition(resourceRepository, resource);
    }
  
  };

  public ClassifierDecomposition() {
    super(IClassifierDecomposition.TYPE_ID);
  }
  
  public ClassifierDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IClassifierDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectClass() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class);
  }

  public ClassifierDecomposition setClass(cleon.uml.spec.structural.classes.javamodel.IClassifier class_) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, class_);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock selectDecompose() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose);
  }

  public ClassifierDecomposition setDecompose(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock decompose) {
    _setSingle(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, decompose);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ClassifierDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition selectToMeClass(cleon.uml.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c64a4da0-1757-11e5-9ca7-d1bb57b73459,w7awI9HZLKdTKPdnghIyXVNvmok=] */
