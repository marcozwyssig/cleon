package cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ManufacturerDecomposite extends DynamicResource implements IManufacturerDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturerDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturerDecomposite>() {
    
    @Override
    public IManufacturerDecomposite create() {
      return new ManufacturerDecomposite();
    }
    
    @Override
    public IManufacturerDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ManufacturerDecomposite(resourceRepository, resource);
    }
  
  };

  public ManufacturerDecomposite() {
    super(IManufacturerDecomposite.TYPE_ID);
  }
  
  public ManufacturerDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManufacturerDecomposite.TYPE_ID);
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

  public ManufacturerDecomposite setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer selectInto() {
    return _getSingle(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into);
  }

  public ManufacturerDecomposite setInto(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer into) {
    _setSingle(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ManufacturerDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite selectToMeInto(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite.class, cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b830d6f8-4372-11e6-a9d7-97cf4f7c398b,tfcRD74TgEtaP/Unqpna2Jr4fSw=] */
