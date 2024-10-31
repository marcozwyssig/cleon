package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class View extends DynamicResource implements IView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IView>() {
    
    @Override
    public IView create() {
      return new View();
    }
    
    @Override
    public IView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new View(resourceRepository, resource);
    }
  
  };

  public View() {
    super(IView.TYPE_ID);
  }
  
  public View(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IView.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAlias() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AliasAware_alias);
  }
    
  public void setAlias(java.lang.String alias) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AliasAware_alias, alias);
  }

  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Boolean selectUsed() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_used);
  }
    
  public void setUsed(java.lang.Boolean used) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_used, used);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public View setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public View setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement selectFrom() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_from);
  }

  public View setFrom(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement from) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_from, from);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IGroup_By selectGroup() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_group);
  }

  public View setGroup(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IGroup_By group) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_group, group);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoin> selectJoin() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoin.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_join);
  }

  public View setJoin(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoin> join) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_join, join);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOrderBy selectOrder() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOrderBy.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.View_order);
  }

  public View setOrder(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOrderBy order) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.View_order, order);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public View setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect selectSelect() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_select);
  }

  public View setSelect(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect select) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_select, select);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public View setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public View setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IWhere selectWhere() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IWhere.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.WhereAware_where);
  }

  public View setWhere(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IWhere where) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.WhereAware_where, where);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AliasAware_alias, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_used, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_from, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IGroup_By.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_group, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IJoin.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_join, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOrderBy.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.View_order, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ViewBase_select, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IWhere.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.WhereAware_where, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView selectToMeOrder(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOrderBy object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.View_order, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d1f10a4f-d0ca-11ee-a38e-0b82bafb3097,PLkqKKrYRFYtpqCUK5NdXxGN5yE=] */
