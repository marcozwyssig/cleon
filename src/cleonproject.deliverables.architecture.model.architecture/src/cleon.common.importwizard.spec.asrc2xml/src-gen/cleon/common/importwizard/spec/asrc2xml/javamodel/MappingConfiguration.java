package cleon.common.importwizard.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MappingConfiguration extends DynamicResource implements IMappingConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingConfiguration>() {
    
    @Override
    public IMappingConfiguration create() {
      return new MappingConfiguration();
    }
    
    @Override
    public IMappingConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MappingConfiguration(resourceRepository, resource);
    }
  
  };

  public MappingConfiguration() {
    super(IMappingConfiguration.TYPE_ID);
  }
  
  public MappingConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMappingConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportRootElementHandler> selectRootElementHandler() {
    return _getMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportRootElementHandler.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_rootElementHandler);
  }

  public MappingConfiguration setRootElementHandler(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportRootElementHandler> rootElementHandler) {
    _setMap(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_rootElementHandler, rootElementHandler);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MappingConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard selectWizard() {
    return _getSingle(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_wizard);
  }

  public MappingConfiguration setWizard(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard wizard) {
    _setSingle(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_wizard, wizard);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportRootElementHandler.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_rootElementHandler, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_wizard, visitor);
  }

  // toMeRelations
  
  public static cleon.common.importwizard.spec.asrc2xml.javamodel.IMappingConfiguration selectToMeRootElementHandler(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportRootElementHandler object) {
    return _getToMeSingle(object.getRepository(), cleon.common.importwizard.spec.asrc2xml.javamodel.IMappingConfiguration.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_rootElementHandler, object.getResource());
  }
  
  public static java.util.List<cleon.common.importwizard.spec.asrc2xml.javamodel.IMappingConfiguration> selectToMeWizard(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard object) {
    return _getToMeList(object.getRepository(), cleon.common.importwizard.spec.asrc2xml.javamodel.IMappingConfiguration.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_wizard, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9489a1fa-2217-11e8-8247-038452bbec5f,RmSZzJz6fLKXuKG5YeU4UHy9t98=] */
