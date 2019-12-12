package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceChapter extends DynamicResource implements ISourceChapter {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceChapter> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceChapter>() {
    
    @Override
    public ISourceChapter create() {
      return new SourceChapter();
    }
    
    @Override
    public ISourceChapter create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceChapter(resourceRepository, resource);
    }
  
  };

  public SourceChapter() {
    super(ISourceChapter.TYPE_ID);
  }
  
  public SourceChapter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceChapter.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public SourceChapter setAuthors(java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource> selectComposites() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.Source_composites);
  }

  public SourceChapter setComposites(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISource> composites) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.Source_composites, composites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISourceReference> selectReferences() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISourceReference.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceReferenceAware_references);
  }

  public SourceChapter setReferences(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISourceReference> references) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceReferenceAware_references, references);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceChapter setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISourceReference.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceReferenceAware_references, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1165cb74-bb80-11e5-b2f7-f515c847fa35,GtTaI+PbjEv8RM2qta42v/6Q3hs=] */
