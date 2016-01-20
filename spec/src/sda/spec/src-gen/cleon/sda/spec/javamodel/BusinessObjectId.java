package cleon.sda.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BusinessObjectId extends DynamicResource implements IBusinessObjectId {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBusinessObjectId> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBusinessObjectId>() {
    
    @Override
    public IBusinessObjectId create() {
      return new BusinessObjectId();
    }
    
    @Override
    public IBusinessObjectId create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BusinessObjectId(resourceRepository, resource);
    }
  
  };

  public BusinessObjectId() {
    super(IBusinessObjectId.TYPE_ID);
  }
  
  public BusinessObjectId(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBusinessObjectId.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BusinessObjectId setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,133424cf-be0b-11e5-ad6f-979cbb78853e,1e5woTgyg1gwscvTyfmX+BJHSZY=] */
