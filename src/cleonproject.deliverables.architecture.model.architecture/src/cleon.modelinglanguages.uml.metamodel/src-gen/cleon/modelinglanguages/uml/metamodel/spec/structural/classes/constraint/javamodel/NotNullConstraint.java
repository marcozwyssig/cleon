package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.constraint.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NotNullConstraint extends DynamicResource implements INotNullConstraint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INotNullConstraint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INotNullConstraint>() {
    
    @Override
    public INotNullConstraint create() {
      return new NotNullConstraint();
    }
    
    @Override
    public INotNullConstraint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NotNullConstraint(resourceRepository, resource);
    }
  
  };

  public NotNullConstraint() {
    super(INotNullConstraint.TYPE_ID);
  }
  
  public NotNullConstraint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INotNullConstraint.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NotNullConstraint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4520ada6-1197-11e3-9156-7d5514ad9e83,rYE6XRO867Gt+zePggHJRdcmAl8=] */
