package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AmountAware extends DynamicResource implements IAmountAware {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAmountAware> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAmountAware>() {
    
    @Override
    public IAmountAware create() {
      return new AmountAware();
    }
    
    @Override
    public IAmountAware create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AmountAware(resourceRepository, resource);
    }
  
  };

  public AmountAware() {
    super(IAmountAware.TYPE_ID);
  }
  
  public AmountAware(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAmountAware.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectAmount() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AmountAware_amount);
  }
    
  public void setAmount(java.lang.Integer amount) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AmountAware_amount, amount);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AmountAware setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AmountAware_amount, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1d688582-dfd2-11ef-b0be-9b4cac321140,m1WVjy6mcrK9E+jY18I+6a6nFQY=] */
