package cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Defect extends DynamicResource implements IDefect {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefect> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefect>() {
    
    @Override
    public IDefect create() {
      return new Defect();
    }
    
    @Override
    public IDefect create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Defect(resourceRepository, resource);
    }
  
  };

  public Defect() {
    super(IDefect.TYPE_ID);
  }
  
  public Defect(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDefect.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectEnvironment() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_environment);
  }
    
  public void setEnvironment(java.lang.String environment) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_environment, environment);
  }

  @Override
  public java.lang.Integer selectEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_estimate);
  }
    
  public void setEstimate(java.lang.Integer estimate) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_estimate, estimate);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference, reference);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis);
  }

  public Defect setAnalysis(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText analysis) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, analysis);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Defect setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IClassification.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_classification);
  }

  public Defect setClassification(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IClassification classification) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_classification, classification);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectFoundBy() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_foundBy);
  }

  public Defect setFoundBy(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson foundBy) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_foundBy, foundBy);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Defect setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.IParagraph selectNoParagraph() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph);
  }

  public Defect setNoParagraph(cleon.doc.spec.paragraph.javamodel.IParagraph noParagraph) {
    _setSingle(cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, noParagraph);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IObservation selectObservation() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IObservation.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_observation);
  }

  public Defect setObservation(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IObservation observation) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_observation, observation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Defect setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectOwner() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner);
  }

  public Defect setOwner(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> owner) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Defect setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IReproducibility selectReproducibility() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IReproducibility.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_reproducibility);
  }

  public Defect setReproducibility(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IReproducibility reproducibility) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_reproducibility, reproducibility);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectResolution() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_resolution);
  }

  public Defect setResolution(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText resolution) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_resolution, resolution);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Defect setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_environment, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_estimate, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IClassification.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_classification, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_foundBy, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IObservation.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_observation, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IReproducibility.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_reproducibility, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_resolution, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect selectToMeReproducibility(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IReproducibility object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_reproducibility, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect selectToMeResolution(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_resolution, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect> selectToMeFoundBy(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_foundBy, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect> selectToMeClassification(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IClassification object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_classification, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect> selectToMeObservation(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IObservation object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect.class, cleon.sda.spec.projectmanagement.scope.backlog.defect.DefectPackage.Defect_observation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,484dda11-ff9c-11e4-ac0a-959b440f987f,l6nD2zMXzN41a+BGkNVkijzHjNc=] */
