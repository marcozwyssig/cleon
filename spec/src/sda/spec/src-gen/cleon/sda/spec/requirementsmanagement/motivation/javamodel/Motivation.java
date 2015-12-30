package cleon.sda.spec.requirementsmanagement.motivation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Motivation extends DynamicResource implements IMotivation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMotivation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMotivation>() {
    
    @Override
    public IMotivation create() {
      return new Motivation();
    }
    
    @Override
    public IMotivation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Motivation(resourceRepository, resource);
    }
  
  };

  public Motivation() {
    super(IMotivation.TYPE_ID);
  }
  
  public Motivation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMotivation.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Motivation setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Motivation setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDrivers.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_drivers);
  }

  public Motivation setDrivers(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals selectGoals() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_goals);
  }

  public Motivation setGoals(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals goals) {
    _setSingle(cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_goals, goals);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Motivation setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Motivation setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples selectPrinciples() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_principles);
  }

  public Motivation setPrinciples(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples principles) {
    _setSingle(cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_principles, principles);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources selectSources() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_sources);
  }

  public Motivation setSources(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources sources) {
    _setSingle(cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_sources, sources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Motivation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Motivation setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDrivers.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_drivers, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_goals, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_principles, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_sources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation selectToMePrinciples(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_principles, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation selectToMeSources(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_sources, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation selectToMeDrivers(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_drivers, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation selectToMeGoals(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation.class, cleon.sda.spec.requirementsmanagement.motivation.MotivationPackage.Motivation_goals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c7277d8d-a950-11e5-bda2-a7fc3bd7c783,9I2Ni/8liUvGPs1UC+sMrfkNtAM=] */
