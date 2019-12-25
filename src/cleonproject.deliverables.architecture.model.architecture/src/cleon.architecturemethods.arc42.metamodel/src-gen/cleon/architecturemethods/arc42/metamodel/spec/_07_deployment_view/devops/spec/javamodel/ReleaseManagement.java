package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ReleaseManagement extends DynamicResource implements IReleaseManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReleaseManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReleaseManagement>() {
    
    @Override
    public IReleaseManagement create() {
      return new ReleaseManagement();
    }
    
    @Override
    public IReleaseManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ReleaseManagement(resourceRepository, resource);
    }
  
  };

  public ReleaseManagement() {
    super(IReleaseManagement.TYPE_ID);
  }
  
  public ReleaseManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IReleaseManagement.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ReleaseManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,62253b81-4070-11e5-b5f0-5b1ce9c3de3e,ADhbqYeY+XpTC8aXuqdTB/V3bdc=] */
