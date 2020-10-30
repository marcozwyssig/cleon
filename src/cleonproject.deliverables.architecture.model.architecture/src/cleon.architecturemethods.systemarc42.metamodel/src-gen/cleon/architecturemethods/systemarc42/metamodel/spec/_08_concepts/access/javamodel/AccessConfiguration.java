package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessConfiguration extends DynamicResource implements IAccessConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfiguration>() {
    
    @Override
    public IAccessConfiguration create() {
      return new AccessConfiguration();
    }
    
    @Override
    public IAccessConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessConfiguration(resourceRepository, resource);
    }
  
  };

  public AccessConfiguration() {
    super(IAccessConfiguration.TYPE_ID);
  }
  
  public AccessConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService selectPortService() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_portService);
  }

  public AccessConfiguration setPortService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService portService) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_portService, portService);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AccessConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_portService, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectToMePortService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_portService, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ce85a718-1a0b-11eb-818d-6dbd3a659d3c,keEVQDBdk9SF54z4diWSR037KMs=] */
