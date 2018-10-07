package cleon.initialization.projectmanagement.spec.hermes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Roles extends DynamicResource implements IRoles {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoles> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoles>() {
    
    @Override
    public IRoles create() {
      return new Roles();
    }
    
    @Override
    public IRoles create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Roles(resourceRepository, resource);
    }
  
  };

  public Roles() {
    super(IRoles.TYPE_ID);
  }
  
  public Roles(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoles.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.hermes.javamodel.IRole> selectRoles() {
    return _getList(cleon.initialization.projectmanagement.spec.hermes.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Roles_roles);
  }

  public Roles setRoles(java.util.List<? extends cleon.initialization.projectmanagement.spec.hermes.javamodel.IRole> roles) {
    _setList(cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Roles_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Roles setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.hermes.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Roles_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles selectToMeRoles(cleon.initialization.projectmanagement.spec.hermes.javamodel.IRole object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles.class, cleon.initialization.projectmanagement.spec.hermes.HermesPackage.Roles_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9097eb07-31ca-11e8-8a84-6f139e67278b,MqbYNHB8nJQZhYiTbzAYFxdZmMs=] */
