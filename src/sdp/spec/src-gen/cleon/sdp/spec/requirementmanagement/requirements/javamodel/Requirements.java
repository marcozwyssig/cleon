package cleon.sdp.spec.requirementmanagement.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Requirements extends DynamicResource implements IRequirements {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirements> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirements>() {
    
    @Override
    public IRequirements create() {
      return new Requirements();
    }
    
    @Override
    public IRequirements create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Requirements(resourceRepository, resource);
    }
  
  };

  public Requirements() {
    super(IRequirements.TYPE_ID);
  }
  
  public Requirements(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirements.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirementGroup selectRoot() {
    return _getSingle(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirementGroup.class, cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirements_root);
  }

  public Requirements setRoot(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirementGroup root) {
    _setSingle(cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirements_root, root);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Requirements setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirementGroup.class, cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirements_root, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirements selectToMeRoot(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirementGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirements.class, cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirements_root, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f92279cc-ff9a-11e4-ac0a-959b440f987f,QKbryGDOg/Sn2D+XnUATRKntGUs=] */
