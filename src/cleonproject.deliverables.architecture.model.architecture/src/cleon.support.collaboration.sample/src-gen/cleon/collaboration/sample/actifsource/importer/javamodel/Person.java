package cleon.collaboration.sample.actifsource.importer.javamodel;

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
  public java.lang.Integer selectAge() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.collaboration.sample.actifsource.importer.ImporterPackage.Person_age);
  }
    
  public void setAge(java.lang.Integer age) {
     _setSingleAttribute(cleon.collaboration.sample.actifsource.importer.ImporterPackage.Person_age, age);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.collaboration.sample.actifsource.importer.javamodel.IChair> selectChair() {
    return _getList(cleon.collaboration.sample.actifsource.importer.javamodel.IChair.class, cleon.collaboration.sample.actifsource.importer.ImporterPackage.Person_chair);
  }

  public Person setChair(java.util.List<? extends cleon.collaboration.sample.actifsource.importer.javamodel.IChair> chair) {
    _setList(cleon.collaboration.sample.actifsource.importer.ImporterPackage.Person_chair, chair);
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.collaboration.sample.actifsource.importer.ImporterPackage.Person_age, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.collaboration.sample.actifsource.importer.javamodel.IChair.class, cleon.collaboration.sample.actifsource.importer.ImporterPackage.Person_chair, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.collaboration.sample.actifsource.importer.javamodel.IPerson> selectToMeChair(cleon.collaboration.sample.actifsource.importer.javamodel.IChair object) {
    return _getToMeList(object.getRepository(), cleon.collaboration.sample.actifsource.importer.javamodel.IPerson.class, cleon.collaboration.sample.actifsource.importer.ImporterPackage.Person_chair, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dd7a7214-221f-11e8-8749-cb7f4d6924d3,wiNWZjbkK8uto9/voE7kMBbbWLs=] */
