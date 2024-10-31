package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InterfaceType extends DynamicResource implements IInterfaceType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceType>() {
    
    @Override
    public IInterfaceType create() {
      return new InterfaceType();
    }
    
    @Override
    public IInterfaceType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InterfaceType(resourceRepository, resource);
    }
  
  };

  public InterfaceType() {
    super(IInterfaceType.TYPE_ID);
  }
  
  public InterfaceType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterfaceType.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InterfaceType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isINT()) return visitor.visitINT();
    if (isEXT()) return visitor.visitEXT();
    if (isMGMT()) return visitor.visitMGMT();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isINT()) {
      visitor.visitINT();
      return;
    }
    if (isEXT()) {
      visitor.visitEXT();
      return;
    }
    if (isMGMT()) {
      visitor.visitMGMT();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isINT() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.InterfaceType_INT);
  }
  
  @Override
  public boolean isEXT() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.InterfaceType_EXT);
  }
  
  @Override
  public boolean isMGMT() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.InterfaceType_MGMT);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9aa83a3b-878f-11e9-a61b-279ebde48b48,WuFFJmAQ0iROEUtxsBLSRgeIq5Q=] */
