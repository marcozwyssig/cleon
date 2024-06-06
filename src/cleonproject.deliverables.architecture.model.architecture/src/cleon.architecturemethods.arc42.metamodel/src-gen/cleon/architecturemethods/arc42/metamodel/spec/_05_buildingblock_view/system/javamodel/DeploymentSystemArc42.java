package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentSystemArc42 extends DynamicResource implements IDeploymentSystemArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentSystemArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentSystemArc42>() {
    
    @Override
    public IDeploymentSystemArc42 create() {
      return new DeploymentSystemArc42();
    }
    
    @Override
    public IDeploymentSystemArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentSystemArc42(resourceRepository, resource);
    }
  
  };

  public DeploymentSystemArc42() {
    super(IDeploymentSystemArc42.TYPE_ID);
  }
  
  public DeploymentSystemArc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentSystemArc42.TYPE_ID);
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

  public DeploymentSystemArc42 setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentSystemArc42 setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentSystemArc42 setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentSystemArc42 setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentSystemArc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystemConfiguration selectUsedDeploymentMethod() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.DeploymentSystemArc42_usedDeploymentMethod);
  }

  public DeploymentSystemArc42 setUsedDeploymentMethod(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystemConfiguration usedDeploymentMethod) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.DeploymentSystemArc42_usedDeploymentMethod, usedDeploymentMethod);
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
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.DeploymentSystemArc42_usedDeploymentMethod, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentSystemArc42> selectToMeUsedDeploymentMethod(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentSystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.DeploymentSystemArc42_usedDeploymentMethod, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,33c30f60-fe58-11ea-abcb-bfad67a56d79,VtxfcfSQlTBS4fjeHTgyt4R7ztU=] */
