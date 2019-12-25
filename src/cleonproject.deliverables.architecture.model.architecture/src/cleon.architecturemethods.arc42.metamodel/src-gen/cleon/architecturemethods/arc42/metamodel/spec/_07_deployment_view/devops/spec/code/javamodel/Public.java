package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Public extends DynamicResource implements IPublic {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPublic> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPublic>() {
    
    @Override
    public IPublic create() {
      return new Public();
    }
    
    @Override
    public IPublic create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Public(resourceRepository, resource);
    }
  
  };

  public Public() {
    super(IPublic.TYPE_ID);
  }
  
  public Public(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPublic.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Public setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,61de57c9-41b7-11e5-a2b3-edc7f3343844,mjbbdeWp/NlPBwEhY/zlSr+GIVE=] */
