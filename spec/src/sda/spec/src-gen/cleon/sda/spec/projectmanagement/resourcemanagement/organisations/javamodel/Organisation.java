package cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Organisation extends DynamicResource implements IOrganisation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation>() {
    
    @Override
    public IOrganisation create() {
      return new Organisation();
    }
    
    @Override
    public IOrganisation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Organisation(resourceRepository, resource);
    }
  
  };

  public Organisation() {
    super(IOrganisation.TYPE_ID);
  }
  
  public Organisation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganisation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation> selectSubOrganisation() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation.class, cleon.sda.spec.projectmanagement.resourcemanagement.organisations.OrganisationsPackage.Organisation_subOrganisation);
  }

  public Organisation setSubOrganisation(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation> subOrganisation) {
    _setList(cleon.sda.spec.projectmanagement.resourcemanagement.organisations.OrganisationsPackage.Organisation_subOrganisation, subOrganisation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Organisation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation.class, cleon.sda.spec.projectmanagement.resourcemanagement.organisations.OrganisationsPackage.Organisation_subOrganisation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation selectToMeSubOrganisation(cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation.class, cleon.sda.spec.projectmanagement.resourcemanagement.organisations.OrganisationsPackage.Organisation_subOrganisation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cbb98f3c-c768-11e5-b3f9-43c5a0896ea1,TQjIvJSQgOImGKlLbfB7f5O82KA=] */
