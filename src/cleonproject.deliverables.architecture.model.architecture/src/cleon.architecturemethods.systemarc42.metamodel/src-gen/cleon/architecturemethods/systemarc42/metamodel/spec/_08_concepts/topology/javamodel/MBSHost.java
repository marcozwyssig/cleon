package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MBSHost extends DynamicResource implements IMBSHost {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMBSHost> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMBSHost>() {
    
    @Override
    public IMBSHost create() {
      return new MBSHost();
    }
    
    @Override
    public IMBSHost create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MBSHost(resourceRepository, resource);
    }
  
  };

  public MBSHost() {
    super(IMBSHost.TYPE_ID);
  }
  
  public MBSHost(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMBSHost.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectNumber() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractNumberAware_number);
  }
    
  public void setNumber(java.lang.Integer number) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractNumberAware_number, number);
  }

  @Override
  public java.lang.String selectOverrideOwner() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideOwner);
  }
    
  public void setOverrideOwner(java.lang.String overrideOwner) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideOwner, overrideOwner);
  }

  @Override
  public java.lang.String selectOverrideRN() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideRN);
  }
    
  public void setOverrideRN(java.lang.String overrideRN) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideRN, overrideRN);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ILocation selectBbu() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ILocation.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.MBSHost_bbu);
  }

  public MBSHost setBbu(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ILocation bbu) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.MBSHost_bbu, bbu);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectInstanceOf() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_instanceOf);
  }

  public MBSHost setInstanceOf(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration instanceOf) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_instanceOf, instanceOf);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public MBSHost setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MBSHost setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractNumberAware_number, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideOwner, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideRN, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ILocation.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.MBSHost_bbu, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_instanceOf, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IMBSHost> selectToMeBbu(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ILocation object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IMBSHost.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.MBSHost_bbu, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7d5ed092-57c9-11ea-bd7a-4baf1bc87b3c,m9gi/qgexpq1zukfRxFe+vWtATA=] */
