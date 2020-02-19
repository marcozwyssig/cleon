package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourcePerson extends DynamicResource implements ISourcePerson {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourcePerson> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourcePerson>() {
    
    @Override
    public ISourcePerson create() {
      return new SourcePerson();
    }
    
    @Override
    public ISourcePerson create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourcePerson(resourceRepository, resource);
    }
  
  };

  public SourcePerson() {
    super(ISourcePerson.TYPE_ID);
  }
  
  public SourcePerson(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourcePerson.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember selectAuthors() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public SourcePerson setAuthors(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember authors) {
    _setSingle(cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> selectComposites() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.Source_composites);
  }

  public SourcePerson setComposites(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> composites) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.Source_composites, composites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceDocument> selectDocuments() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourcePerson_documents);
  }

  public SourcePerson setDocuments(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceDocument> documents) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourcePerson_documents, documents);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourcePerson setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourcePerson_documents, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourcePerson selectToMeDocuments(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourcePerson.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourcePerson_documents, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1d03bc5b-bb80-11e5-b2f7-f515c847fa35,09fGOhA836n3kuRvbsMjBB6Zj+Y=] */
