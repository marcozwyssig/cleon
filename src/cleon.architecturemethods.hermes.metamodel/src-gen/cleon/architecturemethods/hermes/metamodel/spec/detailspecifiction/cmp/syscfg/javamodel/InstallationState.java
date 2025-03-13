package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InstallationState extends DynamicResource implements IInstallationState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationState>() {
    
    @Override
    public IInstallationState create() {
      return new InstallationState();
    }
    
    @Override
    public IInstallationState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InstallationState(resourceRepository, resource);
    }
  
  };

  public InstallationState() {
    super(IInstallationState.TYPE_ID);
  }
  
  public InstallationState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInstallationState.TYPE_ID);
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

  public InstallationState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isPresent()) return visitor.visitPresent();
    if (isAbsent()) return visitor.visitAbsent();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isPresent()) {
      visitor.visitPresent();
      return;
    }
    if (isAbsent()) {
      visitor.visitAbsent();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isPresent() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.InstallationState_present);
  }
  
  @Override
  public boolean isAbsent() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.InstallationState_absent);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,73a91148-f18e-11e8-b3e7-15e2dd8d9b05,J1AeYOkZkN18uQ36KMVmCE3ZzHs=] */
