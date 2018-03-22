package cleon.conception.eamod.spec.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sources extends DynamicResource implements ISources {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISources> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISources>() {
    
    @Override
    public ISources create() {
      return new Sources();
    }
    
    @Override
    public ISources create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sources(resourceRepository, resource);
    }
  
  };

  public Sources() {
    super(ISources.TYPE_ID);
  }
  
  public Sources(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISources.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Sources setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> selectSources() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Sources_sources);
  }

  public Sources setSources(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> sources) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Sources_sources, sources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sources setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Sources_sources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISources selectToMeSources(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISources.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Sources_sources, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,efb0f224-a281-11e5-9332-1b5893de4362,yIfOt5H2hxwKIiRprCjvyMNwZJs=] */
