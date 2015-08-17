package cleon.analysis.spec.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Goal extends DynamicResource implements IGoal {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal>() {
    
    @Override
    public IGoal create() {
      return new Goal();
    }
    
    @Override
    public IGoal create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Goal(resourceRepository, resource);
    }
  
  };

  public Goal() {
    super(IGoal.TYPE_ID);
  }
  
  public Goal(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGoal.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public Goal setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectColumnOwns() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns);
  }

  public Goal setColumnOwns(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> columnOwns) {
    _setList(cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, columnOwns);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> selectDescription() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description);
  }

  public Goal setDescription(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> description) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, description);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph selectGoaldescription() {
    return _getSingle(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goaldescription);
  }

  public Goal setGoaldescription(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph goaldescription) {
    _setSingle(cleon.analysis.spec.drivers.DriversPackage.Goal_goaldescription, goaldescription);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph selectGoalname() {
    return _getSingle(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goalname);
  }

  public Goal setGoalname(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph goalname) {
    _setSingle(cleon.analysis.spec.drivers.DriversPackage.Goal_goalname, goalname);
    return this;
  }
    
  @Override
  public cleon.analysis.spec.drivers.javamodel.IGoalImportance selectImportance() {
    return _getSingle(cleon.analysis.spec.drivers.javamodel.IGoalImportance.class, cleon.analysis.spec.drivers.DriversPackage.Goal_importance);
  }

  public Goal setImportance(cleon.analysis.spec.drivers.javamodel.IGoalImportance importance) {
    _setSingle(cleon.analysis.spec.drivers.DriversPackage.Goal_importance, importance);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Goal setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public Goal setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Goal setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, visitor);
    _acceptSingle(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goaldescription, visitor);
    _acceptSingle(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goalname, visitor);
    _acceptSingle(cleon.analysis.spec.drivers.javamodel.IGoalImportance.class, cleon.analysis.spec.drivers.DriversPackage.Goal_importance, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.analysis.spec.drivers.javamodel.IGoal selectToMeGoalname(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goalname, object.getResource());
  }
  
  public static cleon.analysis.spec.drivers.javamodel.IGoal selectToMeGoaldescription(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goaldescription, object.getResource());
  }
  
  public static java.util.List<cleon.analysis.spec.drivers.javamodel.IGoal> selectToMeImportance(cleon.analysis.spec.drivers.javamodel.IGoalImportance object) {
    return _getToMeList(object.getRepository(), cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.drivers.DriversPackage.Goal_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,UDbftKEJMN2XUEvbeAAfRC4yl7Q=] */
