package cleon.doc.spec.paragraph.remarks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Tip extends DynamicResource implements ITip {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITip> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITip>() {
    
    @Override
    public ITip create() {
      return new Tip();
    }
    
    @Override
    public ITip create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Tip(resourceRepository, resource);
    }
  
  };

  public Tip() {
    super(ITip.TYPE_ID);
  }
  
  public Tip(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITip.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectRemark() {
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark);
  }
    
  public void setRemark(java.lang.String remark) {
     _setSingleAttribute(cleon.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark, remark);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Tip setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a4596644-466d-11e5-ba74-cb2e95044e1c,yoPo5rl5u6lQOASxqEHJpZSJ3Vk=] */
