package cleon.desktop.spec.mvvm.binding.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ViewFirst extends DynamicResource implements IViewFirst {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewFirst> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewFirst>() {
    
    @Override
    public IViewFirst create() {
      return new ViewFirst();
    }
    
    @Override
    public IViewFirst create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ViewFirst(resourceRepository, resource);
    }
  
  };

  public ViewFirst() {
    super(IViewFirst.TYPE_ID);
  }
  
  public ViewFirst(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IViewFirst.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ViewFirst setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,44a667d7-a56a-11e4-b136-cb3641e3bed5,KD8NeB+N0d6U+nz2V5Ws8Yhiv5k=] */
