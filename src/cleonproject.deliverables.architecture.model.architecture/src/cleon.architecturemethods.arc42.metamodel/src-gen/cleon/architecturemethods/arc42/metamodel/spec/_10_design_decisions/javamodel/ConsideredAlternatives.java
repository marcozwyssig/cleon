package cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ConsideredAlternatives extends DynamicResource implements IConsideredAlternatives {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConsideredAlternatives> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConsideredAlternatives>() {
    
    @Override
    public IConsideredAlternatives create() {
      return new ConsideredAlternatives();
    }
    
    @Override
    public IConsideredAlternatives create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ConsideredAlternatives(resourceRepository, resource);
    }
  
  };

  public ConsideredAlternatives() {
    super(IConsideredAlternatives.TYPE_ID);
  }
  
  public ConsideredAlternatives(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConsideredAlternatives.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ConsideredAlternatives setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffd8e808-ecde-11e8-8149-8542373915bf,2MMbixMg/zX2/t/44pM4Vu23abQ=] */
