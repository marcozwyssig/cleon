package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LAGType extends DynamicResource implements ILAGType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILAGType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILAGType>() {
    
    @Override
    public ILAGType create() {
      return new LAGType();
    }
    
    @Override
    public ILAGType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LAGType(resourceRepository, resource);
    }
  
  };

  public LAGType() {
    super(ILAGType.TYPE_ID);
  }
  
  public LAGType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILAGType.TYPE_ID);
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

  public LAGType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isH()) return visitor.visitH();
    if (isG()) return visitor.visitG();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isH()) {
      visitor.visitH();
      return;
    }
    if (isG()) {
      visitor.visitG();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isH() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.LAGType_H);
  }
  
  @Override
  public boolean isG() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.LAGType_G);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4ded4698-303c-11ed-b561-abe8147b73fc,AsMJEFUSGdK1nE11BZ5c4a16Pbk=] */
