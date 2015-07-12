package cleon.uml.spec.structural.classes.enums.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnumDekomposition extends DynamicResource implements IEnumDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumDekomposition>() {
    
    @Override
    public IEnumDekomposition create() {
      return new EnumDekomposition();
    }
    
    @Override
    public IEnumDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnumDekomposition(resourceRepository, resource);
    }
  
  };

  public EnumDekomposition() {
    super(IEnumDekomposition.TYPE_ID);
  }
  
  public EnumDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnumDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectClass() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class);
  }

  public EnumDekomposition setClass(cleon.uml.spec.structural.classes.javamodel.IClassifier class_) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, class_);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock selectDecompose() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose);
  }

  public EnumDekomposition setDecompose(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock decompose) {
    _setSingle(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, decompose);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.enums.javamodel.IEnum selectEnum() {
    return _getSingle(cleon.uml.spec.structural.classes.enums.javamodel.IEnum.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_enum);
  }

  public EnumDekomposition setEnum(cleon.uml.spec.structural.classes.enums.javamodel.IEnum enum_) {
    _setSingle(cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_enum, enum_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnumDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.enums.javamodel.IEnum.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_enum, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition selectToMeEnum(cleon.uml.spec.structural.classes.enums.javamodel.IEnum object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_enum, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,42edd90e-266e-11e5-95dc-8f1cdbd9db54,Rku+77Ip2LQV3XePPhCVJ9CAmww=] */
