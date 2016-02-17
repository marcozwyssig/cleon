package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.function.functionalitytype.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionalityType extends DynamicResource implements IFunctionalityType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalityType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalityType>() {
    
    @Override
    public IFunctionalityType create() {
      return new FunctionalityType();
    }
    
    @Override
    public IFunctionalityType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionalityType(resourceRepository, resource);
    }
  
  };

  public FunctionalityType() {
    super(IFunctionalityType.TYPE_ID);
  }
  
  public FunctionalityType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionalityType.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FunctionalityType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2b91373a-d55d-11e5-89ea-2d8d86e9ef89,Rj5/wqv+oEwtyWwkLzRteyv9GKw=] */
