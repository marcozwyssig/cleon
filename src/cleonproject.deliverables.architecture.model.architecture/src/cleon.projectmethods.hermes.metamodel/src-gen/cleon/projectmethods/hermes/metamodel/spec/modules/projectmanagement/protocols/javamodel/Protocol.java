package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Protocol extends DynamicResource implements IProtocol {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocol> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocol>() {
    
    @Override
    public IProtocol create() {
      return new Protocol();
    }
    
    @Override
    public IProtocol create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Protocol(resourceRepository, resource);
    }
  
  };

  public Protocol() {
    super(IProtocol.TYPE_ID);
  }
  
  public Protocol(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProtocol.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectEndtime() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime);
  }
    
  public void setEndtime(java.lang.String endtime) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime, endtime);
  }

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectStarttime() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime);
  }
    
  public void setStarttime(java.lang.String starttime) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime, starttime);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgenda selectAgenda() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgenda.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda);
  }

  public Protocol setAgenda(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgenda agenda) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, agenda);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Protocol setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectDate() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_date);
  }

  public Protocol setDate(cleon.common.calendar.metamodel.spec.javamodel.IDay date) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_date, date);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Protocol setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings);
  }

  public Protocol setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation selectLocation() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_location);
  }

  public Protocol setLocation(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation location) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_location, location);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> selectMembers() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_members);
  }

  public Protocol setMembers(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> members) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_members, members);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember selectModerator() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator);
  }

  public Protocol setModerator(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember moderator) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, moderator);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectNames() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names);
  }

  public Protocol setNames(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> names) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, names);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolProperties selectProperties() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolProperties.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_properties);
  }

  public Protocol setProperties(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolProperties properties) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_properties, properties);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocol() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol);
  }

  public Protocol setProtocol(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems> protocol) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, protocol);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public Protocol setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Protocol setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgenda.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, visitor);
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_date, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_location, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_members, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolProperties.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_properties, visitor);
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol> selectToMeDate(cleon.common.calendar.metamodel.spec.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_date, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol> selectToMeMembers(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_members, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol selectToMeAgenda(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgenda object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol selectToMeProtocol(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol> selectToMeModerator(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol> selectToMeLocation(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_location, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol selectToMeProperties(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolProperties object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocol_properties, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2140b619-b45f-11e5-b1fb-4fb16b224b5b,5+kc916nc8rfbPIW+DpisIEIdMM=] */
