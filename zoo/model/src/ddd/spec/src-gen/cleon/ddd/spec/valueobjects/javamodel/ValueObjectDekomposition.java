package cleon.ddd.spec.valueobjects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ValueObjectDekomposition extends DynamicResource implements IValueObjectDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDekomposition>() {
    
    @Override
    public IValueObjectDekomposition create() {
      return new ValueObjectDekomposition();
    }
    
    @Override
    public IValueObjectDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ValueObjectDekomposition(resourceRepository, resource);
    }
  
  };

  public ValueObjectDekomposition() {
    super(IValueObjectDekomposition.TYPE_ID);
  }
  
  public ValueObjectDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IValueObjectDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectClass() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class);
  }

  public ValueObjectDekomposition setClass(cleon.uml.spec.structural.classes.javamodel.IClassifier class_) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, class_);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock selectDecompose() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose);
  }

  public ValueObjectDekomposition setDecompose(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock decompose) {
    _setSingle(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, decompose);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ValueObjectDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.ddd.spec.valueobjects.javamodel.IValueObject selectValueObject() {
    return _getSingle(cleon.ddd.spec.valueobjects.javamodel.IValueObject.class, cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject);
  }

  public ValueObjectDekomposition setValueObject(cleon.ddd.spec.valueobjects.javamodel.IValueObject valueObject) {
    _setSingle(cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject, valueObject);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.ddd.spec.valueobjects.javamodel.IValueObject.class, cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition selectToMeValueObject(cleon.ddd.spec.valueobjects.javamodel.IValueObject object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition.class, cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,172528f4-266d-11e5-95dc-8f1cdbd9db54,kBLJoJAgx6va29sayZcjiG5K8+g=] */
