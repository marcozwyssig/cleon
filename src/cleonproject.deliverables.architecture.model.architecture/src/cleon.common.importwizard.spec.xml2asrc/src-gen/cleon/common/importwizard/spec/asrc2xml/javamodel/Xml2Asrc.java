package cleon.common.importwizard.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Xml2Asrc extends DynamicResource implements IXml2Asrc {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IXml2Asrc> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IXml2Asrc>() {
    
    @Override
    public IXml2Asrc create() {
      return new Xml2Asrc();
    }
    
    @Override
    public IXml2Asrc create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Xml2Asrc(resourceRepository, resource);
    }
  
  };

  public Xml2Asrc() {
    super(IXml2Asrc.TYPE_ID);
  }
  
  public Xml2Asrc(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IXml2Asrc.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation> selectMapAssoc() {
    return _getMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc);
  }

  public Xml2Asrc setMapAssoc(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportAssociation> mapAssoc) {
    _setMap(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc, mapAssoc);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute> selectMapAttr() {
    return _getMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAttr);
  }

  public Xml2Asrc setMapAttr(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportAttribute> mapAttr) {
    _setMap(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAttr, mapAttr);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation> selectMapOwnRel() {
    return _getMap(cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel);
  }

  public Xml2Asrc setMapOwnRel(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.importwizard.spec.asrc2xml.javamodel.IImportOwnRelation> mapOwnRel) {
    _setMap(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel, mapOwnRel);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Xml2Asrc setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard selectWizard() {
    return _getSingle(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.Xml2Asrc_wizard);
  }

  public Xml2Asrc setWizard(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard wizard) {
    _setSingle(cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.Xml2Asrc_wizard, wizard);
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
    _acceptSingle(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.Xml2Asrc_wizard, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.importwizard.spec.asrc2xml.javamodel.IXml2Asrc> selectToMeWizard(ch.actifsource.ui.wizard.importer.generic.javamodel.IGenericImportWizard object) {
    return _getToMeList(object.getRepository(), cleon.common.importwizard.spec.asrc2xml.javamodel.IXml2Asrc.class, cleon.common.importwizard.spec.asrc2xml.Asrc2xmlPackage.Xml2Asrc_wizard, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9489a1fa-2217-11e8-8247-038452bbec5f,LHEKBZekuZ8bWH4UhMR0ilsFZn0=] */
