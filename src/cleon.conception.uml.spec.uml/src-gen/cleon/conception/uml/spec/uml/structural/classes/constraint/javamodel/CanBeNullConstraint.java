package cleon.conception.uml.spec.uml.structural.classes.constraint.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CanBeNullConstraint extends DynamicResource implements ICanBeNullConstraint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICanBeNullConstraint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICanBeNullConstraint>() {
    
    @Override
    public ICanBeNullConstraint create() {
      return new CanBeNullConstraint();
    }
    
    @Override
    public ICanBeNullConstraint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CanBeNullConstraint(resourceRepository, resource);
    }
  
  };

  public CanBeNullConstraint() {
    super(ICanBeNullConstraint.TYPE_ID);
  }
  
  public CanBeNullConstraint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICanBeNullConstraint.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CanBeNullConstraint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4cd7ecce-1197-11e3-9156-7d5514ad9e83,AtE5FEgvZ5XMHpoDXnaWbUWdViI=] */
