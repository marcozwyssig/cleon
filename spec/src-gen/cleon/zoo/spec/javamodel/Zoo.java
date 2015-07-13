package cleon.zoo.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Zoo extends DynamicResource implements IZoo {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IZoo> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IZoo>() {
    
    @Override
    public IZoo create() {
      return new Zoo();
    }
    
    @Override
    public IZoo create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Zoo(resourceRepository, resource);
    }
  
  };

  public Zoo() {
    super(IZoo.TYPE_ID);
  }
  
  public Zoo(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IZoo.TYPE_ID);
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
  public java.util.List<? extends cleon.zoo.spec.javamodel.ISpecification> selectSpecifications() {
    return _getList(cleon.zoo.spec.javamodel.ISpecification.class, cleon.zoo.spec.SpecPackage.Zoo_specifications);
  }

  public Zoo setSpecifications(java.util.List<? extends cleon.zoo.spec.javamodel.ISpecification> specifications) {
    _setList(cleon.zoo.spec.SpecPackage.Zoo_specifications, specifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Zoo setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.zoo.spec.javamodel.ISpecification.class, cleon.zoo.spec.SpecPackage.Zoo_specifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.zoo.spec.javamodel.IZoo selectToMeSpecifications(cleon.zoo.spec.javamodel.ISpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.zoo.spec.javamodel.IZoo.class, cleon.zoo.spec.SpecPackage.Zoo_specifications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28f43850-e9ba-11e4-848b-0509e3792151,QyEbUeE2q9jdu0mdbudp5ZI5Qf4=] */
