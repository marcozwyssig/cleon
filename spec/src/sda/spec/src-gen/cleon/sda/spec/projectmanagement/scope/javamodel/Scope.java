package cleon.sda.spec.projectmanagement.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Scope extends DynamicResource implements IScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScope>() {
    
    @Override
    public IScope create() {
      return new Scope();
    }
    
    @Override
    public IScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Scope(resourceRepository, resource);
    }
  
  };

  public Scope() {
    super(IScope.TYPE_ID);
  }
  
  public Scope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IScope.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog selectBacklog() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlog);
  }

  public Scope setBacklog(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlog, backlog);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Scope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlog, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.javamodel.IScope selectToMeBacklog(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.javamodel.IScope.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlog, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fef60a9b-a7d8-11e5-82dd-3b995d9c840c,+5SHxZrvcgkEpyDYtGWHAjJzMjk=] */
