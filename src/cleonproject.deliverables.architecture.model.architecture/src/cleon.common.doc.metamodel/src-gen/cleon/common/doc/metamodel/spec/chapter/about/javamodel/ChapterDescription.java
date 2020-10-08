package cleon.common.doc.metamodel.spec.chapter.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ChapterDescription extends DynamicResource implements IChapterDescription {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChapterDescription> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChapterDescription>() {
    
    @Override
    public IChapterDescription create() {
      return new ChapterDescription();
    }
    
    @Override
    public IChapterDescription create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ChapterDescription(resourceRepository, resource);
    }
  
  };

  public ChapterDescription() {
    super(IChapterDescription.TYPE_ID);
  }
  
  public ChapterDescription(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChapterDescription.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectAbstractChapter() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.ChapterDescription_abstractChapter);
  }

  public ChapterDescription setAbstractChapter(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.ChapterDescription_abstractChapter, abstractChapter);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ChapterDescription setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ChapterDescription setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.ChapterDescription_abstractChapter, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.doc.metamodel.spec.chapter.about.javamodel.IChapterDescription> selectToMeAbstractChapter(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.metamodel.spec.chapter.about.javamodel.IChapterDescription.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.ChapterDescription_abstractChapter, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8fde99d-0787-11e9-96ce-190a492a5193,e55dt4ir/yBnCuDJYMqK+IvJPiQ=] */
