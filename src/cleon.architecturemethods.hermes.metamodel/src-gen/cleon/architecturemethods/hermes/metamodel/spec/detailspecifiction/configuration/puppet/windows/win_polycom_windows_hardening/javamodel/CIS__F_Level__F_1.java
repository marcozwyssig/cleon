package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CIS__F_Level__F_1 extends DynamicResource implements ICIS__F_Level__F_1 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICIS__F_Level__F_1> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICIS__F_Level__F_1>() {
    
    @Override
    public ICIS__F_Level__F_1 create() {
      return new CIS__F_Level__F_1();
    }
    
    @Override
    public ICIS__F_Level__F_1 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CIS__F_Level__F_1(resourceRepository, resource);
    }
  
  };

  public CIS__F_Level__F_1() {
    super(ICIS__F_Level__F_1.TYPE_ID);
  }
  
  public CIS__F_Level__F_1(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICIS__F_Level__F_1.TYPE_ID);
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

  public CIS__F_Level__F_1 setRules(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule> rules) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.RuleSet_rules, rules);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CIS__F_Level__F_1 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eb2ee099-63ba-11f0-b5df-8bf89765418e,9zYgnYfKMOjJRUVzHd6inpLdHY8=] */
