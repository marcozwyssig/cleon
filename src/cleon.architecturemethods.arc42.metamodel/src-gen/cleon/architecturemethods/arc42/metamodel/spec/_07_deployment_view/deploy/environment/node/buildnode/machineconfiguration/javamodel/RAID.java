package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RAID extends DynamicResource implements IRAID {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRAID> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRAID>() {
    
    @Override
    public IRAID create() {
      return new RAID();
    }
    
    @Override
    public IRAID create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RAID(resourceRepository, resource);
    }
  
  };

  public RAID() {
    super(IRAID.TYPE_ID);
  }
  
  public RAID(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRAID.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RAID setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isRAID__F_0()) return visitor.visitRAID__F_0();
    if (isRAID__F_1()) return visitor.visitRAID__F_1();
    if (isRAID__F_5()) return visitor.visitRAID__F_5();
    if (isRAID__F_6()) return visitor.visitRAID__F_6();
    if (isRAID__F_10()) return visitor.visitRAID__F_10();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isRAID__F_0()) {
      visitor.visitRAID__F_0();
      return;
    }
    if (isRAID__F_1()) {
      visitor.visitRAID__F_1();
      return;
    }
    if (isRAID__F_5()) {
      visitor.visitRAID__F_5();
      return;
    }
    if (isRAID__F_6()) {
      visitor.visitRAID__F_6();
      return;
    }
    if (isRAID__F_10()) {
      visitor.visitRAID__F_10();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isRAID__F_0() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.RAID_RAID__F_0);
  }
  
  @Override
  public boolean isRAID__F_1() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.RAID_RAID__F_1);
  }
  
  @Override
  public boolean isRAID__F_5() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.RAID_RAID__F_5);
  }
  
  @Override
  public boolean isRAID__F_6() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.RAID_RAID__F_6);
  }
  
  @Override
  public boolean isRAID__F_10() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.RAID_RAID__F_10);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,02c21abc-e534-11ef-b3bd-2f2a4370e45f,g4opkRGaSGq3FR9oKaZZO27c9EM=] */
