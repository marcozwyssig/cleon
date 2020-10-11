package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivityPermission extends DynamicResource implements IActivityPermission {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityPermission> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityPermission>() {
    
    @Override
    public IActivityPermission create() {
      return new ActivityPermission();
    }
    
    @Override
    public IActivityPermission create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivityPermission(resourceRepository, resource);
    }
  
  };

  public ActivityPermission() {
    super(IActivityPermission.TYPE_ID);
  }
  
  public ActivityPermission(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivityPermission.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ActivityPermission setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ActivityPermission setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public ActivityPermission setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public ActivityPermission setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ActivityPermission setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission selectPermission() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityPermission_permission);
  }

  public ActivityPermission setPermission(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission permission) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityPermission_permission, permission);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ActivityPermission setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivityPermission setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityPermission_permission, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> selectToMePermission(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityPermission_permission, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b898fc57-7f22-11e9-9a52-07d4b074defc,tGaMPZF5+ZeGea9RqzsujZJGVck=] */
