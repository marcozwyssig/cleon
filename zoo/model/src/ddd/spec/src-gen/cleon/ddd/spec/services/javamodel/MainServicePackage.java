package cleon.ddd.spec.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MainServicePackage extends DynamicResource implements IMainServicePackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMainServicePackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMainServicePackage>() {
    
    @Override
    public IMainServicePackage create() {
      return new MainServicePackage();
    }
    
    @Override
    public IMainServicePackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MainServicePackage(resourceRepository, resource);
    }
  
  };

  public MainServicePackage() {
    super(IMainServicePackage.TYPE_ID);
  }
  
  public MainServicePackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMainServicePackage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public MainServicePackage setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> selectClasses() {
    return _getList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes);
  }

  public MainServicePackage setClasses(java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> classes) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public MainServicePackage setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes);
  }

  public MainServicePackage setParagraphes(java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.services.javamodel.IServicePackage> selectServicePackages() {
    return _getList(cleon.ddd.spec.services.javamodel.IServicePackage.class, cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_servicePackages);
  }

  public MainServicePackage setServicePackages(java.util.List<? extends cleon.ddd.spec.services.javamodel.IServicePackage> servicePackages) {
    _setList(cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_servicePackages, servicePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.javamodel.IDomainService> selectServices() {
    return _getList(cleon.ddd.spec.javamodel.IDomainService.class, cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_services);
  }

  public MainServicePackage setServices(java.util.List<? extends cleon.ddd.spec.javamodel.IDomainService> services) {
    _setList(cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_services, services);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public MainServicePackage setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> subPackages) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MainServicePackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public MainServicePackage setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes, visitor);
    _acceptList(cleon.ddd.spec.services.javamodel.IServicePackage.class, cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_servicePackages, visitor);
    _acceptList(cleon.ddd.spec.javamodel.IDomainService.class, cleon.ddd.spec.services.ServicesPackage.AbstractServicePackage_services, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2850329-01df-11e4-ab1e-81fd30785d6d,wmbd+KShlTmd1f6rWiycLh93CHE=] */
