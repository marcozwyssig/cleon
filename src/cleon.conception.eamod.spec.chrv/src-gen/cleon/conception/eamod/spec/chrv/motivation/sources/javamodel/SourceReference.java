package cleon.conception.eamod.spec.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceReference extends DynamicResource implements ISourceReference {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceReference> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceReference>() {
    
    @Override
    public ISourceReference create() {
      return new SourceReference();
    }
    
    @Override
    public ISourceReference create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceReference(resourceRepository, resource);
    }
  
  };

  public SourceReference() {
    super(ISourceReference.TYPE_ID);
  }
  
  public SourceReference(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceReference.TYPE_ID);
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

  public SourceReference setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceChapter selectComposite() {
    return _getSingle(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceChapter.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceReference_composite);
  }

  public SourceReference setComposite(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceChapter composite) {
    _setSingle(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceReference_composite, composite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> selectComposites() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Source_composites);
  }

  public SourceReference setComposites(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> composites) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Source_composites, composites);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceReference setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
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
    _acceptSingle(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceChapter.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceReference_composite, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.Source_composites, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceReference selectToMeComposite(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceReference.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceReference_composite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c70c4b2-06f6-11e6-8d3e-13e5be4bd43b,/lmf8LO9MAT5WkV3Ykt3xAxtR9Q=] */
