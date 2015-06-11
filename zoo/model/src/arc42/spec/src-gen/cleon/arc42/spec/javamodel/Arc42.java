package cleon.arc42.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Arc42 extends DynamicResource implements IArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArc42>() {
    
    @Override
    public IArc42 create() {
      return new Arc42();
    }
    
    @Override
    public IArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Arc42(resourceRepository, resource);
    }
  
  };

  public Arc42() {
    super(IArc42.TYPE_ID);
  }
  
  public Arc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArc42.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView selectBuildingBlockView() {
    return _getSingle(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView.class, cleon.arc42.spec.SpecPackage.arc42_buildingBlockView);
  }

  public Arc42 setBuildingBlockView(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView buildingBlockView) {
    _setSingle(cleon.arc42.spec.SpecPackage.arc42_buildingBlockView, buildingBlockView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Document_chapters);
  }

  public Arc42 setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Document_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Arc42 setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Arc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView.class, cleon.arc42.spec.SpecPackage.arc42_buildingBlockView, visitor);
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Document_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.arc42.spec.javamodel.IArc42 selectToMeBuildingBlockView(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec.javamodel.IArc42.class, cleon.arc42.spec.SpecPackage.arc42_buildingBlockView, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,I3o7Dh9y8P61Q72ZSz9VgFUcoTc=] */
