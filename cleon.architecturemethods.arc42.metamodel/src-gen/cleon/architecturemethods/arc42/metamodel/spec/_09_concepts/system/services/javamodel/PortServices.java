package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PortServices extends DynamicResource implements IPortServices {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPortServices> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPortServices>() {
    
    @Override
    public IPortServices create() {
      return new PortServices();
    }
    
    @Override
    public IPortServices create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PortServices(resourceRepository, resource);
    }
  
  };

  public PortServices() {
    super(IPortServices.TYPE_ID);
  }
  
  public PortServices(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPortServices.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> selectPortServices() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.PortServices_portServices);
  }

  public PortServices setPortServices(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> portServices) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.PortServices_portServices, portServices);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PortServices setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.PortServices_portServices, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortServices selectToMePortServices(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortServices.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.PortServices_portServices, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2936d62-6da3-11e9-8af5-2346ca56c2e2,tL5/hBF6pXpwkZsdl8GLo9jl0sE=] */
