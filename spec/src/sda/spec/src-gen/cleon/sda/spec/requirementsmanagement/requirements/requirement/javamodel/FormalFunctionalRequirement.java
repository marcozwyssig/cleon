package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FormalFunctionalRequirement extends DynamicResource implements IFormalFunctionalRequirement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFormalFunctionalRequirement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFormalFunctionalRequirement>() {
    
    @Override
    public IFormalFunctionalRequirement create() {
      return new FormalFunctionalRequirement();
    }
    
    @Override
    public IFormalFunctionalRequirement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FormalFunctionalRequirement(resourceRepository, resource);
    }
  
  };

  public FormalFunctionalRequirement() {
    super(IFormalFunctionalRequirement.TYPE_ID);
  }
  
  public FormalFunctionalRequirement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFormalFunctionalRequirement.TYPE_ID);
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
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectAggregates() {
    return _getList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_aggregates);
  }

  public FormalFunctionalRequirement setAggregates(java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> aggregates) {
    _setList(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConcretizes() {
    return _getList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_concretizes);
  }

  public FormalFunctionalRequirement setConcretizes(java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> concretizes) {
    _setList(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_concretizes, concretizes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState selectState() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_state);
  }

  public FormalFunctionalRequirement setState(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState state) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FormalFunctionalRequirement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_aggregates, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_concretizes, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7244f943-a962-11e5-bda2-a7fc3bd7c783,e7xQ7AfDRMqxyXeDqdD+xHzRHmg=] */