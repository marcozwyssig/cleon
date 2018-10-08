package cleon.conception.architecture.spec.eamod.nov.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OperationalActivity extends DynamicResource implements IOperationalActivity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperationalActivity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperationalActivity>() {
    
    @Override
    public IOperationalActivity create() {
      return new OperationalActivity();
    }
    
    @Override
    public IOperationalActivity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OperationalActivity(resourceRepository, resource);
    }
  
  };

  public OperationalActivity() {
    super(IOperationalActivity.TYPE_ID);
  }
  
  public OperationalActivity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperationalActivity.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability> selectActivityMapsToCapability() {
    return _getList(cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability.class, cleon.conception.architecture.spec.eamod.nov.NovPackage.OperationalActivity_activityMapsToCapability);
  }

  public OperationalActivity setActivityMapsToCapability(java.util.List<? extends cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability> activityMapsToCapability) {
    _setList(cleon.conception.architecture.spec.eamod.nov.NovPackage.OperationalActivity_activityMapsToCapability, activityMapsToCapability);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OperationalActivity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability.class, cleon.conception.architecture.spec.eamod.nov.NovPackage.OperationalActivity_activityMapsToCapability, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.nov.javamodel.IOperationalActivity> selectToMeActivityMapsToCapability(cleon.conception.architecture.spec.eamod.ncv.javamodel.ICapability object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.nov.javamodel.IOperationalActivity.class, cleon.conception.architecture.spec.eamod.nov.NovPackage.OperationalActivity_activityMapsToCapability, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,93ef0a2d-bc84-11e6-b169-a12bde5a1c7c,YNsgv+w2BZIWSq8FyoXRORkq5q0=] */
