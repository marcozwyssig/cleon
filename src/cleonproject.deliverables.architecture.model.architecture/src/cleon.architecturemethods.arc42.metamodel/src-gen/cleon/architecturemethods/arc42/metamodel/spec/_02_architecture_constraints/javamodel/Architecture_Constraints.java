package cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Architecture_Constraints extends DynamicResource implements IArchitecture_Constraints {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitecture_Constraints> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitecture_Constraints>() {
    
    @Override
    public IArchitecture_Constraints create() {
      return new Architecture_Constraints();
    }
    
    @Override
    public IArchitecture_Constraints create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Architecture_Constraints(resourceRepository, resource);
    }
  
  };

  public Architecture_Constraints() {
    super(IArchitecture_Constraints.TYPE_ID);
  }
  
  public Architecture_Constraints(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArchitecture_Constraints.TYPE_ID);
  }

  // attributes
  
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Architecture_Constraints setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Architecture_Constraints setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IOrganizationalConstraints selectOrganizationalConstraints() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IOrganizationalConstraints.class, cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_organizationalConstraints);
  }

  public Architecture_Constraints setOrganizationalConstraints(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IOrganizationalConstraints organizationalConstraints) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_organizationalConstraints, organizationalConstraints);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Architecture_Constraints setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.ITechnicalConstraints selectTechnicalConstraints() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.ITechnicalConstraints.class, cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_technicalConstraints);
  }

  public Architecture_Constraints setTechnicalConstraints(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.ITechnicalConstraints technicalConstraints) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_technicalConstraints, technicalConstraints);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Architecture_Constraints setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IOrganizationalConstraints.class, cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_organizationalConstraints, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.ITechnicalConstraints.class, cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_technicalConstraints, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints selectToMeTechnicalConstraints(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.ITechnicalConstraints object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_technicalConstraints, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints selectToMeOrganizationalConstraints(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IOrganizationalConstraints object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints._02_architecture_constraintsPackage.Architecture_aE_Constraints_organizationalConstraints, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b06163b8-ffc9-11e5-bd7b-8b0acf27d441,IZifH0oizcEKRa2cOP5Rk+E2CZE=] */
