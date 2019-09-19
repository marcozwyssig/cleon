package cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DisplayName extends DynamicResource implements IDisplayName {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDisplayName> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDisplayName>() {
    
    @Override
    public IDisplayName create() {
      return new DisplayName();
    }
    
    @Override
    public IDisplayName create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DisplayName(resourceRepository, resource);
    }
  
  };

  public DisplayName() {
    super(IDisplayName.TYPE_ID);
  }
  
  public DisplayName(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDisplayName.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectClass() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_class);
  }

  public DisplayName setClass(ch.actifsource.core.javamodel.IClass class_) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_class, class_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.selector.element.javamodel.ILinkSelector selectSelector() {
    return _getSingle(ch.actifsource.core.selector.element.javamodel.ILinkSelector.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_selector);
  }

  public DisplayName setSelector(ch.actifsource.core.selector.element.javamodel.ILinkSelector selector) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_selector, selector);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DisplayName setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DisplayName setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_class, visitor);
    _acceptSingle(ch.actifsource.core.selector.element.javamodel.ILinkSelector.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_selector, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.javamodel.IDisplayName> selectToMeClass(ch.actifsource.core.javamodel.IClass object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.javamodel.IDisplayName.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_class, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.javamodel.IDisplayName selectToMeSelector(ch.actifsource.core.selector.element.javamodel.ILinkSelector object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.javamodel.IDisplayName.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.naming.NamingPackage.DisplayName_selector, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b4adca1c-11b2-11e9-9a7b-590a6369b499,TEsQIX1/EpJ9aqhTLOeHtv1zxL4=] */
