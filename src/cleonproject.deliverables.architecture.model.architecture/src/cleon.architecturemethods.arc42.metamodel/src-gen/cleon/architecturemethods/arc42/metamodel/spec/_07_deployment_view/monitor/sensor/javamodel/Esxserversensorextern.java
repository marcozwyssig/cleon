package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Esxserversensorextern extends DynamicResource implements IEsxserversensorextern {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEsxserversensorextern> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEsxserversensorextern>() {
    
    @Override
    public IEsxserversensorextern create() {
      return new Esxserversensorextern();
    }
    
    @Override
    public IEsxserversensorextern create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Esxserversensorextern(resourceRepository, resource);
    }
  
  };

  public Esxserversensorextern() {
    super(IEsxserversensorextern.TYPE_ID);
  }
  
  public Esxserversensorextern(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEsxserversensorextern.TYPE_ID);
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

  public Esxserversensorextern setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db502822-c1eb-11ea-820f-9931558a898c,x28lB2RCsVNpeFu16I+UJSoqDNI=] */
