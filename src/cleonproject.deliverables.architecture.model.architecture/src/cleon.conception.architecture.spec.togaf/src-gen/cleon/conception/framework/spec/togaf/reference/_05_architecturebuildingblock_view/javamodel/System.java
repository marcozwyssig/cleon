package cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System extends DynamicResource implements ISystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem>() {
    
    @Override
    public ISystem create() {
      return new System();
    }
    
    @Override
    public ISystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System(resourceRepository, resource);
    }
  
  };

  public System() {
    super(ISystem.TYPE_ID);
  }
  
  public System(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite> selectDecompose() {
    return _getList(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_decompose);
  }

  public System setDecompose(java.util.List<? extends cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite> decompose) {
    _setList(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public System setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDependency.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_hasDependency);
  }

  public System setHasDependency(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_decompose, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDependency.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.javamodel.ISystem selectToMeDecompose(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.javamodel.ISystem.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_decompose, object.getResource());
  }
  
  public static cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.javamodel.ISystem selectToMeHasDependency(cleon.conception.architecture.spec.buildingblock.javamodel.IDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.javamodel.ISystem.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view._05_architecturebuildingblock_viewPackage.System_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0854a116-4a7d-11e6-b2ea-f94c9b140b76,k+QPoS+9ULy9T8pbGfZ/WZQ5TyA=] */
