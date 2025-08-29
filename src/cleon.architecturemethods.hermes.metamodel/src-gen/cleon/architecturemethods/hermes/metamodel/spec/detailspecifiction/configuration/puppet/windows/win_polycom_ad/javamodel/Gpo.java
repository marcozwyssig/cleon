package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Gpo extends DynamicResource implements IGpo {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGpo> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGpo>() {
    
    @Override
    public IGpo create() {
      return new Gpo();
    }
    
    @Override
    public IGpo create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Gpo(resourceRepository, resource);
    }
  
  };

  public Gpo() {
    super(IGpo.TYPE_ID);
  }
  
  public Gpo(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGpo.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectLinked_ou() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.Win_polycom_adPackage.Gpo_linked_aE_ou);
  }
    
  public void setLinked_ou(java.util.List<java.lang.String> linked_ou) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.Win_polycom_adPackage.Gpo_linked_aE_ou, linked_ou);
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
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IAbstractMember> selectLinked_permissions() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.Win_polycom_adPackage.Gpo_linked_aE_permissions);
  }

  public Gpo setLinked_permissions(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IAbstractMember> linked_permissions) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.Win_polycom_adPackage.Gpo_linked_aE_permissions, linked_permissions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Gpo setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.Win_polycom_adPackage.Gpo_linked_aE_ou, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.Win_polycom_adPackage.Gpo_linked_aE_permissions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IGpo> selectToMeLinked_permissions(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IAbstractMember object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IGpo.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.Win_polycom_adPackage.Gpo_linked_aE_permissions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4189c76e-63c9-11f0-87c2-0f8d66c50b66,P4hF+7EEoMNHnWLVgLzFyXcHANs=] */
