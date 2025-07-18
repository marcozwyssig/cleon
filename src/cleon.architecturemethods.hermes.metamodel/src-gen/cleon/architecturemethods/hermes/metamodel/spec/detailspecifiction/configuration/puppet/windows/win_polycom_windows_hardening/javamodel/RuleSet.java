package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RuleSet extends DynamicResource implements IRuleSet {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRuleSet> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRuleSet>() {
    
    @Override
    public IRuleSet create() {
      return new RuleSet();
    }
    
    @Override
    public IRuleSet create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RuleSet(resourceRepository, resource);
    }
  
  };

  public RuleSet() {
    super(IRuleSet.TYPE_ID);
  }
  
  public RuleSet(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRuleSet.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule> selectRules() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_rules);
  }

  public RuleSet setRules(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule> rules) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_rules, rules);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule> selectSecpol() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_secpol);
  }

  public RuleSet setSecpol(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule> secpol) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_secpol, secpol);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RuleSet setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_rules, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_secpol, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet selectToMeRules(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_rules, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet selectToMeSecpol(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_secpol, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d1f8de48-63ba-11f0-b5df-8bf89765418e,2bLpXymRn2af/uKwoMfFRA4FKvc=] */
