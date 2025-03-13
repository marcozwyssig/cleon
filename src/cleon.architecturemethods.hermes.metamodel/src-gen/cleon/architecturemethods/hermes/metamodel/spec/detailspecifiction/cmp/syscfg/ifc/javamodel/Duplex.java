package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Duplex extends DynamicResource implements IDuplex {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDuplex> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDuplex>() {
    
    @Override
    public IDuplex create() {
      return new Duplex();
    }
    
    @Override
    public IDuplex create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Duplex(resourceRepository, resource);
    }
  
  };

  public Duplex() {
    super(IDuplex.TYPE_ID);
  }
  
  public Duplex(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDuplex.TYPE_ID);
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

  public Duplex setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isAuto()) return visitor.visitAuto();
    if (isFull()) return visitor.visitFull();
    if (isHalf()) return visitor.visitHalf();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isAuto()) {
      visitor.visitAuto();
      return;
    }
    if (isFull()) {
      visitor.visitFull();
      return;
    }
    if (isHalf()) {
      visitor.visitHalf();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isAuto() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.Duplex_auto);
  }
  
  @Override
  public boolean isFull() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.Duplex_full);
  }
  
  @Override
  public boolean isHalf() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.Duplex_half);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,87ad7620-f180-11e8-b3e7-15e2dd8d9b05,Vlb9xP6dxEp3yGvpgGXvIUEWarI=] */
