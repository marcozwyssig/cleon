package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Group extends DynamicResource implements IGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroup>() {
    
    @Override
    public IGroup create() {
      return new Group();
    }
    
    @Override
    public IGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Group(resourceRepository, resource);
    }
  
  };

  public Group() {
    super(IGroup.TYPE_ID);
  }
  
  public Group(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGroup.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IColor selectColor() {
    return _getSingle(ch.actifsource.core.javamodel.IColor.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_color);
  }

  public Group setColor(ch.actifsource.core.javamodel.IColor color) {
    _setSingle(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_color, color);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> selectNodes() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_nodes);
  }

  public Group setNodes(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> nodes) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_nodes, nodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Group setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IColor.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_color, visitor);
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_nodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup> selectToMeNodes(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_nodes, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup> selectToMeColor(ch.actifsource.core.javamodel.IColor object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Group_color, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b8a9dce5-09ae-11e9-8c40-11db3668c0c9,+OEdtWgfVDbYWS7RR2WIXDJSJUs=] */
