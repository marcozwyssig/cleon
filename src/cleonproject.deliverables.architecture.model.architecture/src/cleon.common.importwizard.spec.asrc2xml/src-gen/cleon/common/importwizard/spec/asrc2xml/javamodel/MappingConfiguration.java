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

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation> selectMapAssoc() {
    return _getMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc);
  }

  public MappingConfiguration setMapAssoc(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation> mapAssoc) {
    _setMap(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc, mapAssoc);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute> selectMapAttr() {
    return _getMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAttr);
  }

  public MappingConfiguration setMapAttr(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute> mapAttr) {
    _setMap(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAttr, mapAttr);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation> selectMapOwnRel() {
    return _getMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel);
  }

  public MappingConfiguration setMapOwnRel(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation> mapOwnRel) {
    _setMap(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel, mapOwnRel);
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
    // relations
    _acceptMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc, visitor);
    _acceptMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAttr, visitor);
    _acceptMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_wizard, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.importwizard.spec.asrc2xml.javamodel.IMappingConfiguration> selectToMeWizard(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard object) {
    return _getToMeList(object.getRepository(), cleon.common.importwizard.spec.asrc2xml.javamodel.IMappingConfiguration.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.MappingConfiguration_wizard, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9489a1fa-2217-11e8-8247-038452bbec5f,UT+LS1ber7bTkSFTYSUJOpXlphQ=] */
