package cleon.projectmethods.hermes.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Task extends DynamicResource implements ITask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITask>() {
    
    @Override
    public ITask create() {
      return new Task();
    }
    
    @Override
    public ITask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Task(resourceRepository, resource);
    }
  
  };

  public Task() {
    super(ITask.TYPE_ID);
  }
  
  public Task(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDisplayName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName);
  }
    
  public void setDisplayName(java.lang.String displayName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName, displayName);
  }

  @Override
  public java.lang.String selectIdentifier() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.String identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPurpose() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Task_purpose);
  }
    
  public void setPurpose(java.lang.String purpose) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Task_purpose, purpose);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IRole selectResponsibleRole() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRole.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Task_responsibleRole);
  }

  public Task setResponsibleRole(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRole responsibleRole) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Task_responsibleRole, responsibleRole);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Task setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Task_purpose, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRole.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Task_responsibleRole, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.javamodel.ITask> selectToMeResponsibleRole(cleon.projectmethods.hermes.metamodel.spec.javamodel.IRole object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.javamodel.ITask.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Task_responsibleRole, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df8e50c8-31ce-11e8-8a84-6f139e67278b,z50u5g/wAWXra7ZeybEnL5ngjWY=] */
