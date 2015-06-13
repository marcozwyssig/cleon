package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Inheritance extends DynamicResource implements IInheritance {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInheritance> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInheritance>() {
    
    @Override
    public IInheritance create() {
      return new Inheritance();
    }
    
    @Override
    public IInheritance create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Inheritance(resourceRepository, resource);
    }
  
  };

  public Inheritance() {
    super(IInheritance.TYPE_ID);
  }
  
  public Inheritance(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInheritance.TYPE_ID);
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
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectFrom() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.Inheritance_from);
  }

  public Inheritance setFrom(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> from) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.Inheritance_from, from);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Inheritance setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.Inheritance_from, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.arc42.spec._05_buildingblockview.javamodel.IInheritance> selectToMeFrom(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.IInheritance.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.Inheritance_from, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d715af8c-ffba-11e4-ac0a-959b440f987f,UAIfE0PYFznubPwtOk3lprCMsMU=] */
