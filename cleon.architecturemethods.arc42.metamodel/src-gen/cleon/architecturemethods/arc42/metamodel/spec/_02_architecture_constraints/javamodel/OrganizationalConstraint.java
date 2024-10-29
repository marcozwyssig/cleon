package cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OrganizationalConstraint extends DynamicResource implements IOrganizationalConstraint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganizationalConstraint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganizationalConstraint>() {
    
    @Override
    public IOrganizationalConstraint create() {
      return new OrganizationalConstraint();
    }
    
    @Override
    public IOrganizationalConstraint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OrganizationalConstraint(resourceRepository, resource);
    }
  
  };

  public OrganizationalConstraint() {
    super(IOrganizationalConstraint.TYPE_ID);
  }
  
  public OrganizationalConstraint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganizationalConstraint.TYPE_ID);
  }

  // attributes
  
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OrganizationalConstraint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e6f2152e-eaa8-11e8-88d3-bfc6b992bdec,l+8xJKyDTRWrriokDGOpkZWCvAg=] */
