package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuildManagement extends DynamicResource implements IBuildManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildManagement>() {
    
    @Override
    public IBuildManagement create() {
      return new BuildManagement();
    }
    
    @Override
    public IBuildManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuildManagement(resourceRepository, resource);
    }
  
  };

  public BuildManagement() {
    super(IBuildManagement.TYPE_ID);
  }
  
  public BuildManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuildManagement.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BuildManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3929be93-4070-11e5-b5f0-5b1ce9c3de3e,uONve+bAtoTcySl2focIAeZb2LQ=] */
