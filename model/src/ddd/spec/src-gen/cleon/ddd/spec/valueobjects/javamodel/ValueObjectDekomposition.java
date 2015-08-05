package cleon.ddd.spec.valueobjects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ValueObjectDekomposition extends DynamicResource implements IValueObjectDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDekomposition>() {
    
    @Override
    public IValueObjectDekomposition create() {
      return new ValueObjectDekomposition();
    }
    
    @Override
    public IValueObjectDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ValueObjectDekomposition(resourceRepository, resource);
    }
  
  };

  public ValueObjectDekomposition() {
    super(IValueObjectDekomposition.TYPE_ID);
  }
  
  public ValueObjectDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IValueObjectDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public ValueObjectDekomposition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectClass() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.PackageInClassifierDecomposition_class);
  }

  public ValueObjectDekomposition setClass(cleon.uml.spec.structural.classes.javamodel.IClassifier class_) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.PackageInClassifierDecomposition_class, class_);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock selectInto() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_into);
  }

  public ValueObjectDekomposition setInto(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock into) {
    _setSingle(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_into, into);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public ValueObjectDekomposition setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public ValueObjectDekomposition setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ValueObjectDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.ddd.spec.valueobjects.javamodel.IValueObject selectValueObject() {
    return _getSingle(cleon.ddd.spec.valueobjects.javamodel.IValueObject.class, cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject);
  }

  public ValueObjectDekomposition setValueObject(cleon.ddd.spec.valueobjects.javamodel.IValueObject valueObject) {
    _setSingle(cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject, valueObject);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.PackageInClassifierDecomposition_class, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_into, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.ddd.spec.valueobjects.javamodel.IValueObject.class, cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition selectToMeValueObject(cleon.ddd.spec.valueobjects.javamodel.IValueObject object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition.class, cleon.ddd.spec.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_valueObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,172528f4-266d-11e5-95dc-8f1cdbd9db54,Aj5aPlYQHdHW0B1PMbu7yy8T/1E=] */
