package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GenericCfgResource extends DynamicResource implements IGenericCfgResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGenericCfgResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGenericCfgResource>() {
    
    @Override
    public IGenericCfgResource create() {
      return new GenericCfgResource();
    }
    
    @Override
    public IGenericCfgResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GenericCfgResource(resourceRepository, resource);
    }
  
  };

  public GenericCfgResource() {
    super(IGenericCfgResource.TYPE_ID);
  }
  
  public GenericCfgResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGenericCfgResource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectTitle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title);
  }
    
  public void setTitle(java.lang.String title) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, title);
  }

  @Override
  public java.lang.String selectType() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericCfgResource_type);
  }
    
  public void setType(java.lang.String type) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericCfgResource_type, type);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel.IGenericAttrValue> selectGenericKeyValues() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel.IGenericAttrValue.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericCfgResource_genericKeyValues);
  }

  public GenericCfgResource setGenericKeyValues(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel.IGenericAttrValue> genericKeyValues) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericCfgResource_genericKeyValues, genericKeyValues);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GenericCfgResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericCfgResource_type, visitor);
    // relations
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel.IGenericAttrValue.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericCfgResource_genericKeyValues, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel.IGenericCfgResource selectToMeGenericKeyValues(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel.IGenericAttrValue object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel.IGenericCfgResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericCfgResource_genericKeyValues, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eccc3e4d-ef3a-11e8-be8a-b748ff8f0a75,OuzUEAmtcjoZklAz09WEI48a6pE=] */
