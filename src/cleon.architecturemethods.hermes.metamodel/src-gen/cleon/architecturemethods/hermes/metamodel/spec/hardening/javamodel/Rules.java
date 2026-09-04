package cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Rules extends DynamicResource implements IRules {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRules> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRules>() {
    
    @Override
    public IRules create() {
      return new Rules();
    }
    
    @Override
    public IRules create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Rules(resourceRepository, resource);
    }
  
  };

  public Rules() {
    super(IRules.TYPE_ID);
  }
  
  public Rules(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRules.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel.IRule> selectRule() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.hardening.HardeningPackage.Rules_rule);
  }

  public Rules setRule(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel.IRule> rule) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.hardening.HardeningPackage.Rules_rule, rule);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Rules setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.hardening.HardeningPackage.Rules_rule, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel.IRules selectToMeRule(cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel.IRule object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.hardening.javamodel.IRules.class, cleon.architecturemethods.hermes.metamodel.spec.hardening.HardeningPackage.Rules_rule, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,de222687-5e50-11f0-85a0-e5fe67e459b3,2JsMlzqi8FPRRoC1NHNDrQAXXt0=] */
