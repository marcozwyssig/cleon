package cleon.conception.desktop.spec.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ForwardPropertyDependency extends DynamicResource implements IForwardPropertyDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IForwardPropertyDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IForwardPropertyDependency>() {
    
    @Override
    public IForwardPropertyDependency create() {
      return new ForwardPropertyDependency();
    }
    
    @Override
    public IForwardPropertyDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ForwardPropertyDependency(resourceRepository, resource);
    }
  
  };

  public ForwardPropertyDependency() {
    super(IForwardPropertyDependency.TYPE_ID);
  }
  
  public ForwardPropertyDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IForwardPropertyDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ForwardPropertyDependency setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.conception.desktop.spec.desktop.mvvm.javamodel.IForwardProperty selectTo() {
    return _getSingle(cleon.conception.desktop.spec.desktop.mvvm.javamodel.IForwardProperty.class, cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ForwardPropertyDependency_to);
  }

  public ForwardPropertyDependency setTo(cleon.conception.desktop.spec.desktop.mvvm.javamodel.IForwardProperty to) {
    _setSingle(cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ForwardPropertyDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ForwardPropertyDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.conception.desktop.spec.desktop.mvvm.javamodel.IForwardProperty.class, cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ForwardPropertyDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.desktop.spec.desktop.mvvm.javamodel.IForwardPropertyDependency selectToMeTo(cleon.conception.desktop.spec.desktop.mvvm.javamodel.IForwardProperty object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.desktop.spec.desktop.mvvm.javamodel.IForwardPropertyDependency.class, cleon.conception.desktop.spec.desktop.mvvm.MvvmPackage.ForwardPropertyDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,203c73c6-3b60-11e5-86bc-73aedc28563d,mOCN5h9OOR8ta4YQUkyLqi6pBy8=] */
