package cleon.uml.spec.structural.classes.enums.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Enum extends DynamicResource implements IEnum {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnum> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnum>() {
    
    @Override
    public IEnum create() {
      return new Enum();
    }
    
    @Override
    public IEnum create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Enum(resourceRepository, resource);
    }
  
  };

  public Enum() {
    super(IEnum.TYPE_ID);
  }
  
  public Enum(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnum.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.String selectComments() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.ClassesPackage.Description_comments);
  }
    
  public void setComments(java.lang.String comments) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Description_comments, comments);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> selectOwnDecompositions() {
    return _getList(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.OwnBuildingBlock_ownDecompositions);
  }

  public Enum setOwnDecompositions(java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> ownDecompositions) {
    _setList(cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.OwnBuildingBlock_ownDecompositions, ownDecompositions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Enum setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumValue> selectValues() {
    return _getList(cleon.uml.spec.structural.classes.enums.javamodel.IEnumValue.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.Enum_values);
  }

  public Enum setValues(java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumValue> values) {
    _setList(cleon.uml.spec.structural.classes.enums.EnumsPackage.Enum_values, values);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.ClassesPackage.Description_comments, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.OwnBuildingBlock_ownDecompositions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.uml.spec.structural.classes.enums.javamodel.IEnumValue.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.Enum_values, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.classes.enums.javamodel.IEnum selectToMeValues(cleon.uml.spec.structural.classes.enums.javamodel.IEnumValue object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.enums.javamodel.IEnum.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.Enum_values, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,73469c3e-b1bd-11e4-a1b5-85bab1cb6ada,aHBSH4Af/+UAxyhGyNy4IPiPfS0=] */
