package cleon.sda.spec.projectmanagement.ressources.javamodel;

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
  public java.lang.String selectFirstname() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_firstname);
  }
    
  public void setFirstname(java.lang.String firstname) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_firstname, firstname);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortname() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_shortname);
  }
    
  public void setShortname(java.lang.String shortname) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_shortname, shortname);
  }

  @Override
  public java.lang.String selectSurname() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_surname);
  }
    
  public void setSurname(java.lang.String surname) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_surname, surname);
  }

  // relations
  
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
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_firstname, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_shortname, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.ressources.RessourcesPackage.Person_surname, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9bfc0d2c-ff9e-11e4-ac0a-959b440f987f,HiHl1Hm9lxFGhPsBj+Hz/J8mtm4=] */
