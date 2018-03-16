package cleon.support.projectmanagement.spec.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Space extends DynamicResource implements ISpace {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpace> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpace>() {
    
    @Override
    public ISpace create() {
      return new Space();
    }
    
    @Override
    public ISpace create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Space(resourceRepository, resource);
    }
  
  };

  public Space() {
    super(ISpace.TYPE_ID);
  }
  
  public Space(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISpace.TYPE_ID);
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

  public Space setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0df52110-bbd7-11e6-997f-d73ea5a3671c,B7Lbs5soV1rZLWLLZ07bkS55wmk=] */
