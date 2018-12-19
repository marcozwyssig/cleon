package cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CISCapability extends DynamicResource implements ICISCapability {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICISCapability> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICISCapability>() {
    
    @Override
    public ICISCapability create() {
      return new CISCapability();
    }
    
    @Override
    public ICISCapability create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CISCapability(resourceRepository, resource);
    }
  
  };

  public CISCapability() {
    super(ICISCapability.TYPE_ID);
  }
  
  public CISCapability(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICISCapability.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability> selectCapabilityComposition() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilityComposition);
  }

  public CISCapability setCapabilityComposition(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability> capabilityComposition) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilityComposition, capabilityComposition);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability> selectCapabilityDependency() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilityDependency);
  }

  public CISCapability setCapabilityDependency(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability> capabilityDependency) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilityDependency, capabilityDependency);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability selectCapabilitySpecialisation() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilitySpecialisation);
  }

  public CISCapability setCapabilitySpecialisation(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability capabilitySpecialisation) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilitySpecialisation, capabilitySpecialisation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public CISCapability setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public CISCapability setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public CISCapability setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CISCapability setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilityComposition, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilityDependency, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.Capability_capabilitySpecialisation, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,70fc7e57-bc80-11e6-beb6-85da12323ce9,WnDzjfc8cwMo54+05SFEKYceCIw=] */
