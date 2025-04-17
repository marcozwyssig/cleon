package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RegistryKey extends DynamicResource implements IRegistryKey {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRegistryKey> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRegistryKey>() {
    
    @Override
    public IRegistryKey create() {
      return new RegistryKey();
    }
    
    @Override
    public IRegistryKey create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RegistryKey(resourceRepository, resource);
    }
  
  };

  public RegistryKey() {
    super(IRegistryKey.TYPE_ID);
  }
  
  public RegistryKey(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRegistryKey.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectKeydata() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_keydata);
  }
    
  public void setKeydata(java.lang.String keydata) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_keydata, keydata);
  }

  @Override
  public java.lang.String selectKeytype() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_keytype);
  }
    
  public void setKeytype(java.lang.String keytype) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_keytype, keytype);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_path, path);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetState selectStatus() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_status);
  }

  public RegistryKey setStatus(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetState status) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_status, status);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RegistryKey setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_keydata, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_keytype, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_path, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_status, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel.IRegistryKey> selectToMeStatus(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel.IRegistryKey.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.RegistryKey_status, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b05acf64-1b6a-11f0-9c3a-8502b2fb88fb,hFuamHaSTIc5XFP6E+GNejdfmVQ=] */
