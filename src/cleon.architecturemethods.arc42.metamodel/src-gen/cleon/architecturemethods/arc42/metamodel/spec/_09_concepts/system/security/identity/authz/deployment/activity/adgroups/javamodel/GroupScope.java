package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GroupScope extends DynamicResource implements IGroupScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroupScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroupScope>() {
    
    @Override
    public IGroupScope create() {
      return new GroupScope();
    }
    
    @Override
    public IGroupScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GroupScope(resourceRepository, resource);
    }
  
  };

  public GroupScope() {
    super(IGroupScope.TYPE_ID);
  }
  
  public GroupScope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGroupScope.TYPE_ID);
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

  public GroupScope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isGlobal()) return visitor.visitGlobal();
    if (isUniversal()) return visitor.visitUniversal();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isGlobal()) {
      visitor.visitGlobal();
      return;
    }
    if (isUniversal()) {
      visitor.visitUniversal();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isGlobal() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.AdgroupsPackage.GroupScope_Global);
  }
  
  @Override
  public boolean isUniversal() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.AdgroupsPackage.GroupScope_Universal);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e6ff7994-1125-11f0-a4f9-b5f995a9e0fe,FknljyNfMgijW/o5eU60A02G+fg=] */
