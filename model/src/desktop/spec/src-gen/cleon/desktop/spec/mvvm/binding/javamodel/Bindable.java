package cleon.desktop.spec.mvvm.binding.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Bindable extends DynamicResource implements IBindable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBindable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBindable>() {
    
    @Override
    public IBindable create() {
      return new Bindable();
    }
    
    @Override
    public IBindable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Bindable(resourceRepository, resource);
    }
  
  };

  public Bindable() {
    super(IBindable.TYPE_ID);
  }
  
  public Bindable(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBindable.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.desktop.spec.mvvm.binding.javamodel.IBinding selectBindingPattern() {
    return _getSingle(cleon.desktop.spec.mvvm.binding.javamodel.IBinding.class, cleon.desktop.spec.mvvm.binding.BindingPackage.Bindable_bindingPattern);
  }

  public Bindable setBindingPattern(cleon.desktop.spec.mvvm.binding.javamodel.IBinding bindingPattern) {
    _setSingle(cleon.desktop.spec.mvvm.binding.BindingPackage.Bindable_bindingPattern, bindingPattern);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Bindable setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.desktop.spec.mvvm.binding.javamodel.IBinding.class, cleon.desktop.spec.mvvm.binding.BindingPackage.Bindable_bindingPattern, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.desktop.spec.mvvm.binding.javamodel.IBindable> selectToMeBindingPattern(cleon.desktop.spec.mvvm.binding.javamodel.IBinding object) {
    return _getToMeList(object.getRepository(), cleon.desktop.spec.mvvm.binding.javamodel.IBindable.class, cleon.desktop.spec.mvvm.binding.BindingPackage.Bindable_bindingPattern, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,722bd8d4-a56a-11e4-b136-cb3641e3bed5,opO6sqR3s1KCii/OAI4HUaGOx+s=] */
