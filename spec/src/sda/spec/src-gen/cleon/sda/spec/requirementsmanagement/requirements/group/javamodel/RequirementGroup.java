package cleon.sda.spec.requirementsmanagement.requirements.group.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementGroup extends DynamicResource implements IRequirementGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementGroup>() {
    
    @Override
    public IRequirementGroup create() {
      return new RequirementGroup();
    }
    
    @Override
    public IRequirementGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementGroup(resourceRepository, resource);
    }
  
  };

  public RequirementGroup() {
    super(IRequirementGroup.TYPE_ID);
  }
  
  public RequirementGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementGroup.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3da3b4e2-ff9b-11e4-ac0a-959b440f987f,AYBT/WSit88u54bLgySYC0sTVJ0=] */
