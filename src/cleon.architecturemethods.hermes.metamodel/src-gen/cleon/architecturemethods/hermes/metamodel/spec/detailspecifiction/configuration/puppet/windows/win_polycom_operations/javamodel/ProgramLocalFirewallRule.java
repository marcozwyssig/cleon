package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProgramLocalFirewallRule extends DynamicResource implements IProgramLocalFirewallRule {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProgramLocalFirewallRule> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProgramLocalFirewallRule>() {
    
    @Override
    public IProgramLocalFirewallRule create() {
      return new ProgramLocalFirewallRule();
    }
    
    @Override
    public IProgramLocalFirewallRule create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProgramLocalFirewallRule(resourceRepository, resource);
    }
  
  };

  public ProgramLocalFirewallRule() {
    super(IProgramLocalFirewallRule.TYPE_ID);
  }
  
  public ProgramLocalFirewallRule(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProgramLocalFirewallRule.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDirection() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_direction);
  }
    
  public void setDirection(java.lang.String direction) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_direction, direction);
  }

  @Override
  public java.lang.String selectDisplayName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_displayName);
  }
    
  public void setDisplayName(java.lang.String displayName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_displayName, displayName);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectProgram() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_program);
  }
    
  public void setProgram(java.lang.String program) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_program, program);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProgramLocalFirewallRule setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_direction, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_displayName, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.ProgramLocalFirewallRule_program, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9cfafccf-4816-11f0-bcdd-31d38803078d,rmX2c5d+y7e40hJPy/m/yt5mdUQ=] */
