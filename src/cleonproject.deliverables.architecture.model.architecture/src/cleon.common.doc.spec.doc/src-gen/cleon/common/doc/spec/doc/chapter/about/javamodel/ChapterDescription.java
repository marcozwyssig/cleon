package cleon.common.doc.spec.doc.chapter.about.javamodel;

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

  // relations
  
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
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8fde99d-0787-11e9-96ce-190a492a5193,ALCuZ1huYxoZGThK8q/bJdBQxb0=] */
