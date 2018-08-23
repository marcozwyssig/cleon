package cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel;

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
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectEndtime() {
    return _getSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime);
  }
    
  public void setEndtime(java.lang.String endtime) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime, endtime);
  }

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
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
    return _getSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime);
  }
    
  public void setStarttime(java.lang.String starttime) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime, starttime);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda selectAgenda() {
    return _getSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda);
  }

  public Protocol setAgenda(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda agenda) {
    _setSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, agenda);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDate() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date);
  }

  public Protocol setDate(cleon.common.resources.spec.calendar.javamodel.IDay date) {
    _setSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date, date);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Protocol setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation selectLocation() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location);
  }

  public Protocol setLocation(cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation location) {
    _setSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location, location);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> selectMembers() {
    return _getList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members);
  }

  public Protocol setMembers(java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> members) {
    _setList(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members, members);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember selectModerator() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator);
  }

  public Protocol setModerator(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember moderator) {
    _setSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, moderator);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties selectProperties() {
    return _getSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_properties);
  }

  public Protocol setProperties(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties properties) {
    _setSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_properties, properties);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocol() {
    return _getMap(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol);
  }

  public Protocol setProtocol(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolItems> protocol) {
    _setMap(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, protocol);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Protocol setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, visitor);
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_properties, visitor);
    _acceptMap(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeDate(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeMembers(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol selectToMeAgenda(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol selectToMeProtocol(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolItems object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeModerator(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeLocation(cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol selectToMeProperties(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_properties, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2140b619-b45f-11e5-b1fb-4fb16b224b5b,YyNCHFX5c631LMkSGg6mdeT+QBY=] */
