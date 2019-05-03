package cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuildingBlockSystemOverviewDiagram extends DynamicResource implements IBuildingBlockSystemOverviewDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockSystemOverviewDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockSystemOverviewDiagram>() {
    
    @Override
    public IBuildingBlockSystemOverviewDiagram create() {
      return new BuildingBlockSystemOverviewDiagram();
    }
    
    @Override
    public IBuildingBlockSystemOverviewDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuildingBlockSystemOverviewDiagram(resourceRepository, resource);
    }
  
  };

  public BuildingBlockSystemOverviewDiagram() {
    super(IBuildingBlockSystemOverviewDiagram.TYPE_ID);
  }
  
  public BuildingBlockSystemOverviewDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuildingBlockSystemOverviewDiagram.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, path);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements);
  }

  public BuildingBlockSystemOverviewDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystem selectSystem() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystem.class, cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system);
  }

  public BuildingBlockSystemOverviewDiagram setSystem(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystem system) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system, system);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BuildingBlockSystemOverviewDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystem.class, cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IBuildingBlockSystemOverviewDiagram> selectToMeSystem(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystem object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IBuildingBlockSystemOverviewDiagram.class, cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dec338dd-02db-11e9-9e58-33d596257b14,ZiWONdZ6wYrPiYjJk7FAzMznup4=] */
