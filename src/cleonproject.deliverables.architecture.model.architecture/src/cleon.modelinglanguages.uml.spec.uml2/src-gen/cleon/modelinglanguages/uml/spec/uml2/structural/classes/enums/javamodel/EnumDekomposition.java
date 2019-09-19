package cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel;

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

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectPurpose() {
    return _getListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose);
  }
    
  public void setPurpose(java.util.List<java.lang.String> purpose) {
     _setListAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, purpose);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnum selectInto() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnum.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.EnumsPackage.EnumDekomposition_into);
  }

  public EnumDekomposition setInto(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnum into) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.EnumsPackage.EnumDekomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public EnumDekomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
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
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnum.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.EnumsPackage.EnumDekomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition selectToMeInto(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnum object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.EnumsPackage.EnumDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,42edd90e-266e-11e5-95dc-8f1cdbd9db54,5e+yUgwC7Ovggo84Wd1/zxECHuU=] */
