package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ForwardProperty extends DynamicResource implements IForwardProperty {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IForwardProperty> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IForwardProperty>() {
    
    @Override
    public IForwardProperty create() {
      return new ForwardProperty();
    }
    
    @Override
    public IForwardProperty create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ForwardProperty(resourceRepository, resource);
    }
  
  };

  public ForwardProperty() {
    super(IForwardProperty.TYPE_ID);
  }
  
  public ForwardProperty(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IForwardProperty.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsReadOnly() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.ForwardProperty_isReadOnly);
  }
    
  public void setIsReadOnly(java.lang.Boolean isReadOnly) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.ForwardProperty_isReadOnly, isReadOnly);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField selectField() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.ForwardProperty_field);
  }

  public ForwardProperty setField(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField field) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.ForwardProperty_field, field);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ForwardProperty setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ForwardProperty setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.ForwardProperty_isReadOnly, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.ForwardProperty_field, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IForwardProperty> selectToMeField(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.javamodel.IForwardProperty.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.mvvm.MvvmPackage.ForwardProperty_field, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,623e0e7c-c0c2-11e4-b2f2-bbf951b71ec4,PQpbHx1ivCSRos47pHvVYztSdM4=] */
