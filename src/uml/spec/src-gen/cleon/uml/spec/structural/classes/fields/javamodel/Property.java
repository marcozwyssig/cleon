package cleon.uml.spec.structural.classes.fields.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Property extends DynamicResource implements IProperty {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperty> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperty>() {
    
    @Override
    public IProperty create() {
      return new Property();
    }
    
    @Override
    public IProperty create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Property(resourceRepository, resource);
    }
  
  };

  public Property() {
    super(IProperty.TYPE_ID);
  }
  
  public Property(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProperty.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectGetter() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_getter);
  }
    
  public void setGetter(java.lang.Boolean getter) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_getter, getter);
  }

  @Override
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
  }

  @Override
  public java.lang.Boolean selectIsObsolete() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Obsolete_isObsolete);
  }
    
  public void setIsObsolete(java.lang.Boolean isObsolete) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Obsolete_isObsolete, isObsolete);
  }

  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectSetter() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_setter);
  }
    
  public void setSetter(java.lang.Boolean setter) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_setter, setter);
  }

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.association.javamodel.ICollectionType selectAsCollection() {
    return _getSingle(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Property_asCollection);
  }

  public Property setAsCollection(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType asCollection) {
    _setSingle(cleon.uml.spec.structural.classes.fields.FieldsPackage.Property_asCollection, asCollection);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public Property setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> selectDescription() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description);
  }

  public Property setDescription(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> description) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, description);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Property setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Property setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public Property setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectReturnType() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.ClassesPackage.ReturnType_returnType);
  }

  public Property setReturnType(cleon.uml.spec.structural.classes.javamodel.IClassifier returnType) {
    _setSingle(cleon.uml.spec.structural.classes.ClassesPackage.ReturnType_returnType, returnType);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectType() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_type);
  }

  public Property setType(cleon.uml.spec.structural.classes.javamodel.IClassifier type) {
    _setSingle(cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Property setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_getter, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Obsolete_isObsolete, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_setter, visitor);
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Property_asCollection, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.ClassesPackage.ReturnType_returnType, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Field_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.structural.classes.fields.javamodel.IProperty> selectToMeAsCollection(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.classes.fields.javamodel.IProperty.class, cleon.uml.spec.structural.classes.fields.FieldsPackage.Property_asCollection, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,123c8e93-13ba-11e3-bec7-f1e135382475,9VKO/fBtd1wD2MwvsDH6ceCPtb0=] */
