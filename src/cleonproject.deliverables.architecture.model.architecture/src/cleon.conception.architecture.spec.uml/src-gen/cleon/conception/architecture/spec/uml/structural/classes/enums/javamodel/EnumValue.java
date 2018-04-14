package cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnumValue extends DynamicResource implements IEnumValue {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumValue> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumValue>() {
    
    @Override
    public IEnumValue create() {
      return new EnumValue();
    }
    
    @Override
    public IEnumValue create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnumValue(resourceRepository, resource);
    }
  
  };

  public EnumValue() {
    super(IEnumValue.TYPE_ID);
  }
  
  public EnumValue(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnumValue.TYPE_ID);
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
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.uml.structural.classes.enums.EnumsPackage.EnumValue_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.conception.architecture.spec.uml.structural.classes.enums.EnumsPackage.EnumValue_value, value);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnumValue setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.uml.structural.classes.enums.EnumsPackage.EnumValue_value, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,151f6892-b1be-11e4-a1b5-85bab1cb6ada,u+pTng1bOqEmIyQLT10amCr/ZMI=] */
