package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ValueAware extends DynamicResource implements IValueAware {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueAware> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueAware>() {
    
    @Override
    public IValueAware create() {
      return new ValueAware();
    }
    
    @Override
    public IValueAware create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ValueAware(resourceRepository, resource);
    }
  
  };

  public ValueAware() {
    super(IValueAware.TYPE_ID);
  }
  
  public ValueAware(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IValueAware.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ValueAware setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue selectValue() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.ValuePackage.ValueAware_value);
  }

  public ValueAware setValue(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue value) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.ValuePackage.ValueAware_value, value);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.ValuePackage.ValueAware_value, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValueAware> selectToMeValue(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValueAware.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.ValuePackage.ValueAware_value, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4e869654-d657-11e5-beff-c5494779b7d9,J8DeHLYRR/t9Ihgzo0u34PRX/PM=] */
