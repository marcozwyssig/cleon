package cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Solutions extends DynamicResource implements ISolutions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutions>() {
    
    @Override
    public ISolutions create() {
      return new Solutions();
    }
    
    @Override
    public ISolutions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Solutions(resourceRepository, resource);
    }
  
  };

  public Solutions() {
    super(ISolutions.TYPE_ID);
  }
  
  public Solutions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutions.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite> selectDecompose() {
    return _getList(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose);
  }

  public Solutions setDecompose(java.util.List<? extends cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite> decompose) {
    _setList(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose, decompose);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Solutions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    // relations
    _acceptList(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.javamodel.ISolutions selectToMeDecompose(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.javamodel.ISolutions.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d6f6d790-4a7c-11e6-b2ea-f94c9b140b76,TeRfLh7ms9QNAMi/2y1SkR1vNxs=] */
