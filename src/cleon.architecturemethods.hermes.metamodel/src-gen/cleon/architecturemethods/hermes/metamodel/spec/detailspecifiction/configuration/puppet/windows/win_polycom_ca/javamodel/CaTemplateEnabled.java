package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CaTemplateEnabled extends DynamicResource implements ICaTemplateEnabled {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaTemplateEnabled> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaTemplateEnabled>() {
    
    @Override
    public ICaTemplateEnabled create() {
      return new CaTemplateEnabled();
    }
    
    @Override
    public ICaTemplateEnabled create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CaTemplateEnabled(resourceRepository, resource);
    }
  
  };

  public CaTemplateEnabled() {
    super(ICaTemplateEnabled.TYPE_ID);
  }
  
  public CaTemplateEnabled(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICaTemplateEnabled.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectVersion() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateEnabled_version);
  }
    
  public void setVersion(java.lang.Integer version) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateEnabled_version, version);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel.ICaTemplateInstalled selectCaTemplateInstalled() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel.ICaTemplateInstalled.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateEnabled_caTemplateInstalled);
  }

  public CaTemplateEnabled setCaTemplateInstalled(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel.ICaTemplateInstalled caTemplateInstalled) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateEnabled_caTemplateInstalled, caTemplateInstalled);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public CaTemplateEnabled setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CaTemplateEnabled setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateEnabled_version, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel.ICaTemplateInstalled.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateEnabled_caTemplateInstalled, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel.ICaTemplateEnabled> selectToMeCaTemplateInstalled(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel.ICaTemplateInstalled object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel.ICaTemplateEnabled.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.CaTemplateEnabled_caTemplateInstalled, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1bcd1ba0-1045-11f0-8aa5-cd86450b7feb,1FibPbEK8Wsk6um0YAU7bnDOKMc=] */
