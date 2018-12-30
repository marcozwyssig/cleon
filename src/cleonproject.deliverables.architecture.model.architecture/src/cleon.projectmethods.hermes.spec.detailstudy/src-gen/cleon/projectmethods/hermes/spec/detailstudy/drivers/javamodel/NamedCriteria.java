package cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedCriteria extends DynamicResource implements INamedCriteria {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedCriteria> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedCriteria>() {
    
    @Override
    public INamedCriteria create() {
      return new NamedCriteria();
    }
    
    @Override
    public INamedCriteria create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedCriteria(resourceRepository, resource);
    }
  
  };

  public NamedCriteria() {
    super(INamedCriteria.TYPE_ID);
  }
  
  public NamedCriteria(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedCriteria.TYPE_ID);
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
  public java.lang.Integer selectWeighting() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.DriversPackage.WeightingAware_weighting);
  }
    
  public void setWeighting(java.lang.Integer weighting) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.detailstudy.drivers.DriversPackage.WeightingAware_weighting, weighting);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedCriteria setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.DriversPackage.WeightingAware_weighting, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,nzZVvQtXkZICdutts4eB651vj/4=] */
