package cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Maturity extends DynamicResource implements IMaturity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMaturity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMaturity>() {
    
    @Override
    public IMaturity create() {
      return new Maturity();
    }
    
    @Override
    public IMaturity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Maturity(resourceRepository, resource);
    }
  
  };

  public Maturity() {
    super(IMaturity.TYPE_ID);
  }
  
  public Maturity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMaturity.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Maturity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (is__0___F___S___F_Senior()) return visitor.visit__0___F___S___F_Senior();
    if (is__Y___F___S___F_Professional()) return visitor.visit__Y___F___S___F_Professional();
    if (is__W___F___S___F_Junior()) return visitor.visit__W___F___S___F_Junior();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__0___F___S___F_Senior()) {
      visitor.visit__0___F___S___F_Senior();
      return;
    }
    if (is__Y___F___S___F_Professional()) {
      visitor.visit__Y___F___S___F_Professional();
      return;
    }
    if (is__W___F___S___F_Junior()) {
      visitor.visit__W___F___S___F_Junior();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__0___F___S___F_Senior() {
    return getResource().equals(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.ExperiencePackage.Maturity___0___F___S___F_Senior);
  }
  
  @Override
  public boolean is__Y___F___S___F_Professional() {
    return getResource().equals(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.ExperiencePackage.Maturity___Y___F___S___F_Professional);
  }
  
  @Override
  public boolean is__W___F___S___F_Junior() {
    return getResource().equals(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.ExperiencePackage.Maturity___W___F___S___F_Junior);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b802c383-b509-11e5-aa95-235930e9af3d,tB6hC1+/ptJY1eyK4DhRzRizPUY=] */
