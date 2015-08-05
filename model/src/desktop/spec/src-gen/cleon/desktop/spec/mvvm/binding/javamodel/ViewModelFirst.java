package cleon.desktop.spec.mvvm.binding.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ViewModelFirst extends DynamicResource implements IViewModelFirst {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModelFirst> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModelFirst>() {
    
    @Override
    public IViewModelFirst create() {
      return new ViewModelFirst();
    }
    
    @Override
    public IViewModelFirst create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ViewModelFirst(resourceRepository, resource);
    }
  
  };

  public ViewModelFirst() {
    super(IViewModelFirst.TYPE_ID);
  }
  
  public ViewModelFirst(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IViewModelFirst.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ViewModelFirst setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3d2504e1-a56a-11e4-b136-cb3641e3bed5,tFV+P2LOKcS0A6p0CNE7Q+qh3M4=] */
