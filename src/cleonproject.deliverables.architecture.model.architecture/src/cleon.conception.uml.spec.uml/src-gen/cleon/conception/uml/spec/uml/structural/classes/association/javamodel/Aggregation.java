package cleon.conception.uml.spec.uml.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Aggregation extends DynamicResource implements IAggregation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAggregation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAggregation>() {
    
    @Override
    public IAggregation create() {
      return new Aggregation();
    }
    
    @Override
    public IAggregation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Aggregation(resourceRepository, resource);
    }
  
  };

  public Aggregation() {
    super(IAggregation.TYPE_ID);
  }
  
  public Aggregation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAggregation.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Aggregation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,49f27e80-13d4-11e3-9736-a3484832b481,mgYs8XGAuFKX76j2z1kRGwOGsII=] */
