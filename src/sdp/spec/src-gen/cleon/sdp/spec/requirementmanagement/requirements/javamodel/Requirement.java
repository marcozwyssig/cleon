package cleon.sdp.spec.requirementmanagement.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Requirement extends DynamicResource implements IRequirement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirement>() {
    
    @Override
    public IRequirement create() {
      return new Requirement();
    }
    
    @Override
    public IRequirement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Requirement(resourceRepository, resource);
    }
  
  };

  public Requirement() {
    super(IRequirement.TYPE_ID);
  }
  
  public Requirement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirement.TYPE_ID);
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
  public cleon.sdp.spec.requirementmanagement.requirements.javamodel.IState selectState() {
    return _getSingle(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IState.class, cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirement_state);
  }

  public Requirement setState(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IState state) {
    _setSingle(cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirement_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Requirement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IState.class, cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirement_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirement> selectToMeState(cleon.sdp.spec.requirementmanagement.requirements.javamodel.IState object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.requirementmanagement.requirements.javamodel.IRequirement.class, cleon.sdp.spec.requirementmanagement.requirements.RequirementsPackage.Requirement_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,TYEnMJLzHmRX8n/38kNQQlwp0oA=] */
