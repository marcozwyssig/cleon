package cleon.architecturemethods.systemarc42.metamodel.spec.diagram.javamodel;

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
  public java.lang.Boolean selectLeftToRight() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_leftToRight);
  }
    
  public void setLeftToRight(java.lang.Boolean leftToRight) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_leftToRight, leftToRight);
  }

  @Override
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_path, path);
  }

  @Override
  public java.lang.String selectScale() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_scale);
  }
    
  public void setScale(java.lang.String scale) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_scale, scale);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public BuildingBlockSystemOverviewDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemWithLayers selectSystem() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemWithLayers.class, cleon.architecturemethods.systemarc42.metamodel.spec.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system);
  }

  public BuildingBlockSystemOverviewDiagram setSystem(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemWithLayers system) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system, system);
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
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_leftToRight, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_path, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_scale, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemWithLayers.class, cleon.architecturemethods.systemarc42.metamodel.spec.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.diagram.javamodel.IBuildingBlockSystemOverviewDiagram> selectToMeSystem(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemWithLayers object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.diagram.javamodel.IBuildingBlockSystemOverviewDiagram.class, cleon.architecturemethods.systemarc42.metamodel.spec.diagram.DiagramPackage.BuildingBlockSystemOverviewDiagram_system, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dec338dd-02db-11e9-9e58-33d596257b14,6Udx5vvLxDwjmLKK/f/s1vAF8qE=] */
