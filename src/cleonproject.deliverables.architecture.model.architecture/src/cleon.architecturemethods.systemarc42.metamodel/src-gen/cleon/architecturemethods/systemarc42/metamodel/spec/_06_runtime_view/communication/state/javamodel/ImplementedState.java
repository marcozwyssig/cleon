package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImplementedState extends DynamicResource implements IImplementedState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImplementedState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImplementedState>() {
    
    @Override
    public IImplementedState create() {
      return new ImplementedState();
    }
    
    @Override
    public IImplementedState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImplementedState(resourceRepository, resource);
    }
  
  };

  public ImplementedState() {
    super(IImplementedState.TYPE_ID);
  }
  
  public ImplementedState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImplementedState.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectRefnNo() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplementedState_refnNo);
  }
    
  public void setRefnNo(java.util.List<java.lang.String> refnNo) {
     _setListAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplementedState_refnNo, refnNo);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplentationStateForEnvironment> selectImplementationStateIn() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplentationStateForEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplementedState_implementationStateIn);
  }

  public ImplementedState setImplementationStateIn(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplentationStateForEnvironment> implementationStateIn) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplementedState_implementationStateIn, implementationStateIn);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImplementedState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplementedState_refnNo, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplentationStateForEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplementedState_implementationStateIn, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState selectToMeImplementationStateIn(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplentationStateForEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplementedState_implementationStateIn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,979efb64-0c5a-11ea-af20-c193d8bcdd26,aZu84ozfLaBhjiPEhzoZSSmhjZA=] */
