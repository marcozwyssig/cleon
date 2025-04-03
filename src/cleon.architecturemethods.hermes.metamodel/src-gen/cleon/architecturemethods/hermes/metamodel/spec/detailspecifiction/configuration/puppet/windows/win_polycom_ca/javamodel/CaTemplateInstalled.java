package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CaTemplateInstalled extends DynamicResource implements ICaTemplateInstalled {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaTemplateInstalled> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaTemplateInstalled>() {
    
    @Override
    public ICaTemplateInstalled create() {
      return new CaTemplateInstalled();
    }
    
    @Override
    public ICaTemplateInstalled create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CaTemplateInstalled(resourceRepository, resource);
    }
  
  };

  public CaTemplateInstalled() {
    super(ICaTemplateInstalled.TYPE_ID);
  }
  
  public CaTemplateInstalled(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICaTemplateInstalled.TYPE_ID);
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
  public java.lang.String selectType() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateInstalled_type);
  }
    
  public void setType(java.lang.String type) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateInstalled_type, type);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CaTemplateInstalled setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateInstalled_type, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7d9c489a-1044-11f0-8aa5-cd86450b7feb,eEvYwRJVVgYQzvxczzooBliMRfE=] */
