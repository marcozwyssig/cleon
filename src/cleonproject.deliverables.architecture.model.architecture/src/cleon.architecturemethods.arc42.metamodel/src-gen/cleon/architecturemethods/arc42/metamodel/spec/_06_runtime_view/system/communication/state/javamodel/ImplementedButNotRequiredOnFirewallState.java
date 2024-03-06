package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImplementedButNotRequiredOnFirewallState extends DynamicResource implements IImplementedButNotRequiredOnFirewallState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImplementedButNotRequiredOnFirewallState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImplementedButNotRequiredOnFirewallState>() {
    
    @Override
    public IImplementedButNotRequiredOnFirewallState create() {
      return new ImplementedButNotRequiredOnFirewallState();
    }
    
    @Override
    public IImplementedButNotRequiredOnFirewallState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImplementedButNotRequiredOnFirewallState(resourceRepository, resource);
    }
  
  };

  public ImplementedButNotRequiredOnFirewallState() {
    super(IImplementedButNotRequiredOnFirewallState.TYPE_ID);
  }
  
  public ImplementedButNotRequiredOnFirewallState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImplementedButNotRequiredOnFirewallState.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImplementedButNotRequiredOnFirewallState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2a244c8f-1770-11eb-aff5-dd5c3dd3a631,v6se2GMvTuLhmq++sgtQ+OBCSYw=] */
