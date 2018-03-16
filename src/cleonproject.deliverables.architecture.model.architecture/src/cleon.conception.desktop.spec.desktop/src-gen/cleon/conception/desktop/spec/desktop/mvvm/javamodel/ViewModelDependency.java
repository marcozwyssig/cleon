package cleon.conception.desktop.spec.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ViewModelDependency extends DynamicResource implements IViewModelDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModelDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModelDependency>() {
    
    @Override
    public IViewModelDependency create() {
      return new ViewModelDependency();
    }
    
    @Override
    public IViewModelDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ViewModelDependency(resourceRepository, resource);
    }
  
  };

  public ViewModelDependency() {
    super(IViewModelDependency.TYPE_ID);
  }
  
  public ViewModelDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IViewModelDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.desktop.spec.desktop.mvvm.javamodel.IViewModel> selectTo() {
    return _getList(cleon.conception.desktop.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ViewModelDependency_to);
  }

  public ViewModelDependency setTo(java.util.List<? extends cleon.conception.desktop.spec.desktop.mvvm.javamodel.IViewModel> to) {
    _setList(cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ViewModelDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ViewModelDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.conception.desktop.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ViewModelDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.desktop.spec.desktop.mvvm.javamodel.IViewModelDependency> selectToMeTo(cleon.conception.desktop.spec.desktop.mvvm.javamodel.IViewModel object) {
    return _getToMeList(object.getRepository(), cleon.conception.desktop.spec.desktop.mvvm.javamodel.IViewModelDependency.class, cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ViewModelDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e5f87cbd-3b5e-11e5-86bc-73aedc28563d,iQve1frjkZ8qbBOoGH39yvHT7Rc=] */
