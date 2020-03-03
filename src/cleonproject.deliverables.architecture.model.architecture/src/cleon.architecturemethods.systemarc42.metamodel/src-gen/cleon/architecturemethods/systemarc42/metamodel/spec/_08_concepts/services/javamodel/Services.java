package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Services extends DynamicResource implements IServices {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServices> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServices>() {
    
    @Override
    public IServices create() {
      return new Services();
    }
    
    @Override
    public IServices create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Services(resourceRepository, resource);
    }
  
  };

  public Services() {
    super(IServices.TYPE_ID);
  }
  
  public Services(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServices.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectTopServices() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.Services_topServices);
  }

  public Services setTopServices(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> topServices) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.Services_topServices, topServices);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Services setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.Services_topServices, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices selectToMeTopServices(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.Services_topServices, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2936d62-6da3-11e9-8af5-2346ca56c2e2,XcM/w7ea1baFnihf43do88xGU0U=] */
