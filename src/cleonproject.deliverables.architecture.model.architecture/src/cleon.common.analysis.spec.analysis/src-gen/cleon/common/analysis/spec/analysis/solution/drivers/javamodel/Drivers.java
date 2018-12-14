package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

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

  public Drivers setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext selectContext() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context);
  }

  public Drivers setContext(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext context) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context, context);
    return this;
  }
    
  @Override
  public cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ICriterias selectCriterias() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ICriterias.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_criterias);
  }

  public Drivers setCriterias(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ICriterias criterias) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Drivers setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs);
  }

  public Drivers setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource> selectSources() {
    return _getList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources);
  }

  public Drivers setSources(java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource> sources) {
    _setList(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, sources);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context, visitor);
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ICriterias.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_criterias, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, visitor);
    _acceptList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeContext(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context, object.getResource());
  }
  
  public static cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeCriterias(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ICriterias object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_criterias, object.getResource());
  }
  
  public static cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeSources(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,ilZlv9XVg8mH5YgKFfyWkpqDsak=] */
