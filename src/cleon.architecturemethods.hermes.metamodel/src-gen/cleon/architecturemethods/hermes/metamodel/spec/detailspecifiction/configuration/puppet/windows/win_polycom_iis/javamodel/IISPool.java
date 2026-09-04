package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IISPool extends DynamicResource implements IIISPool {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIISPool> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIISPool>() {
    
    @Override
    public IIISPool create() {
      return new IISPool();
    }
    
    @Override
    public IIISPool create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IISPool(resourceRepository, resource);
    }
  
  };

  public IISPool() {
    super(IIISPool.TYPE_ID);
  }
  
  public IISPool(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIISPool.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPipeline_mode() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.IISPool_pipeline_aE_mode);
  }
    
  public void setPipeline_mode(java.lang.String pipeline_mode) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.IISPool_pipeline_aE_mode, pipeline_mode);
  }

  @Override
  public java.lang.String selectRuntime_version() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.IISPool_runtime_aE_version);
  }
    
  public void setRuntime_version(java.lang.String runtime_version) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.IISPool_runtime_aE_version, runtime_version);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IISPool setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.IISPool_pipeline_aE_mode, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.IISPool_runtime_aE_version, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aee61b86-115a-11f0-a4f9-b5f995a9e0fe,RZKEcZOa7JL0natel+vIaYyTYz8=] */
