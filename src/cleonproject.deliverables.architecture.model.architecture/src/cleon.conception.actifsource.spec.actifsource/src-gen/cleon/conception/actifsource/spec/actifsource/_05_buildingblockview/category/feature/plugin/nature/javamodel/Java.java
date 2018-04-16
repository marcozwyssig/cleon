package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.nature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Java extends DynamicResource implements IJava {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IJava> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IJava>() {
    
    @Override
    public IJava create() {
      return new Java();
    }
    
    @Override
    public IJava create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Java(resourceRepository, resource);
    }
  
  };

  public Java() {
    super(IJava.TYPE_ID);
  }
  
  public Java(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IJava.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Java setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e9f92d4a-3fd7-11e8-bd50-b94594551673,x/vuq1lxBscvuaYd1fe4brwX7NM=] */
