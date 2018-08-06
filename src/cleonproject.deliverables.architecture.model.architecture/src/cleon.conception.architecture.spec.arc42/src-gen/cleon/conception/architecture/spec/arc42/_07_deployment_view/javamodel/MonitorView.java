package cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MonitorView extends DynamicResource implements IMonitorView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitorView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitorView>() {
    
    @Override
    public IMonitorView create() {
      return new MonitorView();
    }
    
    @Override
    public IMonitorView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MonitorView(resourceRepository, resource);
    }
  
  };

  public MonitorView() {
    super(IMonitorView.TYPE_ID);
  }
  
  public MonitorView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMonitorView.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MonitorView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0e2fd28c-9992-11e8-b347-dd2314b02086,rH2VKGRSRR3B/XsekuMnJsMODo8=] */
