package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceDocument extends DynamicResource implements ISourceDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceDocument>() {
    
    @Override
    public ISourceDocument create() {
      return new SourceDocument();
    }
    
    @Override
    public ISourceDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceDocument(resourceRepository, resource);
    }
  
  };

  public SourceDocument() {
    super(ISourceDocument.TYPE_ID);
  }
  
  public SourceDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceDocument.TYPE_ID);
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

  @Override
  public java.net.URL selectUrl() {
    return _getSingleAttribute(java.net.URL.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceDocument_url);
  }
    
  public void setUrl(java.net.URL url) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceDocument_url, url);
  }

  // relations
  
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember selectAuthors() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public SourceDocument setAuthors(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember authors) {
    _setSingle(cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceChapter> selectChapters() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceChapter.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceDocument_chapters);
  }

  public SourceDocument setChapters(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceChapter> chapters) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceDocument_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> selectComposites() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.Source_composites);
  }

  public SourceDocument setComposites(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> composites) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.Source_composites, composites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceReference> selectReferences() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceReference.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceReferenceAware_references);
  }

  public SourceDocument setReferences(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceReference> references) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceReferenceAware_references, references);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.net.URL.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceDocument_url, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceChapter.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceDocument_chapters, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceReference.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceReferenceAware_references, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceDocument selectToMeChapters(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceDocument_chapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0322fa0c-bb80-11e5-b2f7-f515c847fa35,DtUTCw0neZeJanQ3Fe7hBIOZFwo=] */
