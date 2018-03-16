package cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionBuildingBlockComponentDecomposite extends DynamicResource implements ISolutionBuildingBlockComponentDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockComponentDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockComponentDecomposite>() {
    
    @Override
    public ISolutionBuildingBlockComponentDecomposite create() {
      return new SolutionBuildingBlockComponentDecomposite();
    }
    
    @Override
    public ISolutionBuildingBlockComponentDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionBuildingBlockComponentDecomposite(resourceRepository, resource);
    }
  
  };

  public SolutionBuildingBlockComponentDecomposite() {
    super(ISolutionBuildingBlockComponentDecomposite.TYPE_ID);
  }
  
  public SolutionBuildingBlockComponentDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionBuildingBlockComponentDecomposite.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SolutionBuildingBlockComponentDecomposite setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent selectInto() {
    return _getSingle(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into);
  }

  public SolutionBuildingBlockComponentDecomposite setInto(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent into) {
    _setSingle(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionBuildingBlockComponentDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite selectToMeInto(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6437681b-33a2-11e6-94cd-fbf6c8ccd08d,3vpmrJHsdY57So/xDtaVixDAB4k=] */
