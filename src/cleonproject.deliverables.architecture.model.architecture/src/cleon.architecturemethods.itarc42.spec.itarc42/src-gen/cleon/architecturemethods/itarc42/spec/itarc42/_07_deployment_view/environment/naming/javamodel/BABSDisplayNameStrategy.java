package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.naming.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BABSDisplayNameStrategy extends DynamicResource implements IBABSDisplayNameStrategy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBABSDisplayNameStrategy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBABSDisplayNameStrategy>() {
    
    @Override
    public IBABSDisplayNameStrategy create() {
      return new BABSDisplayNameStrategy();
    }
    
    @Override
    public IBABSDisplayNameStrategy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BABSDisplayNameStrategy(resourceRepository, resource);
    }
  
  };

  public BABSDisplayNameStrategy() {
    super(IBABSDisplayNameStrategy.TYPE_ID);
  }
  
  public BABSDisplayNameStrategy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBABSDisplayNameStrategy.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BABSDisplayNameStrategy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,da0f104e-11af-11e9-9a7b-590a6369b499,nxlZAnWVhre4MArs9mJjxMRlQIc=] */
