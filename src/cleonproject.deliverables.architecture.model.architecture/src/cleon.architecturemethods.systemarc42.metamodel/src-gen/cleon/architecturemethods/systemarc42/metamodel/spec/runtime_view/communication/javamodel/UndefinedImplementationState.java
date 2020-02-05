package cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UndefinedImplementationState extends DynamicResource implements IUndefinedImplementationState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUndefinedImplementationState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUndefinedImplementationState>() {
    
    @Override
    public IUndefinedImplementationState create() {
      return new UndefinedImplementationState();
    }
    
    @Override
    public IUndefinedImplementationState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UndefinedImplementationState(resourceRepository, resource);
    }
  
  };

  public UndefinedImplementationState() {
    super(IUndefinedImplementationState.TYPE_ID);
  }
  
  public UndefinedImplementationState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUndefinedImplementationState.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public UndefinedImplementationState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e19a0a43-0c5a-11ea-af20-c193d8bcdd26,uitn1hiC4DsiqGzsTzbAVRnLTY4=] */
