package cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuildingBlockOverviewDiagram extends DynamicResource implements IBuildingBlockOverviewDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockOverviewDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockOverviewDiagram>() {
    
    @Override
    public IBuildingBlockOverviewDiagram create() {
      return new BuildingBlockOverviewDiagram();
    }
    
    @Override
    public IBuildingBlockOverviewDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuildingBlockOverviewDiagram(resourceRepository, resource);
    }
  
  };

  public BuildingBlockOverviewDiagram() {
    super(IBuildingBlockOverviewDiagram.TYPE_ID);
  }
  
  public BuildingBlockOverviewDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuildingBlockOverviewDiagram.TYPE_ID);
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
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, path);
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

  public BuildingBlockOverviewDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BuildingBlockOverviewDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5cf9b709-0a93-11e9-9f72-e5610a9d4cd3,p/UOiSwuvEenSV7mMxAIcMuVtxw=] */
