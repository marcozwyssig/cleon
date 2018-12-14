package cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Risks extends DynamicResource implements IRisks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRisks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRisks>() {
    
    @Override
    public IRisks create() {
      return new Risks();
    }
    
    @Override
    public IRisks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Risks(resourceRepository, resource);
    }
  
  };

  public Risks() {
    super(IRisks.TYPE_ID);
  }
  
  public Risks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRisks.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public Risks setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Risks setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs);
  }

  public Risks setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk> selectRisks() {
    return _getList(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.RisksPackage.Risks_risks);
  }

  public Risks setRisks(java.util.List<? extends cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk> risks) {
    _setList(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.RisksPackage.Risks_risks, risks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Risks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.RisksPackage.Risks_risks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisks selectToMeRisks(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisks.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.RisksPackage.Risks_risks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,85df72cc-a7de-11e5-82dd-3b995d9c840c,TlBODya2YOx5fjmECyd8+WaeoWY=] */
