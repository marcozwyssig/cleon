package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FWStandardServiceGroup extends DynamicResource implements IFWStandardServiceGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFWStandardServiceGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFWStandardServiceGroup>() {
    
    @Override
    public IFWStandardServiceGroup create() {
      return new FWStandardServiceGroup();
    }
    
    @Override
    public IFWStandardServiceGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FWStandardServiceGroup(resourceRepository, resource);
    }
  
  };

  public FWStandardServiceGroup() {
    super(IFWStandardServiceGroup.TYPE_ID);
  }
  
  public FWStandardServiceGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFWStandardServiceGroup.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
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
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IFWStandardService> selectFwservices() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IFWStandardService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.FWStandardServiceGroup_fwservices);
  }

  public FWStandardServiceGroup setFwservices(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IFWStandardService> fwservices) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.FWStandardServiceGroup_fwservices, fwservices);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectServices() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.AbstractServiceGroup_services);
  }

  public FWStandardServiceGroup setServices(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> services) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.AbstractServiceGroup_services, services);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FWStandardServiceGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IFWStandardService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.FWStandardServiceGroup_fwservices, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IFWStandardServiceGroup> selectToMeFwservices(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IFWStandardService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IFWStandardServiceGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.FWStandardServiceGroup_fwservices, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,51a930dd-a0ec-11ea-8daa-afb4679c3497,oinsNLRZuwICmR13d3yAyi0dm9Q=] */
