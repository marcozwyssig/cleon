package cleon.sda.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Drivers extends DynamicResource implements IDrivers {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDrivers> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDrivers>() {
    
    @Override
    public IDrivers create() {
      return new Drivers();
    }
    
    @Override
    public IDrivers create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Drivers(resourceRepository, resource);
    }
  
  };

  public Drivers() {
    super(IDrivers.TYPE_ID);
  }
  
  public Drivers(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDrivers.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Drivers setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IContext selectContext() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IContext.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_context);
  }

  public Drivers setContext(cleon.sda.spec.analysis.solution.drivers.javamodel.IContext context) {
    _setSingle(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_context, context);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Drivers setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoals selectGoal() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoals.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_goal);
  }

  public Drivers setGoal(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoals goal) {
    _setSingle(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_goal, goal);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.ISubDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public Drivers setNoDocuments(cleon.doc.spec.document.javamodel.ISubDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.IParagraph selectNoParagraph() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph);
  }

  public Drivers setNoParagraph(cleon.doc.spec.paragraph.javamodel.IParagraph noParagraph) {
    _setSingle(cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, noParagraph);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Drivers setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Drivers setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.analysis.solution.drivers.javamodel.ISource> selectSources() {
    return _getList(cleon.sda.spec.analysis.solution.drivers.javamodel.ISource.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_sources);
  }

  public Drivers setSources(java.util.List<? extends cleon.sda.spec.analysis.solution.drivers.javamodel.ISource> sources) {
    _setList(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, sources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Drivers setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Drivers setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IContext.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_context, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoals.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_goal, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.sda.spec.analysis.solution.drivers.javamodel.ISource.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeContext(cleon.sda.spec.analysis.solution.drivers.javamodel.IContext object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_context, object.getResource());
  }
  
  public static cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeGoal(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_goal, object.getResource());
  }
  
  public static cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeSources(cleon.sda.spec.analysis.solution.drivers.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,VMoOnonBwfGDN6511xSSM7vbg0U=] */
