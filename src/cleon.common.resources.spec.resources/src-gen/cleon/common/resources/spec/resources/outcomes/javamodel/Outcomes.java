package cleon.common.resources.spec.resources.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Outcomes extends DynamicResource implements IOutcomes {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomes> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomes>() {
    
    @Override
    public IOutcomes create() {
      return new Outcomes();
    }
    
    @Override
    public IOutcomes create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Outcomes(resourceRepository, resource);
    }
  
  };

  public Outcomes() {
    super(IOutcomes.TYPE_ID);
  }
  
  public Outcomes(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutcomes.TYPE_ID);
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
  public java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcome> selectOutcomes() {
    return _getList(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcome.class, cleon.common.resources.spec.resources.outcomes.OutcomesPackage.Outcomes_outcomes);
  }

  public Outcomes setOutcomes(java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcome> outcomes) {
    _setList(cleon.common.resources.spec.resources.outcomes.OutcomesPackage.Outcomes_outcomes, outcomes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Outcomes setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcome.class, cleon.common.resources.spec.resources.outcomes.OutcomesPackage.Outcomes_outcomes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes> selectToMeOutcomes(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcome object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes.class, cleon.common.resources.spec.resources.outcomes.OutcomesPackage.Outcomes_outcomes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ca9809d8-1cec-11e6-aaba-9db7fdc64d7e,EypSc8eZdwhchdotX35glh8MTZo=] */
