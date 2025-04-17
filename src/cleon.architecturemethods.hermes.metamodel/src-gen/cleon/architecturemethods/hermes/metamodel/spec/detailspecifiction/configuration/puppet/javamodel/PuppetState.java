package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PuppetState extends DynamicResource implements IPuppetState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPuppetState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPuppetState>() {
    
    @Override
    public IPuppetState create() {
      return new PuppetState();
    }
    
    @Override
    public IPuppetState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PuppetState(resourceRepository, resource);
    }
  
  };

  public PuppetState() {
    super(IPuppetState.TYPE_ID);
  }
  
  public PuppetState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPuppetState.TYPE_ID);
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

  public PuppetState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isAbsent()) return visitor.visitAbsent();
    if (isPresent()) return visitor.visitPresent();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isAbsent()) {
      visitor.visitAbsent();
      return;
    }
    if (isPresent()) {
      visitor.visitPresent();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isAbsent() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetState_absent);
  }
  
  @Override
  public boolean isPresent() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetState_present);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01b33e55-1b6b-11f0-9c3a-8502b2fb88fb,EZi2VHVrFB59hex4+Lx8Ee5S/j8=] */
