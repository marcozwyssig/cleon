package cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Supplies extends DynamicResource implements ISupplies {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplies> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplies>() {
    
    @Override
    public ISupplies create() {
      return new Supplies();
    }
    
    @Override
    public ISupplies create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Supplies(resourceRepository, resource);
    }
  
  };

  public Supplies() {
    super(ISupplies.TYPE_ID);
  }
  
  public Supplies(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISupplies.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public Supplies setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Supplies setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Supplies setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupply> selectSupply() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupply.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.SupplyPackage.Supplies_supply);
  }

  public Supplies setSupply(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupply> supply) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.SupplyPackage.Supplies_supply, supply);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Supplies setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupply.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.SupplyPackage.Supplies_supply, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies selectToMeSupply(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupply object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.SupplyPackage.Supplies_supply, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,13d24c1c-0e15-11e6-ae01-ef640c578b9b,tgnBGn8QD0em2cuBAnVpiVDMXPo=] */
