package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Table extends DynamicResource implements ITable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable>() {
    
    @Override
    public ITable create() {
      return new Table();
    }
    
    @Override
    public ITable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Table(resourceRepository, resource);
    }
  
  };

  public Table() {
    super(ITable.TYPE_ID);
  }
  
  public Table(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITable.TYPE_ID);
  }

  // attributes
  
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Table setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IColumn> selectColumns() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_columns);
  }

  public Table setColumns(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IColumn> columns) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_columns, columns);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Table setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Table setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Table setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IPrimaryKey selectPrimary_key() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IPrimaryKey.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_primary_aE_key);
  }

  public Table setPrimary_key(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IPrimaryKey primary_key) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_primary_aE_key, primary_key);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Table setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_columns, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IPrimaryKey.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_primary_aE_key, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.ITable selectToMeColumns(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IColumn object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_columns, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.ITable selectToMePrimary_key(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IPrimaryKey object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Table_primary_aE_key, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,09a46257-b934-11ee-a0d0-e953bcbfaeef,9eWj+SvKMLQ9tDRxsEbXsbR3pGE=] */
