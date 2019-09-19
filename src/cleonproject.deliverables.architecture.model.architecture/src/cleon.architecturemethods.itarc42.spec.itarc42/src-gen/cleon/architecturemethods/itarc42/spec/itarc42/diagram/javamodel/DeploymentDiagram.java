package cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentDiagram extends DynamicResource implements IDeploymentDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentDiagram>() {
    
    @Override
    public IDeploymentDiagram create() {
      return new DeploymentDiagram();
    }
    
    @Override
    public IDeploymentDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentDiagram(resourceRepository, resource);
    }
  
  };

  public DeploymentDiagram() {
    super(IDeploymentDiagram.TYPE_ID);
  }
  
  public DeploymentDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentDiagram.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectLeftToRight() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight);
  }
    
  public void setLeftToRight(java.lang.Boolean leftToRight) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight, leftToRight);
  }

  @Override
  public java.lang.Boolean selectOnlyOneLayer() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.DeploymentDiagram_onlyOneLayer);
  }
    
  public void setOnlyOneLayer(java.lang.Boolean onlyOneLayer) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.DeploymentDiagram_onlyOneLayer, onlyOneLayer);
  }

  @Override
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, path);
  }

  @Override
  public java.lang.Boolean selectRenderHidden() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.DeploymentDiagram_renderHidden);
  }
    
  public void setRenderHidden(java.lang.Boolean renderHidden) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.DeploymentDiagram_renderHidden, renderHidden);
  }

  @Override
  public java.lang.String selectScale() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale);
  }
    
  public void setScale(java.lang.String scale) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale, scale);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements);
  }

  public DeploymentDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.DeploymentDiagram_onlyOneLayer, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.itarc42.spec.itarc42.diagram.DiagramPackage.DeploymentDiagram_renderHidden, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1cf628c3-0aa0-11e9-8a91-633e556ac68f,aZJggkrGfQqNADHAL5REubOUOGY=] */
