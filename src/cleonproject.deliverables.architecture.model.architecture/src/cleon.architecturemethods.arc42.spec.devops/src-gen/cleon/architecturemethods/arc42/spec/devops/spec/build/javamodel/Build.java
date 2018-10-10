package cleon.architecturemethods.arc42.spec.devops.spec.build.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Build extends DynamicResource implements IBuild {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuild> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuild>() {
    
    @Override
    public IBuild create() {
      return new Build();
    }
    
    @Override
    public IBuild create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Build(resourceRepository, resource);
    }
  
  };

  public Build() {
    super(IBuild.TYPE_ID);
  }
  
  public Build(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuild.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Build setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cc39ac79-406e-11e5-b5f0-5b1ce9c3de3e,ZXU39oZQa78HzFDBKE6NvE9nvWo=] */
