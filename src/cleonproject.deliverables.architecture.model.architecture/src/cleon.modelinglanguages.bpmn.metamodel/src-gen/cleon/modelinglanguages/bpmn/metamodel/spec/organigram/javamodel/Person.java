package cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Person extends DynamicResource implements IPerson {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPerson> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPerson>() {
    
    @Override
    public IPerson create() {
      return new Person();
    }
    
    @Override
    public IPerson create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Person(resourceRepository, resource);
    }
  
  };

  public Person() {
    super(IPerson.TYPE_ID);
  }
  
  public Person(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPerson.TYPE_ID);
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
  public java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> selectRoles() {
    return _getList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organigram.OrganigramPackage.Person_roles);
  }

  public Person setRoles(java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> roles) {
    _setList(cleon.modelinglanguages.bpmn.metamodel.spec.organigram.OrganigramPackage.Person_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Person setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organigram.OrganigramPackage.Person_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IPerson> selectToMeRoles(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IPerson.class, cleon.modelinglanguages.bpmn.metamodel.spec.organigram.OrganigramPackage.Person_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e4ce5b3-daac-11e3-ae07-89aa80d5ec3d,ub4+8ynRKiB7e1BlRxbZDCjQ2Ak=] */
