package cleon.modelinglanguages.rack.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Racks extends DynamicResource implements IRacks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRacks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRacks>() {
    
    @Override
    public IRacks create() {
      return new Racks();
    }
    
    @Override
    public IRacks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Racks(resourceRepository, resource);
    }
  
  };

  public Racks() {
    super(IRacks.TYPE_ID);
  }
  
  public Racks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRacks.TYPE_ID);
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

  public Racks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,88ad6c4a-0550-11e9-b814-a133e521728c,uQTxxA23ekaUOu6WJNzQp1sPI9c=] */
