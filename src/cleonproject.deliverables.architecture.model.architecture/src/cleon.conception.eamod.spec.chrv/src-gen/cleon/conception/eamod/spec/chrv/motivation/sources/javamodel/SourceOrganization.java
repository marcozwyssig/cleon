package cleon.conception.eamod.spec.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceOrganization extends DynamicResource implements ISourceOrganization {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceOrganization> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceOrganization>() {
    
    @Override
    public ISourceOrganization create() {
      return new SourceOrganization();
    }
    
    @Override
    public ISourceOrganization create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceOrganization(resourceRepository, resource);
    }
  
  };

  public SourceOrganization() {
    super(ISourceOrganization.TYPE_ID);
  }
  
  public SourceOrganization(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceOrganization.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public SourceOrganization setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> selectComposites() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Source_composites);
  }

  public SourceOrganization setComposites(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> composites) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Source_composites, composites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceDocument> selectDocuments() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceDocument.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_documents);
  }

  public SourceOrganization setDocuments(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceDocument> documents) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourcePerson> selectPersons() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourcePerson.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_persons);
  }

  public SourceOrganization setPersons(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourcePerson> persons) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_persons, persons);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceOrganization setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceWorkshop> selectWorkshop() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceWorkshop.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_workshop);
  }

  public SourceOrganization setWorkshop(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceWorkshop> workshop) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_workshop, workshop);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Source_composites, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceDocument.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_documents, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourcePerson.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_persons, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceWorkshop.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_workshop, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceOrganization selectToMePersons(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourcePerson object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceOrganization.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_persons, object.getResource());
  }
  
  public static cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceOrganization selectToMeDocuments(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceOrganization.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_documents, object.getResource());
  }
  
  public static cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceOrganization selectToMeWorkshop(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceWorkshop object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceOrganization.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceOrganization_workshop, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1b0ca733-bb80-11e5-b2f7-f515c847fa35,CqaYp5CuxmXI8gYyDgDOsGfk41I=] */