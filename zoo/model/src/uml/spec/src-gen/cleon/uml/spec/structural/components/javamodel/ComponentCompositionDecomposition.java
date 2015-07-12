package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentCompositionDecomposition extends DynamicResource implements IComponentCompositionDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionDecomposition>() {
    
    @Override
    public IComponentCompositionDecomposition create() {
      return new ComponentCompositionDecomposition();
    }
    
    @Override
    public IComponentCompositionDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentCompositionDecomposition(resourceRepository, resource);
    }
  
  };

  public ComponentCompositionDecomposition() {
    super(IComponentCompositionDecomposition.TYPE_ID);
  }
  
  public ComponentCompositionDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentCompositionDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public ComponentCompositionDecomposition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.components.javamodel.IAbstractComponent selectDecompose() {
    return _getSingle(cleon.uml.spec.structural.components.javamodel.IAbstractComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDecomposition_decompose);
  }

  public ComponentCompositionDecomposition setDecompose(cleon.uml.spec.structural.components.javamodel.IAbstractComponent decompose) {
    _setSingle(cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDecomposition_decompose, decompose);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentCompositionDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public ComponentCompositionDecomposition setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.components.javamodel.IAbstractComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDecomposition_decompose, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.components.javamodel.IComponentCompositionDecomposition selectToMeDecompose(cleon.uml.spec.structural.components.javamodel.IAbstractComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.components.javamodel.IComponentCompositionDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDecomposition_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,096bdd9e-174e-11e5-9ca7-d1bb57b73459,rzydoN20SJYcP4jQ7RsE6aJQwgU=] */
