package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OperationActivityCover extends DynamicResource implements IOperationActivityCover {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperationActivityCover> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperationActivityCover>() {
    
    @Override
    public IOperationActivityCover create() {
      return new OperationActivityCover();
    }
    
    @Override
    public IOperationActivityCover create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OperationActivityCover(resourceRepository, resource);
    }
  
  };

  public OperationActivityCover() {
    super(IOperationActivityCover.TYPE_ID);
  }
  
  public OperationActivityCover(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperationActivityCover.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OperationActivityCover setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,41b40751-1bf7-11e9-9d15-bdc420ac8f00,++5AxSY8h8eanovbVLthwMnwQN0=] */
