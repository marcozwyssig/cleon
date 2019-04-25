package cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuildingBlockDependenciesDiagram extends DynamicResource implements IBuildingBlockDependenciesDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockDependenciesDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockDependenciesDiagram>() {
    
    @Override
    public IBuildingBlockDependenciesDiagram create() {
      return new BuildingBlockDependenciesDiagram();
    }
    
    @Override
    public IBuildingBlockDependenciesDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuildingBlockDependenciesDiagram(resourceRepository, resource);
    }
  
  };

  public BuildingBlockDependenciesDiagram() {
    super(IBuildingBlockDependenciesDiagram.TYPE_ID);
  }
  
  public BuildingBlockDependenciesDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuildingBlockDependenciesDiagram.TYPE_ID);
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

  public BuildingBlockDependenciesDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BuildingBlockDependenciesDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0091c2c7-0e17-11e9-8b4c-f9aec93d8b56,LqWxAvETFp9Al84CGlzVj2nD+/E=] */
