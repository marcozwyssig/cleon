package cleon.sda.spec.projectmanagement.resourcemanagement.space.javamodel;

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
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f2a87973-a7d8-11e5-82dd-3b995d9c840c,pHUUqSo24mVhw7GSTZe78KOVtsM=] */
